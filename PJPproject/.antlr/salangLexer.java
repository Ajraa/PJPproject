// Generated from d:/C#Projects/PJPproject/PJPproject/salang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class salangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING_VAL=1, SEMI=2, COMA=3, INT=4, FLOAT=5, STRING=6, BOOL=7, IF=8, 
		ELSE=9, WHILE=10, FOR=11, READ=12, WRITE=13, ID=14, FLOAT_VAL=15, INT_VAL=16, 
		BOOL_VAL=17, ASSIGN=18, MUL=19, DIV=20, ADD=21, SUB=22, MOD=23, CON=24, 
		LES=25, GRE=26, NEG=27, EQ=28, NEQ=29, AND=30, OR=31, LPARAN=32, RPARAN=33, 
		LCPARAN=34, RCPARAN=35, WS=36, COMMENT=37, LINE_COMMENT=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRING_VAL", "StringCharacters", "StringCharacter", "EscapeSequence", 
			"OctalEscape", "UnicodeEscape", "HexDigit", "OctalDigit", "ZeroToThree", 
			"SEMI", "COMA", "INT", "FLOAT", "STRING", "BOOL", "IF", "ELSE", "WHILE", 
			"FOR", "READ", "WRITE", "ID", "FLOAT_VAL", "INT_VAL", "BOOL_VAL", "ASSIGN", 
			"MUL", "DIV", "ADD", "SUB", "MOD", "CON", "LES", "GRE", "NEG", "EQ", 
			"NEQ", "AND", "OR", "LPARAN", "RPARAN", "LCPARAN", "RCPARAN", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", "','", "'int'", "'float'", "'string'", "'bool'", "'if'", 
			"'else'", "'while'", "'for'", "'read'", "'write'", null, null, null, 
			null, "'='", "'*'", "'/'", "'+'", "'-'", "'%'", "'.'", "'<'", "'>'", 
			"'!'", "'=='", "'!='", "'&&'", "'||'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING_VAL", "SEMI", "COMA", "INT", "FLOAT", "STRING", "BOOL", 
			"IF", "ELSE", "WHILE", "FOR", "READ", "WRITE", "ID", "FLOAT_VAL", "INT_VAL", 
			"BOOL_VAL", "ASSIGN", "MUL", "DIV", "ADD", "SUB", "MOD", "CON", "LES", 
			"GRE", "NEG", "EQ", "NEQ", "AND", "OR", "LPARAN", "RPARAN", "LCPARAN", 
			"RCPARAN", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public salangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "salang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000&\u0133\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0001\u0000\u0001\u0000\u0003\u0000`\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001e\b\u0001\u000b\u0001"+
		"\f\u0001f\u0001\u0002\u0001\u0002\u0003\u0002k\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003q\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004~\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0004\u0005\u0082\b\u0005\u000b\u0005\f\u0005\u0083"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u00ca\b\u0015\n\u0015\f\u0015\u00cd\t\u0015"+
		"\u0003\u0015\u00cf\b\u0015\u0001\u0016\u0004\u0016\u00d2\b\u0016\u000b"+
		"\u0016\f\u0016\u00d3\u0001\u0016\u0001\u0016\u0004\u0016\u00d8\b\u0016"+
		"\u000b\u0016\f\u0016\u00d9\u0001\u0017\u0004\u0017\u00dd\b\u0017\u000b"+
		"\u0017\f\u0017\u00de\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00ea"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001"+
		"*\u0001+\u0004+\u0115\b+\u000b+\f+\u0116\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0005,\u011f\b,\n,\f,\u0122\t,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001-\u0005-\u012d\b-\n-\f-\u0130\t-\u0001-\u0001"+
		"-\u0001\u0120\u0000.\u0001\u0001\u0003\u0000\u0005\u0000\u0007\u0000\t"+
		"\u0000\u000b\u0000\r\u0000\u000f\u0000\u0011\u0000\u0013\u0002\u0015\u0003"+
		"\u0017\u0004\u0019\u0005\u001b\u0006\u001d\u0007\u001f\b!\t#\n%\u000b"+
		"\'\f)\r+\u000e-\u000f/\u00101\u00113\u00125\u00137\u00149\u0015;\u0016"+
		"=\u0017?\u0018A\u0019C\u001aE\u001bG\u001cI\u001dK\u001eM\u001fO Q!S\""+
		"U#W$Y%[&\u0001\u0000\n\u0004\u0000\n\n\r\r\"\"\\\\\b\u0000\"\"\'\'\\\\"+
		"bbffnnrrtt\u0003\u000009AFaf\u0001\u000007\u0001\u000003\u0002\u0000A"+
		"Zaz\u0003\u000009AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"\n\n\r\r\u013b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000"+
		"E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001"+
		"\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000"+
		"\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000"+
		"S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001"+
		"\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000"+
		"\u0000\u0001]\u0001\u0000\u0000\u0000\u0003d\u0001\u0000\u0000\u0000\u0005"+
		"j\u0001\u0000\u0000\u0000\u0007p\u0001\u0000\u0000\u0000\t}\u0001\u0000"+
		"\u0000\u0000\u000b\u007f\u0001\u0000\u0000\u0000\r\u008a\u0001\u0000\u0000"+
		"\u0000\u000f\u008c\u0001\u0000\u0000\u0000\u0011\u008e\u0001\u0000\u0000"+
		"\u0000\u0013\u0090\u0001\u0000\u0000\u0000\u0015\u0092\u0001\u0000\u0000"+
		"\u0000\u0017\u0094\u0001\u0000\u0000\u0000\u0019\u0098\u0001\u0000\u0000"+
		"\u0000\u001b\u009e\u0001\u0000\u0000\u0000\u001d\u00a5\u0001\u0000\u0000"+
		"\u0000\u001f\u00aa\u0001\u0000\u0000\u0000!\u00ad\u0001\u0000\u0000\u0000"+
		"#\u00b2\u0001\u0000\u0000\u0000%\u00b8\u0001\u0000\u0000\u0000\'\u00bc"+
		"\u0001\u0000\u0000\u0000)\u00c1\u0001\u0000\u0000\u0000+\u00c7\u0001\u0000"+
		"\u0000\u0000-\u00d1\u0001\u0000\u0000\u0000/\u00dc\u0001\u0000\u0000\u0000"+
		"1\u00e9\u0001\u0000\u0000\u00003\u00eb\u0001\u0000\u0000\u00005\u00ed"+
		"\u0001\u0000\u0000\u00007\u00ef\u0001\u0000\u0000\u00009\u00f1\u0001\u0000"+
		"\u0000\u0000;\u00f3\u0001\u0000\u0000\u0000=\u00f5\u0001\u0000\u0000\u0000"+
		"?\u00f7\u0001\u0000\u0000\u0000A\u00f9\u0001\u0000\u0000\u0000C\u00fb"+
		"\u0001\u0000\u0000\u0000E\u00fd\u0001\u0000\u0000\u0000G\u00ff\u0001\u0000"+
		"\u0000\u0000I\u0102\u0001\u0000\u0000\u0000K\u0105\u0001\u0000\u0000\u0000"+
		"M\u0108\u0001\u0000\u0000\u0000O\u010b\u0001\u0000\u0000\u0000Q\u010d"+
		"\u0001\u0000\u0000\u0000S\u010f\u0001\u0000\u0000\u0000U\u0111\u0001\u0000"+
		"\u0000\u0000W\u0114\u0001\u0000\u0000\u0000Y\u011a\u0001\u0000\u0000\u0000"+
		"[\u0128\u0001\u0000\u0000\u0000]_\u0005\"\u0000\u0000^`\u0003\u0003\u0001"+
		"\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ab\u0005\"\u0000\u0000b\u0002\u0001\u0000\u0000\u0000ce\u0003"+
		"\u0005\u0002\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0004\u0001\u0000"+
		"\u0000\u0000hk\b\u0000\u0000\u0000ik\u0003\u0007\u0003\u0000jh\u0001\u0000"+
		"\u0000\u0000ji\u0001\u0000\u0000\u0000k\u0006\u0001\u0000\u0000\u0000"+
		"lm\u0005\\\u0000\u0000mq\u0007\u0001\u0000\u0000nq\u0003\t\u0004\u0000"+
		"oq\u0003\u000b\u0005\u0000pl\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000po\u0001\u0000\u0000\u0000q\b\u0001\u0000\u0000\u0000rs\u0005\\"+
		"\u0000\u0000s~\u0003\u000f\u0007\u0000tu\u0005\\\u0000\u0000uv\u0003\u000f"+
		"\u0007\u0000vw\u0003\u000f\u0007\u0000w~\u0001\u0000\u0000\u0000xy\u0005"+
		"\\\u0000\u0000yz\u0003\u0011\b\u0000z{\u0003\u000f\u0007\u0000{|\u0003"+
		"\u000f\u0007\u0000|~\u0001\u0000\u0000\u0000}r\u0001\u0000\u0000\u0000"+
		"}t\u0001\u0000\u0000\u0000}x\u0001\u0000\u0000\u0000~\n\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0005\\\u0000\u0000\u0080\u0082\u0005u\u0000\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0003\r\u0006\u0000\u0086"+
		"\u0087\u0003\r\u0006\u0000\u0087\u0088\u0003\r\u0006\u0000\u0088\u0089"+
		"\u0003\r\u0006\u0000\u0089\f\u0001\u0000\u0000\u0000\u008a\u008b\u0007"+
		"\u0002\u0000\u0000\u008b\u000e\u0001\u0000\u0000\u0000\u008c\u008d\u0007"+
		"\u0003\u0000\u0000\u008d\u0010\u0001\u0000\u0000\u0000\u008e\u008f\u0007"+
		"\u0004\u0000\u0000\u008f\u0012\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		";\u0000\u0000\u0091\u0014\u0001\u0000\u0000\u0000\u0092\u0093\u0005,\u0000"+
		"\u0000\u0093\u0016\u0001\u0000\u0000\u0000\u0094\u0095\u0005i\u0000\u0000"+
		"\u0095\u0096\u0005n\u0000\u0000\u0096\u0097\u0005t\u0000\u0000\u0097\u0018"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005f\u0000\u0000\u0099\u009a\u0005"+
		"l\u0000\u0000\u009a\u009b\u0005o\u0000\u0000\u009b\u009c\u0005a\u0000"+
		"\u0000\u009c\u009d\u0005t\u0000\u0000\u009d\u001a\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005s\u0000\u0000\u009f\u00a0\u0005t\u0000\u0000\u00a0\u00a1"+
		"\u0005r\u0000\u0000\u00a1\u00a2\u0005i\u0000\u0000\u00a2\u00a3\u0005n"+
		"\u0000\u0000\u00a3\u00a4\u0005g\u0000\u0000\u00a4\u001c\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005b\u0000\u0000\u00a6\u00a7\u0005o\u0000\u0000\u00a7"+
		"\u00a8\u0005o\u0000\u0000\u00a8\u00a9\u0005l\u0000\u0000\u00a9\u001e\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005i\u0000\u0000\u00ab\u00ac\u0005f\u0000"+
		"\u0000\u00ac \u0001\u0000\u0000\u0000\u00ad\u00ae\u0005e\u0000\u0000\u00ae"+
		"\u00af\u0005l\u0000\u0000\u00af\u00b0\u0005s\u0000\u0000\u00b0\u00b1\u0005"+
		"e\u0000\u0000\u00b1\"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005w\u0000"+
		"\u0000\u00b3\u00b4\u0005h\u0000\u0000\u00b4\u00b5\u0005i\u0000\u0000\u00b5"+
		"\u00b6\u0005l\u0000\u0000\u00b6\u00b7\u0005e\u0000\u0000\u00b7$\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005f\u0000\u0000\u00b9\u00ba\u0005o\u0000"+
		"\u0000\u00ba\u00bb\u0005r\u0000\u0000\u00bb&\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005r\u0000\u0000\u00bd\u00be\u0005e\u0000\u0000\u00be\u00bf\u0005"+
		"a\u0000\u0000\u00bf\u00c0\u0005d\u0000\u0000\u00c0(\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005w\u0000\u0000\u00c2\u00c3\u0005r\u0000\u0000\u00c3"+
		"\u00c4\u0005i\u0000\u0000\u00c4\u00c5\u0005t\u0000\u0000\u00c5\u00c6\u0005"+
		"e\u0000\u0000\u00c6*\u0001\u0000\u0000\u0000\u00c7\u00ce\u0007\u0005\u0000"+
		"\u0000\u00c8\u00ca\u0007\u0006\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf,\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d2\u0007\u0007\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d7\u0005.\u0000\u0000\u00d6\u00d8\u0007\u0007\u0000\u0000\u00d7"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		".\u0001\u0000\u0000\u0000\u00db\u00dd\u0007\u0007\u0000\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0005t\u0000\u0000\u00e1\u00e2\u0005r\u0000"+
		"\u0000\u00e2\u00e3\u0005u\u0000\u0000\u00e3\u00ea\u0005e\u0000\u0000\u00e4"+
		"\u00e5\u0005f\u0000\u0000\u00e5\u00e6\u0005a\u0000\u0000\u00e6\u00e7\u0005"+
		"l\u0000\u0000\u00e7\u00e8\u0005s\u0000\u0000\u00e8\u00ea\u0005e\u0000"+
		"\u0000\u00e9\u00e0\u0001\u0000\u0000\u0000\u00e9\u00e4\u0001\u0000\u0000"+
		"\u0000\u00ea2\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005=\u0000\u0000\u00ec"+
		"4\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005*\u0000\u0000\u00ee6\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005/\u0000\u0000\u00f08\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0005+\u0000\u0000\u00f2:\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005-\u0000\u0000\u00f4<\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"%\u0000\u0000\u00f6>\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005.\u0000"+
		"\u0000\u00f8@\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005<\u0000\u0000\u00fa"+
		"B\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005>\u0000\u0000\u00fcD\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0005!\u0000\u0000\u00feF\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005=\u0000\u0000\u0100\u0101\u0005=\u0000\u0000\u0101"+
		"H\u0001\u0000\u0000\u0000\u0102\u0103\u0005!\u0000\u0000\u0103\u0104\u0005"+
		"=\u0000\u0000\u0104J\u0001\u0000\u0000\u0000\u0105\u0106\u0005&\u0000"+
		"\u0000\u0106\u0107\u0005&\u0000\u0000\u0107L\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0005|\u0000\u0000\u0109\u010a\u0005|\u0000\u0000\u010aN\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005(\u0000\u0000\u010cP\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0005)\u0000\u0000\u010eR\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0005{\u0000\u0000\u0110T\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"}\u0000\u0000\u0112V\u0001\u0000\u0000\u0000\u0113\u0115\u0007\b\u0000"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0006+\u0000\u0000"+
		"\u0119X\u0001\u0000\u0000\u0000\u011a\u011b\u0005/\u0000\u0000\u011b\u011c"+
		"\u0005*\u0000\u0000\u011c\u0120\u0001\u0000\u0000\u0000\u011d\u011f\t"+
		"\u0000\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0120\u011e\u0001"+
		"\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0005*\u0000\u0000\u0124\u0125\u0005/\u0000"+
		"\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0006,\u0000\u0000"+
		"\u0127Z\u0001\u0000\u0000\u0000\u0128\u0129\u0005/\u0000\u0000\u0129\u012a"+
		"\u0005/\u0000\u0000\u012a\u012e\u0001\u0000\u0000\u0000\u012b\u012d\b"+
		"\t\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0006-\u0000\u0000\u0132\\\u0001\u0000\u0000"+
		"\u0000\u0010\u0000_fjp}\u0083\u00cb\u00ce\u00d3\u00d9\u00de\u00e9\u0116"+
		"\u0120\u012e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}