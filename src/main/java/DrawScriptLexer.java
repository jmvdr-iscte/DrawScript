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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PROPERTYID=8, 
		ID=9, N=10, COLOR=11, PLUS=12, MINUS=13, TIMES=14, DIVIDE=15, MOD=16, 
		EQUALS=17, WS=18, PROPERTYSEPARATOR=19, ENDINSTRUCTION=20, INTERVALSEPARATOR=21, 
		OPENPARENTESIS=22, CLOSEDPARENTESIS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "PROPERTYID", 
			"ID", "N", "COLOR", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "EQUALS", 
			"WS", "PROPERTYSEPARATOR", "ENDINSTRUCTION", "INTERVALSEPARATOR", "OPENPARENTESIS", 
			"CLOSEDPARENTESIS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'in'", "':'", "'['", "'---'", null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", null, "'~'", 
			"'_'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "PROPERTYID", "ID", "N", 
			"COLOR", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "EQUALS", "WS", "PROPERTYSEPARATOR", 
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
		"\u0004\u0000\u0017\u0081\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007H\b\u0007"+
		"\u000b\u0007\f\u0007I\u0001\b\u0004\bM\b\b\u000b\b\f\bN\u0001\t\u0004"+
		"\tR\b\t\u000b\t\f\tS\u0001\n\u0003\nW\b\n\u0001\n\u0004\nZ\b\n\u000b\n"+
		"\f\n[\u0001\n\u0003\n_\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0004\u0011n\b\u0011\u000b\u0011\f\u0011o\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000"+
		"\u0004\u0001\u0000az\u0001\u0000AZ\u0001\u000009\u0003\u0000\t\n\r\r "+
		" \u0087\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0001/\u0001\u0000\u0000\u0000\u00032\u0001\u0000\u0000\u0000\u00057"+
		"\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000\t>\u0001\u0000"+
		"\u0000\u0000\u000b@\u0001\u0000\u0000\u0000\rB\u0001\u0000\u0000\u0000"+
		"\u000fG\u0001\u0000\u0000\u0000\u0011L\u0001\u0000\u0000\u0000\u0013Q"+
		"\u0001\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017`\u0001\u0000"+
		"\u0000\u0000\u0019b\u0001\u0000\u0000\u0000\u001bd\u0001\u0000\u0000\u0000"+
		"\u001df\u0001\u0000\u0000\u0000\u001fh\u0001\u0000\u0000\u0000!j\u0001"+
		"\u0000\u0000\u0000#m\u0001\u0000\u0000\u0000%s\u0001\u0000\u0000\u0000"+
		"\'u\u0001\u0000\u0000\u0000)w\u0001\u0000\u0000\u0000+y\u0001\u0000\u0000"+
		"\u0000-}\u0001\u0000\u0000\u0000/0\u0005i\u0000\u000001\u0005f\u0000\u0000"+
		"1\u0002\u0001\u0000\u0000\u000023\u0005e\u0000\u000034\u0005l\u0000\u0000"+
		"45\u0005s\u0000\u000056\u0005e\u0000\u00006\u0004\u0001\u0000\u0000\u0000"+
		"78\u0005f\u0000\u000089\u0005o\u0000\u00009:\u0005r\u0000\u0000:\u0006"+
		"\u0001\u0000\u0000\u0000;<\u0005i\u0000\u0000<=\u0005n\u0000\u0000=\b"+
		"\u0001\u0000\u0000\u0000>?\u0005:\u0000\u0000?\n\u0001\u0000\u0000\u0000"+
		"@A\u0005[\u0000\u0000A\f\u0001\u0000\u0000\u0000BC\u0005-\u0000\u0000"+
		"CD\u0005-\u0000\u0000DE\u0005-\u0000\u0000E\u000e\u0001\u0000\u0000\u0000"+
		"FH\u0007\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0010\u0001"+
		"\u0000\u0000\u0000KM\u0007\u0001\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000O\u0012\u0001\u0000\u0000\u0000PR\u0007\u0002\u0000\u0000QP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000T\u0014\u0001\u0000\u0000\u0000UW\u0005|\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000"+
		"\u0000\u0000XZ\u0007\u0002\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\^\u0001\u0000\u0000\u0000]_\u0005|\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_\u0016\u0001\u0000\u0000\u0000`a\u0005+\u0000"+
		"\u0000a\u0018\u0001\u0000\u0000\u0000bc\u0005-\u0000\u0000c\u001a\u0001"+
		"\u0000\u0000\u0000de\u0005*\u0000\u0000e\u001c\u0001\u0000\u0000\u0000"+
		"fg\u0005/\u0000\u0000g\u001e\u0001\u0000\u0000\u0000hi\u0005%\u0000\u0000"+
		"i \u0001\u0000\u0000\u0000jk\u0005=\u0000\u0000k\"\u0001\u0000\u0000\u0000"+
		"ln\u0007\u0003\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0006\u0011\u0000\u0000r$\u0001\u0000\u0000\u0000st\u0005"+
		"~\u0000\u0000t&\u0001\u0000\u0000\u0000uv\u0005_\u0000\u0000v(\u0001\u0000"+
		"\u0000\u0000wx\u0005,\u0000\u0000x*\u0001\u0000\u0000\u0000yz\u0005(\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{|\u0006\u0015\u0000\u0000|,\u0001\u0000"+
		"\u0000\u0000}~\u0005)\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0006\u0016\u0000\u0000\u0080.\u0001\u0000\u0000\u0000\b\u0000"+
		"INSV[^o\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}