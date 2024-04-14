using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PJPproject
{
  internal class TargetVisitor : salangBaseVisitor<string>
  {
    private Dictionary<string, string> nameTypes = new Dictionary<string, string>();
    private Stack<string> ids = new Stack<string>();
    public VisitorTypeCheck TypeVisitor { get; set; }
    private int labelCounter = 0;

    public override string VisitProg([NotNull] salangParser.ProgContext context)
    {
      StringBuilder sb = new StringBuilder();
      foreach (var st in context.stat()) 
      {
        var value = Visit(st);
        sb.Append(value);
      }
      return sb.ToString();
    }

    // Stat visitors

    public override string VisitParanStat([NotNull] salangParser.ParanStatContext context)
    {
      StringBuilder sb = new StringBuilder();
      foreach (var st in context.stat())
      {
        var value = Visit(st);
        sb.Append(value);
      }
      return sb.ToString();
    }

    private (string, string) GetDefaultValue(string type)
    {
      switch (type)
      {
        case "int": return ("int","0");
        case "float": return ("float", "0.0");
        case "string": return ("string", "\"\"");
        case "bool": return ("bool", "false");
        default: return ("E", "");
      }
    }

    public override string VisitDeclarationOfVariable([NotNull] salangParser.DeclarationOfVariableContext context)
    {
      StringBuilder sb = new StringBuilder();
      var type = context.primitive_type().GetText();
      (string, string) def = GetDefaultValue(type);
      foreach (var id in context.ID())
      {
        sb.AppendLine($"push {def.Item1.ToUpper()[0]} {def.Item2}");
        sb.AppendLine($"save {id.GetText()}");
        nameTypes.Add(id.GetText(), def.Item1);
      }
      return sb.ToString();
    }

    public override string VisitIfStat([NotNull] salangParser.IfStatContext context)
    {
      StringBuilder sb = new StringBuilder();
      var exp = Visit(context.expr());
      sb.Append(exp);
      int labelOne = this.labelCounter++;
      int labelTwo = this.labelCounter++;
      sb.AppendLine($"fjmp {labelOne}");
      var st1 = Visit(context.stat()[0]);
      sb.Append(st1);
      sb.AppendLine($"jmp {labelTwo}");
      sb.AppendLine($"label {labelOne}");
      if (context.ELSE() != null)
        sb.Append(Visit(context.stat()[1]));
      sb.AppendLine($"label {labelTwo}");
      return sb.ToString();
    }

    public override string VisitWhileLoop([NotNull] salangParser.WhileLoopContext context)
    {
      StringBuilder sb = new StringBuilder();

      int labelOne = this.labelCounter++;
      int labelTwo = this.labelCounter++;
      sb.AppendLine($"label {labelOne}");
      sb.Append(Visit(context.expr()));
      sb.AppendLine($"fjmp {labelTwo}");
      sb.Append(Visit(context.stat()));
      sb.AppendLine($"jmp {labelOne}");
      sb.AppendLine($"label {labelTwo}");

      return sb.ToString();
    }

    public override string VisitReadStat([NotNull] salangParser.ReadStatContext context)
    {
      StringBuilder sb = new StringBuilder(); // load datatype, save
      foreach(var id in context.ID())
      {
        sb.AppendLine($"read {nameTypes[id.GetText()].ToUpper()[0]}");
        sb.AppendLine($"save {id.GetText()}");
      }
      return sb.ToString();
    }

    public override string VisitWriteStat([NotNull] salangParser.WriteStatContext context)
    {
      StringBuilder sb = new StringBuilder();
      int cnt = 0;
      foreach (var ex in context.expr())
      {
        sb.Append(Visit(ex));
        cnt++;
      }
      sb.AppendLine($"print {cnt}");
      return sb.ToString();
    }

    public override string VisitExprStat([NotNull] salangParser.ExprStatContext context)
    {
      return Visit(context.expr());
    }

    // Expr visitors
    public override string VisitIdExpr([NotNull] salangParser.IdExprContext context)
    {
      return $"load {context.ID().GetText()}\n";
    }

    public override string VisitParanExpr([NotNull] salangParser.ParanExprContext context)
    {
      return Visit(context.expr());
    }

    public override string VisitIntExpr([NotNull] salangParser.IntExprContext context)
    {
      var value = Convert.ToInt32(context.INT_VAL().GetText());
      return $"push I {value}\n";
    }

    public override string VisitFloatExpr([NotNull] salangParser.FloatExprContext context)
    {
      var value = float.Parse(context.FLOAT_VAL().GetText());
      return $"push F {value}\n";
    }

    public override string VisitStringExpr([NotNull] salangParser.StringExprContext context)
    {
      var value = context.STRING_VAL().GetText();
      return $"push S {value}\n";
    }

    public override string VisitBoolExpr([NotNull] salangParser.BoolExprContext context)
    {
      var value = context.BOOL_VAL().GetText();
      return $"push B {value}\n";
    }

    public override string VisitSubExpr([NotNull] salangParser.SubExprContext context)
    {
      StringBuilder sb = new StringBuilder();
      sb.Append(Visit(context.expr()));
      sb.AppendLine("uminus");
      return sb.ToString();
    }

    public override string VisitNegExpr([NotNull] salangParser.NegExprContext context)
    {
      StringBuilder sb = new StringBuilder();
      sb.Append(Visit(context.expr()));
      sb.AppendLine("not");
      return sb.ToString();
    }

    public override string VisitMulDivModExpr([NotNull] salangParser.MulDivModExprContext context)
    {
      StringBuilder sb = new StringBuilder();

      var left = Visit(context.expr()[0]);
      var right = Visit(context.expr()[1]);
      sb.Append(left);
      sb.Append(right);
      
      if (TypeVisitor.Visit(context.expr()[0]) != TypeVisitor.Visit(context.expr()[1]))
        sb.AppendLine("itof");


      if (context.op.Text.Equals("*"))
        sb.AppendLine("mul");
      else if (context.op.Text.Equals("/"))
        sb.AppendLine("div");
      else
        sb.AppendLine("mod");

      return sb.ToString();
    }

    public override string VisitAddSubConExpr([NotNull] salangParser.AddSubConExprContext context)
    {
      StringBuilder sb = new StringBuilder();

      var left = Visit(context.expr()[0]);
      var right = Visit(context.expr()[1]);
      sb.Append(left);
      sb.Append(right);

      if (TypeVisitor.Visit(context.expr()[0]) != TypeVisitor.Visit(context.expr()[1]))
        sb.AppendLine("itof");

      if (context.op.Text.Equals("+"))
        sb.AppendLine("add");
      else if (context.op.Text.Equals("-"))
        sb.AppendLine("sub");
      else
        sb.AppendLine("concat");

      return sb.ToString();
    }

    public override string VisitLesGreExpr([NotNull] salangParser.LesGreExprContext context)
    {
      StringBuilder sb = new StringBuilder();

      var left = Visit(context.expr()[0]);
      var right = Visit(context.expr()[1]);
      Console.WriteLine($"{TypeVisitor.Visit(context.expr()[0])} != {TypeVisitor.Visit(context.expr()[1])}");
      sb.Append(left);

      if (TypeVisitor.Visit(context.expr()[0]) != TypeVisitor.Visit(context.expr()[1]))
        sb.AppendLine("itof");

      sb.Append(right);

      if (context.op.Text.Equals(">"))
        sb.AppendLine("gt");
      else
        sb.AppendLine("lt");

      return sb.ToString();
    }

    public override string VisitEqNeqExpr([NotNull] salangParser.EqNeqExprContext context)
    {
      StringBuilder sb = new StringBuilder();

      var left = Visit(context.expr()[0]);
      var right = Visit(context.expr()[1]);

      sb.Append(left);

      if (TypeVisitor.Visit(context.expr()[0]) != TypeVisitor.Visit(context.expr()[1]))
        sb.AppendLine("itof");

      sb.Append(right);

      sb.AppendLine("eq");
      if (context.op.Text.Equals("!="))
        sb.AppendLine("not");

      return sb.ToString();
    }

    public override string VisitAndExpr([NotNull] salangParser.AndExprContext context)
    {
      StringBuilder sb = new StringBuilder();

      var left = Visit(context.expr()[0]);
      var right = Visit(context.expr()[1]);
      sb.Append(left);
      sb.Append(right);
      sb.AppendLine("and");
      return sb.ToString();
    }

    public override string VisitOrExpr([NotNull] salangParser.OrExprContext context)
    {
      StringBuilder sb = new StringBuilder();

      var left = Visit(context.expr()[0]);
      var right = Visit(context.expr()[1]);
      sb.Append(left);
      sb.Append(right);
      sb.AppendLine("or");
      return sb.ToString();
    }

    public override string VisitAssignExpr([NotNull] salangParser.AssignExprContext context)
    {
      StringBuilder sb = new StringBuilder();

      var right = Visit(context.expr());
      var id = context.ID().GetText();
      sb.Append(right);
      if (nameTypes[id] != TypeVisitor.Visit(context.expr()))
        sb.AppendLine("itof");
      sb.AppendLine($"save {id}");
      sb.AppendLine($"load {id}");
      if (!(context.parent is salangParser.ExprContext))
        sb.AppendLine("pop");
      return sb.ToString();
    }
  }
}
