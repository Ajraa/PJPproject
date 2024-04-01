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
public class Project_exprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT_KEYWORD=8, 
		FLOAT_KEYWORD=9, STRING_KEYWORD=10, BOOL_KEYWORD=11, SEMI=12, COMMA=13, 
		CON=14, MUL=15, DIV=16, MOD=17, ADD=18, SUB=19, LES=20, GRE=21, NEG=22, 
		EQ=23, NEQ=24, AND=25, OR=26, READ=27, WRITE=28, IF=29, ELSE=30, WHILE=31, 
		IDENTIFIER=32, FLOAT=33, INT=34, BOOL=35, STRING=36, WS=37, COMMENT=38, 
		LINE_COMMENT=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "INT_KEYWORD", 
			"FLOAT_KEYWORD", "STRING_KEYWORD", "BOOL_KEYWORD", "SEMI", "COMMA", "CON", 
			"MUL", "DIV", "MOD", "ADD", "SUB", "LES", "GRE", "NEG", "EQ", "NEQ", 
			"AND", "OR", "READ", "WRITE", "IF", "ELSE", "WHILE", "IDENTIFIER", "FLOAT", 
			"INT", "BOOL", "STRING", "EscapeSequence", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'true'", "'false'", "'='", "'int'", 
			"'float'", "'string'", "'bool'", "';'", "','", "'.'", "'*'", "'/'", "'%'", 
			"'+'", "'-'", "'<'", "'>'", "'!'", "'=='", "'!='", "'&&'", "'||'", "'read'", 
			"'write'", "'if'", "'else'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "INT_KEYWORD", "FLOAT_KEYWORD", 
			"STRING_KEYWORD", "BOOL_KEYWORD", "SEMI", "COMMA", "CON", "MUL", "DIV", 
			"MOD", "ADD", "SUB", "LES", "GRE", "NEG", "EQ", "NEQ", "AND", "OR", "READ", 
			"WRITE", "IF", "ELSE", "WHILE", "IDENTIFIER", "FLOAT", "INT", "BOOL", 
			"STRING", "WS", "COMMENT", "LINE_COMMENT"
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


	public Project_exprLexer(CharStream input) {
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
		"\u0004\u0000\'\u0111\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"&\u0002\'\u0007\'\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0005\u001f\u00ba\b\u001f\n\u001f\f\u001f"+
		"\u00bd\t\u001f\u0003\u001f\u00bf\b\u001f\u0001 \u0004 \u00c2\b \u000b"+
		" \f \u00c3\u0001 \u0001 \u0004 \u00c8\b \u000b \f \u00c9\u0001!\u0004"+
		"!\u00cd\b!\u000b!\f!\u00ce\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u00da\b\"\u0001#\u0001#\u0001#\u0005"+
		"#\u00df\b#\n#\f#\u00e2\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u00ea\b$\u0001$\u0003$\u00ed\b$\u0001$\u0003$\u00f0\b$\u0001%\u0004"+
		"%\u00f3\b%\u000b%\f%\u00f4\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005"+
		"&\u00fd\b&\n&\f&\u0100\t&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u010b\b\'\n\'\f\'\u010e\t\'\u0001\'\u0001\'"+
		"\u0001\u00fe\u0000(\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e"+
		"=\u001f? A!C\"E#G$I\u0000K%M&O\'\u0001\u0000\t\u0002\u0000AZaz\u0003\u0000"+
		"09AZaz\u0001\u000009\u0004\u0000\n\n\r\r\"\"\\\\\b\u0000\"\"\'\'\\\\b"+
		"bffnnrrtt\u0001\u000003\u0001\u000007\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"\n\n\r\r\u011d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000"+
		"\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0001"+
		"Q\u0001\u0000\u0000\u0000\u0003S\u0001\u0000\u0000\u0000\u0005U\u0001"+
		"\u0000\u0000\u0000\u0007W\u0001\u0000\u0000\u0000\tY\u0001\u0000\u0000"+
		"\u0000\u000b^\u0001\u0000\u0000\u0000\rd\u0001\u0000\u0000\u0000\u000f"+
		"f\u0001\u0000\u0000\u0000\u0011j\u0001\u0000\u0000\u0000\u0013p\u0001"+
		"\u0000\u0000\u0000\u0015w\u0001\u0000\u0000\u0000\u0017|\u0001\u0000\u0000"+
		"\u0000\u0019~\u0001\u0000\u0000\u0000\u001b\u0080\u0001\u0000\u0000\u0000"+
		"\u001d\u0082\u0001\u0000\u0000\u0000\u001f\u0084\u0001\u0000\u0000\u0000"+
		"!\u0086\u0001\u0000\u0000\u0000#\u0088\u0001\u0000\u0000\u0000%\u008a"+
		"\u0001\u0000\u0000\u0000\'\u008c\u0001\u0000\u0000\u0000)\u008e\u0001"+
		"\u0000\u0000\u0000+\u0090\u0001\u0000\u0000\u0000-\u0092\u0001\u0000\u0000"+
		"\u0000/\u0095\u0001\u0000\u0000\u00001\u0098\u0001\u0000\u0000\u00003"+
		"\u009b\u0001\u0000\u0000\u00005\u009e\u0001\u0000\u0000\u00007\u00a3\u0001"+
		"\u0000\u0000\u00009\u00a9\u0001\u0000\u0000\u0000;\u00ac\u0001\u0000\u0000"+
		"\u0000=\u00b1\u0001\u0000\u0000\u0000?\u00b7\u0001\u0000\u0000\u0000A"+
		"\u00c1\u0001\u0000\u0000\u0000C\u00cc\u0001\u0000\u0000\u0000E\u00d9\u0001"+
		"\u0000\u0000\u0000G\u00db\u0001\u0000\u0000\u0000I\u00ef\u0001\u0000\u0000"+
		"\u0000K\u00f2\u0001\u0000\u0000\u0000M\u00f8\u0001\u0000\u0000\u0000O"+
		"\u0106\u0001\u0000\u0000\u0000QR\u0005{\u0000\u0000R\u0002\u0001\u0000"+
		"\u0000\u0000ST\u0005}\u0000\u0000T\u0004\u0001\u0000\u0000\u0000UV\u0005"+
		"(\u0000\u0000V\u0006\u0001\u0000\u0000\u0000WX\u0005)\u0000\u0000X\b\u0001"+
		"\u0000\u0000\u0000YZ\u0005t\u0000\u0000Z[\u0005r\u0000\u0000[\\\u0005"+
		"u\u0000\u0000\\]\u0005e\u0000\u0000]\n\u0001\u0000\u0000\u0000^_\u0005"+
		"f\u0000\u0000_`\u0005a\u0000\u0000`a\u0005l\u0000\u0000ab\u0005s\u0000"+
		"\u0000bc\u0005e\u0000\u0000c\f\u0001\u0000\u0000\u0000de\u0005=\u0000"+
		"\u0000e\u000e\u0001\u0000\u0000\u0000fg\u0005i\u0000\u0000gh\u0005n\u0000"+
		"\u0000hi\u0005t\u0000\u0000i\u0010\u0001\u0000\u0000\u0000jk\u0005f\u0000"+
		"\u0000kl\u0005l\u0000\u0000lm\u0005o\u0000\u0000mn\u0005a\u0000\u0000"+
		"no\u0005t\u0000\u0000o\u0012\u0001\u0000\u0000\u0000pq\u0005s\u0000\u0000"+
		"qr\u0005t\u0000\u0000rs\u0005r\u0000\u0000st\u0005i\u0000\u0000tu\u0005"+
		"n\u0000\u0000uv\u0005g\u0000\u0000v\u0014\u0001\u0000\u0000\u0000wx\u0005"+
		"b\u0000\u0000xy\u0005o\u0000\u0000yz\u0005o\u0000\u0000z{\u0005l\u0000"+
		"\u0000{\u0016\u0001\u0000\u0000\u0000|}\u0005;\u0000\u0000}\u0018\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005,\u0000\u0000\u007f\u001a\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005.\u0000\u0000\u0081\u001c\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005*\u0000\u0000\u0083\u001e\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005/\u0000\u0000\u0085 \u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"%\u0000\u0000\u0087\"\u0001\u0000\u0000\u0000\u0088\u0089\u0005+\u0000"+
		"\u0000\u0089$\u0001\u0000\u0000\u0000\u008a\u008b\u0005-\u0000\u0000\u008b"+
		"&\u0001\u0000\u0000\u0000\u008c\u008d\u0005<\u0000\u0000\u008d(\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005>\u0000\u0000\u008f*\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005!\u0000\u0000\u0091,\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005=\u0000\u0000\u0093\u0094\u0005=\u0000\u0000\u0094.\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005!\u0000\u0000\u0096\u0097\u0005=\u0000"+
		"\u0000\u00970\u0001\u0000\u0000\u0000\u0098\u0099\u0005&\u0000\u0000\u0099"+
		"\u009a\u0005&\u0000\u0000\u009a2\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"|\u0000\u0000\u009c\u009d\u0005|\u0000\u0000\u009d4\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005r\u0000\u0000\u009f\u00a0\u0005e\u0000\u0000\u00a0"+
		"\u00a1\u0005a\u0000\u0000\u00a1\u00a2\u0005d\u0000\u0000\u00a26\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005w\u0000\u0000\u00a4\u00a5\u0005r\u0000"+
		"\u0000\u00a5\u00a6\u0005i\u0000\u0000\u00a6\u00a7\u0005t\u0000\u0000\u00a7"+
		"\u00a8\u0005e\u0000\u0000\u00a88\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"i\u0000\u0000\u00aa\u00ab\u0005f\u0000\u0000\u00ab:\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005e\u0000\u0000\u00ad\u00ae\u0005l\u0000\u0000\u00ae"+
		"\u00af\u0005s\u0000\u0000\u00af\u00b0\u0005e\u0000\u0000\u00b0<\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005w\u0000\u0000\u00b2\u00b3\u0005h\u0000"+
		"\u0000\u00b3\u00b4\u0005i\u0000\u0000\u00b4\u00b5\u0005l\u0000\u0000\u00b5"+
		"\u00b6\u0005e\u0000\u0000\u00b6>\u0001\u0000\u0000\u0000\u00b7\u00be\u0007"+
		"\u0000\u0000\u0000\u00b8\u00ba\u0007\u0001\u0000\u0000\u00b9\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00bb\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf@\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c2\u0007\u0002\u0000\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c7\u0005.\u0000\u0000\u00c6\u00c8\u0007\u0002\u0000"+
		"\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000"+
		"\u0000\u00caB\u0001\u0000\u0000\u0000\u00cb\u00cd\u0007\u0002\u0000\u0000"+
		"\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cfD\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005t\u0000\u0000\u00d1\u00d2"+
		"\u0005r\u0000\u0000\u00d2\u00d3\u0005u\u0000\u0000\u00d3\u00da\u0005e"+
		"\u0000\u0000\u00d4\u00d5\u0005f\u0000\u0000\u00d5\u00d6\u0005a\u0000\u0000"+
		"\u00d6\u00d7\u0005l\u0000\u0000\u00d7\u00d8\u0005s\u0000\u0000\u00d8\u00da"+
		"\u0005e\u0000\u0000\u00d9\u00d0\u0001\u0000\u0000\u0000\u00d9\u00d4\u0001"+
		"\u0000\u0000\u0000\u00daF\u0001\u0000\u0000\u0000\u00db\u00e0\u0005\""+
		"\u0000\u0000\u00dc\u00df\b\u0003\u0000\u0000\u00dd\u00df\u0003I$\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000"+
		"\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\"\u0000\u0000\u00e4"+
		"H\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\\\u0000\u0000\u00e6\u00f0"+
		"\u0007\u0004\u0000\u0000\u00e7\u00ec\u0005\\\u0000\u0000\u00e8\u00ea\u0007"+
		"\u0005\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0007"+
		"\u0006\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0007"+
		"\u0006\u0000\u0000\u00ef\u00e5\u0001\u0000\u0000\u0000\u00ef\u00e7\u0001"+
		"\u0000\u0000\u0000\u00f0J\u0001\u0000\u0000\u0000\u00f1\u00f3\u0007\u0007"+
		"\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0006%\u0000"+
		"\u0000\u00f7L\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005/\u0000\u0000\u00f9"+
		"\u00fa\u0005*\u0000\u0000\u00fa\u00fe\u0001\u0000\u0000\u0000\u00fb\u00fd"+
		"\t\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005*\u0000\u0000\u0102\u0103\u0005/\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0006&\u0000\u0000"+
		"\u0105N\u0001\u0000\u0000\u0000\u0106\u0107\u0005/\u0000\u0000\u0107\u0108"+
		"\u0005/\u0000\u0000\u0108\u010c\u0001\u0000\u0000\u0000\u0109\u010b\b"+
		"\b\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0006\'\u0000\u0000\u0110P\u0001\u0000\u0000"+
		"\u0000\u000f\u0000\u00bb\u00be\u00c3\u00c9\u00ce\u00d9\u00de\u00e0\u00e9"+
		"\u00ec\u00ef\u00f4\u00fe\u010c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}