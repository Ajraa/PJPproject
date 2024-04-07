using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Mime;
using System.Text;
using System.Threading.Tasks;

namespace PJPproject
{
  internal class VisitorTypeCheck: salangBaseVisitor<string>
  {
    Dictionary<string, string> Types { get; set; } = new Dictionary<string, string>();
    public List<string> Errors { get; set; } = new List<string>();

    public override string VisitProg([NotNull] salangParser.ProgContext context)
    {
      return base.VisitProg(context);
    }

    public override string VisitDeclarationOfVariable([NotNull] salangParser.DeclarationOfVariableContext context)
    {
      string type = context.children[0].GetText();
      List<string> variables = new List<string> { type };
      foreach (var variable in context.children)
      {
        if (context.children[0].Equals(variable)) continue; 
        if (variable.GetText().StartsWith(';')) break;
        if (Types.ContainsKey(variable.GetText()))
           Errors.Add("Proměnná byla deklarována dvakrát - " + context.ToString());
        else
          Types.Add(variable.GetText(), type);
      }

      return base.VisitDeclarationOfVariable(context);
    }

    public override string VisitAssignExpr([NotNull] salangParser.AssignExprContext context)
    {
      String variable = context.children[0].GetText();
      string result = this.Visit(context.children[2]);

      if (Types[variable] != result)
        Errors.Add("Špatný datový typ - " + context.ToString());

      return base.VisitAssignExpr(context);
    }

    public override string VisitSubExpr([NotNull] salangParser.SubExprContext context)
    {
      string type = Visit(context);
      if (type != "int" && type != "float")
        Errors.Add("Unární mínus očekává int nebo float - " + context.ToString());
      return type;
    }

    public override string VisitNegExpr([NotNull] salangParser.NegExprContext context)
    {
      string type = Visit(context);
      if (type != "bool")
        Errors.Add("Unární negace očekává bool - " + context.ToString());

      return base.VisitNegExpr(context);
    }

    public override string VisitIntExpr([NotNull] salangParser.IntExprContext context)
    {
      return "int";
    }

    public override string VisitFloatExpr([NotNull] salangParser.FloatExprContext context)
    {
      return "float";
    }

    public override string VisitBoolExpr([NotNull] salangParser.BoolExprContext context)
    {
      return "bool";
    }

    public override string VisitStringExpr([NotNull] salangParser.StringExprContext context)
    {
      return "string";
    }

    public override string VisitIdExpr([NotNull] salangParser.IdExprContext context)
    {
      return Types[context.GetText()];
    }

    public override string VisitMulDivModExpr([NotNull] salangParser.MulDivModExprContext context)
    {
      string type1 = Visit(context.children[0]);
      string type2 = Visit(context.children[2]);

      if (context.op == context.MOD()?.Symbol)
      {
        if (type1 != "int" || type2 != "int")
          Errors.Add("Modulo očekává int - " + context.ToString());
        else
          return "int";
      }
      else
      {
        if ((type1 != "int" && type1 != "float") || (type2 != "int" && type2 != "float"))
          Errors.Add($"Operace {context.op} očekává int nebo float - " + context.ToString());
        else if ((type1 == "float" && type2 == "float") || type1 != type2)
          return "float";
        else
          return "int";
      }

      return base.VisitMulDivModExpr(context);
    }

    public override string VisitAddSubConExpr([NotNull] salangParser.AddSubConExprContext context)
    {
      string type1 = context.children[0].GetText();
      string type2 = context.children[2].GetText();

      if(context.op == context.CON()?.Symbol) 
      {
        if(type1 != "string" && type2 != "string")
          Errors.Add("Concat očekává stringy - " + context.ToString());
        else
          return "string";
      }
      else
      {
        if ((type1 != "int" && type1 != "float") || (type2 != "int" && type2 != "float"))
          Errors.Add($"Operace {context.op} očekává int nebo float - " + context.ToString());
        else if ((type1 == "float" && type2 == "float") || type1 != type2)
          return "float";
        else
          return "int";
      }

      return base.VisitAddSubConExpr(context);
    }

    public override string VisitLesGreExpr([NotNull] salangParser.LesGreExprContext context)
    {
      string type1 = context.children[0].GetText();
      string type2 = context.children[2].GetText();

      if ((type1 != "int" && type1 != "float") || (type2 != "int" && type2 != "float"))
        Errors.Add($"Operace {context.op} očekává int nebo float - " + context.ToString());
      else
        return "bool";

      return base.VisitLesGreExpr(context);
    }

    public override string VisitEqNeqExpr([NotNull] salangParser.EqNeqExprContext context)
    {
      return "bool";
    }

    public override string VisitAndExpr([NotNull] salangParser.AndExprContext context)
    {
      string type1 = context.children[0].GetText();
      string type2 = context.children[2].GetText();

      if(type1 != "bool" || type2 != "bool")
        Errors.Add($"Operace {context.op} očekává bool - " + context.ToString());
      else
        return "bool";

      return base.VisitAndExpr(context);
    }

    public override string VisitOrExpr([NotNull] salangParser.OrExprContext context)
    {
      string type1 = context.children[0].GetText();
      string type2 = context.children[2].GetText();

      if (type1 != "bool" || type2 != "bool")
        Errors.Add($"Operace {context.op} očekává bool - " + context.ToString());
      else
        return "bool";

      return base.VisitOrExpr(context);
    }

    public override string VisitIfStat([NotNull] salangParser.IfStatContext context)
    {
      if (Visit(context.children[2]) != "bool")
        Errors.Add("If očekává bool - " + context.ToString());
      return base.VisitIfStat(context);
    }

    public override string VisitWhileLoop([NotNull] salangParser.WhileLoopContext context)
    {
      if (Visit(context.children[2]) != "bool")
        Errors.Add("While očekává bool - " + context.ToString());
      return base.VisitWhileLoop(context);
    }
  }
}