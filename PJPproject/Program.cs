using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System.Globalization;
using System.Net.Http.Headers;

namespace PJPproject
{
  internal class Program
  {
    static void Main(string[] args)
    {
      Thread.CurrentThread.CurrentCulture = new CultureInfo("en-US");
      var fileName = "input.txt";
      Console.WriteLine("Parsing: " + fileName);
      var inputFile = new StreamReader(fileName);
      AntlrInputStream input = new AntlrInputStream(inputFile);
      salangLexer lexer = new salangLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer); 
      salangParser parser = new salangParser(tokens);

      parser.AddErrorListener(new VerboseListener());
      IParseTree tree = parser.prog();

      if (parser.NumberOfSyntaxErrors == 0)
      {
        Console.WriteLine("Bez chyby");
      }

      VisitorTypeCheck visitor = new VisitorTypeCheck();
      visitor.Visit(tree);

      if (visitor.Errors.Count > 0)
      {
        foreach (string err in visitor.Errors)
          Console.WriteLine(err);
        return;
      }

      TargetVisitor targetVisitor = new TargetVisitor();
      targetVisitor.TypeVisitor = visitor;
      string target = targetVisitor.Visit(tree);
      //Console.WriteLine(target);
      try
      {
        using (StreamWriter writer = new StreamWriter("target.txt"))
        {
          writer.Write(target);
        }
      }
      catch (Exception e)
      {
        Console.WriteLine(e.ToString());
      }


      try
      {
        var intertpreter = new VirtualMachine("target.txt");
        intertpreter.Run();
      }
      catch (Exception e)
      {
        Console.WriteLine(e.StackTrace);
      }
    }
  }
}
