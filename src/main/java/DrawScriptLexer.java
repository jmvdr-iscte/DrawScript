// Generated from C:/Users/Utilizador/IdeaProjects/DrawScript/src\DrawScript.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DrawScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PROPERTYID=7, ID=8, N=9, 
		COLOR=10, PLUS=11, MINUS=12, TIMES=13, DIVIDE=14, MOD=15, EQUALS=16, WS=17, 
		PROPERTYSEPARATOR=18, ENDINSTRUCTION=19, INTERVALSEPARATOR=20, OPENPARENTESIS=21, 
		CLOSEDPARENTESIS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "PROPERTYID", "ID", "N", 
			"COLOR", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "EQUALS", "WS", "PROPERTYSEPARATOR", 
			"ENDINSTRUCTION", "INTERVALSEPARATOR", "OPENPARENTESIS", "CLOSEDPARENTESIS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'for'", "'in'", "':'", "'['", "'---'", null, null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", null, "'~'", "'_'", "','", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PROPERTYID", "ID", "N", "COLOR", 
			"PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "EQUALS", "WS", "PROPERTYSEPARATOR", 
			"ENDINSTRUCTION", "INTERVALSEPARATOR", "OPENPARENTESIS", "CLOSEDPARENTESIS"
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


	public DrawScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DrawScript.g4"; }

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
		"\u0004\u0000\u0016z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0004\u0006A\b\u0006\u000b\u0006\f\u0006"+
		"B\u0001\u0007\u0004\u0007F\b\u0007\u000b\u0007\f\u0007G\u0001\b\u0004"+
		"\bK\b\b\u000b\b\f\bL\u0001\t\u0003\tP\b\t\u0001\t\u0004\tS\b\t\u000b\t"+
		"\f\tT\u0001\t\u0003\tX\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0004\u0010g\b\u0010\u000b\u0010\f\u0010h\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0004\u0001\u0000az\u0001"+
		"\u0000AZ\u0001\u000009\u0003\u0000\t\n\r\r  \u0080\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0001-\u0001\u0000\u0000\u0000\u00030\u0001\u0000\u0000\u0000\u0005"+
		"4\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t9\u0001\u0000"+
		"\u0000\u0000\u000b;\u0001\u0000\u0000\u0000\r@\u0001\u0000\u0000\u0000"+
		"\u000fE\u0001\u0000\u0000\u0000\u0011J\u0001\u0000\u0000\u0000\u0013O"+
		"\u0001\u0000\u0000\u0000\u0015Y\u0001\u0000\u0000\u0000\u0017[\u0001\u0000"+
		"\u0000\u0000\u0019]\u0001\u0000\u0000\u0000\u001b_\u0001\u0000\u0000\u0000"+
		"\u001da\u0001\u0000\u0000\u0000\u001fc\u0001\u0000\u0000\u0000!f\u0001"+
		"\u0000\u0000\u0000#l\u0001\u0000\u0000\u0000%n\u0001\u0000\u0000\u0000"+
		"\'p\u0001\u0000\u0000\u0000)r\u0001\u0000\u0000\u0000+v\u0001\u0000\u0000"+
		"\u0000-.\u0005i\u0000\u0000./\u0005f\u0000\u0000/\u0002\u0001\u0000\u0000"+
		"\u000001\u0005f\u0000\u000012\u0005o\u0000\u000023\u0005r\u0000\u0000"+
		"3\u0004\u0001\u0000\u0000\u000045\u0005i\u0000\u000056\u0005n\u0000\u0000"+
		"6\u0006\u0001\u0000\u0000\u000078\u0005:\u0000\u00008\b\u0001\u0000\u0000"+
		"\u00009:\u0005[\u0000\u0000:\n\u0001\u0000\u0000\u0000;<\u0005-\u0000"+
		"\u0000<=\u0005-\u0000\u0000=>\u0005-\u0000\u0000>\f\u0001\u0000\u0000"+
		"\u0000?A\u0007\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u000e"+
		"\u0001\u0000\u0000\u0000DF\u0007\u0001\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000H\u0010\u0001\u0000\u0000\u0000IK\u0007\u0002\u0000\u0000"+
		"JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000M\u0012\u0001\u0000\u0000\u0000NP\u0005"+
		"|\u0000\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001"+
		"\u0000\u0000\u0000QS\u0007\u0002\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UW\u0001\u0000\u0000\u0000VX\u0005|\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000X\u0014\u0001\u0000\u0000\u0000YZ\u0005"+
		"+\u0000\u0000Z\u0016\u0001\u0000\u0000\u0000[\\\u0005-\u0000\u0000\\\u0018"+
		"\u0001\u0000\u0000\u0000]^\u0005*\u0000\u0000^\u001a\u0001\u0000\u0000"+
		"\u0000_`\u0005/\u0000\u0000`\u001c\u0001\u0000\u0000\u0000ab\u0005%\u0000"+
		"\u0000b\u001e\u0001\u0000\u0000\u0000cd\u0005=\u0000\u0000d \u0001\u0000"+
		"\u0000\u0000eg\u0007\u0003\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jk\u0006\u0010\u0000\u0000k\"\u0001\u0000\u0000"+
		"\u0000lm\u0005~\u0000\u0000m$\u0001\u0000\u0000\u0000no\u0005_\u0000\u0000"+
		"o&\u0001\u0000\u0000\u0000pq\u0005,\u0000\u0000q(\u0001\u0000\u0000\u0000"+
		"rs\u0005(\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0006\u0014\u0000\u0000"+
		"u*\u0001\u0000\u0000\u0000vw\u0005)\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xy\u0006\u0015\u0000\u0000y,\u0001\u0000\u0000\u0000\b\u0000BGLOTWh\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}