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
		ELSE=9, WHILE=10, READ=11, WRITE=12, ID=13, FLOAT_VAL=14, INT_VAL=15, 
		BOOL_VAL=16, ASSIGN=17, MUL=18, DIV=19, ADD=20, SUB=21, MOD=22, CON=23, 
		LES=24, GRE=25, NEG=26, EQ=27, NEQ=28, AND=29, OR=30, LPARAN=31, RPARAN=32, 
		LCPARAN=33, RCPARAN=34, WS=35, COMMENT=36, LINE_COMMENT=37;
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
			"'else'", "'while'", "'read'", "'write'", null, null, null, null, "'='", 
			"'*'", "'/'", "'+'", "'-'", "'%'", "'.'", "'<'", "'>'", "'!'", "'=='", 
			"'!='", "'&&'", "'||'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING_VAL", "SEMI", "COMA", "INT", "FLOAT", "STRING", "BOOL", 
			"IF", "ELSE", "WHILE", "READ", "WRITE", "ID", "FLOAT_VAL", "INT_VAL", 
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 10806754806L) != 0) );
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCPARAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(LCPARAN);
				setState(16);
				stat();
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10806754806L) != 0)) {
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
				((StatContext)_localctx).pos = stat();
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(41);
					match(ELSE);
					setState(42);
					((StatContext)_localctx).neg = stat();
					}
					break;
				}
				}
				break;
			case WHILE:
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
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				match(READ);
				setState(52);
				match(ID);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(53);
					match(COMA);
					setState(54);
					match(ID);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				match(SEMI);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				match(WRITE);
				setState(62);
				expr(0);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(63);
					match(COMA);
					setState(64);
					expr(0);
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
			case STRING_VAL:
			case ID:
			case FLOAT_VAL:
			case INT_VAL:
			case BOOL_VAL:
			case SUB:
			case NEG:
			case LPARAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				expr(0);
				setState(73);
				match(SEMI);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
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
		public Token prefix;
		public Token op;
		public TerminalNode ID() { return getToken(salangParser.ID, 0); }
		public TerminalNode LPARAN() { return getToken(salangParser.LPARAN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPARAN() { return getToken(salangParser.RPARAN, 0); }
		public TerminalNode BOOL_VAL() { return getToken(salangParser.BOOL_VAL, 0); }
		public TerminalNode INT_VAL() { return getToken(salangParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(salangParser.FLOAT_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(salangParser.STRING_VAL, 0); }
		public TerminalNode SUB() { return getToken(salangParser.SUB, 0); }
		public TerminalNode NEG() { return getToken(salangParser.NEG, 0); }
		public TerminalNode ASSIGN() { return getToken(salangParser.ASSIGN, 0); }
		public TerminalNode MUL() { return getToken(salangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(salangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(salangParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(salangParser.ADD, 0); }
		public TerminalNode CON() { return getToken(salangParser.CON, 0); }
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(79);
				match(ID);
				}
				break;
			case 2:
				{
				setState(80);
				match(LPARAN);
				setState(81);
				expr(0);
				setState(82);
				match(RPARAN);
				}
				break;
			case 3:
				{
				setState(84);
				match(BOOL_VAL);
				}
				break;
			case 4:
				{
				setState(85);
				match(INT_VAL);
				}
				break;
			case 5:
				{
				setState(86);
				match(FLOAT_VAL);
				}
				break;
			case 6:
				{
				setState(87);
				match(STRING_VAL);
				}
				break;
			case 7:
				{
				setState(88);
				((ExprContext)_localctx).prefix = match(SUB);
				setState(89);
				expr(9);
				}
				break;
			case 8:
				{
				setState(90);
				((ExprContext)_localctx).prefix = match(NEG);
				setState(91);
				expr(8);
				}
				break;
			case 9:
				{
				setState(92);
				match(ID);
				setState(93);
				match(ASSIGN);
				setState(94);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(98);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4980736L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(101);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 11534336L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(104);
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
						setState(105);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(107);
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
						setState(108);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(110);
						match(AND);
						setState(111);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(113);
						match(OR);
						setState(114);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(119);
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
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				((Primitive_typeContext)_localctx).type = match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((Primitive_typeContext)_localctx).type = match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				((Primitive_typeContext)_localctx).type = match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
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
		"\u0004\u0001%\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u0013\b\u0001\n\u0001\f\u0001\u0016\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001,\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u00018\b\u0001\n\u0001\f\u0001;\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001B\b"+
		"\u0001\n\u0001\f\u0001E\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001M\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002`\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002t\b\u0002\n\u0002\f\u0002w\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003}\b\u0003\u0001\u0003\u0000\u0001\u0004"+
		"\u0004\u0000\u0002\u0004\u0006\u0000\u0004\u0002\u0000\u0012\u0013\u0016"+
		"\u0016\u0002\u0000\u0014\u0015\u0017\u0017\u0001\u0000\u0018\u0019\u0001"+
		"\u0000\u001b\u001c\u0098\u0000\t\u0001\u0000\u0000\u0000\u0002L\u0001"+
		"\u0000\u0000\u0000\u0004_\u0001\u0000\u0000\u0000\u0006|\u0001\u0000\u0000"+
		"\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\u000b"+
		"\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001"+
		"\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000e\u0005\u0000\u0000"+
		"\u0001\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0005!\u0000\u0000"+
		"\u0010\u0014\u0003\u0002\u0001\u0000\u0011\u0013\u0003\u0002\u0001\u0000"+
		"\u0012\u0011\u0001\u0000\u0000\u0000\u0013\u0016\u0001\u0000\u0000\u0000"+
		"\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000"+
		"\u0015\u0017\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0005\"\u0000\u0000\u0018M\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0003\u0006\u0003\u0000\u001a\u001f\u0005\r\u0000\u0000\u001b\u001c"+
		"\u0005\u0003\u0000\u0000\u001c\u001e\u0005\r\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000\"#\u0005\u0002\u0000\u0000#M\u0001\u0000"+
		"\u0000\u0000$%\u0005\b\u0000\u0000%&\u0005\u001f\u0000\u0000&\'\u0003"+
		"\u0004\u0002\u0000\'(\u0005 \u0000\u0000(+\u0003\u0002\u0001\u0000)*\u0005"+
		"\t\u0000\u0000*,\u0003\u0002\u0001\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,M\u0001\u0000\u0000\u0000-.\u0005\n\u0000\u0000./\u0005"+
		"\u001f\u0000\u0000/0\u0003\u0004\u0002\u000001\u0005 \u0000\u000012\u0003"+
		"\u0002\u0001\u00002M\u0001\u0000\u0000\u000034\u0005\u000b\u0000\u0000"+
		"49\u0005\r\u0000\u000056\u0005\u0003\u0000\u000068\u0005\r\u0000\u0000"+
		"75\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000<M\u0005\u0002\u0000\u0000=>\u0005\f\u0000\u0000>C\u0003\u0004"+
		"\u0002\u0000?@\u0005\u0003\u0000\u0000@B\u0003\u0004\u0002\u0000A?\u0001"+
		"\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000FG\u0005\u0002\u0000\u0000GM\u0001\u0000\u0000\u0000HI\u0003\u0004"+
		"\u0002\u0000IJ\u0005\u0002\u0000\u0000JM\u0001\u0000\u0000\u0000KM\u0005"+
		"\u0002\u0000\u0000L\u000f\u0001\u0000\u0000\u0000L\u0019\u0001\u0000\u0000"+
		"\u0000L$\u0001\u0000\u0000\u0000L-\u0001\u0000\u0000\u0000L3\u0001\u0000"+
		"\u0000\u0000L=\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000LK\u0001"+
		"\u0000\u0000\u0000M\u0003\u0001\u0000\u0000\u0000NO\u0006\u0002\uffff"+
		"\uffff\u0000O`\u0005\r\u0000\u0000PQ\u0005\u001f\u0000\u0000QR\u0003\u0004"+
		"\u0002\u0000RS\u0005 \u0000\u0000S`\u0001\u0000\u0000\u0000T`\u0005\u0010"+
		"\u0000\u0000U`\u0005\u000f\u0000\u0000V`\u0005\u000e\u0000\u0000W`\u0005"+
		"\u0001\u0000\u0000XY\u0005\u0015\u0000\u0000Y`\u0003\u0004\u0002\tZ[\u0005"+
		"\u001a\u0000\u0000[`\u0003\u0004\u0002\b\\]\u0005\r\u0000\u0000]^\u0005"+
		"\u0011\u0000\u0000^`\u0003\u0004\u0002\u0001_N\u0001\u0000\u0000\u0000"+
		"_P\u0001\u0000\u0000\u0000_T\u0001\u0000\u0000\u0000_U\u0001\u0000\u0000"+
		"\u0000_V\u0001\u0000\u0000\u0000_W\u0001\u0000\u0000\u0000_X\u0001\u0000"+
		"\u0000\u0000_Z\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000\u0000`u\u0001"+
		"\u0000\u0000\u0000ab\n\u0007\u0000\u0000bc\u0007\u0000\u0000\u0000ct\u0003"+
		"\u0004\u0002\bde\n\u0006\u0000\u0000ef\u0007\u0001\u0000\u0000ft\u0003"+
		"\u0004\u0002\u0007gh\n\u0005\u0000\u0000hi\u0007\u0002\u0000\u0000it\u0003"+
		"\u0004\u0002\u0006jk\n\u0004\u0000\u0000kl\u0007\u0003\u0000\u0000lt\u0003"+
		"\u0004\u0002\u0005mn\n\u0003\u0000\u0000no\u0005\u001d\u0000\u0000ot\u0003"+
		"\u0004\u0002\u0004pq\n\u0002\u0000\u0000qr\u0005\u001e\u0000\u0000rt\u0003"+
		"\u0004\u0002\u0003sa\u0001\u0000\u0000\u0000sd\u0001\u0000\u0000\u0000"+
		"sg\u0001\u0000\u0000\u0000sj\u0001\u0000\u0000\u0000sm\u0001\u0000\u0000"+
		"\u0000sp\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0005\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000x}\u0005\u0004\u0000\u0000y}\u0005\u0005\u0000"+
		"\u0000z}\u0005\u0006\u0000\u0000{}\u0005\u0007\u0000\u0000|x\u0001\u0000"+
		"\u0000\u0000|y\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|{\u0001"+
		"\u0000\u0000\u0000}\u0007\u0001\u0000\u0000\u0000\u000b\u000b\u0014\u001f"+
		"+9CL_su|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}