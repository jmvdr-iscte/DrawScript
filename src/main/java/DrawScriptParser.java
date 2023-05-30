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
		ID=9, N=10, COLOR=11, LINECOLOR=12, WS=13, OPERATOR=14, PROPERTYSEPARATOR=15, 
		ENDINSTRUCTION=16, INTERVALSEPARATION=17, EQUALSOPERATOR=18, OPENPARENTESIS=19, 
		CLOSEDPARENTESIS=20;
	public static final int
		RULE_script = 0, RULE_constantList = 1, RULE_propertyList = 2, RULE_instructionList = 3, 
		RULE_property = 4, RULE_instruction = 5, RULE_ifStatement = 6, RULE_elseStatement = 7, 
		RULE_declaration = 8, RULE_geometricobjectsdec = 9, RULE_declarationvalue = 10, 
		RULE_constant = 11, RULE_propertyvalue = 12, RULE_geometricobjects = 13, 
		RULE_xexpression = 14, RULE_yexpression = 15, RULE_forLoop = 16, RULE_decvalue = 17, 
		RULE_linevalue = 18, RULE_condition = 19, RULE_expression = 20, RULE_interval = 21, 
		RULE_value = 22, RULE_delimiter = 23, RULE_r = 24, RULE_g = 25, RULE_b = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "constantList", "propertyList", "instructionList", "property", 
			"instruction", "ifStatement", "elseStatement", "declaration", "geometricobjectsdec", 
			"declarationvalue", "constant", "propertyvalue", "geometricobjects", 
			"xexpression", "yexpression", "forLoop", "decvalue", "linevalue", "condition", 
			"expression", "interval", "value", "delimiter", "r", "g", "b"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'if'", "'else'", "'for'", "'in'", "'['", "'---'", null, 
			null, null, null, null, null, null, "'~'", "'_'", "','", "'='", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "PROPERTYID", "ID", "N", 
			"COLOR", "LINECOLOR", "WS", "OPERATOR", "PROPERTYSEPARATOR", "ENDINSTRUCTION", 
			"INTERVALSEPARATION", "EQUALSOPERATOR", "OPENPARENTESIS", "CLOSEDPARENTESIS"
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
			setState(54);
			constantList(0);
			setState(55);
			delimiter();
			setState(56);
			propertyList(0);
			setState(57);
			delimiter();
			setState(58);
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
			setState(61);
			constant();
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
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
					setState(63);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(64);
					constant();
					}
					} 
				}
				setState(69);
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
			setState(71);
			property();
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
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
					setState(73);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(74);
					property();
					}
					} 
				}
				setState(79);
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
			setState(81);
			instruction();
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
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
					setState(83);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(84);
					instruction();
					}
					} 
				}
				setState(89);
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
		public PropertyvalueContext propvalue;
		public TerminalNode PROPERTYID() { return getToken(DrawScriptParser.PROPERTYID, 0); }
		public PropertyvalueContext propertyvalue() {
			return getRuleContext(PropertyvalueContext.class,0);
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
			setState(90);
			((PropertyContext)_localctx).propid = match(PROPERTYID);
			setState(91);
			match(T__0);
			setState(92);
			((PropertyContext)_localctx).propvalue = propertyvalue();
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
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public GeometricobjectsdecContext geometricobjectsdec() {
			return getRuleContext(GeometricobjectsdecContext.class,0);
		}
		public TerminalNode ENDINSTRUCTION() { return getToken(DrawScriptParser.ENDINSTRUCTION, 0); }
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
		enterRule(_localctx, 10, RULE_instruction);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				forLoop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				elseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				geometricobjectsdec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				match(ENDINSTRUCTION);
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
	public static class IfStatementContext extends ParserRuleContext {
		public Token conditionResult;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode EQUALSOPERATOR() { return getToken(DrawScriptParser.EQUALSOPERATOR, 0); }
		public TerminalNode N() { return getToken(DrawScriptParser.N, 0); }
		public TerminalNode ID() { return getToken(DrawScriptParser.ID, 0); }
		public TerminalNode PROPERTYID() { return getToken(DrawScriptParser.PROPERTYID, 0); }
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
		enterRule(_localctx, 12, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__1);
			setState(103);
			condition();
			setState(104);
			match(EQUALSOPERATOR);
			setState(105);
			((IfStatementContext)_localctx).conditionResult = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
				((IfStatementContext)_localctx).conditionResult = (Token)_errHandler.recoverInline(this);
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
		enterRule(_localctx, 14, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__2);
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
		public DeclarationvalueContext declarationvall;
		public TerminalNode PROPERTYID() { return getToken(DrawScriptParser.PROPERTYID, 0); }
		public DeclarationvalueContext declarationvalue() {
			return getRuleContext(DeclarationvalueContext.class,0);
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
		enterRule(_localctx, 16, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((DeclarationContext)_localctx).id = match(PROPERTYID);
			setState(110);
			((DeclarationContext)_localctx).declarationvall = declarationvalue();
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
	public static class GeometricobjectsdecContext extends ParserRuleContext {
		public Token id;
		public GeometricobjectsContext geometricobjects() {
			return getRuleContext(GeometricobjectsContext.class,0);
		}
		public TerminalNode PROPERTYID() { return getToken(DrawScriptParser.PROPERTYID, 0); }
		public GeometricobjectsdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geometricobjectsdec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterGeometricobjectsdec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitGeometricobjectsdec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitGeometricobjectsdec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeometricobjectsdecContext geometricobjectsdec() throws RecognitionException {
		GeometricobjectsdecContext _localctx = new GeometricobjectsdecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_geometricobjectsdec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((GeometricobjectsdecContext)_localctx).id = match(PROPERTYID);
			setState(113);
			geometricobjects();
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
	public static class DeclarationvalueContext extends ParserRuleContext {
		public DecvalueContext decvalue() {
			return getRuleContext(DecvalueContext.class,0);
		}
		public DeclarationvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterDeclarationvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitDeclarationvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitDeclarationvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationvalueContext declarationvalue() throws RecognitionException {
		DeclarationvalueContext _localctx = new DeclarationvalueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarationvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 22, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((ConstantContext)_localctx).constid = match(ID);
			setState(118);
			match(T__0);
			setState(119);
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
	public static class PropertyvalueContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DrawScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DrawScriptParser.ID, i);
		}
		public TerminalNode PROPERTYSEPARATOR() { return getToken(DrawScriptParser.PROPERTYSEPARATOR, 0); }
		public List<TerminalNode> N() { return getTokens(DrawScriptParser.N); }
		public TerminalNode N(int i) {
			return getToken(DrawScriptParser.N, i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(DrawScriptParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(DrawScriptParser.OPERATOR, i);
		}
		public PropertyvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterPropertyvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitPropertyvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitPropertyvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyvalueContext propertyvalue() throws RecognitionException {
		PropertyvalueContext _localctx = new PropertyvalueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_propertyvalue);
		int _la;
		try {
			int _alt;
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==N) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR) {
					{
					{
					setState(123);
					match(OPERATOR);
					setState(124);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==N) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				match(PROPERTYSEPARATOR);
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==N) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(132);
						match(OPERATOR);
						setState(133);
						_la = _input.LA(1);
						if ( !(_la==ID || _la==N) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
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
	public static class GeometricobjectsContext extends ParserRuleContext {
		public XexpressionContext xexpression() {
			return getRuleContext(XexpressionContext.class,0);
		}
		public TerminalNode INTERVALSEPARATION() { return getToken(DrawScriptParser.INTERVALSEPARATION, 0); }
		public YexpressionContext yexpression() {
			return getRuleContext(YexpressionContext.class,0);
		}
		public GeometricobjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geometricobjects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterGeometricobjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitGeometricobjects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitGeometricobjects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeometricobjectsContext geometricobjects() throws RecognitionException {
		GeometricobjectsContext _localctx = new GeometricobjectsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_geometricobjects);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			xexpression();
			setState(142);
			match(INTERVALSEPARATION);
			setState(143);
			yexpression();
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
	public static class XexpressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DrawScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DrawScriptParser.ID, i);
		}
		public List<TerminalNode> PROPERTYID() { return getTokens(DrawScriptParser.PROPERTYID); }
		public TerminalNode PROPERTYID(int i) {
			return getToken(DrawScriptParser.PROPERTYID, i);
		}
		public List<TerminalNode> N() { return getTokens(DrawScriptParser.N); }
		public TerminalNode N(int i) {
			return getToken(DrawScriptParser.N, i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(DrawScriptParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(DrawScriptParser.OPERATOR, i);
		}
		public List<TerminalNode> PROPERTYSEPARATOR() { return getTokens(DrawScriptParser.PROPERTYSEPARATOR); }
		public TerminalNode PROPERTYSEPARATOR(int i) {
			return getToken(DrawScriptParser.PROPERTYSEPARATOR, i);
		}
		public XexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterXexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitXexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitXexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XexpressionContext xexpression() throws RecognitionException {
		XexpressionContext _localctx = new XexpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_xexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50944L) != 0)) {
				{
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR || _la==PROPERTYSEPARATOR) {
					{
					setState(146);
					_la = _input.LA(1);
					if ( !(_la==OPERATOR || _la==PROPERTYSEPARATOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(149);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(154);
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

	@SuppressWarnings("CheckReturnValue")
	public static class YexpressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DrawScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DrawScriptParser.ID, i);
		}
		public List<TerminalNode> PROPERTYID() { return getTokens(DrawScriptParser.PROPERTYID); }
		public TerminalNode PROPERTYID(int i) {
			return getToken(DrawScriptParser.PROPERTYID, i);
		}
		public List<TerminalNode> N() { return getTokens(DrawScriptParser.N); }
		public TerminalNode N(int i) {
			return getToken(DrawScriptParser.N, i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(DrawScriptParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(DrawScriptParser.OPERATOR, i);
		}
		public List<TerminalNode> PROPERTYSEPARATOR() { return getTokens(DrawScriptParser.PROPERTYSEPARATOR); }
		public TerminalNode PROPERTYSEPARATOR(int i) {
			return getToken(DrawScriptParser.PROPERTYSEPARATOR, i);
		}
		public YexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterYexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitYexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitYexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YexpressionContext yexpression() throws RecognitionException {
		YexpressionContext _localctx = new YexpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_yexpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPERATOR || _la==PROPERTYSEPARATOR) {
						{
						setState(156);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR || _la==PROPERTYSEPARATOR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(159);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 32, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__3);
			setState(166);
			match(PROPERTYID);
			setState(167);
			match(T__4);
			setState(168);
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
	public static class DecvalueContext extends ParserRuleContext {
		public TerminalNode N() { return getToken(DrawScriptParser.N, 0); }
		public TerminalNode ID() { return getToken(DrawScriptParser.ID, 0); }
		public LinevalueContext linevalue() {
			return getRuleContext(LinevalueContext.class,0);
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
		enterRule(_localctx, 34, RULE_decvalue);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case N:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(N);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(ID);
				}
				break;
			case LINECOLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				linevalue();
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
		enterRule(_localctx, 36, RULE_linevalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(DrawScriptParser.OPERATOR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			expression();
			setState(178);
			match(OPERATOR);
			setState(179);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> PROPERTYID() { return getTokens(DrawScriptParser.PROPERTYID); }
		public TerminalNode PROPERTYID(int i) {
			return getToken(DrawScriptParser.PROPERTYID, i);
		}
		public List<TerminalNode> ID() { return getTokens(DrawScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DrawScriptParser.ID, i);
		}
		public List<TerminalNode> N() { return getTokens(DrawScriptParser.N); }
		public TerminalNode N(int i) {
			return getToken(DrawScriptParser.N, i);
		}
		public TerminalNode OPENPARENTESIS() { return getToken(DrawScriptParser.OPENPARENTESIS, 0); }
		public List<TerminalNode> OPERATOR() { return getTokens(DrawScriptParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(DrawScriptParser.OPERATOR, i);
		}
		public TerminalNode CLOSEDPARENTESIS() { return getToken(DrawScriptParser.CLOSEDPARENTESIS, 0); }
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENPARENTESIS) {
				{
				setState(181);
				match(OPENPARENTESIS);
				}
			}

			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(185);
					match(OPERATOR);
					setState(186);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSEDPARENTESIS) {
				{
				setState(192);
				match(CLOSEDPARENTESIS);
				}
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
		enterRule(_localctx, 42, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__5);
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==N) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(197);
			match(INTERVALSEPARATION);
			setState(198);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==N) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(199);
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
		enterRule(_localctx, 44, RULE_value);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case N:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(N);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(202);
				r();
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(203);
					g();
					}
					break;
				}
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(206);
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
		enterRule(_localctx, 46, RULE_delimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		enterRule(_localctx, 48, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		enterRule(_localctx, 50, RULE_g);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		enterRule(_localctx, 52, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0014\u00dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001B\b\u0001\n\u0001"+
		"\f\u0001E\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003V\b\u0003\n\u0003"+
		"\f\u0003Y\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005e\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f~\b\f\n\f\f\f\u0081\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u0087\b\f\n\f\f\f\u008a\t\f\u0003\f"+
		"\u008c\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0094\b\u000e\u0001\u000e\u0005\u000e\u0097\b\u000e\n\u000e\f\u000e"+
		"\u009a\t\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u009e\b\u000f\u0001"+
		"\u000f\u0005\u000f\u00a1\b\u000f\n\u000f\f\u000f\u00a4\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00ae\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014\u00b7\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00bc\b\u0014\n\u0014"+
		"\f\u0014\u00bf\t\u0014\u0001\u0014\u0003\u0014\u00c2\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u00cd\b\u0016\u0001\u0016\u0003\u0016"+
		"\u00d0\b\u0016\u0003\u0016\u00d2\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0000\u0003\u0002\u0004\u0006\u001b\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000"+
		"\u0003\u0001\u0000\b\n\u0001\u0000\t\n\u0001\u0000\u000e\u000f\u00d7\u0000"+
		"6\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004F\u0001"+
		"\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\bZ\u0001\u0000\u0000"+
		"\u0000\nd\u0001\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000\u000ek\u0001"+
		"\u0000\u0000\u0000\u0010m\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000"+
		"\u0000\u0014s\u0001\u0000\u0000\u0000\u0016u\u0001\u0000\u0000\u0000\u0018"+
		"\u008b\u0001\u0000\u0000\u0000\u001a\u008d\u0001\u0000\u0000\u0000\u001c"+
		"\u0091\u0001\u0000\u0000\u0000\u001e\u009b\u0001\u0000\u0000\u0000 \u00a5"+
		"\u0001\u0000\u0000\u0000\"\u00ad\u0001\u0000\u0000\u0000$\u00af\u0001"+
		"\u0000\u0000\u0000&\u00b1\u0001\u0000\u0000\u0000(\u00b6\u0001\u0000\u0000"+
		"\u0000*\u00c3\u0001\u0000\u0000\u0000,\u00d1\u0001\u0000\u0000\u0000."+
		"\u00d3\u0001\u0000\u0000\u00000\u00d5\u0001\u0000\u0000\u00002\u00d7\u0001"+
		"\u0000\u0000\u00004\u00d9\u0001\u0000\u0000\u000067\u0003\u0002\u0001"+
		"\u000078\u0003.\u0017\u000089\u0003\u0004\u0002\u00009:\u0003.\u0017\u0000"+
		":;\u0003\u0006\u0003\u0000;\u0001\u0001\u0000\u0000\u0000<=\u0006\u0001"+
		"\uffff\uffff\u0000=>\u0003\u0016\u000b\u0000>C\u0001\u0000\u0000\u0000"+
		"?@\n\u0001\u0000\u0000@B\u0003\u0016\u000b\u0000A?\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000D\u0003\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0006"+
		"\u0002\uffff\uffff\u0000GH\u0003\b\u0004\u0000HM\u0001\u0000\u0000\u0000"+
		"IJ\n\u0001\u0000\u0000JL\u0003\b\u0004\u0000KI\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000N\u0005\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0006"+
		"\u0003\uffff\uffff\u0000QR\u0003\n\u0005\u0000RW\u0001\u0000\u0000\u0000"+
		"ST\n\u0001\u0000\u0000TV\u0003\n\u0005\u0000US\u0001\u0000\u0000\u0000"+
		"VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000X\u0007\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005"+
		"\b\u0000\u0000[\\\u0005\u0001\u0000\u0000\\]\u0003\u0018\f\u0000]\t\u0001"+
		"\u0000\u0000\u0000^e\u0003\u0010\b\u0000_e\u0003 \u0010\u0000`e\u0003"+
		"\f\u0006\u0000ae\u0003\u000e\u0007\u0000be\u0003\u0012\t\u0000ce\u0005"+
		"\u0010\u0000\u0000d^\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000"+
		"d`\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000e\u000b\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0002\u0000\u0000gh\u0003&\u0013\u0000hi\u0005\u0012\u0000\u0000ij\u0007"+
		"\u0000\u0000\u0000j\r\u0001\u0000\u0000\u0000kl\u0005\u0003\u0000\u0000"+
		"l\u000f\u0001\u0000\u0000\u0000mn\u0005\b\u0000\u0000no\u0003\u0014\n"+
		"\u0000o\u0011\u0001\u0000\u0000\u0000pq\u0005\b\u0000\u0000qr\u0003\u001a"+
		"\r\u0000r\u0013\u0001\u0000\u0000\u0000st\u0003\"\u0011\u0000t\u0015\u0001"+
		"\u0000\u0000\u0000uv\u0005\t\u0000\u0000vw\u0005\u0001\u0000\u0000wx\u0003"+
		",\u0016\u0000x\u0017\u0001\u0000\u0000\u0000y\u008c\u0005\t\u0000\u0000"+
		"z\u007f\u0007\u0001\u0000\u0000{|\u0005\u000e\u0000\u0000|~\u0007\u0001"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\u000f\u0000\u0000\u0083\u0088\u0007\u0001\u0000\u0000\u0084"+
		"\u0085\u0005\u000e\u0000\u0000\u0085\u0087\u0007\u0001\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b"+
		"y\u0001\u0000\u0000\u0000\u008bz\u0001\u0000\u0000\u0000\u008c\u0019\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0003\u001c\u000e\u0000\u008e\u008f\u0005"+
		"\u0011\u0000\u0000\u008f\u0090\u0003\u001e\u000f\u0000\u0090\u001b\u0001"+
		"\u0000\u0000\u0000\u0091\u0098\u0007\u0000\u0000\u0000\u0092\u0094\u0007"+
		"\u0002\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0007"+
		"\u0000\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0097\u009a\u0001"+
		"\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u001d\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009b\u00a2\u0007\u0000\u0000\u0000\u009c\u009e\u0007"+
		"\u0002\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0007"+
		"\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u001f\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\u0004\u0000\u0000\u00a6\u00a7\u0005"+
		"\b\u0000\u0000\u00a7\u00a8\u0005\u0005\u0000\u0000\u00a8\u00a9\u0003*"+
		"\u0015\u0000\u00a9!\u0001\u0000\u0000\u0000\u00aa\u00ae\u0005\n\u0000"+
		"\u0000\u00ab\u00ae\u0005\t\u0000\u0000\u00ac\u00ae\u0003$\u0012\u0000"+
		"\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae#\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005\f\u0000\u0000\u00b0%\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0003(\u0014\u0000\u00b2\u00b3\u0005\u000e\u0000\u0000\u00b3\u00b4\u0003"+
		"(\u0014\u0000\u00b4\'\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005\u0013"+
		"\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00bd\u0007\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0005\u000e\u0000\u0000\u00ba\u00bc\u0007\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c2\u0005\u0014\u0000\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2)\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\u0006\u0000\u0000\u00c4\u00c5\u0007\u0001\u0000"+
		"\u0000\u00c5\u00c6\u0005\u0011\u0000\u0000\u00c6\u00c7\u0007\u0001\u0000"+
		"\u0000\u00c7\u00c8\u0005\u0006\u0000\u0000\u00c8+\u0001\u0000\u0000\u0000"+
		"\u00c9\u00d2\u0005\n\u0000\u0000\u00ca\u00cc\u00030\u0018\u0000\u00cb"+
		"\u00cd\u00032\u0019\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00d0"+
		"\u00034\u001a\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00c9\u0001"+
		"\u0000\u0000\u0000\u00d1\u00ca\u0001\u0000\u0000\u0000\u00d2-\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0005\u0007\u0000\u0000\u00d4/\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0005\u000b\u0000\u0000\u00d61\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0005\u000b\u0000\u0000\u00d83\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005\u000b\u0000\u0000\u00da5\u0001\u0000\u0000\u0000\u0012CM"+
		"Wd\u007f\u0088\u008b\u0093\u0098\u009d\u00a2\u00ad\u00b6\u00bd\u00c1\u00cc"+
		"\u00cf\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}