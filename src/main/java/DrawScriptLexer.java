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
		ID=9, N=10, COLOR=11, LINECOLOR=12, WS=13, OPERATOR=14, PROPERTYSEPARATOR=15, 
		ENDINSTRUCTION=16, INTERVALSEPARATION=17, EQUALSOPERATOR=18, OPENPARENTESIS=19, 
		CLOSEDPARENTESIS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "PROPERTYID", 
			"ID", "N", "COLOR", "LINECOLOR", "WS", "OPERATOR", "PROPERTYSEPARATOR", 
			"ENDINSTRUCTION", "INTERVALSEPARATION", "EQUALSOPERATOR", "OPENPARENTESIS", 
			"CLOSEDPARENTESIS"
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
		"\u0004\u0000\u0014}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007B\b\u0007\u000b"+
		"\u0007\f\u0007C\u0001\b\u0004\bG\b\b\u000b\b\f\bH\u0001\t\u0004\tL\b\t"+
		"\u000b\t\f\tM\u0001\n\u0001\n\u0004\nR\b\n\u000b\n\f\nS\u0001\n\u0001"+
		"\n\u0001\u000b\u0004\u000bY\b\u000b\u000b\u000b\f\u000bZ\u0001\u000b\u0001"+
		"\u000b\u0004\u000b_\b\u000b\u000b\u000b\f\u000b`\u0001\u000b\u0001\u000b"+
		"\u0004\u000be\b\u000b\u000b\u000b\f\u000bf\u0001\f\u0004\fj\b\f\u000b"+
		"\f\f\fk\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0005\u0001\u0000"+
		"az\u0001\u0000AZ\u0001\u000009\u0003\u0000\t\n\r\r  \u0004\u0000%%*+-"+
		"-//\u0084\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001"+
		"\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000"+
		"\u0000\u00073\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000\u000b"+
		":\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000\u000fA\u0001\u0000"+
		"\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013K\u0001\u0000\u0000\u0000"+
		"\u0015O\u0001\u0000\u0000\u0000\u0017X\u0001\u0000\u0000\u0000\u0019i"+
		"\u0001\u0000\u0000\u0000\u001bo\u0001\u0000\u0000\u0000\u001dq\u0001\u0000"+
		"\u0000\u0000\u001fs\u0001\u0000\u0000\u0000!u\u0001\u0000\u0000\u0000"+
		"#w\u0001\u0000\u0000\u0000%y\u0001\u0000\u0000\u0000\'{\u0001\u0000\u0000"+
		"\u0000)*\u0005:\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005i\u0000"+
		"\u0000,-\u0005f\u0000\u0000-\u0004\u0001\u0000\u0000\u0000./\u0005e\u0000"+
		"\u0000/0\u0005l\u0000\u000001\u0005s\u0000\u000012\u0005e\u0000\u0000"+
		"2\u0006\u0001\u0000\u0000\u000034\u0005f\u0000\u000045\u0005o\u0000\u0000"+
		"56\u0005r\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005i\u0000\u0000"+
		"89\u0005n\u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005[\u0000\u0000"+
		";\f\u0001\u0000\u0000\u0000<=\u0005-\u0000\u0000=>\u0005-\u0000\u0000"+
		">?\u0005-\u0000\u0000?\u000e\u0001\u0000\u0000\u0000@B\u0007\u0000\u0000"+
		"\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0010\u0001\u0000\u0000\u0000"+
		"EG\u0007\u0001\u0000\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0012\u0001"+
		"\u0000\u0000\u0000JL\u0007\u0002\u0000\u0000KJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000N\u0014\u0001\u0000\u0000\u0000OQ\u0005|\u0000\u0000PR\u0007\u0002"+
		"\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UV\u0005|\u0000\u0000V\u0016\u0001\u0000\u0000\u0000WY\u0007\u0002\u0000"+
		"\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0005"+
		"|\u0000\u0000]_\u0007\u0002\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bd\u0005|\u0000\u0000ce\u0007\u0002\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000g\u0018\u0001\u0000\u0000\u0000hj\u0007"+
		"\u0003\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0006\f\u0000\u0000n\u001a\u0001\u0000\u0000\u0000op\u0007\u0004"+
		"\u0000\u0000p\u001c\u0001\u0000\u0000\u0000qr\u0005~\u0000\u0000r\u001e"+
		"\u0001\u0000\u0000\u0000st\u0005_\u0000\u0000t \u0001\u0000\u0000\u0000"+
		"uv\u0005,\u0000\u0000v\"\u0001\u0000\u0000\u0000wx\u0005=\u0000\u0000"+
		"x$\u0001\u0000\u0000\u0000yz\u0005(\u0000\u0000z&\u0001\u0000\u0000\u0000"+
		"{|\u0005)\u0000\u0000|(\u0001\u0000\u0000\u0000\t\u0000CHMSZ`fk\u0001"+
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