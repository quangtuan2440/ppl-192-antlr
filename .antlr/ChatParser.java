// Generated from /home/tuanduong/Documents/192/PPL/test/Chat.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChatParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, TYPE_N_ID=13, TYPE=14, TYPE_INT=15, TYPE_FLOAT=16, 
		KEY_RETURN=17, INT=18, FLOAT=19, WS=20;
	public static final int
		RULE_mc = 0, RULE_declaration = 1, RULE_vardeclar = 2, RULE_funcdeclar = 3, 
		RULE_paramdeclar = 4, RULE_funcbody = 5, RULE_statement = 6, RULE_assignment = 7, 
		RULE_call = 8, RULE_return_statement = 9, RULE_expression = 10, RULE_simple_exp = 11, 
		RULE_operators = 12, RULE_operands = 13;
	public static final String[] ruleNames = {
		"mc", "declaration", "vardeclar", "funcdeclar", "paramdeclar", "funcbody", 
		"statement", "assignment", "call", "return_statement", "expression", "simple_exp", 
		"operators", "operands"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "','", "')'", "'{'", "'}'", "'='", "'+'", "'-'", "'*'", 
		"'/'", null, null, null, "'int'", "'float'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ID", "TYPE_N_ID", "TYPE", "TYPE_INT", "TYPE_FLOAT", "KEY_RETURN", "INT", 
		"FLOAT", "WS"
	};
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
	public String getGrammarFileName() { return "Chat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class McContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ChatParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public McContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mc; }
	}

	public final McContext mc() throws RecognitionException {
		McContext _localctx = new McContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				declaration();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE_N_ID || _la==TYPE );
			setState(33);
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

	public static class DeclarationContext extends ParserRuleContext {
		public VardeclarContext vardeclar() {
			return getRuleContext(VardeclarContext.class,0);
		}
		public FuncdeclarContext funcdeclar() {
			return getRuleContext(FuncdeclarContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_N_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				vardeclar();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				funcdeclar();
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

	public static class VardeclarContext extends ParserRuleContext {
		public TerminalNode TYPE_N_ID() { return getToken(ChatParser.TYPE_N_ID, 0); }
		public VardeclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclar; }
	}

	public final VardeclarContext vardeclar() throws RecognitionException {
		VardeclarContext _localctx = new VardeclarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardeclar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(TYPE_N_ID);
			setState(40);
			match(T__0);
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

	public static class FuncdeclarContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ChatParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(ChatParser.ID, 0); }
		public ParamdeclarContext paramdeclar() {
			return getRuleContext(ParamdeclarContext.class,0);
		}
		public FuncbodyContext funcbody() {
			return getRuleContext(FuncbodyContext.class,0);
		}
		public FuncdeclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdeclar; }
	}

	public final FuncdeclarContext funcdeclar() throws RecognitionException {
		FuncdeclarContext _localctx = new FuncdeclarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcdeclar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(TYPE);
			setState(43);
			match(ID);
			setState(44);
			paramdeclar();
			setState(45);
			funcbody();
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

	public static class ParamdeclarContext extends ParserRuleContext {
		public List<TerminalNode> TYPE_N_ID() { return getTokens(ChatParser.TYPE_N_ID); }
		public TerminalNode TYPE_N_ID(int i) {
			return getToken(ChatParser.TYPE_N_ID, i);
		}
		public ParamdeclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramdeclar; }
	}

	public final ParamdeclarContext paramdeclar() throws RecognitionException {
		ParamdeclarContext _localctx = new ParamdeclarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramdeclar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__1);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE_N_ID) {
				{
				{
				setState(48);
				match(TYPE_N_ID);
				{
				setState(49);
				match(T__2);
				setState(50);
				match(TYPE_N_ID);
				}
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__3);
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

	public static class FuncbodyContext extends ParserRuleContext {
		public List<VardeclarContext> vardeclar() {
			return getRuleContexts(VardeclarContext.class);
		}
		public VardeclarContext vardeclar(int i) {
			return getRuleContext(VardeclarContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcbody; }
	}

	public final FuncbodyContext funcbody() throws RecognitionException {
		FuncbodyContext _localctx = new FuncbodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__4);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << TYPE_N_ID) | (1L << KEY_RETURN))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE_N_ID:
					{
					setState(59);
					vardeclar();
					}
					break;
				case ID:
				case KEY_RETURN:
					{
					setState(60);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(T__5);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				return_statement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ChatParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ID);
			setState(74);
			match(T__6);
			setState(75);
			expression();
			setState(76);
			match(T__0);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ChatParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(T__1);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ID) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(80);
				expression();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(81);
					match(T__2);
					setState(82);
					expression();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__3);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode KEY_RETURN() { return getToken(ChatParser.KEY_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(KEY_RETURN);
			setState(96);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Simple_expContext simple_exp() {
			return getRuleContext(Simple_expContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(T__1);
				setState(99);
				simple_exp();
				setState(100);
				match(T__3);
				}
				break;
			case ID:
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				simple_exp();
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

	public static class Simple_expContext extends ParserRuleContext {
		public List<OperandsContext> operands() {
			return getRuleContexts(OperandsContext.class);
		}
		public OperandsContext operands(int i) {
			return getRuleContext(OperandsContext.class,i);
		}
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public Simple_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_exp; }
	}

	public final Simple_expContext simple_exp() throws RecognitionException {
		Simple_expContext _localctx = new Simple_expContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simple_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			operands();
			setState(106);
			operators();
			setState(107);
			operands();
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

	public static class OperatorsContext extends ParserRuleContext {
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class OperandsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ChatParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ChatParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(ChatParser.ID, 0); }
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public OperandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operands; }
	}

	public final OperandsContext operands() throws RecognitionException {
		OperandsContext _localctx = new OperandsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operands);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(FLOAT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				call();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26x\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\2\3\2\3\3"+
		"\3\3\5\3(\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\66\n"+
		"\6\f\6\16\69\13\6\3\6\3\6\3\7\3\7\3\7\7\7@\n\7\f\7\16\7C\13\7\3\7\3\7"+
		"\3\b\3\b\3\b\5\bJ\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\nV\n\n"+
		"\f\n\16\nY\13\n\7\n[\n\n\f\n\16\n^\13\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\5\fj\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\5"+
		"\17v\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\n\r"+
		"\2v\2\37\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b,\3\2\2\2\n\61\3\2\2\2\f<\3\2"+
		"\2\2\16I\3\2\2\2\20K\3\2\2\2\22P\3\2\2\2\24a\3\2\2\2\26i\3\2\2\2\30k\3"+
		"\2\2\2\32o\3\2\2\2\34u\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37"+
		"\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\2\2\3$\3\3\2\2\2%(\5\6\4\2&(\5\b\5"+
		"\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)*\7\17\2\2*+\7\3\2\2+\7\3\2\2\2,-"+
		"\7\20\2\2-.\7\16\2\2./\5\n\6\2/\60\5\f\7\2\60\t\3\2\2\2\61\67\7\4\2\2"+
		"\62\63\7\17\2\2\63\64\7\5\2\2\64\66\7\17\2\2\65\62\3\2\2\2\669\3\2\2\2"+
		"\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\6\2\2;\13\3\2\2\2"+
		"<A\7\7\2\2=@\5\6\4\2>@\5\16\b\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2"+
		"\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\b\2\2E\r\3\2\2\2FJ\5\20\t\2GJ\5\22"+
		"\n\2HJ\5\24\13\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\17\3\2\2\2KL\7\16\2\2"+
		"LM\7\t\2\2MN\5\26\f\2NO\7\3\2\2O\21\3\2\2\2PQ\7\16\2\2Q\\\7\4\2\2RW\5"+
		"\26\f\2ST\7\5\2\2TV\5\26\f\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X"+
		"[\3\2\2\2YW\3\2\2\2ZR\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2"+
		"\2^\\\3\2\2\2_`\7\6\2\2`\23\3\2\2\2ab\7\23\2\2bc\5\26\f\2c\25\3\2\2\2"+
		"de\7\4\2\2ef\5\30\r\2fg\7\6\2\2gj\3\2\2\2hj\5\30\r\2id\3\2\2\2ih\3\2\2"+
		"\2j\27\3\2\2\2kl\5\34\17\2lm\5\32\16\2mn\5\34\17\2n\31\3\2\2\2op\t\2\2"+
		"\2p\33\3\2\2\2qv\7\24\2\2rv\7\25\2\2sv\7\16\2\2tv\5\22\n\2uq\3\2\2\2u"+
		"r\3\2\2\2us\3\2\2\2ut\3\2\2\2v\35\3\2\2\2\f!\'\67?AIW\\iu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}