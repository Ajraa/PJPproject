using Antlr4.Runtime;
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
    }
  }
}
