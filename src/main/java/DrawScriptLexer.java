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
		EQUALS=17, LARGER=18, LESS=19, WS=20, PROPERTYSEPARATOR=21, ENDINSTRUCTION=22, 
		INTERVALSEPARATOR=23, OPENPARENTESIS=24, CLOSEDPARENTESIS=25;
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
			"LARGER", "LESS", "WS", "PROPERTYSEPARATOR", "ENDINSTRUCTION", "INTERVALSEPARATOR", 
			"OPENPARENTESIS", "CLOSEDPARENTESIS"
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
		"\u0004\u0000\u0019\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0004\u0007L\b\u0007\u000b\u0007\f\u0007M\u0001"+
		"\b\u0004\bQ\b\b\u000b\b\f\bR\u0001\t\u0004\tV\b\t\u000b\t\f\tW\u0001\n"+
		"\u0003\n[\b\n\u0001\n\u0004\n^\b\n\u000b\n\f\n_\u0001\n\u0003\nc\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013v\b\u0013\u000b\u0013"+
		"\f\u0013w\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000"+
		"\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u0019\u0001\u0000\u0004\u0001\u0000az\u0001\u0000AZ\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u008f\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000"+
		"\u0005;\u0001\u0000\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\tB\u0001"+
		"\u0000\u0000\u0000\u000bD\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000"+
		"\u0000\u000fK\u0001\u0000\u0000\u0000\u0011P\u0001\u0000\u0000\u0000\u0013"+
		"U\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017d\u0001"+
		"\u0000\u0000\u0000\u0019f\u0001\u0000\u0000\u0000\u001bh\u0001\u0000\u0000"+
		"\u0000\u001dj\u0001\u0000\u0000\u0000\u001fl\u0001\u0000\u0000\u0000!"+
		"n\u0001\u0000\u0000\u0000#p\u0001\u0000\u0000\u0000%r\u0001\u0000\u0000"+
		"\u0000\'u\u0001\u0000\u0000\u0000){\u0001\u0000\u0000\u0000+}\u0001\u0000"+
		"\u0000\u0000-\u007f\u0001\u0000\u0000\u0000/\u0081\u0001\u0000\u0000\u0000"+
		"1\u0085\u0001\u0000\u0000\u000034\u0005i\u0000\u000045\u0005f\u0000\u0000"+
		"5\u0002\u0001\u0000\u0000\u000067\u0005e\u0000\u000078\u0005l\u0000\u0000"+
		"89\u0005s\u0000\u00009:\u0005e\u0000\u0000:\u0004\u0001\u0000\u0000\u0000"+
		";<\u0005f\u0000\u0000<=\u0005o\u0000\u0000=>\u0005r\u0000\u0000>\u0006"+
		"\u0001\u0000\u0000\u0000?@\u0005i\u0000\u0000@A\u0005n\u0000\u0000A\b"+
		"\u0001\u0000\u0000\u0000BC\u0005:\u0000\u0000C\n\u0001\u0000\u0000\u0000"+
		"DE\u0005[\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005-\u0000\u0000"+
		"GH\u0005-\u0000\u0000HI\u0005-\u0000\u0000I\u000e\u0001\u0000\u0000\u0000"+
		"JL\u0007\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0010\u0001"+
		"\u0000\u0000\u0000OQ\u0007\u0001\u0000\u0000PO\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000S\u0012\u0001\u0000\u0000\u0000TV\u0007\u0002\u0000\u0000UT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000X\u0014\u0001\u0000\u0000\u0000Y[\u0005|\u0000"+
		"\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000"+
		"\u0000\u0000\\^\u0007\u0002\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`b\u0001\u0000\u0000\u0000ac\u0005|\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000c\u0016\u0001\u0000\u0000\u0000de\u0005+\u0000"+
		"\u0000e\u0018\u0001\u0000\u0000\u0000fg\u0005-\u0000\u0000g\u001a\u0001"+
		"\u0000\u0000\u0000hi\u0005*\u0000\u0000i\u001c\u0001\u0000\u0000\u0000"+
		"jk\u0005/\u0000\u0000k\u001e\u0001\u0000\u0000\u0000lm\u0005%\u0000\u0000"+
		"m \u0001\u0000\u0000\u0000no\u0005=\u0000\u0000o\"\u0001\u0000\u0000\u0000"+
		"pq\u0005>\u0000\u0000q$\u0001\u0000\u0000\u0000rs\u0005<\u0000\u0000s"+
		"&\u0001\u0000\u0000\u0000tv\u0007\u0003\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0006\u0013\u0000\u0000z(\u0001"+
		"\u0000\u0000\u0000{|\u0005~\u0000\u0000|*\u0001\u0000\u0000\u0000}~\u0005"+
		"_\u0000\u0000~,\u0001\u0000\u0000\u0000\u007f\u0080\u0005,\u0000\u0000"+
		"\u0080.\u0001\u0000\u0000\u0000\u0081\u0082\u0005(\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0006\u0017\u0000\u0000\u00840\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005)\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0006\u0018\u0000\u0000\u00882\u0001\u0000\u0000"+
		"\u0000\b\u0000MRWZ_bw\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}