using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PJPproject
{
  internal class VirtualMachine
  {
    private Stack<(string type, object value)> stack = new();
    private Dictionary<int, int> labels = new();
    private List<string> instructions = new();
    private Dictionary<string, (string type, object value)> variables = new();

    public VirtualMachine(string filename) 
    {
      var lines = File.ReadAllLines(filename);

      int i = 0;
      foreach (var line in lines)
      {
        instructions.Add(line);
        if(line.Contains("label"))
        {
          var index = int.Parse(line.Split(' ')[1]);
          labels.Add(index, i);
        }
        i++;
      }
    }

    public void Run()
    {
      int current = 0;
      while (current < instructions.Count)
      {
        var command = instructions[current].Split(' ');
        var name = command[0];
        var args = command.Skip(1).ToArray();
        switch (name)
        {
          case "load": Load(args[0]); break;
          case "save": Save(args[0]); break;
          case "print": Print(int.Parse(args[0])); break;
          case "read": Read(args[0]); break;
          case "pop": stack.Pop(); break;
          case "push":
            var type = args[0];
            var val = args[1];
            if (type == "S")
              for (int i = 2; i < args.Length; i++)
                val += " " + args[i];
            Push(type, val);
            break;
          case "itof": Itof(); break;
          case "not": Not(); break;
          case "eq": Eq(); break;
          case "lt": Lt(); break;
          case "gt": Gt(); break;
          case "and": And(); break;
          case "or": Or(); break;
          case "concat": Concat(); break;
          case "uminus": Uminus(); break;
          case "mod": Mod(); break;
          case "div": Div(); break;
          case "mul": Mul(); break;
          case "add": Add(); break;
          case "sub": Sub(); break;
          case "jmp": current = labels[int.Parse(args[0])]; break;
          case "fjmp": current = (bool)stack.Pop().value ? current : labels[int.Parse(args[0])]; break;
          case "label": break;
          default:
            throw new InvalidOperationException($"Unknown command {name}");
            break;
        }
        current++;
      }
    }

    private void Push(string typeId, string val)
    {
      (string type, object value) tup = typeId switch
      {
        "I" when int.TryParse(val, out int intValue) => ("int", intValue),
        "F" when float.TryParse(val, out float floatValue) => ("float", floatValue),
        "B" when bool.TryParse(val, out bool boolValue) => ("bool", boolValue),
        "S" => ("string", val.Replace("\"", String.Empty)),
        _ => throw new Exception($"Read expected '{typeId}'")
      };

      stack.Push(tup);
    }

    private void Load(string name)
    {
      if (variables.ContainsKey(name))
      {
        stack.Push(variables[name]);
      }
      else
        throw new InvalidOperationException($"Variable {name} was not initialized");
    }

    private void Save(string name)
    {
      variables[name] = stack.Pop();
    }

    private void Read(string typeId)
    {
      var val = Console.ReadLine();
      (string type, object value) tup = typeId switch
      {
        "I" when int.TryParse(val, out int intValue) => ("int", intValue),
        "F" when float.TryParse(val, out float floatValue) => ("float", floatValue),
        "B" when bool.TryParse(val, out bool boolValue) => ("bool", boolValue),
        "S" => ("string", val.Replace("\"", String.Empty)),
        _ => throw new Exception($"Read expected '{typeId}'")
      };

      stack.Push(tup);
    }

    private void Print(int num)
    {
      var items = new object[num];
      for (int i = num - 1; i >= 0; i--)
        items[i] = stack.Pop().value;
      Console.WriteLine(string.Join("", items));
    }

    private void Itof()
    {
      var value = stack.Pop();
      if(value.type == "int")
        stack.Push(("float",(float)Convert.ToInt32(value.value)));
      else
        stack.Push(("float", (float)value.value));
    }

    private void Lt()
    {
      var right = stack.Pop();
      var left = stack.Pop();

      bool result = left.type switch
      {
        "int" => Convert.ToInt32(left.value) < Convert.ToInt32(right.value),
        "float" => (float)left.value < (float)right.value,
        _ => throw new ArgumentException($"Cannot compare: {left.type} < {right.type}")
      };

      stack.Push(("bool", result));
    }

    private void Gt()
    {
      var right = stack.Pop();
      var left = stack.Pop();

      bool result = left.type switch
      {
        "int" => Convert.ToInt32(left.value) > Convert.ToInt32(right.value),
        "float" => (float)left.value > (float)right.value,
        _ => throw new ArgumentException($"Cannot compare: {left.type} > {right.type}")
      };

      stack.Push(("bool", result));
    }

    private void Eq()
    {
      var right = stack.Pop();
      var left = stack.Pop();

      bool result = left.type switch
      {
        "int" => Convert.ToInt32(left.value) == Convert.ToInt32(right.value),
        "float" => (float)left.value == (float)right.value,
        "string" => (string)left.value == (string)right.value,
        _ => throw new ArgumentException($"Cannot compare: {left.type} == {right.type}")
      };

      stack.Push(("bool", result));
    }

    private void Not()
    {
      var val = stack.Pop();
      if (val.type != "bool")
        throw new ArgumentException($"Cannot negate {val.type}");
      stack.Push(("bool", !(bool)val.value));
    }

    private void And()
    {
      var right = stack.Pop();
      var left = stack.Pop();

      if (left.type != "bool" || right.type != "bool")
        throw new ArgumentException($"Cannot use: {left.type} && {right.type}");

      stack.Push(("bool", (bool)left.value && (bool) right.value));
    }

    private void Or()
    {
      var right = stack.Pop();
      var left = stack.Pop();

      if (left.type != "bool" || right.type != "bool")
        throw new ArgumentException($"Cannot use: {left.type} || {right.type}");

      stack.Push(("bool", (bool)left.value || (bool)right.value));
    }
    private void Uminus()
    {
      var value = stack.Pop();

      object negatedValue = value.type switch
      {
        "int" => -Convert.ToInt32(value.value),
        "float" => -(float)value.value,
        _ => throw new ArgumentException($"Cannot uminuts {value}.")
      };
      stack.Push((value.type, negatedValue));
    }

    private void Add()
    {
      var right = stack.Pop();
      var left = stack.Pop();

      var result = left.type switch
      {
        "float" => (float)left.value + (float)right.value,
        "int" => Convert.ToInt32(left.value) + Convert.ToInt32(right.value),
        _ => throw new ArgumentException($"Cannot use ADD on ${left.type}")
      };

      stack.Push((left.type, result));
    }

    private void Sub()
    {
      var right = stack.Pop();
      var left = stack.Pop();

      var result = left.type switch
      {
        "float" => (float)left.value - (float)right.value,
        "int" => Convert.ToInt32(left.value) - Convert.ToInt32(right.value),
        _ => throw new ArgumentException($"Cannot use SUB on ${left.type}")
      };

      stack.Push((left.type, result));
    }

    private void Concat()
    {
      var left = stack.Pop();
      var right = stack.Pop();
      if (left.type != "string" || right.type != "string")
        throw new ArgumentException($"Unsupported type '{left.type}' or '{left.type}' for string concatenation.");

      stack.Push(("string", $"{(string)left.value}{(string)right.value}"));

    }

    private void Mul()
    {
      var right = stack.Pop();
      var left = stack.Pop();

      var result = left.type switch
      {
        "float" => (float)left.value * (float)right.value,
        "int" => Convert.ToInt32(left.value) * Convert.ToInt32(right.value),
        _ => throw new ArgumentException($"Cannot use MUL on ${left.type}")
      };

      stack.Push((left.type, result));
    }

    private void Div()
    {
      var right = stack.Pop();
      var left = stack.Pop();

      var result = left.type switch
      {
        "float" => (float)left.value / (float)right.value,
        "int" => Convert.ToInt32(left.value) / Convert.ToInt32(right.value),
        _ => throw new ArgumentException($"Cannot use DIV on ${left.type}")
      };

      stack.Push((left.type, result));
    }

    private void Mod()
    {
      var right = stack.Pop();
      var left = stack.Pop();

      stack.Push(("int",Convert.ToInt32(left.value) + Convert.ToInt32(right.value)));
    }
  }
}
