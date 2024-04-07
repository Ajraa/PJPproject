// Generated from d:/C#Projects/PJPproject/PJPproject/salang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class salangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING_VAL=1, SEMI=2, COMA=3, INT=4, FLOAT=5, STRING=6, BOOL=7, IF=8, 
		ELSE=9, WHILE=10, FOR=11, READ=12, WRITE=13, FLOAT_VAL=14, INT_VAL=15, 
		BOOL_VAL=16, ASSIGN=17, MUL=18, DIV=19, ADD=20, SUB=21, MOD=22, CON=23, 
		LES=24, GRE=25, NEG=26, EQ=27, NEQ=28, AND=29, OR=30, LPARAN=31, RPARAN=32, 
		LCPARAN=33, RCPARAN=34, ID=35, WS=36, COMMENT=37, LINE_COMMENT=38;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_primitive_type = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "primitive_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", "','", "'int'", "'float'", "'string'", "'bool'", "'if'", 
			"'else'", "'while'", "'for'", "'read'", "'write'", null, null, null, 
			"'='", "'*'", "'/'", "'+'", "'-'", "'%'", "'.'", "'<'", "'>'", "'!'", 
			"'=='", "'!='", "'&&'", "'||'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING_VAL", "SEMI", "COMA", "INT", "FLOAT", "STRING", "BOOL", 
			"IF", "ELSE", "WHILE", "FOR", "READ", "WRITE", "FLOAT_VAL", "INT_VAL", 
			"BOOL_VAL", "ASSIGN", "MUL", "DIV", "ADD", "SUB", "MOD", "CON", "LES", 
			"GRE", "NEG", "EQ", "NEQ", "AND", "OR", "LPARAN", "RPARAN", "LCPARAN", 
			"RCPARAN", "ID", "WS", "COMMENT", "LINE_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "salang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public salangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(salangParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				stat();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 45166493174L) != 0) );
			setState(13);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatContext extends StatContext {
		public StatContext pos;
		public StatContext neg;
		public TerminalNode IF() { return getToken(salangParser.IF, 0); }
		public TerminalNode LPARAN() { return getToken(salangParser.LPARAN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPARAN() { return getToken(salangParser.RPARAN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(salangParser.ELSE, 0); }
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadStatContext extends StatContext {
		public TerminalNode READ() { return getToken(salangParser.READ, 0); }
		public List<TerminalNode> ID() { return getTokens(salangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(salangParser.ID, i);
		}
		public TerminalNode SEMI() { return getToken(salangParser.SEMI, 0); }
		public List<TerminalNode> COMA() { return getTokens(salangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(salangParser.COMA, i);
		}
		public ReadStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends StatContext {
		public TerminalNode WHILE() { return getToken(salangParser.WHILE, 0); }
		public TerminalNode LPARAN() { return getToken(salangParser.LPARAN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPARAN() { return getToken(salangParser.RPARAN, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public WhileLoopContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParanStatContext extends StatContext {
		public TerminalNode LCPARAN() { return getToken(salangParser.LCPARAN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode RCPARAN() { return getToken(salangParser.RCPARAN, 0); }
		public ParanStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(salangParser.SEMI, 0); }
		public ExprStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SemiStatContext extends StatContext {
		public TerminalNode SEMI() { return getToken(salangParser.SEMI, 0); }
		public SemiStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends StatContext {
		public TerminalNode FOR() { return getToken(salangParser.FOR, 0); }
		public TerminalNode LPARAN() { return getToken(salangParser.LPARAN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(salangParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(salangParser.SEMI, i);
		}
		public TerminalNode RPARAN() { return getToken(salangParser.RPARAN, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ForLoopContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationOfVariableContext extends StatContext {
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(salangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(salangParser.ID, i);
		}
		public TerminalNode SEMI() { return getToken(salangParser.SEMI, 0); }
		public List<TerminalNode> COMA() { return getTokens(salangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(salangParser.COMA, i);
		}
		public DeclarationOfVariableContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WriteStatContext extends StatContext {
		public TerminalNode WRITE() { return getToken(salangParser.WRITE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(salangParser.SEMI, 0); }
		public List<TerminalNode> COMA() { return getTokens(salangParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(salangParser.COMA, i);
		}
		public WriteStatContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCPARAN:
				_localctx = new ParanStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(LCPARAN);
				setState(16);
				stat();
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 45166493174L) != 0)) {
					{
					{
					setState(17);
					stat();
					}
					}
					setState(22);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(23);
				match(RCPARAN);
				}
				break;
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
				_localctx = new DeclarationOfVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				primitive_type();
				setState(26);
				match(ID);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(27);
					match(COMA);
					setState(28);
					match(ID);
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
				match(SEMI);
				}
				break;
			case IF:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(IF);
				setState(37);
				match(LPARAN);
				setState(38);
				expr(0);
				setState(39);
				match(RPARAN);
				setState(40);
				((IfStatContext)_localctx).pos = stat();
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(41);
					match(ELSE);
					setState(42);
					((IfStatContext)_localctx).neg = stat();
					}
					break;
				}
				}
				break;
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				match(WHILE);
				setState(46);
				match(LPARAN);
				setState(47);
				expr(0);
				setState(48);
				match(RPARAN);
				setState(49);
				stat();
				}
				break;
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				match(FOR);
				setState(52);
				match(LPARAN);
				setState(53);
				expr(0);
				setState(54);
				match(SEMI);
				setState(55);
				expr(0);
				setState(56);
				match(SEMI);
				setState(57);
				expr(0);
				setState(58);
				match(RPARAN);
				setState(59);
				stat();
				}
				break;
			case READ:
				_localctx = new ReadStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				match(READ);
				setState(62);
				match(ID);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(63);
					match(COMA);
					setState(64);
					match(ID);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(SEMI);
				}
				break;
			case WRITE:
				_localctx = new WriteStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				match(WRITE);
				setState(72);
				expr(0);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(73);
					match(COMA);
					setState(74);
					expr(0);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				match(SEMI);
				}
				break;
			case STRING_VAL:
			case FLOAT_VAL:
			case INT_VAL:
			case BOOL_VAL:
			case SUB:
			case NEG:
			case LPARAN:
			case ID:
				_localctx = new ExprStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				expr(0);
				setState(83);
				match(SEMI);
				}
				break;
			case SEMI:
				_localctx = new SemiStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExprContext {
		public TerminalNode INT_VAL() { return getToken(salangParser.INT_VAL, 0); }
		public IntExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LesGreExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LES() { return getToken(salangParser.LES, 0); }
		public TerminalNode GRE() { return getToken(salangParser.GRE, 0); }
		public LesGreExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(salangParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(salangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(salangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(salangParser.MOD, 0); }
		public MulDivModExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExprContext extends ExprContext {
		public Token prefix;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(salangParser.SUB, 0); }
		public SubExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING_VAL() { return getToken(salangParser.STRING_VAL, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatExprContext extends ExprContext {
		public TerminalNode FLOAT_VAL() { return getToken(salangParser.FLOAT_VAL, 0); }
		public FloatExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegExprContext extends ExprContext {
		public Token prefix;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEG() { return getToken(salangParser.NEG, 0); }
		public NegExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprContext extends ExprContext {
		public TerminalNode BOOL_VAL() { return getToken(salangParser.BOOL_VAL, 0); }
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubConExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(salangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(salangParser.SUB, 0); }
		public TerminalNode CON() { return getToken(salangParser.CON, 0); }
		public AddSubConExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParanExprContext extends ExprContext {
		public TerminalNode LPARAN() { return getToken(salangParser.LPARAN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPARAN() { return getToken(salangParser.RPARAN, 0); }
		public ParanExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(salangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(salangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqNeqExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(salangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(salangParser.NEQ, 0); }
		public EqNeqExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(salangParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(salangParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(89);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new ParanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(LPARAN);
				setState(91);
				expr(0);
				setState(92);
				match(RPARAN);
				}
				break;
			case 3:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(BOOL_VAL);
				}
				break;
			case 4:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(INT_VAL);
				}
				break;
			case 5:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(FLOAT_VAL);
				}
				break;
			case 6:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(STRING_VAL);
				}
				break;
			case 7:
				{
				_localctx = new SubExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				((SubExprContext)_localctx).prefix = match(SUB);
				setState(99);
				expr(9);
				}
				break;
			case 8:
				{
				_localctx = new NegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				((NegExprContext)_localctx).prefix = match(NEG);
				setState(101);
				expr(8);
				}
				break;
			case 9:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(ID);
				setState(103);
				match(ASSIGN);
				setState(104);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(108);
						((MulDivModExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4980736L) != 0)) ) {
							((MulDivModExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(109);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubConExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(111);
						((AddSubConExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 11534336L) != 0)) ) {
							((AddSubConExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new LesGreExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(114);
						((LesGreExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LES || _la==GRE) ) {
							((LesGreExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new EqNeqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(117);
						((EqNeqExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqNeqExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(118);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						((AndExprContext)_localctx).op = match(AND);
						setState(121);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(123);
						((OrExprContext)_localctx).op = match(OR);
						setState(124);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Primitive_typeContext extends ParserRuleContext {
		public Token type;
		public TerminalNode INT() { return getToken(salangParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(salangParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(salangParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(salangParser.BOOL, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitive_type);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((Primitive_typeContext)_localctx).type = match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((Primitive_typeContext)_localctx).type = match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				((Primitive_typeContext)_localctx).type = match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				((Primitive_typeContext)_localctx).type = match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u0089\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u0013\b\u0001\n\u0001\f\u0001\u0016\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001,\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001B\b\u0001\n\u0001\f\u0001E\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001L\b\u0001\n\u0001\f\u0001O\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001W\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002j\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002~\b\u0002\n\u0002"+
		"\f\u0002\u0081\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0087\b\u0003\u0001\u0003\u0000\u0001\u0004\u0004\u0000\u0002"+
		"\u0004\u0006\u0000\u0004\u0002\u0000\u0012\u0013\u0016\u0016\u0002\u0000"+
		"\u0014\u0015\u0017\u0017\u0001\u0000\u0018\u0019\u0001\u0000\u001b\u001c"+
		"\u00a3\u0000\t\u0001\u0000\u0000\u0000\u0002V\u0001\u0000\u0000\u0000"+
		"\u0004i\u0001\u0000\u0000\u0000\u0006\u0086\u0001\u0000\u0000\u0000\b"+
		"\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000"+
		"\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000"+
		"\u0000\f\r\u0001\u0000\u0000\u0000\r\u000e\u0005\u0000\u0000\u0001\u000e"+
		"\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0005!\u0000\u0000\u0010\u0014"+
		"\u0003\u0002\u0001\u0000\u0011\u0013\u0003\u0002\u0001\u0000\u0012\u0011"+
		"\u0001\u0000\u0000\u0000\u0013\u0016\u0001\u0000\u0000\u0000\u0014\u0012"+
		"\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0017"+
		"\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0005\"\u0000\u0000\u0018W\u0001\u0000\u0000\u0000\u0019\u001a\u0003"+
		"\u0006\u0003\u0000\u001a\u001f\u0005#\u0000\u0000\u001b\u001c\u0005\u0003"+
		"\u0000\u0000\u001c\u001e\u0005#\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000"+
		"\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u0002\u0000\u0000#W\u0001\u0000\u0000\u0000"+
		"$%\u0005\b\u0000\u0000%&\u0005\u001f\u0000\u0000&\'\u0003\u0004\u0002"+
		"\u0000\'(\u0005 \u0000\u0000(+\u0003\u0002\u0001\u0000)*\u0005\t\u0000"+
		"\u0000*,\u0003\u0002\u0001\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,W\u0001\u0000\u0000\u0000-.\u0005\n\u0000\u0000./\u0005\u001f"+
		"\u0000\u0000/0\u0003\u0004\u0002\u000001\u0005 \u0000\u000012\u0003\u0002"+
		"\u0001\u00002W\u0001\u0000\u0000\u000034\u0005\u000b\u0000\u000045\u0005"+
		"\u001f\u0000\u000056\u0003\u0004\u0002\u000067\u0005\u0002\u0000\u0000"+
		"78\u0003\u0004\u0002\u000089\u0005\u0002\u0000\u00009:\u0003\u0004\u0002"+
		"\u0000:;\u0005 \u0000\u0000;<\u0003\u0002\u0001\u0000<W\u0001\u0000\u0000"+
		"\u0000=>\u0005\f\u0000\u0000>C\u0005#\u0000\u0000?@\u0005\u0003\u0000"+
		"\u0000@B\u0005#\u0000\u0000A?\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000FW\u0005\u0002\u0000\u0000GH\u0005"+
		"\r\u0000\u0000HM\u0003\u0004\u0002\u0000IJ\u0005\u0003\u0000\u0000JL\u0003"+
		"\u0004\u0002\u0000KI\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0002\u0000\u0000QW\u0001\u0000"+
		"\u0000\u0000RS\u0003\u0004\u0002\u0000ST\u0005\u0002\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000UW\u0005\u0002\u0000\u0000V\u000f\u0001\u0000\u0000"+
		"\u0000V\u0019\u0001\u0000\u0000\u0000V$\u0001\u0000\u0000\u0000V-\u0001"+
		"\u0000\u0000\u0000V3\u0001\u0000\u0000\u0000V=\u0001\u0000\u0000\u0000"+
		"VG\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000W\u0003\u0001\u0000\u0000\u0000XY\u0006\u0002\uffff\uffff\u0000"+
		"Yj\u0005#\u0000\u0000Z[\u0005\u001f\u0000\u0000[\\\u0003\u0004\u0002\u0000"+
		"\\]\u0005 \u0000\u0000]j\u0001\u0000\u0000\u0000^j\u0005\u0010\u0000\u0000"+
		"_j\u0005\u000f\u0000\u0000`j\u0005\u000e\u0000\u0000aj\u0005\u0001\u0000"+
		"\u0000bc\u0005\u0015\u0000\u0000cj\u0003\u0004\u0002\tde\u0005\u001a\u0000"+
		"\u0000ej\u0003\u0004\u0002\bfg\u0005#\u0000\u0000gh\u0005\u0011\u0000"+
		"\u0000hj\u0003\u0004\u0002\u0001iX\u0001\u0000\u0000\u0000iZ\u0001\u0000"+
		"\u0000\u0000i^\u0001\u0000\u0000\u0000i_\u0001\u0000\u0000\u0000i`\u0001"+
		"\u0000\u0000\u0000ia\u0001\u0000\u0000\u0000ib\u0001\u0000\u0000\u0000"+
		"id\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000j\u007f\u0001\u0000"+
		"\u0000\u0000kl\n\u0007\u0000\u0000lm\u0007\u0000\u0000\u0000m~\u0003\u0004"+
		"\u0002\bno\n\u0006\u0000\u0000op\u0007\u0001\u0000\u0000p~\u0003\u0004"+
		"\u0002\u0007qr\n\u0005\u0000\u0000rs\u0007\u0002\u0000\u0000s~\u0003\u0004"+
		"\u0002\u0006tu\n\u0004\u0000\u0000uv\u0007\u0003\u0000\u0000v~\u0003\u0004"+
		"\u0002\u0005wx\n\u0003\u0000\u0000xy\u0005\u001d\u0000\u0000y~\u0003\u0004"+
		"\u0002\u0004z{\n\u0002\u0000\u0000{|\u0005\u001e\u0000\u0000|~\u0003\u0004"+
		"\u0002\u0003}k\u0001\u0000\u0000\u0000}n\u0001\u0000\u0000\u0000}q\u0001"+
		"\u0000\u0000\u0000}t\u0001\u0000\u0000\u0000}w\u0001\u0000\u0000\u0000"+
		"}z\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0005\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0087\u0005"+
		"\u0004\u0000\u0000\u0083\u0087\u0005\u0005\u0000\u0000\u0084\u0087\u0005"+
		"\u0006\u0000\u0000\u0085\u0087\u0005\u0007\u0000\u0000\u0086\u0082\u0001"+
		"\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0007\u0001"+
		"\u0000\u0000\u0000\u000b\u000b\u0014\u001f+CMVi}\u007f\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}