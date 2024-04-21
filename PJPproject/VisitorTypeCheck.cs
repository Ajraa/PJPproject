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

    public override string VisitDeclarationOfVariable([NotNull] salangParser.DeclarationOfVariableContext context)
    {
      string type = context.primitive_type().GetText();
      foreach (var variable in context.ID())
      {
        if (Types.ContainsKey(variable.GetText()))
           Errors.Add($"Proměnná {variable.GetText()} byla deklarována dvakrát - " + context.Start.Line);
        else
          Types.Add(variable.GetText(), type);
      }

      return base.VisitDeclarationOfVariable(context);
    }

    public override string VisitAssignExpr([NotNull] salangParser.AssignExprContext context)
    {
      String variable = context.ID().GetText();
      string result = this.Visit(context.expr());
      if (!Types.ContainsKey(variable) ||  Types[variable] != result && (Types[variable] != "float" && result != "int"))
        Errors.Add("Špatný datový typ - " + context.Start.Line);

      return "int";
    }

    public override string VisitSubExpr([NotNull] salangParser.SubExprContext context)
    {
      string type = Visit(context.children[1]);
      if (type != "int" && type != "float")
        Errors.Add("Unární mínus očekává int nebo float - " + context.Start.Line);
      else
        return type;
      return base.VisitSubExpr(context);
    }

    public override string VisitNegExpr([NotNull] salangParser.NegExprContext context)
    {
      string type = Visit(context.expr());
      if (type != "bool")
        Errors.Add("Unární negace očekává bool - " + context.Start.Line);
      else
        return "bool";

      return base.VisitNegExpr(context);
    }

    public override string VisitParanExpr([NotNull] salangParser.ParanExprContext context)
    {
      return Visit(context.expr());
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
      if (!Types.ContainsKey(context.GetText()))
        Errors.Add($"Proměnná {context.GetText()} neexistuje - " + context.Start.Line);
      else
        return Types[context.GetText()];
      return base.VisitIdExpr(context);
    }

    public override string VisitMulDivModExpr([NotNull] salangParser.MulDivModExprContext context)
    {
      string type1 = Visit(context.children[0]);
      string type2 = Visit(context.children[2]);

      if (context.op == context.MOD()?.Symbol)
      {
        if (type1 != "int" || type2 != "int")
          Errors.Add("Modulo očekává int - " + context.Start.Line);
        else
          return "int";
      }
      else
      {
        if ((type1 != "int" && type1 != "float") || (type2 != "int" && type2 != "float"))
          Errors.Add($"Operace {context.op} očekává int nebo float - " + context.Start.Line);
        else if ((type1 == "float" && type2 == "float") || type1 != type2)
          return "float";
        else
          return "int";
      }

      return base.VisitMulDivModExpr(context);
    }

    public override string VisitAddSubConExpr([NotNull] salangParser.AddSubConExprContext context)
    {
      string type1 = Visit(context.children[0]);
      string type2 = Visit(context.children[2]);

      if (context.op == context.CON()?.Symbol) 
      {
        if(type1 != "string" || type2 != "string")
          Errors.Add("Concat očekává stringy - " + context.Start.Line);
        else
          return "string";
      }
      else
      {
        if ((type1 != "int" && type1 != "float") || (type2 != "int" && type2 != "float"))
          Errors.Add($"Operace {context.op.Text} očekává int nebo float - " + context.Start.Line);
        else if ((type1 == "float" && type2 == "float") || type1 != type2)
          return "float";
        else
          return "int";
      }

      return base.VisitAddSubConExpr(context);
    }

    public override string VisitLesGreExpr([NotNull] salangParser.LesGreExprContext context)
    {
      string type1 = Visit(context.children[0]);
      string type2 = Visit(context.children[2]);

      if ((type1 != "int" && type1 != "float") || (type2 != "int" && type2 != "float"))
        Errors.Add($"Operace {context.op.Text} očekává int nebo float - " + context.Start.Line);
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
      string type1 = Visit(context.children[0]);
      string type2 = Visit(context.children[2]);

      if (type1 != "bool" || type2 != "bool")
        Errors.Add($"Operace {context.op.Text} očekává bool - " + context.Start.Line);
      else
        return "bool";

      return base.VisitAndExpr(context);
    }

    public override string VisitOrExpr([NotNull] salangParser.OrExprContext context)
    {
      string type1 = Visit(context.children[0]);
      string type2 = Visit(context.children[2]);

      if (type1 != "bool" || type2 != "bool")
        Errors.Add($"Operace {context.op.Type} očekává bool - " + context.Start.Line);
      else
        return "bool";

      return base.VisitOrExpr(context);
    }

    public override string VisitIfStat([NotNull] salangParser.IfStatContext context)
    {
      if (Visit(context.children[2]) != "bool")
        Errors.Add("If očekává bool - " + context.Start.Line);
      return base.VisitIfStat(context);
    }

    public override string VisitWhileLoop([NotNull] salangParser.WhileLoopContext context)
    {
      if (Visit(context.children[2]) != "bool")
        Errors.Add("While očekává bool - " + context.Start.Line);
      return base.VisitWhileLoop(context);
    }

		public override string VisitTernaryExpr([NotNull] salangParser.TernaryExprContext context)
		{
			string type1 = Visit(context.children[0]);
			string type2 = Visit(context.children[2]);
      string type3 = Visit(context.children[4]);

      if (type1 != "bool")
        Errors.Add("Ternární operátor očekává bool - " + context.Start.Line);
      else if (type2 == type3)
        return type2;
      else if ((type2 == "float" && type3 == "int") || (type2 == "int" && type3 == "float"))
        return "float";
      else
        Errors.Add("Typy v ternarnárním operátor se neshodují " + context.Start.Line);

			return base.VisitTernaryExpr(context);
		}
	}
}