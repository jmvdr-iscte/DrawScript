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
		COLOR=10, LINECOLOR=11, WS=12, PLUS=13, MINUS=14, TIMES=15, DIVIDE=16, 
		PROPERTYSEPARATOR=17, ENDINSTRUCTION=18, INTERVALSEPARATION=19, EQUALS=20, 
		OPENPARENTESIS=21, CLOSEDPARENTESIS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "PROPERTYID", "ID", "N", 
			"COLOR", "LINECOLOR", "WS", "PLUS", "MINUS", "TIMES", "DIVIDE", "PROPERTYSEPARATOR", 
			"ENDINSTRUCTION", "INTERVALSEPARATION", "EQUALS", "OPENPARENTESIS", "CLOSEDPARENTESIS"
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
		"\u0004\u0000\u0016\u0087\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006"+
		"C\b\u0006\u000b\u0006\f\u0006D\u0001\u0007\u0004\u0007H\b\u0007\u000b"+
		"\u0007\f\u0007I\u0001\b\u0004\bM\b\b\u000b\b\f\bN\u0001\t\u0003\tR\b\t"+
		"\u0001\t\u0004\tU\b\t\u000b\t\f\tV\u0001\t\u0003\tZ\b\t\u0001\n\u0004"+
		"\n]\b\n\u000b\n\f\n^\u0001\n\u0001\n\u0004\nc\b\n\u000b\n\f\nd\u0001\n"+
		"\u0001\n\u0004\ni\b\n\u000b\n\f\nj\u0001\u000b\u0004\u000bn\b\u000b\u000b"+
		"\u000b\f\u000bo\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000"+
		"\u0004\u0001\u0000az\u0001\u0000AZ\u0001\u000009\u0003\u0000\t\n\r\r "+
		" \u0090\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000"+
		"\u0003/\u0001\u0000\u0000\u0000\u00054\u0001\u0000\u0000\u0000\u00078"+
		"\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000b=\u0001\u0000"+
		"\u0000\u0000\rB\u0001\u0000\u0000\u0000\u000fG\u0001\u0000\u0000\u0000"+
		"\u0011L\u0001\u0000\u0000\u0000\u0013Q\u0001\u0000\u0000\u0000\u0015\\"+
		"\u0001\u0000\u0000\u0000\u0017m\u0001\u0000\u0000\u0000\u0019s\u0001\u0000"+
		"\u0000\u0000\u001bu\u0001\u0000\u0000\u0000\u001dw\u0001\u0000\u0000\u0000"+
		"\u001fy\u0001\u0000\u0000\u0000!{\u0001\u0000\u0000\u0000#}\u0001\u0000"+
		"\u0000\u0000%\u007f\u0001\u0000\u0000\u0000\'\u0081\u0001\u0000\u0000"+
		"\u0000)\u0083\u0001\u0000\u0000\u0000+\u0085\u0001\u0000\u0000\u0000-"+
		".\u0005:\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005e\u0000\u0000"+
		"01\u0005l\u0000\u000012\u0005s\u0000\u000023\u0005e\u0000\u00003\u0004"+
		"\u0001\u0000\u0000\u000045\u0005f\u0000\u000056\u0005o\u0000\u000067\u0005"+
		"r\u0000\u00007\u0006\u0001\u0000\u0000\u000089\u0005i\u0000\u00009:\u0005"+
		"n\u0000\u0000:\b\u0001\u0000\u0000\u0000;<\u0005[\u0000\u0000<\n\u0001"+
		"\u0000\u0000\u0000=>\u0005-\u0000\u0000>?\u0005-\u0000\u0000?@\u0005-"+
		"\u0000\u0000@\f\u0001\u0000\u0000\u0000AC\u0007\u0000\u0000\u0000BA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000E\u000e\u0001\u0000\u0000\u0000FH\u0007\u0001"+
		"\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0010\u0001\u0000\u0000"+
		"\u0000KM\u0007\u0002\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0012"+
		"\u0001\u0000\u0000\u0000PR\u0005|\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SU\u0007\u0002\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XZ\u0005"+
		"|\u0000\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0014"+
		"\u0001\u0000\u0000\u0000[]\u0007\u0002\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0005|\u0000\u0000ac\u0007\u0002"+
		"\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fh\u0005|\u0000\u0000gi\u0007\u0002\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000k\u0016\u0001\u0000\u0000\u0000ln\u0007\u0003\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0006\u000b\u0000"+
		"\u0000r\u0018\u0001\u0000\u0000\u0000st\u0005+\u0000\u0000t\u001a\u0001"+
		"\u0000\u0000\u0000uv\u0005-\u0000\u0000v\u001c\u0001\u0000\u0000\u0000"+
		"wx\u0005*\u0000\u0000x\u001e\u0001\u0000\u0000\u0000yz\u0005/\u0000\u0000"+
		"z \u0001\u0000\u0000\u0000{|\u0005~\u0000\u0000|\"\u0001\u0000\u0000\u0000"+
		"}~\u0005_\u0000\u0000~$\u0001\u0000\u0000\u0000\u007f\u0080\u0005,\u0000"+
		"\u0000\u0080&\u0001\u0000\u0000\u0000\u0081\u0082\u0005=\u0000\u0000\u0082"+
		"(\u0001\u0000\u0000\u0000\u0083\u0084\u0005(\u0000\u0000\u0084*\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005)\u0000\u0000\u0086,\u0001\u0000\u0000"+
		"\u0000\u000b\u0000DINQVY^djo\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}