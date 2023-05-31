// Generated from C:/Users/Utilizador/IdeaProjects/DrawScript/src\DrawScript.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DrawScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PROPERTYID=7, ID=8, N=9, 
		COLOR=10, LINECOLOR=11, WS=12, PLUS=13, MINUS=14, TIMES=15, DIVIDE=16, 
		PROPERTYSEPARATOR=17, ENDINSTRUCTION=18, INTERVALSEPARATION=19, EQUALS=20, 
		OPENPARENTESIS=21, CLOSEDPARENTESIS=22;
	public static final int
		RULE_script = 0, RULE_constantList = 1, RULE_propertyList = 2, RULE_instructionList = 3, 
		RULE_property = 4, RULE_dimension = 5, RULE_background = 6, RULE_instruction = 7, 
		RULE_elseStatement = 8, RULE_declaration = 9, RULE_constant = 10, RULE_forLoop = 11, 
		RULE_linevalue = 12, RULE_expression = 13, RULE_interval = 14, RULE_value = 15, 
		RULE_delimiter = 16, RULE_r = 17, RULE_g = 18, RULE_b = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "constantList", "propertyList", "instructionList", "property", 
			"dimension", "background", "instruction", "elseStatement", "declaration", 
			"constant", "forLoop", "linevalue", "expression", "interval", "value", 
			"delimiter", "r", "g", "b"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'else'", "'for'", "'in'", "'['", "'---'", null, null, null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'~'", "'_'", "','", "'='", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PROPERTYID", "ID", "N", "COLOR", 
			"LINECOLOR", "WS", "PLUS", "MINUS", "TIMES", "DIVIDE", "PROPERTYSEPARATOR", 
			"ENDINSTRUCTION", "INTERVALSEPARATION", "EQUALS", "OPENPARENTESIS", "CLOSEDPARENTESIS"
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
	public String getGrammarFileName() { return "DrawScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrawScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public List<DelimiterContext> delimiter() {
			return getRuleContexts(DelimiterContext.class);
		}
		public DelimiterContext delimiter(int i) {
			return getRuleContext(DelimiterContext.class,i);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public InstructionListContext instructionList() {
			return getRuleContext(InstructionListContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			constantList(0);
			setState(41);
			delimiter();
			setState(42);
			propertyList(0);
			setState(43);
			delimiter();
			setState(44);
			instructionList(0);
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
	public static class ConstantListContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		return constantList(0);
	}

	private ConstantListContext constantList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstantListContext _localctx = new ConstantListContext(_ctx, _parentState);
		ConstantListContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_constantList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(47);
			constant();
			}
			_ctx.stop = _input.LT(-1);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstantListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constantList);
					setState(49);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(50);
					constant();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
	public static class PropertyListContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		return propertyList(0);
	}

	private PropertyListContext propertyList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropertyListContext _localctx = new PropertyListContext(_ctx, _parentState);
		PropertyListContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_propertyList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(57);
			property();
			}
			_ctx.stop = _input.LT(-1);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PropertyListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_propertyList);
					setState(59);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(60);
					property();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class InstructionListContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public InstructionListContext instructionList() {
			return getRuleContext(InstructionListContext.class,0);
		}
		public InstructionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterInstructionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitInstructionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitInstructionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionListContext instructionList() throws RecognitionException {
		return instructionList(0);
	}

	private InstructionListContext instructionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InstructionListContext _localctx = new InstructionListContext(_ctx, _parentState);
		InstructionListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_instructionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(67);
			instruction();
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstructionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instructionList);
					setState(69);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(70);
					instruction();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class PropertyContext extends ParserRuleContext {
		public Token propid;
		public TerminalNode PROPERTYID() { return getToken(DrawScriptParser.PROPERTYID, 0); }
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public BackgroundContext background() {
			return getRuleContext(BackgroundContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((PropertyContext)_localctx).propid = match(PROPERTYID);
			setState(77);
			match(T__0);
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(78);
				dimension();
				}
				break;
			case 2:
				{
				setState(79);
				background();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimensionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PROPERTYSEPARATOR() { return getToken(DrawScriptParser.PROPERTYSEPARATOR, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			expression(0);
			setState(83);
			match(PROPERTYSEPARATOR);
			setState(84);
			expression(0);
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
	public static class BackgroundContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterBackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitBackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitBackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundContext background() throws RecognitionException {
		BackgroundContext _localctx = new BackgroundContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_background);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			expression(0);
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
	public static class InstructionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			declaration();
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
	public static class ElseStatementContext extends ParserRuleContext {
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__1);
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
	public static class DeclarationContext extends ParserRuleContext {
		public Token id;
		public TerminalNode PROPERTYID() { return getToken(DrawScriptParser.PROPERTYID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public GContext g() {
			return getRuleContext(GContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((DeclarationContext)_localctx).id = match(PROPERTYID);
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case N:
				{
				setState(93);
				expression(0);
				}
				break;
			case COLOR:
				{
				{
				setState(94);
				r();
				setState(95);
				g();
				setState(96);
				b();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public Token constid;
		public ValueContext constval;
		public TerminalNode ID() { return getToken(DrawScriptParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((ConstantContext)_localctx).constid = match(ID);
			setState(101);
			match(T__0);
			setState(102);
			((ConstantContext)_localctx).constval = value();
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
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode PROPERTYID() { return getToken(DrawScriptParser.PROPERTYID, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__2);
			setState(105);
			match(PROPERTYID);
			setState(106);
			match(T__3);
			setState(107);
			interval();
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
	public static class LinevalueContext extends ParserRuleContext {
		public TerminalNode LINECOLOR() { return getToken(DrawScriptParser.LINECOLOR, 0); }
		public LinevalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linevalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterLinevalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitLinevalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitLinevalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinevalueContext linevalue() throws RecognitionException {
		LinevalueContext _localctx = new LinevalueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_linevalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LINECOLOR);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DrawScriptParser.ID, 0); }
		public TerminalNode N() { return getToken(DrawScriptParser.N, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(DrawScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DrawScriptParser.MINUS, 0); }
		public TerminalNode DIVIDE() { return getToken(DrawScriptParser.DIVIDE, 0); }
		public TerminalNode TIMES() { return getToken(DrawScriptParser.TIMES, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(112);
				match(ID);
				}
				break;
			case N:
				{
				setState(113);
				match(N);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(117);
						match(PLUS);
						setState(118);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						match(MINUS);
						setState(121);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(123);
						match(DIVIDE);
						setState(124);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(126);
						match(TIMES);
						setState(127);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVALSEPARATION() { return getToken(DrawScriptParser.INTERVALSEPARATION, 0); }
		public List<TerminalNode> N() { return getTokens(DrawScriptParser.N); }
		public TerminalNode N(int i) {
			return getToken(DrawScriptParser.N, i);
		}
		public List<TerminalNode> ID() { return getTokens(DrawScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DrawScriptParser.ID, i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__4);
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==N) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			match(INTERVALSEPARATION);
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==N) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(137);
			match(T__4);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DrawScriptParser.ID, 0); }
		public TerminalNode N() { return getToken(DrawScriptParser.N, 0); }
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public GContext g() {
			return getRuleContext(GContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(ID);
				}
				break;
			case N:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(N);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(141);
				r();
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(142);
					g();
					}
					break;
				}
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(145);
					b();
					}
					break;
				}
				}
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
	public static class DelimiterContext extends ParserRuleContext {
		public DelimiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimiter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterDelimiter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitDelimiter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitDelimiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimiterContext delimiter() throws RecognitionException {
		DelimiterContext _localctx = new DelimiterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(DrawScriptParser.COLOR, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(COLOR);
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
	public static class GContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(DrawScriptParser.COLOR, 0); }
		public GContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_g);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(COLOR);
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
	public static class BContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(DrawScriptParser.COLOR, 0); }
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(COLOR);
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
		case 1:
			return constantList_sempred((ConstantListContext)_localctx, predIndex);
		case 2:
			return propertyList_sempred((PropertyListContext)_localctx, predIndex);
		case 3:
			return instructionList_sempred((InstructionListContext)_localctx, predIndex);
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constantList_sempred(ConstantListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean propertyList_sempred(PropertyListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean instructionList_sempred(InstructionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u009f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002>\b"+
		"\u0002\n\u0002\f\u0002A\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003K\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tc\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0003\rs\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0081\b\r\n"+
		"\r\f\r\u0084\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0090\b\u000f\u0001\u000f\u0003\u000f\u0093\b\u000f\u0003\u000f"+
		"\u0095\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0004\u0002\u0004"+
		"\u0006\u001a\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0001\u0001\u0000\b\t\u0098"+
		"\u0000(\u0001\u0000\u0000\u0000\u0002.\u0001\u0000\u0000\u0000\u00048"+
		"\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bL\u0001\u0000"+
		"\u0000\u0000\nR\u0001\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000e"+
		"X\u0001\u0000\u0000\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012\\\u0001"+
		"\u0000\u0000\u0000\u0014d\u0001\u0000\u0000\u0000\u0016h\u0001\u0000\u0000"+
		"\u0000\u0018m\u0001\u0000\u0000\u0000\u001ar\u0001\u0000\u0000\u0000\u001c"+
		"\u0085\u0001\u0000\u0000\u0000\u001e\u0094\u0001\u0000\u0000\u0000 \u0096"+
		"\u0001\u0000\u0000\u0000\"\u0098\u0001\u0000\u0000\u0000$\u009a\u0001"+
		"\u0000\u0000\u0000&\u009c\u0001\u0000\u0000\u0000()\u0003\u0002\u0001"+
		"\u0000)*\u0003 \u0010\u0000*+\u0003\u0004\u0002\u0000+,\u0003 \u0010\u0000"+
		",-\u0003\u0006\u0003\u0000-\u0001\u0001\u0000\u0000\u0000./\u0006\u0001"+
		"\uffff\uffff\u0000/0\u0003\u0014\n\u000005\u0001\u0000\u0000\u000012\n"+
		"\u0001\u0000\u000024\u0003\u0014\n\u000031\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6\u0003\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0006\u0002"+
		"\uffff\uffff\u00009:\u0003\b\u0004\u0000:?\u0001\u0000\u0000\u0000;<\n"+
		"\u0001\u0000\u0000<>\u0003\b\u0004\u0000=;\u0001\u0000\u0000\u0000>A\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@\u0005\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0006\u0003"+
		"\uffff\uffff\u0000CD\u0003\u000e\u0007\u0000DI\u0001\u0000\u0000\u0000"+
		"EF\n\u0001\u0000\u0000FH\u0003\u000e\u0007\u0000GE\u0001\u0000\u0000\u0000"+
		"HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000J\u0007\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005"+
		"\u0007\u0000\u0000MP\u0005\u0001\u0000\u0000NQ\u0003\n\u0005\u0000OQ\u0003"+
		"\f\u0006\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\t"+
		"\u0001\u0000\u0000\u0000RS\u0003\u001a\r\u0000ST\u0005\u0011\u0000\u0000"+
		"TU\u0003\u001a\r\u0000U\u000b\u0001\u0000\u0000\u0000VW\u0003\u001a\r"+
		"\u0000W\r\u0001\u0000\u0000\u0000XY\u0003\u0012\t\u0000Y\u000f\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0002\u0000\u0000[\u0011\u0001\u0000\u0000\u0000"+
		"\\b\u0005\u0007\u0000\u0000]c\u0003\u001a\r\u0000^_\u0003\"\u0011\u0000"+
		"_`\u0003$\u0012\u0000`a\u0003&\u0013\u0000ac\u0001\u0000\u0000\u0000b"+
		"]\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000c\u0013\u0001\u0000"+
		"\u0000\u0000de\u0005\b\u0000\u0000ef\u0005\u0001\u0000\u0000fg\u0003\u001e"+
		"\u000f\u0000g\u0015\u0001\u0000\u0000\u0000hi\u0005\u0003\u0000\u0000"+
		"ij\u0005\u0007\u0000\u0000jk\u0005\u0004\u0000\u0000kl\u0003\u001c\u000e"+
		"\u0000l\u0017\u0001\u0000\u0000\u0000mn\u0005\u000b\u0000\u0000n\u0019"+
		"\u0001\u0000\u0000\u0000op\u0006\r\uffff\uffff\u0000ps\u0005\b\u0000\u0000"+
		"qs\u0005\t\u0000\u0000ro\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"s\u0082\u0001\u0000\u0000\u0000tu\n\u0004\u0000\u0000uv\u0005\r\u0000"+
		"\u0000v\u0081\u0003\u001a\r\u0005wx\n\u0003\u0000\u0000xy\u0005\u000e"+
		"\u0000\u0000y\u0081\u0003\u001a\r\u0004z{\n\u0002\u0000\u0000{|\u0005"+
		"\u0010\u0000\u0000|\u0081\u0003\u001a\r\u0003}~\n\u0001\u0000\u0000~\u007f"+
		"\u0005\u000f\u0000\u0000\u007f\u0081\u0003\u001a\r\u0002\u0080t\u0001"+
		"\u0000\u0000\u0000\u0080w\u0001\u0000\u0000\u0000\u0080z\u0001\u0000\u0000"+
		"\u0000\u0080}\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u001b\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\u0005\u0000\u0000\u0086\u0087\u0007\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\u0013\u0000\u0000\u0088\u0089\u0007\u0000\u0000\u0000"+
		"\u0089\u008a\u0005\u0005\u0000\u0000\u008a\u001d\u0001\u0000\u0000\u0000"+
		"\u008b\u0095\u0005\b\u0000\u0000\u008c\u0095\u0005\t\u0000\u0000\u008d"+
		"\u008f\u0003\"\u0011\u0000\u008e\u0090\u0003$\u0012\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092"+
		"\u0001\u0000\u0000\u0000\u0091\u0093\u0003&\u0013\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001"+
		"\u0000\u0000\u0000\u0094\u008b\u0001\u0000\u0000\u0000\u0094\u008c\u0001"+
		"\u0000\u0000\u0000\u0094\u008d\u0001\u0000\u0000\u0000\u0095\u001f\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\u0006\u0000\u0000\u0097!\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0005\n\u0000\u0000\u0099#\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\n\u0000\u0000\u009b%\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005\n\u0000\u0000\u009d\'\u0001\u0000\u0000\u0000\u000b"+
		"5?IPbr\u0080\u0082\u008f\u0092\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}