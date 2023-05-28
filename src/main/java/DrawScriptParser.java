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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, PROPERTYID=9, 
		ID=10, N=11, COLOR=12, WS=13, OPERATOR=14, PROPERTYSEPARATOR=15, ENDINSTRUCTION=16, 
		INTERVALSEPARATION=17, EQUALSOPERATOR=18, OPENPARENTESIS=19, CLOSEDPARENTESIS=20;
	public static final int
		RULE_program = 0, RULE_property = 1, RULE_instruction = 2, RULE_ifStatement = 3, 
		RULE_elseStatement = 4, RULE_declaration = 5, RULE_geometricobjectsdec = 6, 
		RULE_declarationvalue = 7, RULE_constant = 8, RULE_propertyvalue = 9, 
		RULE_geometricobjects = 10, RULE_xexpression = 11, RULE_yexpression = 12, 
		RULE_forLoop = 13, RULE_decvalue = 14, RULE_linevalue = 15, RULE_condition = 16, 
		RULE_expression = 17, RULE_interval = 18, RULE_value = 19, RULE_delimiter = 20, 
		RULE_r = 21, RULE_g = 22, RULE_b = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "property", "instruction", "ifStatement", "elseStatement", 
			"declaration", "geometricobjectsdec", "declarationvalue", "constant", 
			"propertyvalue", "geometricobjects", "xexpression", "yexpression", "forLoop", 
			"decvalue", "linevalue", "condition", "expression", "interval", "value", 
			"delimiter", "r", "g", "b"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'if'", "'else'", "'for'", "'in'", "'|'", "'['", "'---'", 
			null, null, null, null, null, null, "'~'", "'_'", "','", "'='", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "PROPERTYID", "ID", 
			"N", "COLOR", "WS", "OPERATOR", "PROPERTYSEPARATOR", "ENDINSTRUCTION", 
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
	public static class ProgramContext extends ParserRuleContext {
		public List<DelimiterContext> delimiter() {
			return getRuleContexts(DelimiterContext.class);
		}
		public DelimiterContext delimiter(int i) {
			return getRuleContext(DelimiterContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(48);
				constant();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			delimiter();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROPERTYID) {
				{
				{
				setState(55);
				property();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			delimiter();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66076L) != 0)) {
				{
				{
				setState(62);
				instruction();
				}
				}
				setState(67);
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
		enterRule(_localctx, 2, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((PropertyContext)_localctx).propid = match(PROPERTYID);
			setState(69);
			match(T__0);
			setState(70);
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
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				forLoop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				elseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				geometricobjectsdec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
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
		enterRule(_localctx, 6, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__1);
			setState(81);
			condition();
			setState(82);
			match(EQUALSOPERATOR);
			setState(83);
			((IfStatementContext)_localctx).conditionResult = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
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
		enterRule(_localctx, 8, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
		enterRule(_localctx, 10, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((DeclarationContext)_localctx).id = match(PROPERTYID);
			setState(88);
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
		enterRule(_localctx, 12, RULE_geometricobjectsdec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((GeometricobjectsdecContext)_localctx).id = match(PROPERTYID);
			setState(91);
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
		enterRule(_localctx, 14, RULE_declarationvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		public Token id;
		public ValueContext val;
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
		enterRule(_localctx, 16, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((ConstantContext)_localctx).id = match(ID);
			setState(96);
			match(T__0);
			setState(97);
			((ConstantContext)_localctx).val = value();
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
		enterRule(_localctx, 18, RULE_propertyvalue);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==N) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR) {
					{
					{
					setState(101);
					match(OPERATOR);
					setState(102);
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
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(PROPERTYSEPARATOR);
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==N) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERATOR) {
					{
					{
					setState(110);
					match(OPERATOR);
					setState(111);
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
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		enterRule(_localctx, 20, RULE_geometricobjects);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			xexpression();
			setState(120);
			match(INTERVALSEPARATION);
			setState(121);
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
		enterRule(_localctx, 22, RULE_xexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52736L) != 0)) {
				{
				{
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR || _la==PROPERTYSEPARATOR) {
					{
					setState(124);
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

				setState(127);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(132);
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
		enterRule(_localctx, 24, RULE_yexpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPERATOR || _la==PROPERTYSEPARATOR) {
						{
						setState(134);
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

					setState(137);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
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
				setState(142);
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
		enterRule(_localctx, 26, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__3);
			setState(144);
			match(PROPERTYID);
			setState(145);
			match(T__4);
			setState(146);
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
		enterRule(_localctx, 28, RULE_decvalue);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(N);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				linevalue();
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
	public static class LinevalueContext extends ParserRuleContext {
		public List<TerminalNode> N() { return getTokens(DrawScriptParser.N); }
		public TerminalNode N(int i) {
			return getToken(DrawScriptParser.N, i);
		}
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
		enterRule(_localctx, 30, RULE_linevalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(N);
			setState(154);
			match(T__5);
			setState(155);
			match(N);
			setState(156);
			match(T__5);
			setState(157);
			match(N);
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
		enterRule(_localctx, 32, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			expression();
			setState(160);
			match(OPERATOR);
			setState(161);
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
		enterRule(_localctx, 34, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPENPARENTESIS) {
				{
				setState(163);
				match(OPENPARENTESIS);
				}
			}

			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					match(OPERATOR);
					setState(168);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
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
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSEDPARENTESIS) {
				{
				setState(174);
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
		enterRule(_localctx, 36, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__6);
			setState(178);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==N) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(179);
			match(INTERVALSEPARATION);
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==N) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(181);
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
		enterRule(_localctx, 38, RULE_value);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case N:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(N);
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				r();
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(185);
					g();
					}
					break;
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLOR) {
					{
					setState(188);
					b();
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
		enterRule(_localctx, 40, RULE_delimiter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		enterRule(_localctx, 42, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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
		enterRule(_localctx, 44, RULE_g);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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
		enterRule(_localctx, 46, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0014\u00ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005"+
		"\u00002\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u00009\b\u0000\n\u0000\f\u0000<\t\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0005\th\b\t\n\t\f\tk\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tq\b"+
		"\t\n\t\f\tt\t\t\u0003\tv\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b~\b\u000b\u0001\u000b\u0005\u000b\u0081\b\u000b"+
		"\n\u000b\f\u000b\u0084\t\u000b\u0001\f\u0001\f\u0003\f\u0088\b\f\u0001"+
		"\f\u0005\f\u008b\b\f\n\f\f\f\u008e\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0098\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011"+
		"\u00a5\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00aa\b"+
		"\u0011\n\u0011\f\u0011\u00ad\t\u0011\u0001\u0011\u0003\u0011\u00b0\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00bb\b\u0013\u0001\u0013"+
		"\u0003\u0013\u00be\b\u0013\u0003\u0013\u00c0\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0003"+
		"\u0001\u0000\t\u000b\u0001\u0000\n\u000b\u0001\u0000\u000e\u000f\u00c8"+
		"\u00003\u0001\u0000\u0000\u0000\u0002D\u0001\u0000\u0000\u0000\u0004N"+
		"\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\bU\u0001\u0000"+
		"\u0000\u0000\nW\u0001\u0000\u0000\u0000\fZ\u0001\u0000\u0000\u0000\u000e"+
		"]\u0001\u0000\u0000\u0000\u0010_\u0001\u0000\u0000\u0000\u0012u\u0001"+
		"\u0000\u0000\u0000\u0014w\u0001\u0000\u0000\u0000\u0016{\u0001\u0000\u0000"+
		"\u0000\u0018\u0085\u0001\u0000\u0000\u0000\u001a\u008f\u0001\u0000\u0000"+
		"\u0000\u001c\u0097\u0001\u0000\u0000\u0000\u001e\u0099\u0001\u0000\u0000"+
		"\u0000 \u009f\u0001\u0000\u0000\u0000\"\u00a4\u0001\u0000\u0000\u0000"+
		"$\u00b1\u0001\u0000\u0000\u0000&\u00bf\u0001\u0000\u0000\u0000(\u00c1"+
		"\u0001\u0000\u0000\u0000*\u00c3\u0001\u0000\u0000\u0000,\u00c5\u0001\u0000"+
		"\u0000\u0000.\u00c7\u0001\u0000\u0000\u000002\u0003\u0010\b\u000010\u0001"+
		"\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u00006:\u0003(\u0014\u000079\u0003\u0002\u0001\u000087\u0001\u0000\u0000"+
		"\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=A\u0003"+
		"(\u0014\u0000>@\u0003\u0004\u0002\u0000?>\u0001\u0000\u0000\u0000@C\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"B\u0001\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005\t\u0000"+
		"\u0000EF\u0005\u0001\u0000\u0000FG\u0003\u0012\t\u0000G\u0003\u0001\u0000"+
		"\u0000\u0000HO\u0003\n\u0005\u0000IO\u0003\u001a\r\u0000JO\u0003\u0006"+
		"\u0003\u0000KO\u0003\b\u0004\u0000LO\u0003\f\u0006\u0000MO\u0005\u0010"+
		"\u0000\u0000NH\u0001\u0000\u0000\u0000NI\u0001\u0000\u0000\u0000NJ\u0001"+
		"\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NM\u0001\u0000\u0000\u0000O\u0005\u0001\u0000\u0000\u0000PQ\u0005\u0002"+
		"\u0000\u0000QR\u0003 \u0010\u0000RS\u0005\u0012\u0000\u0000ST\u0007\u0000"+
		"\u0000\u0000T\u0007\u0001\u0000\u0000\u0000UV\u0005\u0003\u0000\u0000"+
		"V\t\u0001\u0000\u0000\u0000WX\u0005\t\u0000\u0000XY\u0003\u000e\u0007"+
		"\u0000Y\u000b\u0001\u0000\u0000\u0000Z[\u0005\t\u0000\u0000[\\\u0003\u0014"+
		"\n\u0000\\\r\u0001\u0000\u0000\u0000]^\u0003\u001c\u000e\u0000^\u000f"+
		"\u0001\u0000\u0000\u0000_`\u0005\n\u0000\u0000`a\u0005\u0001\u0000\u0000"+
		"ab\u0003&\u0013\u0000b\u0011\u0001\u0000\u0000\u0000cv\u0005\n\u0000\u0000"+
		"di\u0007\u0001\u0000\u0000ef\u0005\u000e\u0000\u0000fh\u0007\u0001\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000lm\u0005\u000f\u0000\u0000mr\u0007\u0001\u0000\u0000"+
		"no\u0005\u000e\u0000\u0000oq\u0007\u0001\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uc\u0001"+
		"\u0000\u0000\u0000ud\u0001\u0000\u0000\u0000v\u0013\u0001\u0000\u0000"+
		"\u0000wx\u0003\u0016\u000b\u0000xy\u0005\u0011\u0000\u0000yz\u0003\u0018"+
		"\f\u0000z\u0015\u0001\u0000\u0000\u0000{\u0082\u0007\u0000\u0000\u0000"+
		"|~\u0007\u0002\u0000\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0000\u0000\u0000"+
		"\u0080}\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0017\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085"+
		"\u008c\u0007\u0000\u0000\u0000\u0086\u0088\u0007\u0002\u0000\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0007\u0000\u0000\u0000\u008a"+
		"\u0087\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u0019\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u0004\u0000\u0000\u0090\u0091\u0005\t\u0000\u0000\u0091\u0092"+
		"\u0005\u0005\u0000\u0000\u0092\u0093\u0003$\u0012\u0000\u0093\u001b\u0001"+
		"\u0000\u0000\u0000\u0094\u0098\u0005\u000b\u0000\u0000\u0095\u0098\u0005"+
		"\n\u0000\u0000\u0096\u0098\u0003\u001e\u000f\u0000\u0097\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u001d\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u000b"+
		"\u0000\u0000\u009a\u009b\u0005\u0006\u0000\u0000\u009b\u009c\u0005\u000b"+
		"\u0000\u0000\u009c\u009d\u0005\u0006\u0000\u0000\u009d\u009e\u0005\u000b"+
		"\u0000\u0000\u009e\u001f\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\"\u0011"+
		"\u0000\u00a0\u00a1\u0005\u000e\u0000\u0000\u00a1\u00a2\u0003\"\u0011\u0000"+
		"\u00a2!\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005\u0013\u0000\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00ab\u0007\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0005\u000e\u0000\u0000\u00a8\u00aa\u0007\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b0\u0005\u0014\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0#\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005\u0007\u0000\u0000\u00b2\u00b3\u0007\u0001\u0000\u0000\u00b3\u00b4"+
		"\u0005\u0011\u0000\u0000\u00b4\u00b5\u0007\u0001\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0007\u0000\u0000\u00b6%\u0001\u0000\u0000\u0000\u00b7\u00c0\u0005"+
		"\u000b\u0000\u0000\u00b8\u00ba\u0003*\u0015\u0000\u00b9\u00bb\u0003,\u0016"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00be\u0003.\u0017\u0000"+
		"\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00b7\u0001\u0000\u0000\u0000"+
		"\u00bf\u00b8\u0001\u0000\u0000\u0000\u00c0\'\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005\b\u0000\u0000\u00c2)\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0005\f\u0000\u0000\u00c4+\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\f\u0000\u0000\u00c6-\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\f\u0000"+
		"\u0000\u00c8/\u0001\u0000\u0000\u0000\u00123:ANiru}\u0082\u0087\u008c"+
		"\u0097\u00a4\u00ab\u00af\u00ba\u00bd\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}