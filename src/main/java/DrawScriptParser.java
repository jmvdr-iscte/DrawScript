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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PROPERTYID=8, 
		ID=9, N=10, COLOR=11, PLUS=12, MINUS=13, TIMES=14, DIVIDE=15, MOD=16, 
		EQUALS=17, LARGER=18, LESS=19, WS=20, PROPERTYSEPARATOR=21, ENDINSTRUCTION=22, 
		INTERVALSEPARATOR=23, OPENPARENTESIS=24, CLOSEDPARENTESIS=25;
	public static final int
		RULE_script = 0, RULE_constantList = 1, RULE_propertyList = 2, RULE_instructionList = 3, 
		RULE_instruction = 4, RULE_figure = 5, RULE_figureshape = 6, RULE_singleparameter = 7, 
		RULE_doubleparameter = 8, RULE_controlStructure = 9, RULE_ifStatement = 10, 
		RULE_forLoop = 11, RULE_property = 12, RULE_dimension = 13, RULE_background = 14, 
		RULE_declaration = 15, RULE_decvalue = 16, RULE_constant = 17, RULE_expression = 18, 
		RULE_interval = 19, RULE_value = 20, RULE_delimiter = 21, RULE_r = 22, 
		RULE_g = 23, RULE_b = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "constantList", "propertyList", "instructionList", "instruction", 
			"figure", "figureshape", "singleparameter", "doubleparameter", "controlStructure", 
			"ifStatement", "forLoop", "property", "dimension", "background", "declaration", 
			"decvalue", "constant", "expression", "interval", "value", "delimiter", 
			"r", "g", "b"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'in'", "':'", "'['", "'---'", null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'>'", "'<'", 
			null, "'~'", "'_'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "PROPERTYID", "ID", "N", 
			"COLOR", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "EQUALS", "LARGER", 
			"LESS", "WS", "PROPERTYSEPARATOR", "ENDINSTRUCTION", "INTERVALSEPARATOR", 
			"OPENPARENTESIS", "CLOSEDPARENTESIS"
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
		public InstructionListContext instructionList() {
			return getRuleContext(InstructionListContext.class,0);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
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
			setState(50);
			constantList(0);
			setState(51);
			delimiter();
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(52);
				propertyList(0);
				setState(53);
				delimiter();
				}
				break;
			}
			setState(57);
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
			setState(60);
			constant();
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConstantListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constantList);
					setState(62);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(63);
					constant();
					}
					} 
				}
				setState(68);
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
			setState(70);
			property();
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PropertyListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_propertyList);
					setState(72);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(73);
					property();
					}
					} 
				}
				setState(78);
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
			setState(80);
			instruction();
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InstructionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_instructionList);
					setState(82);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(83);
					instruction();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class InstructionContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ControlStructureContext controlStructure() {
			return getRuleContext(ControlStructureContext.class,0);
		}
		public FigureContext figure() {
			return getRuleContext(FigureContext.class,0);
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
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				controlStructure();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				figure();
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
	public static class FigureContext extends ParserRuleContext {
		public Token id;
		public ExpressionContext localization;
		public FigureshapeContext shape;
		public TerminalNode INTERVALSEPARATOR() { return getToken(DrawScriptParser.INTERVALSEPARATOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PROPERTYID() { return getToken(DrawScriptParser.PROPERTYID, 0); }
		public FigureshapeContext figureshape() {
			return getRuleContext(FigureshapeContext.class,0);
		}
		public FigureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitFigure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureContext figure() throws RecognitionException {
		FigureContext _localctx = new FigureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_figure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((FigureContext)_localctx).id = match(PROPERTYID);
			{
			}
			setState(96);
			((FigureContext)_localctx).localization = expression(0);
			setState(97);
			match(INTERVALSEPARATOR);
			setState(98);
			expression(0);
			setState(99);
			((FigureContext)_localctx).shape = figureshape();
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
	public static class FigureshapeContext extends ParserRuleContext {
		public SingleparameterContext singleparameter() {
			return getRuleContext(SingleparameterContext.class,0);
		}
		public DoubleparameterContext doubleparameter() {
			return getRuleContext(DoubleparameterContext.class,0);
		}
		public FigureshapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figureshape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterFigureshape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitFigureshape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitFigureshape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureshapeContext figureshape() throws RecognitionException {
		FigureshapeContext _localctx = new FigureshapeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_figureshape);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				singleparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				doubleparameter();
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
	public static class SingleparameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterSingleparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitSingleparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitSingleparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleparameterContext singleparameter() throws RecognitionException {
		SingleparameterContext _localctx = new SingleparameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_singleparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
	public static class DoubleparameterContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PROPERTYSEPARATOR() { return getToken(DrawScriptParser.PROPERTYSEPARATOR, 0); }
		public DoubleparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterDoubleparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitDoubleparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitDoubleparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleparameterContext doubleparameter() throws RecognitionException {
		DoubleparameterContext _localctx = new DoubleparameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_doubleparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			expression(0);
			setState(108);
			match(PROPERTYSEPARATOR);
			setState(109);
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
	public static class ControlStructureContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ControlStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterControlStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitControlStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitControlStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStructureContext controlStructure() throws RecognitionException {
		ControlStructureContext _localctx = new ControlStructureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_controlStructure);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				ifStatement();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				forLoop();
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
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<InstructionListContext> instructionList() {
			return getRuleContexts(InstructionListContext.class);
		}
		public InstructionListContext instructionList(int i) {
			return getRuleContext(InstructionListContext.class,i);
		}
		public TerminalNode ENDINSTRUCTION() { return getToken(DrawScriptParser.ENDINSTRUCTION, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__0);
			setState(116);
			expression(0);
			setState(117);
			instructionList(0);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(118);
				match(T__1);
				setState(119);
				instructionList(0);
				}
			}

			setState(122);
			match(ENDINSTRUCTION);
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
		public InstructionListContext instructionList() {
			return getRuleContext(InstructionListContext.class,0);
		}
		public TerminalNode ENDINSTRUCTION() { return getToken(DrawScriptParser.ENDINSTRUCTION, 0); }
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
			setState(124);
			match(T__2);
			setState(125);
			match(PROPERTYID);
			setState(126);
			match(T__3);
			setState(127);
			interval();
			setState(128);
			instructionList(0);
			setState(129);
			match(ENDINSTRUCTION);
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
		enterRule(_localctx, 24, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((PropertyContext)_localctx).propid = match(PROPERTYID);
			setState(132);
			match(T__4);
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(133);
				dimension();
				}
				break;
			case 2:
				{
				setState(134);
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
		enterRule(_localctx, 26, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			expression(0);
			setState(138);
			match(PROPERTYSEPARATOR);
			setState(139);
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
		public TerminalNode ID() { return getToken(DrawScriptParser.ID, 0); }
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
		enterRule(_localctx, 28, RULE_background);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
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
		public DecvalueContext decvalue() {
			return getRuleContext(DecvalueContext.class,0);
		}
		public TerminalNode PROPERTYID() { return getToken(DrawScriptParser.PROPERTYID, 0); }
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
		enterRule(_localctx, 30, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			((DeclarationContext)_localctx).id = match(PROPERTYID);
			setState(144);
			decvalue();
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
	public static class DecvalueContext extends ParserRuleContext {
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
		public DecvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterDecvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitDecvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitDecvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecvalueContext decvalue() throws RecognitionException {
		DecvalueContext _localctx = new DecvalueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decvalue);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROPERTYID:
			case ID:
			case N:
			case OPENPARENTESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				expression(0);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(147);
				r();
				setState(148);
				g();
				setState(149);
				b();
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
		enterRule(_localctx, 34, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((ConstantContext)_localctx).constid = match(ID);
			setState(154);
			match(T__4);
			setState(155);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DrawScriptParser.ID, 0); }
		public TerminalNode N() { return getToken(DrawScriptParser.N, 0); }
		public TerminalNode PROPERTYID() { return getToken(DrawScriptParser.PROPERTYID, 0); }
		public TerminalNode OPENPARENTESIS() { return getToken(DrawScriptParser.OPENPARENTESIS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSEDPARENTESIS() { return getToken(DrawScriptParser.CLOSEDPARENTESIS, 0); }
		public TerminalNode DIVIDE() { return getToken(DrawScriptParser.DIVIDE, 0); }
		public TerminalNode TIMES() { return getToken(DrawScriptParser.TIMES, 0); }
		public TerminalNode PLUS() { return getToken(DrawScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DrawScriptParser.MINUS, 0); }
		public TerminalNode MOD() { return getToken(DrawScriptParser.MOD, 0); }
		public TerminalNode LARGER() { return getToken(DrawScriptParser.LARGER, 0); }
		public TerminalNode LESS() { return getToken(DrawScriptParser.LESS, 0); }
		public TerminalNode EQUALS() { return getToken(DrawScriptParser.EQUALS, 0); }
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(158);
				match(ID);
				}
				break;
			case N:
				{
				setState(159);
				match(N);
				}
				break;
			case PROPERTYID:
				{
				setState(160);
				match(PROPERTYID);
				}
				break;
			case OPENPARENTESIS:
				{
				setState(161);
				match(OPENPARENTESIS);
				setState(162);
				expression(0);
				setState(163);
				match(CLOSEDPARENTESIS);
				setState(164);
				expression(9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(169);
						match(DIVIDE);
						setState(170);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(172);
						match(TIMES);
						setState(173);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(175);
						match(PLUS);
						setState(176);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(178);
						match(MINUS);
						setState(179);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(181);
						match(MOD);
						setState(182);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(184);
						match(LARGER);
						setState(185);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(187);
						match(LESS);
						setState(188);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(190);
						match(EQUALS);
						setState(191);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INTERVALSEPARATOR() { return getToken(DrawScriptParser.INTERVALSEPARATOR, 0); }
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
		enterRule(_localctx, 38, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__5);
			setState(198);
			expression(0);
			setState(199);
			match(INTERVALSEPARATOR);
			setState(200);
			expression(0);
			setState(201);
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
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(ID);
				}
				break;
			case N:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(N);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(205);
				r();
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(206);
					g();
					}
					break;
				}
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(209);
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
		enterRule(_localctx, 42, RULE_delimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__6);
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
		enterRule(_localctx, 44, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		enterRule(_localctx, 46, RULE_g);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		enterRule(_localctx, 48, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
		case 18:
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
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u00008\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001A\b\u0001\n\u0001\f\u0001D\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002K\b\u0002\n\u0002\f\u0002N\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003U\b\u0003\n\u0003\f\u0003X\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006h\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\tr\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\ny\b\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0088\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0098\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00a7\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00c1"+
		"\b\u0012\n\u0012\f\u0012\u00c4\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00d0\b\u0014\u0001\u0014\u0003\u0014\u00d3\b"+
		"\u0014\u0003\u0014\u00d5\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0000"+
		"\u0004\u0002\u0004\u0006$\u0019\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000\u0000\u00df"+
		"\u00002\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000\u0000\u0004E"+
		"\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\b\\\u0001\u0000"+
		"\u0000\u0000\n^\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000e"+
		"i\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012q\u0001"+
		"\u0000\u0000\u0000\u0014s\u0001\u0000\u0000\u0000\u0016|\u0001\u0000\u0000"+
		"\u0000\u0018\u0083\u0001\u0000\u0000\u0000\u001a\u0089\u0001\u0000\u0000"+
		"\u0000\u001c\u008d\u0001\u0000\u0000\u0000\u001e\u008f\u0001\u0000\u0000"+
		"\u0000 \u0097\u0001\u0000\u0000\u0000\"\u0099\u0001\u0000\u0000\u0000"+
		"$\u00a6\u0001\u0000\u0000\u0000&\u00c5\u0001\u0000\u0000\u0000(\u00d4"+
		"\u0001\u0000\u0000\u0000*\u00d6\u0001\u0000\u0000\u0000,\u00d8\u0001\u0000"+
		"\u0000\u0000.\u00da\u0001\u0000\u0000\u00000\u00dc\u0001\u0000\u0000\u0000"+
		"23\u0003\u0002\u0001\u000037\u0003*\u0015\u000045\u0003\u0004\u0002\u0000"+
		"56\u0003*\u0015\u000068\u0001\u0000\u0000\u000074\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009:\u0003\u0006\u0003"+
		"\u0000:\u0001\u0001\u0000\u0000\u0000;<\u0006\u0001\uffff\uffff\u0000"+
		"<=\u0003\"\u0011\u0000=B\u0001\u0000\u0000\u0000>?\n\u0001\u0000\u0000"+
		"?A\u0003\"\u0011\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0003\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0006\u0002\uffff\uffff\u0000"+
		"FG\u0003\u0018\f\u0000GL\u0001\u0000\u0000\u0000HI\n\u0001\u0000\u0000"+
		"IK\u0003\u0018\f\u0000JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0005\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0006\u0003\uffff\uffff\u0000"+
		"PQ\u0003\b\u0004\u0000QV\u0001\u0000\u0000\u0000RS\n\u0001\u0000\u0000"+
		"SU\u0003\b\u0004\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0007\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000Y]\u0003\u001e\u000f\u0000Z]\u0003"+
		"\u0012\t\u0000[]\u0003\n\u0005\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\t\u0001\u0000\u0000\u0000"+
		"^_\u0005\b\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0003$\u0012\u0000"+
		"ab\u0005\u0017\u0000\u0000bc\u0003$\u0012\u0000cd\u0003\f\u0006\u0000"+
		"d\u000b\u0001\u0000\u0000\u0000eh\u0003\u000e\u0007\u0000fh\u0003\u0010"+
		"\b\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\r\u0001"+
		"\u0000\u0000\u0000ij\u0003$\u0012\u0000j\u000f\u0001\u0000\u0000\u0000"+
		"kl\u0003$\u0012\u0000lm\u0005\u0015\u0000\u0000mn\u0003$\u0012\u0000n"+
		"\u0011\u0001\u0000\u0000\u0000or\u0003\u0014\n\u0000pr\u0003\u0016\u000b"+
		"\u0000qo\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0013\u0001"+
		"\u0000\u0000\u0000st\u0005\u0001\u0000\u0000tu\u0003$\u0012\u0000ux\u0003"+
		"\u0006\u0003\u0000vw\u0005\u0002\u0000\u0000wy\u0003\u0006\u0003\u0000"+
		"xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z{\u0005\u0016\u0000\u0000{\u0015\u0001\u0000\u0000\u0000|}\u0005"+
		"\u0003\u0000\u0000}~\u0005\b\u0000\u0000~\u007f\u0005\u0004\u0000\u0000"+
		"\u007f\u0080\u0003&\u0013\u0000\u0080\u0081\u0003\u0006\u0003\u0000\u0081"+
		"\u0082\u0005\u0016\u0000\u0000\u0082\u0017\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005\b\u0000\u0000\u0084\u0087\u0005\u0005\u0000\u0000\u0085\u0088"+
		"\u0003\u001a\r\u0000\u0086\u0088\u0003\u001c\u000e\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0019\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0003$\u0012\u0000\u008a\u008b\u0005\u0015"+
		"\u0000\u0000\u008b\u008c\u0003$\u0012\u0000\u008c\u001b\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005\t\u0000\u0000\u008e\u001d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005\b\u0000\u0000\u0090\u0091\u0003 \u0010\u0000\u0091"+
		"\u001f\u0001\u0000\u0000\u0000\u0092\u0098\u0003$\u0012\u0000\u0093\u0094"+
		"\u0003,\u0016\u0000\u0094\u0095\u0003.\u0017\u0000\u0095\u0096\u00030"+
		"\u0018\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0092\u0001\u0000"+
		"\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0098!\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005\t\u0000\u0000\u009a\u009b\u0005\u0005\u0000\u0000"+
		"\u009b\u009c\u0003(\u0014\u0000\u009c#\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0006\u0012\uffff\uffff\u0000\u009e\u00a7\u0005\t\u0000\u0000\u009f\u00a7"+
		"\u0005\n\u0000\u0000\u00a0\u00a7\u0005\b\u0000\u0000\u00a1\u00a2\u0005"+
		"\u0018\u0000\u0000\u00a2\u00a3\u0003$\u0012\u0000\u00a3\u00a4\u0005\u0019"+
		"\u0000\u0000\u00a4\u00a5\u0003$\u0012\t\u00a5\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a6\u009d\u0001\u0000\u0000\u0000\u00a6\u009f\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a0\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a7\u00c2\u0001\u0000\u0000\u0000\u00a8\u00a9\n\b\u0000\u0000"+
		"\u00a9\u00aa\u0005\u000f\u0000\u0000\u00aa\u00c1\u0003$\u0012\t\u00ab"+
		"\u00ac\n\u0007\u0000\u0000\u00ac\u00ad\u0005\u000e\u0000\u0000\u00ad\u00c1"+
		"\u0003$\u0012\b\u00ae\u00af\n\u0006\u0000\u0000\u00af\u00b0\u0005\f\u0000"+
		"\u0000\u00b0\u00c1\u0003$\u0012\u0007\u00b1\u00b2\n\u0005\u0000\u0000"+
		"\u00b2\u00b3\u0005\r\u0000\u0000\u00b3\u00c1\u0003$\u0012\u0006\u00b4"+
		"\u00b5\n\u0004\u0000\u0000\u00b5\u00b6\u0005\u0010\u0000\u0000\u00b6\u00c1"+
		"\u0003$\u0012\u0005\u00b7\u00b8\n\u0003\u0000\u0000\u00b8\u00b9\u0005"+
		"\u0012\u0000\u0000\u00b9\u00c1\u0003$\u0012\u0004\u00ba\u00bb\n\u0002"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0013\u0000\u0000\u00bc\u00c1\u0003$\u0012"+
		"\u0003\u00bd\u00be\n\u0001\u0000\u0000\u00be\u00bf\u0005\u0011\u0000\u0000"+
		"\u00bf\u00c1\u0003$\u0012\u0002\u00c0\u00a8\u0001\u0000\u0000\u0000\u00c0"+
		"\u00ab\u0001\u0000\u0000\u0000\u00c0\u00ae\u0001\u0000\u0000\u0000\u00c0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00c0\u00b4\u0001\u0000\u0000\u0000\u00c0"+
		"\u00b7\u0001\u0000\u0000\u0000\u00c0\u00ba\u0001\u0000\u0000\u0000\u00c0"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3"+
		"%\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0005\u0006\u0000\u0000\u00c6\u00c7\u0003$\u0012\u0000\u00c7\u00c8\u0005"+
		"\u0017\u0000\u0000\u00c8\u00c9\u0003$\u0012\u0000\u00c9\u00ca\u0005\u0006"+
		"\u0000\u0000\u00ca\'\u0001\u0000\u0000\u0000\u00cb\u00d5\u0005\t\u0000"+
		"\u0000\u00cc\u00d5\u0005\n\u0000\u0000\u00cd\u00cf\u0003,\u0016\u0000"+
		"\u00ce\u00d0\u0003.\u0017\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d3\u00030\u0018\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d4\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d5)\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005"+
		"\u0007\u0000\u0000\u00d7+\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u000b"+
		"\u0000\u0000\u00d9-\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u000b\u0000"+
		"\u0000\u00db/\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u000b\u0000\u0000"+
		"\u00dd1\u0001\u0000\u0000\u0000\u00107BLV\\gqx\u0087\u0097\u00a6\u00c0"+
		"\u00c2\u00cf\u00d2\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}