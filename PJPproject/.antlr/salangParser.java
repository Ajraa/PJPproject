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
		STRING_VAL=1, TextBlock=2, BOOL_VAL=3, SEMI=4, COMA=5, SHORT=6, INT=7, 
		LONG=8, FLOAT=9, DOUBLE=10, STRING=11, BOOL=12, IF=13, ELSE=14, WHILE=15, 
		READ=16, WRITE=17, ID=18, FLOAT_VAL=19, INT_VAL=20, ASSIGN=21, MUL=22, 
		DIV=23, ADD=24, SUB=25, MOD=26, LES=27, GRE=28, NEG=29, EQ=30, NEQ=31, 
		AND=32, OR=33, LPARAN=34, RPARAN=35, LCPARAN=36, RCPARAN=37, QUOTE=38, 
		WS=39, COMMENT=40, LINE_COMMENT=41;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_primitive_type = 3, 
		RULE_integral_type = 4, RULE_floating_point_type = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "primitive_type", "integral_type", "floating_point_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "';'", "','", "'short'", "'int'", "'long'", "'float'", 
			"'double'", "'string'", "'bool'", "'if'", "'else'", "'while'", "'read'", 
			"'write'", null, null, null, "'='", "'*'", "'/'", "'+'", "'-'", "'%'", 
			"'<'", "'>'", "'!'", "'=='", "'!='", "'&&'", "'||'", "'('", "')'", "'{'", 
			"'}'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING_VAL", "TextBlock", "BOOL_VAL", "SEMI", "COMA", "SHORT", 
			"INT", "LONG", "FLOAT", "DOUBLE", "STRING", "BOOL", "IF", "ELSE", "WHILE", 
			"READ", "WRITE", "ID", "FLOAT_VAL", "INT_VAL", "ASSIGN", "MUL", "DIV", 
			"ADD", "SUB", "MOD", "LES", "GRE", "NEG", "EQ", "NEQ", "AND", "OR", "LPARAN", 
			"RPARAN", "LCPARAN", "RCPARAN", "QUOTE", "WS", "COMMENT", "LINE_COMMENT"
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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 86471851992L) != 0) );
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
		public StatContext pos;
		public StatContext neg;
		public TerminalNode LCPARAN() { return getToken(salangParser.LCPARAN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode RCPARAN() { return getToken(salangParser.RCPARAN, 0); }
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
		public TerminalNode IF() { return getToken(salangParser.IF, 0); }
		public TerminalNode LPARAN() { return getToken(salangParser.LPARAN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPARAN() { return getToken(salangParser.RPARAN, 0); }
		public TerminalNode ELSE() { return getToken(salangParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(salangParser.WHILE, 0); }
		public TerminalNode READ() { return getToken(salangParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(salangParser.WRITE, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(LCPARAN);
				setState(18);
				stat();
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 86471851992L) != 0)) {
					{
					{
					setState(19);
					stat();
					}
					}
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(25);
				match(RCPARAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				primitive_type();
				setState(28);
				match(ID);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(29);
					match(COMA);
					setState(30);
					match(ID);
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(IF);
				setState(39);
				match(LPARAN);
				setState(40);
				expr(0);
				setState(41);
				match(RPARAN);
				setState(42);
				((StatContext)_localctx).pos = stat();
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(43);
					match(ELSE);
					setState(44);
					((StatContext)_localctx).neg = stat();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(WHILE);
				setState(48);
				match(LPARAN);
				setState(49);
				expr(0);
				setState(50);
				match(RPARAN);
				setState(51);
				stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				match(READ);
				setState(54);
				match(ID);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(55);
					match(COMA);
					setState(56);
					match(ID);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				match(WRITE);
				setState(64);
				expr(0);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(65);
					match(COMA);
					setState(66);
					expr(0);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				expr(0);
				setState(75);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				match(SEMI);
				}
				break;
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
		public Token prefix;
		public Token op;
		public TerminalNode ID() { return getToken(salangParser.ID, 0); }
		public TerminalNode BOOL_VAL() { return getToken(salangParser.BOOL_VAL, 0); }
		public TerminalNode INT_VAL() { return getToken(salangParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(salangParser.FLOAT_VAL, 0); }
		public TerminalNode STRING() { return getToken(salangParser.STRING, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(salangParser.SUB, 0); }
		public TerminalNode NEG() { return getToken(salangParser.NEG, 0); }
		public TerminalNode LPARAN() { return getToken(salangParser.LPARAN, 0); }
		public TerminalNode RPARAN() { return getToken(salangParser.RPARAN, 0); }
		public TerminalNode ASSIGN() { return getToken(salangParser.ASSIGN, 0); }
		public TerminalNode MUL() { return getToken(salangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(salangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(salangParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(salangParser.ADD, 0); }
		public TerminalNode LES() { return getToken(salangParser.LES, 0); }
		public TerminalNode GRE() { return getToken(salangParser.GRE, 0); }
		public TerminalNode EQ() { return getToken(salangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(salangParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(salangParser.AND, 0); }
		public TerminalNode OR() { return getToken(salangParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(81);
				match(ID);
				}
				break;
			case 2:
				{
				setState(82);
				match(BOOL_VAL);
				}
				break;
			case 3:
				{
				setState(83);
				match(INT_VAL);
				}
				break;
			case 4:
				{
				setState(84);
				match(FLOAT_VAL);
				}
				break;
			case 5:
				{
				setState(85);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(86);
				((ExprContext)_localctx).prefix = match(SUB);
				setState(87);
				expr(10);
				}
				break;
			case 7:
				{
				setState(88);
				((ExprContext)_localctx).prefix = match(NEG);
				setState(89);
				expr(9);
				}
				break;
			case 8:
				{
				setState(90);
				match(LPARAN);
				setState(91);
				expr(0);
				setState(92);
				match(RPARAN);
				}
				break;
			case 9:
				{
				setState(94);
				match(ID);
				setState(95);
				match(ASSIGN);
				setState(96);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(100);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 79691776L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(103);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(106);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LES || _la==GRE) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(112);
						match(AND);
						setState(113);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(115);
						match(OR);
						setState(116);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(121);
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
		public Integral_typeContext integral_type() {
			return getRuleContext(Integral_typeContext.class,0);
		}
		public Floating_point_typeContext floating_point_type() {
			return getRuleContext(Floating_point_typeContext.class,0);
		}
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORT:
			case INT:
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				integral_type();
				}
				break;
			case FLOAT:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				floating_point_type();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				((Primitive_typeContext)_localctx).type = match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Integral_typeContext extends ParserRuleContext {
		public Token type;
		public TerminalNode SHORT() { return getToken(salangParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(salangParser.INT, 0); }
		public TerminalNode LONG() { return getToken(salangParser.LONG, 0); }
		public Integral_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral_type; }
	}

	public final Integral_typeContext integral_type() throws RecognitionException {
		Integral_typeContext _localctx = new Integral_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integral_type);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((Integral_typeContext)_localctx).type = match(SHORT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				((Integral_typeContext)_localctx).type = match(INT);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				((Integral_typeContext)_localctx).type = match(LONG);
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
	public static class Floating_point_typeContext extends ParserRuleContext {
		public Token type;
		public TerminalNode FLOAT() { return getToken(salangParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(salangParser.DOUBLE, 0); }
		public Floating_point_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point_type; }
	}

	public final Floating_point_typeContext floating_point_type() throws RecognitionException {
		Floating_point_typeContext _localctx = new Floating_point_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floating_point_type);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((Floating_point_typeContext)_localctx).type = match(FLOAT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				((Floating_point_typeContext)_localctx).type = match(DOUBLE);
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
		"\u0004\u0001)\u008a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0015\b\u0001"+
		"\n\u0001\f\u0001\u0018\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001:\b\u0001\n\u0001"+
		"\f\u0001=\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001D\b\u0001\n\u0001\f\u0001G\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001O\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002b\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002v\b\u0002\n\u0002\f\u0002y\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u007f\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0084\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0088\b\u0005\u0001\u0005\u0000\u0001\u0004\u0006\u0000"+
		"\u0002\u0004\u0006\b\n\u0000\u0004\u0002\u0000\u0016\u0017\u001a\u001a"+
		"\u0001\u0000\u0018\u0019\u0001\u0000\u001b\u001c\u0001\u0000\u001e\u001f"+
		"\u00a4\u0000\r\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000\u0000"+
		"\u0004a\u0001\u0000\u0000\u0000\u0006~\u0001\u0000\u0000\u0000\b\u0083"+
		"\u0001\u0000\u0000\u0000\n\u0087\u0001\u0000\u0000\u0000\f\u000e\u0003"+
		"\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000"+
		"\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000"+
		"\u0000\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0012\u0005$\u0000\u0000"+
		"\u0012\u0016\u0003\u0002\u0001\u0000\u0013\u0015\u0003\u0002\u0001\u0000"+
		"\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0018\u0001\u0000\u0000\u0000"+
		"\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000"+
		"\u0017\u0019\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0005%\u0000\u0000\u001aO\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0003\u0006\u0003\u0000\u001c!\u0005\u0012\u0000\u0000\u001d\u001e\u0005"+
		"\u0005\u0000\u0000\u001e \u0005\u0012\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000$%\u0005\u0004\u0000\u0000%O\u0001\u0000\u0000\u0000&\'\u0005\r"+
		"\u0000\u0000\'(\u0005\"\u0000\u0000()\u0003\u0004\u0002\u0000)*\u0005"+
		"#\u0000\u0000*-\u0003\u0002\u0001\u0000+,\u0005\u000e\u0000\u0000,.\u0003"+
		"\u0002\u0001\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".O\u0001\u0000\u0000\u0000/0\u0005\u000f\u0000\u000001\u0005\"\u0000\u0000"+
		"12\u0003\u0004\u0002\u000023\u0005#\u0000\u000034\u0003\u0002\u0001\u0000"+
		"4O\u0001\u0000\u0000\u000056\u0005\u0010\u0000\u00006;\u0005\u0012\u0000"+
		"\u000078\u0005\u0005\u0000\u00008:\u0005\u0012\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">O\u0005\u0004\u0000\u0000?@\u0005\u0011\u0000\u0000@E\u0003\u0004\u0002"+
		"\u0000AB\u0005\u0005\u0000\u0000BD\u0003\u0004\u0002\u0000CA\u0001\u0000"+
		"\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"HI\u0005\u0004\u0000\u0000IO\u0001\u0000\u0000\u0000JK\u0003\u0004\u0002"+
		"\u0000KL\u0005\u0004\u0000\u0000LO\u0001\u0000\u0000\u0000MO\u0005\u0004"+
		"\u0000\u0000N\u0011\u0001\u0000\u0000\u0000N\u001b\u0001\u0000\u0000\u0000"+
		"N&\u0001\u0000\u0000\u0000N/\u0001\u0000\u0000\u0000N5\u0001\u0000\u0000"+
		"\u0000N?\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NM\u0001\u0000"+
		"\u0000\u0000O\u0003\u0001\u0000\u0000\u0000PQ\u0006\u0002\uffff\uffff"+
		"\u0000Qb\u0005\u0012\u0000\u0000Rb\u0005\u0003\u0000\u0000Sb\u0005\u0014"+
		"\u0000\u0000Tb\u0005\u0013\u0000\u0000Ub\u0005\u000b\u0000\u0000VW\u0005"+
		"\u0019\u0000\u0000Wb\u0003\u0004\u0002\nXY\u0005\u001d\u0000\u0000Yb\u0003"+
		"\u0004\u0002\tZ[\u0005\"\u0000\u0000[\\\u0003\u0004\u0002\u0000\\]\u0005"+
		"#\u0000\u0000]b\u0001\u0000\u0000\u0000^_\u0005\u0012\u0000\u0000_`\u0005"+
		"\u0015\u0000\u0000`b\u0003\u0004\u0002\u0001aP\u0001\u0000\u0000\u0000"+
		"aR\u0001\u0000\u0000\u0000aS\u0001\u0000\u0000\u0000aT\u0001\u0000\u0000"+
		"\u0000aU\u0001\u0000\u0000\u0000aV\u0001\u0000\u0000\u0000aX\u0001\u0000"+
		"\u0000\u0000aZ\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000bw\u0001"+
		"\u0000\u0000\u0000cd\n\u0007\u0000\u0000de\u0007\u0000\u0000\u0000ev\u0003"+
		"\u0004\u0002\bfg\n\u0006\u0000\u0000gh\u0007\u0001\u0000\u0000hv\u0003"+
		"\u0004\u0002\u0007ij\n\u0005\u0000\u0000jk\u0007\u0002\u0000\u0000kv\u0003"+
		"\u0004\u0002\u0006lm\n\u0004\u0000\u0000mn\u0007\u0003\u0000\u0000nv\u0003"+
		"\u0004\u0002\u0005op\n\u0003\u0000\u0000pq\u0005 \u0000\u0000qv\u0003"+
		"\u0004\u0002\u0004rs\n\u0002\u0000\u0000st\u0005!\u0000\u0000tv\u0003"+
		"\u0004\u0002\u0003uc\u0001\u0000\u0000\u0000uf\u0001\u0000\u0000\u0000"+
		"ui\u0001\u0000\u0000\u0000ul\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000"+
		"\u0000ur\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0005\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z\u007f\u0003\b\u0004\u0000{\u007f\u0003\n\u0005"+
		"\u0000|\u007f\u0005\u000b\u0000\u0000}\u007f\u0005\f\u0000\u0000~z\u0001"+
		"\u0000\u0000\u0000~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0007\u0001\u0000\u0000\u0000\u0080\u0084"+
		"\u0005\u0006\u0000\u0000\u0081\u0084\u0005\u0007\u0000\u0000\u0082\u0084"+
		"\u0005\b\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\t\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0005\t\u0000\u0000\u0086\u0088\u0005\n\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u000b\u0001\u0000\u0000\u0000\r\u000f\u0016!-;ENauw~\u0083"+
		"\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}