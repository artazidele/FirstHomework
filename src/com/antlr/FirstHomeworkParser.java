package com.antlr;// Generated from C:/Users/Arta/IdeaProjects/FirstHomework/src\FirstHomework.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FirstHomeworkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, NOT=19, WEAKOP=20, STRONGOP=21, RELATION=22, NUMBER=23, VARNAME=24, 
		WS=25;
	public static final int
		RULE_progr = 0, RULE_series = 1, RULE_stmt = 2, RULE_input_stmt = 3, RULE_output_stmt = 4, 
		RULE_assign_stmt = 5, RULE_cond_stmt = 6, RULE_loop = 7, RULE_compar = 8, 
		RULE_compareor = 9, RULE_compareand = 10, RULE_varlist = 11, RULE_expr = 12, 
		RULE_term = 13, RULE_elem = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"progr", "series", "stmt", "input_stmt", "output_stmt", "assign_stmt", 
			"cond_stmt", "loop", "compar", "compareor", "compareand", "varlist", 
			"expr", "term", "elem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'read'", "'write'", "':='", "'if'", "'then'", "'else'", 
			"'fi'", "'while'", "'do'", "'end'", "'or'", "'and'", "'('", "')'", "','", 
			"'false'", "'true'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NOT", "WEAKOP", "STRONGOP", 
			"RELATION", "NUMBER", "VARNAME", "WS"
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
	public String getGrammarFileName() { return "FirstHomework.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FirstHomeworkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrContext extends ParserRuleContext {
		public SeriesContext series() {
			return getRuleContext(SeriesContext.class,0);
		}
		public ProgrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterProgr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitProgr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitProgr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrContext progr() throws RecognitionException {
		ProgrContext _localctx = new ProgrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_progr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			series();
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

	public static class SeriesContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_series; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitSeries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitSeries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeriesContext series() throws RecognitionException {
		SeriesContext _localctx = new SeriesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_series);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			stmt();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(33);
				match(T__0);
				setState(34);
				stmt();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StmtContext extends ParserRuleContext {
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public Output_stmtContext output_stmt() {
			return getRuleContext(Output_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Cond_stmtContext cond_stmt() {
			return getRuleContext(Cond_stmtContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				input_stmt();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				output_stmt();
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				assign_stmt();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				cond_stmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				loop();
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

	public static class Input_stmtContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterInput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitInput_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitInput_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__1);
			setState(48);
			varlist();
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

	public static class Output_stmtContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Output_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterOutput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitOutput_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitOutput_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_stmtContext output_stmt() throws RecognitionException {
		Output_stmtContext _localctx = new Output_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_output_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__2);
			setState(51);
			varlist();
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(FirstHomeworkParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(VARNAME);
			setState(54);
			match(T__3);
			setState(55);
			expr();
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

	public static class Cond_stmtContext extends ParserRuleContext {
		public ComparContext compar() {
			return getRuleContext(ComparContext.class,0);
		}
		public List<SeriesContext> series() {
			return getRuleContexts(SeriesContext.class);
		}
		public SeriesContext series(int i) {
			return getRuleContext(SeriesContext.class,i);
		}
		public Cond_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterCond_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitCond_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitCond_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_stmtContext cond_stmt() throws RecognitionException {
		Cond_stmtContext _localctx = new Cond_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__4);
			setState(58);
			compar();
			setState(59);
			match(T__5);
			setState(60);
			series();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(61);
				match(T__6);
				setState(62);
				series();
				}
			}

			setState(65);
			match(T__7);
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

	public static class LoopContext extends ParserRuleContext {
		public ComparContext compar() {
			return getRuleContext(ComparContext.class,0);
		}
		public SeriesContext series() {
			return getRuleContext(SeriesContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__8);
			setState(68);
			compar();
			setState(69);
			match(T__9);
			setState(70);
			series();
			setState(71);
			match(T__10);
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

	public static class ComparContext extends ParserRuleContext {
		public List<CompareorContext> compareor() {
			return getRuleContexts(CompareorContext.class);
		}
		public CompareorContext compareor(int i) {
			return getRuleContext(CompareorContext.class,i);
		}
		public ComparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterCompar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitCompar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitCompar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparContext compar() throws RecognitionException {
		ComparContext _localctx = new ComparContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			compareor();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(74);
				match(T__11);
				setState(75);
				compareor();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CompareorContext extends ParserRuleContext {
		public List<CompareandContext> compareand() {
			return getRuleContexts(CompareandContext.class);
		}
		public CompareandContext compareand(int i) {
			return getRuleContext(CompareandContext.class,i);
		}
		public CompareorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterCompareor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitCompareor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitCompareor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareorContext compareor() throws RecognitionException {
		CompareorContext _localctx = new CompareorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compareor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			compareand();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(82);
				match(T__12);
				setState(83);
				compareand();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CompareandContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RELATION() { return getToken(FirstHomeworkParser.RELATION, 0); }
		public ComparContext compar() {
			return getRuleContext(ComparContext.class,0);
		}
		public TerminalNode NOT() { return getToken(FirstHomeworkParser.NOT, 0); }
		public CompareandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterCompareand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitCompareand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitCompareand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareandContext compareand() throws RecognitionException {
		CompareandContext _localctx = new CompareandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compareand);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				expr();
				setState(90);
				match(RELATION);
				setState(91);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__13);
				setState(94);
				compar();
				setState(95);
				match(T__14);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(NOT);
				setState(98);
				match(T__13);
				setState(99);
				compar();
				setState(100);
				match(T__14);
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

	public static class VarlistContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(FirstHomeworkParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(FirstHomeworkParser.VARNAME, i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(VARNAME);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(105);
				match(T__15);
				setState(106);
				match(VARNAME);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> WEAKOP() { return getTokens(FirstHomeworkParser.WEAKOP); }
		public TerminalNode WEAKOP(int i) {
			return getToken(FirstHomeworkParser.WEAKOP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			term();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WEAKOP) {
				{
				{
				setState(113);
				match(WEAKOP);
				setState(114);
				term();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public List<ElemContext> elem() {
			return getRuleContexts(ElemContext.class);
		}
		public ElemContext elem(int i) {
			return getRuleContext(ElemContext.class,i);
		}
		public List<TerminalNode> STRONGOP() { return getTokens(FirstHomeworkParser.STRONGOP); }
		public TerminalNode STRONGOP(int i) {
			return getToken(FirstHomeworkParser.STRONGOP, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			elem();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRONGOP) {
				{
				{
				setState(121);
				match(STRONGOP);
				setState(122);
				elem();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ElemContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FirstHomeworkParser.NUMBER, 0); }
		public TerminalNode VARNAME() { return getToken(FirstHomeworkParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).enterElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FirstHomeworkListener ) ((FirstHomeworkListener)listener).exitElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FirstHomeworkVisitor ) return ((FirstHomeworkVisitor<? extends T>)visitor).visitElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemContext elem() throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elem);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__17);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(NUMBER);
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(VARNAME);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				match(T__13);
				setState(133);
				expr();
				setState(134);
				match(T__14);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u008b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001$\b\u0001\n\u0001"+
		"\f\u0001\'\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002.\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006@\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0005\bM\b\b\n\b\f\bP\t\b\u0001\t\u0001\t\u0001\t\u0005\tU\b"+
		"\t\n\t\f\tX\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\ng\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000bl\b\u000b\n\u000b\f\u000bo\t"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0005\ft\b\f\n\f\f\fw\t\f\u0001\r\u0001"+
		"\r\u0001\r\u0005\r|\b\r\n\r\f\r\u007f\t\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0089\b\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0000\u008c"+
		"\u0000\u001e\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004"+
		"-\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b2\u0001\u0000"+
		"\u0000\u0000\n5\u0001\u0000\u0000\u0000\f9\u0001\u0000\u0000\u0000\u000e"+
		"C\u0001\u0000\u0000\u0000\u0010I\u0001\u0000\u0000\u0000\u0012Q\u0001"+
		"\u0000\u0000\u0000\u0014f\u0001\u0000\u0000\u0000\u0016h\u0001\u0000\u0000"+
		"\u0000\u0018p\u0001\u0000\u0000\u0000\u001ax\u0001\u0000\u0000\u0000\u001c"+
		"\u0088\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f"+
		"\u0001\u0001\u0000\u0000\u0000 %\u0003\u0004\u0002\u0000!\"\u0005\u0001"+
		"\u0000\u0000\"$\u0003\u0004\u0002\u0000#!\u0001\u0000\u0000\u0000$\'\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\u0003\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(.\u0003\u0006"+
		"\u0003\u0000).\u0003\b\u0004\u0000*.\u0003\n\u0005\u0000+.\u0003\f\u0006"+
		"\u0000,.\u0003\u000e\u0007\u0000-(\u0001\u0000\u0000\u0000-)\u0001\u0000"+
		"\u0000\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0005\u0002\u0000"+
		"\u000001\u0003\u0016\u000b\u00001\u0007\u0001\u0000\u0000\u000023\u0005"+
		"\u0003\u0000\u000034\u0003\u0016\u000b\u00004\t\u0001\u0000\u0000\u0000"+
		"56\u0005\u0018\u0000\u000067\u0005\u0004\u0000\u000078\u0003\u0018\f\u0000"+
		"8\u000b\u0001\u0000\u0000\u00009:\u0005\u0005\u0000\u0000:;\u0003\u0010"+
		"\b\u0000;<\u0005\u0006\u0000\u0000<?\u0003\u0002\u0001\u0000=>\u0005\u0007"+
		"\u0000\u0000>@\u0003\u0002\u0001\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005\b\u0000\u0000B\r"+
		"\u0001\u0000\u0000\u0000CD\u0005\t\u0000\u0000DE\u0003\u0010\b\u0000E"+
		"F\u0005\n\u0000\u0000FG\u0003\u0002\u0001\u0000GH\u0005\u000b\u0000\u0000"+
		"H\u000f\u0001\u0000\u0000\u0000IN\u0003\u0012\t\u0000JK\u0005\f\u0000"+
		"\u0000KM\u0003\u0012\t\u0000LJ\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0011\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QV\u0003\u0014\n\u0000RS\u0005"+
		"\r\u0000\u0000SU\u0003\u0014\n\u0000TR\u0001\u0000\u0000\u0000UX\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"W\u0013\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0003\u0018"+
		"\f\u0000Z[\u0005\u0016\u0000\u0000[\\\u0003\u0018\f\u0000\\g\u0001\u0000"+
		"\u0000\u0000]^\u0005\u000e\u0000\u0000^_\u0003\u0010\b\u0000_`\u0005\u000f"+
		"\u0000\u0000`g\u0001\u0000\u0000\u0000ab\u0005\u0013\u0000\u0000bc\u0005"+
		"\u000e\u0000\u0000cd\u0003\u0010\b\u0000de\u0005\u000f\u0000\u0000eg\u0001"+
		"\u0000\u0000\u0000fY\u0001\u0000\u0000\u0000f]\u0001\u0000\u0000\u0000"+
		"fa\u0001\u0000\u0000\u0000g\u0015\u0001\u0000\u0000\u0000hm\u0005\u0018"+
		"\u0000\u0000ij\u0005\u0010\u0000\u0000jl\u0005\u0018\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000n\u0017\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000pu\u0003\u001a\r\u0000qr\u0005\u0014\u0000\u0000rt\u0003\u001a"+
		"\r\u0000sq\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0019\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000x}\u0003\u001c\u000e\u0000yz\u0005\u0015\u0000"+
		"\u0000z|\u0003\u001c\u000e\u0000{y\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u001b\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0089"+
		"\u0005\u0011\u0000\u0000\u0081\u0089\u0005\u0012\u0000\u0000\u0082\u0089"+
		"\u0005\u0017\u0000\u0000\u0083\u0089\u0005\u0018\u0000\u0000\u0084\u0085"+
		"\u0005\u000e\u0000\u0000\u0085\u0086\u0003\u0018\f\u0000\u0086\u0087\u0005"+
		"\u000f\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0080\u0001"+
		"\u0000\u0000\u0000\u0088\u0081\u0001\u0000\u0000\u0000\u0088\u0082\u0001"+
		"\u0000\u0000\u0000\u0088\u0083\u0001\u0000\u0000\u0000\u0088\u0084\u0001"+
		"\u0000\u0000\u0000\u0089\u001d\u0001\u0000\u0000\u0000\n%-?NVfmu}\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}