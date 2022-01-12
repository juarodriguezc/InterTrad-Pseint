// Generated from C:/Users/juans/Desktop/Lenguajes de programacion/InterTrad/grammar\PseintGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseintGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		F_SALG_SP=1, FIN_F_SALG_SP=2, PROC_ALG=3, FIN_PROC_ALG=4, DEFINIR=5, COMO=6, 
		DIMENSION=7, LEER=8, ESCRIBIR=9, SI=10, ENTONCES=11, SINO=12, FINSI=13, 
		SEGUN=14, HACER=15, CASO=16, DE=17, OTRO=18, MODO=19, FINSEGUN=20, MIENTRAS=21, 
		FINMIENTRAS=22, REPETIR=23, HASTA=24, QUE=25, PARA=26, CON=27, PASO=28, 
		FINPARA=29, BORRAR=30, LIMPIAR=31, PANTALLA=32, ESPERAR=33, SEGUNDOS=34, 
		MILISEGUNDOS=35, TECLA=36, T_DATO=37, T_NUM=38, T_LOGICO=39, T_CARAC=40, 
		TD_REAL=41, TD_ENTERO=42, TD_CADENA=43, VERDADERO=44, FALSO=45, PYC=46, 
		ASIG=47, PAR_IZQ=48, PAR_DER=49, COR_IZQ=50, COR_DER=51, COMA=52, GEQ=53, 
		LEQ=54, DIFT=55, GRE=56, LOW=57, EQU=58, OP_Y=59, OP_OR=60, OP_NEG=61, 
		MAS=62, MENOS=63, MUL=64, DIV=65, POT=66, MOD=67, DOSP=68, ID=69, WS=70, 
		COMMENT=71;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"F_SALG_SP", "FIN_F_SALG_SP", "PROC_ALG", "FIN_PROC_ALG", "DEFINIR", 
			"COMO", "DIMENSION", "LEER", "ESCRIBIR", "SI", "ENTONCES", "SINO", "FINSI", 
			"SEGUN", "HACER", "CASO", "DE", "OTRO", "MODO", "FINSEGUN", "MIENTRAS", 
			"FINMIENTRAS", "REPETIR", "HASTA", "QUE", "PARA", "CON", "PASO", "FINPARA", 
			"BORRAR", "LIMPIAR", "PANTALLA", "ESPERAR", "SEGUNDOS", "MILISEGUNDOS", 
			"TECLA", "T_DATO", "T_NUM", "T_LOGICO", "T_CARAC", "TD_REAL", "TD_ENTERO", 
			"TD_CADENA", "VERDADERO", "FALSO", "PYC", "ASIG", "PAR_IZQ", "PAR_DER", 
			"COR_IZQ", "COR_DER", "COMA", "GEQ", "LEQ", "DIFT", "GRE", "LOW", "EQU", 
			"OP_Y", "OP_OR", "OP_NEG", "MAS", "MENOS", "MUL", "DIV", "POT", "MOD", 
			"DOSP", "ID", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
			"Z", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "';'", "'<-'", 
			"'('", "')'", "'['", "']'", "','", "'>='", "'<='", "'<>'", "'>'", "'<'", 
			"'='", null, null, null, "'+'", "'-'", "'*'", "'/'", null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "F_SALG_SP", "FIN_F_SALG_SP", "PROC_ALG", "FIN_PROC_ALG", "DEFINIR", 
			"COMO", "DIMENSION", "LEER", "ESCRIBIR", "SI", "ENTONCES", "SINO", "FINSI", 
			"SEGUN", "HACER", "CASO", "DE", "OTRO", "MODO", "FINSEGUN", "MIENTRAS", 
			"FINMIENTRAS", "REPETIR", "HASTA", "QUE", "PARA", "CON", "PASO", "FINPARA", 
			"BORRAR", "LIMPIAR", "PANTALLA", "ESPERAR", "SEGUNDOS", "MILISEGUNDOS", 
			"TECLA", "T_DATO", "T_NUM", "T_LOGICO", "T_CARAC", "TD_REAL", "TD_ENTERO", 
			"TD_CADENA", "VERDADERO", "FALSO", "PYC", "ASIG", "PAR_IZQ", "PAR_DER", 
			"COR_IZQ", "COR_DER", "COMA", "GEQ", "LEQ", "DIFT", "GRE", "LOW", "EQU", 
			"OP_Y", "OP_OR", "OP_NEG", "MAS", "MENOS", "MUL", "DIV", "POT", "MOD", 
			"DOSP", "ID", "WS", "COMMENT"
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


	public PseintGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PseintGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2I\u033c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\u00e6\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0111\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0125\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u013f\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0212\n#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\5&\u022a"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u025f\n\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0286\n)\3*"+
		"\6*\u0289\n*\r*\16*\u028a\3*\3*\6*\u028f\n*\r*\16*\u0290\3+\6+\u0294\n"+
		"+\r+\16+\u0295\3,\3,\7,\u029a\n,\f,\16,\u029d\13,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\5<\u02d1\n<\3=\3=\5=\u02d5\n=\3>\3>\3>\3"+
		">\5>\u02db\n>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3D\3D\3D\5D\u02ec\n"+
		"D\3E\3E\3F\3F\7F\u02f2\nF\fF\16F\u02f5\13F\3G\3G\3H\3H\3I\3I\3J\3J\3K"+
		"\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V"+
		"\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\6a\u032c"+
		"\na\ra\16a\u032d\3a\3a\3b\3b\3b\3b\7b\u0336\nb\fb\16b\u0339\13b\3b\3b"+
		"\3\u029b\2c\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d"+
		"\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af"+
		"\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1"+
		"H\u00c3I\3\2#\3\2\62;\3\2\60\60\4\2$$))\4\2C\\c|\6\2\62;C\\aac|\4\2CC"+
		"cc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13"+
		"\f\17\17\"\"\4\2\f\f\17\17\2\u033e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\3\u00e5\3\2\2"+
		"\2\5\u0110\3\2\2\2\7\u0124\3\2\2\2\t\u013e\3\2\2\2\13\u0140\3\2\2\2\r"+
		"\u0148\3\2\2\2\17\u014d\3\2\2\2\21\u0157\3\2\2\2\23\u015c\3\2\2\2\25\u0165"+
		"\3\2\2\2\27\u0168\3\2\2\2\31\u0171\3\2\2\2\33\u0176\3\2\2\2\35\u017c\3"+
		"\2\2\2\37\u0182\3\2\2\2!\u0188\3\2\2\2#\u018d\3\2\2\2%\u0190\3\2\2\2\'"+
		"\u0195\3\2\2\2)\u019a\3\2\2\2+\u01a3\3\2\2\2-\u01ac\3\2\2\2/\u01b8\3\2"+
		"\2\2\61\u01c0\3\2\2\2\63\u01c6\3\2\2\2\65\u01ca\3\2\2\2\67\u01cf\3\2\2"+
		"\29\u01d3\3\2\2\2;\u01d8\3\2\2\2=\u01e0\3\2\2\2?\u01e7\3\2\2\2A\u01ef"+
		"\3\2\2\2C\u01f8\3\2\2\2E\u0211\3\2\2\2G\u0213\3\2\2\2I\u0220\3\2\2\2K"+
		"\u0229\3\2\2\2M\u025e\3\2\2\2O\u0260\3\2\2\2Q\u0285\3\2\2\2S\u0288\3\2"+
		"\2\2U\u0293\3\2\2\2W\u0297\3\2\2\2Y\u02a0\3\2\2\2[\u02aa\3\2\2\2]\u02b0"+
		"\3\2\2\2_\u02b2\3\2\2\2a\u02b5\3\2\2\2c\u02b7\3\2\2\2e\u02b9\3\2\2\2g"+
		"\u02bb\3\2\2\2i\u02bd\3\2\2\2k\u02bf\3\2\2\2m\u02c2\3\2\2\2o\u02c5\3\2"+
		"\2\2q\u02c8\3\2\2\2s\u02ca\3\2\2\2u\u02cc\3\2\2\2w\u02d0\3\2\2\2y\u02d4"+
		"\3\2\2\2{\u02da\3\2\2\2}\u02dc\3\2\2\2\177\u02de\3\2\2\2\u0081\u02e0\3"+
		"\2\2\2\u0083\u02e2\3\2\2\2\u0085\u02e4\3\2\2\2\u0087\u02eb\3\2\2\2\u0089"+
		"\u02ed\3\2\2\2\u008b\u02ef\3\2\2\2\u008d\u02f6\3\2\2\2\u008f\u02f8\3\2"+
		"\2\2\u0091\u02fa\3\2\2\2\u0093\u02fc\3\2\2\2\u0095\u02fe\3\2\2\2\u0097"+
		"\u0300\3\2\2\2\u0099\u0302\3\2\2\2\u009b\u0304\3\2\2\2\u009d\u0306\3\2"+
		"\2\2\u009f\u0308\3\2\2\2\u00a1\u030a\3\2\2\2\u00a3\u030c\3\2\2\2\u00a5"+
		"\u030e\3\2\2\2\u00a7\u0310\3\2\2\2\u00a9\u0312\3\2\2\2\u00ab\u0314\3\2"+
		"\2\2\u00ad\u0316\3\2\2\2\u00af\u0318\3\2\2\2\u00b1\u031a\3\2\2\2\u00b3"+
		"\u031c\3\2\2\2\u00b5\u031e\3\2\2\2\u00b7\u0320\3\2\2\2\u00b9\u0322\3\2"+
		"\2\2\u00bb\u0324\3\2\2\2\u00bd\u0326\3\2\2\2\u00bf\u0328\3\2\2\2\u00c1"+
		"\u032b\3\2\2\2\u00c3\u0331\3\2\2\2\u00c5\u00c6\5\u0097L\2\u00c6\u00c7"+
		"\5\u00b5[\2\u00c7\u00c8\5\u00a7T\2\u00c8\u00c9\5\u0091I\2\u00c9\u00ca"+
		"\5\u009dO\2\u00ca\u00cb\5\u00a9U\2\u00cb\u00cc\5\u00a7T\2\u00cc\u00e6"+
		"\3\2\2\2\u00cd\u00ce\5\u00b1Y\2\u00ce\u00cf\5\u00b5[\2\u00cf\u00d0\5\u008f"+
		"H\2\u00d0\u00d1\5\u00abV\2\u00d1\u00d2\5\u00afX\2\u00d2\u00d3\5\u00a9"+
		"U\2\u00d3\u00d4\5\u0091I\2\u00d4\u00d5\5\u0095K\2\u00d5\u00d6\5\u00b1"+
		"Y\2\u00d6\u00d7\5\u00a9U\2\u00d7\u00e6\3\2\2\2\u00d8\u00d9\5\u00b1Y\2"+
		"\u00d9\u00da\5\u00b5[\2\u00da\u00db\5\u008fH\2\u00db\u00dc\5\u008dG\2"+
		"\u00dc\u00dd\5\u00a3R\2\u00dd\u00de\5\u0099M\2\u00de\u00df\5\u00a9U\2"+
		"\u00df\u00e0\5\u00afX\2\u00e0\u00e1\5\u009dO\2\u00e1\u00e2\5\u00b3Z\2"+
		"\u00e2\u00e3\5\u00a5S\2\u00e3\u00e4\5\u00a9U\2\u00e4\u00e6\3\2\2\2\u00e5"+
		"\u00c5\3\2\2\2\u00e5\u00cd\3\2\2\2\u00e5\u00d8\3\2\2\2\u00e6\4\3\2\2\2"+
		"\u00e7\u00e8\5\u0097L\2\u00e8\u00e9\5\u009dO\2\u00e9\u00ea\5\u00a7T\2"+
		"\u00ea\u00eb\5\u0097L\2\u00eb\u00ec\5\u00b5[\2\u00ec\u00ed\5\u00a7T\2"+
		"\u00ed\u00ee\5\u0091I\2\u00ee\u00ef\5\u009dO\2\u00ef\u00f0\5\u00a9U\2"+
		"\u00f0\u00f1\5\u00a7T\2\u00f1\u0111\3\2\2\2\u00f2\u00f3\5\u0097L\2\u00f3"+
		"\u00f4\5\u009dO\2\u00f4\u00f5\5\u00a7T\2\u00f5\u00f6\5\u00b1Y\2\u00f6"+
		"\u00f7\5\u00b5[\2\u00f7\u00f8\5\u008fH\2\u00f8\u00f9\5\u00abV\2\u00f9"+
		"\u00fa\5\u00afX\2\u00fa\u00fb\5\u00a9U\2\u00fb\u00fc\5\u0091I\2\u00fc"+
		"\u00fd\5\u0095K\2\u00fd\u00fe\5\u00b1Y\2\u00fe\u00ff\5\u00a9U\2\u00ff"+
		"\u0111\3\2\2\2\u0100\u0101\5\u0097L\2\u0101\u0102\5\u009dO\2\u0102\u0103"+
		"\5\u00a7T\2\u0103\u0104\5\u00b1Y\2\u0104\u0105\5\u00b5[\2\u0105\u0106"+
		"\5\u008fH\2\u0106\u0107\5\u008dG\2\u0107\u0108\5\u00a3R\2\u0108\u0109"+
		"\5\u0099M\2\u0109\u010a\5\u00a9U\2\u010a\u010b\5\u00afX\2\u010b\u010c"+
		"\5\u009dO\2\u010c\u010d\5\u00b3Z\2\u010d\u010e\5\u00a5S\2\u010e\u010f"+
		"\5\u00a9U\2\u010f\u0111\3\2\2\2\u0110\u00e7\3\2\2\2\u0110\u00f2\3\2\2"+
		"\2\u0110\u0100\3\2\2\2\u0111\6\3\2\2\2\u0112\u0113\5\u00abV\2\u0113\u0114"+
		"\5\u00afX\2\u0114\u0115\5\u00a9U\2\u0115\u0116\5\u0091I\2\u0116\u0117"+
		"\5\u0095K\2\u0117\u0118\5\u00b1Y\2\u0118\u0119\5\u00a9U\2\u0119\u0125"+
		"\3\2\2\2\u011a\u011b\5\u008dG\2\u011b\u011c\5\u00a3R\2\u011c\u011d\5\u0099"+
		"M\2\u011d\u011e\5\u00a9U\2\u011e\u011f\5\u00afX\2\u011f\u0120\5\u009d"+
		"O\2\u0120\u0121\5\u00b3Z\2\u0121\u0122\5\u00a5S\2\u0122\u0123\5\u00a9"+
		"U\2\u0123\u0125\3\2\2\2\u0124\u0112\3\2\2\2\u0124\u011a\3\2\2\2\u0125"+
		"\b\3\2\2\2\u0126\u0127\5\u0097L\2\u0127\u0128\5\u009dO\2\u0128\u0129\5"+
		"\u00a7T\2\u0129\u012a\5\u00abV\2\u012a\u012b\5\u00afX\2\u012b\u012c\5"+
		"\u00a9U\2\u012c\u012d\5\u0091I\2\u012d\u012e\5\u0095K\2\u012e\u012f\5"+
		"\u00b1Y\2\u012f\u0130\5\u00a9U\2\u0130\u013f\3\2\2\2\u0131\u0132\5\u0097"+
		"L\2\u0132\u0133\5\u009dO\2\u0133\u0134\5\u00a7T\2\u0134\u0135\5\u008d"+
		"G\2\u0135\u0136\5\u00a3R\2\u0136\u0137\5\u0099M\2\u0137\u0138\5\u00a9"+
		"U\2\u0138\u0139\5\u00afX\2\u0139\u013a\5\u009dO\2\u013a\u013b\5\u00b3"+
		"Z\2\u013b\u013c\5\u00a5S\2\u013c\u013d\5\u00a9U\2\u013d\u013f\3\2\2\2"+
		"\u013e\u0126\3\2\2\2\u013e\u0131\3\2\2\2\u013f\n\3\2\2\2\u0140\u0141\5"+
		"\u0093J\2\u0141\u0142\5\u0095K\2\u0142\u0143\5\u0097L\2\u0143\u0144\5"+
		"\u009dO\2\u0144\u0145\5\u00a7T\2\u0145\u0146\5\u009dO\2\u0146\u0147\5"+
		"\u00afX\2\u0147\f\3\2\2\2\u0148\u0149\5\u0091I\2\u0149\u014a\5\u00a9U"+
		"\2\u014a\u014b\5\u00a5S\2\u014b\u014c\5\u00a9U\2\u014c\16\3\2\2\2\u014d"+
		"\u014e\5\u0093J\2\u014e\u014f\5\u009dO\2\u014f\u0150\5\u00a5S\2\u0150"+
		"\u0151\5\u0095K\2\u0151\u0152\5\u00a7T\2\u0152\u0153\5\u00b1Y\2\u0153"+
		"\u0154\5\u009dO\2\u0154\u0155\5\u00a9U\2\u0155\u0156\5\u00a7T\2\u0156"+
		"\20\3\2\2\2\u0157\u0158\5\u00a3R\2\u0158\u0159\5\u0095K\2\u0159\u015a"+
		"\5\u0095K\2\u015a\u015b\5\u00afX\2\u015b\22\3\2\2\2\u015c\u015d\5\u0095"+
		"K\2\u015d\u015e\5\u00b1Y\2\u015e\u015f\5\u0091I\2\u015f\u0160\5\u00af"+
		"X\2\u0160\u0161\5\u009dO\2\u0161\u0162\5\u008fH\2\u0162\u0163\5\u009d"+
		"O\2\u0163\u0164\5\u00afX\2\u0164\24\3\2\2\2\u0165\u0166\5\u00b1Y\2\u0166"+
		"\u0167\5\u009dO\2\u0167\26\3\2\2\2\u0168\u0169\5\u0095K\2\u0169\u016a"+
		"\5\u00a7T\2\u016a\u016b\5\u00b3Z\2\u016b\u016c\5\u00a9U\2\u016c\u016d"+
		"\5\u00a7T\2\u016d\u016e\5\u0091I\2\u016e\u016f\5\u0095K\2\u016f\u0170"+
		"\5\u00b1Y\2\u0170\30\3\2\2\2\u0171\u0172\5\u00b1Y\2\u0172\u0173\5\u009d"+
		"O\2\u0173\u0174\5\u00a7T\2\u0174\u0175\5\u00a9U\2\u0175\32\3\2\2\2\u0176"+
		"\u0177\5\u0097L\2\u0177\u0178\5\u009dO\2\u0178\u0179\5\u00a7T\2\u0179"+
		"\u017a\5\u00b1Y\2\u017a\u017b\5\u009dO\2\u017b\34\3\2\2\2\u017c\u017d"+
		"\5\u00b1Y\2\u017d\u017e\5\u0095K\2\u017e\u017f\5\u0099M\2\u017f\u0180"+
		"\5\u00b5[\2\u0180\u0181\5\u00a7T\2\u0181\36\3\2\2\2\u0182\u0183\5\u009b"+
		"N\2\u0183\u0184\5\u008dG\2\u0184\u0185\5\u0091I\2\u0185\u0186\5\u0095"+
		"K\2\u0186\u0187\5\u00afX\2\u0187 \3\2\2\2\u0188\u0189\5\u0091I\2\u0189"+
		"\u018a\5\u008dG\2\u018a\u018b\5\u00b1Y\2\u018b\u018c\5\u00a9U\2\u018c"+
		"\"\3\2\2\2\u018d\u018e\5\u0093J\2\u018e\u018f\5\u0095K\2\u018f$\3\2\2"+
		"\2\u0190\u0191\5\u00a9U\2\u0191\u0192\5\u00b3Z\2\u0192\u0193\5\u00afX"+
		"\2\u0193\u0194\5\u00a9U\2\u0194&\3\2\2\2\u0195\u0196\5\u00a5S\2\u0196"+
		"\u0197\5\u00a9U\2\u0197\u0198\5\u0093J\2\u0198\u0199\5\u00a9U\2\u0199"+
		"(\3\2\2\2\u019a\u019b\5\u0097L\2\u019b\u019c\5\u009dO\2\u019c\u019d\5"+
		"\u00a7T\2\u019d\u019e\5\u00b1Y\2\u019e\u019f\5\u0095K\2\u019f\u01a0\5"+
		"\u0099M\2\u01a0\u01a1\5\u00b5[\2\u01a1\u01a2\5\u00a7T\2\u01a2*\3\2\2\2"+
		"\u01a3\u01a4\5\u00a5S\2\u01a4\u01a5\5\u009dO\2\u01a5\u01a6\5\u0095K\2"+
		"\u01a6\u01a7\5\u00a7T\2\u01a7\u01a8\5\u00b3Z\2\u01a8\u01a9\5\u00afX\2"+
		"\u01a9\u01aa\5\u008dG\2\u01aa\u01ab\5\u00b1Y\2\u01ab,\3\2\2\2\u01ac\u01ad"+
		"\5\u0097L\2\u01ad\u01ae\5\u009dO\2\u01ae\u01af\5\u00a7T\2\u01af\u01b0"+
		"\5\u00a5S\2\u01b0\u01b1\5\u009dO\2\u01b1\u01b2\5\u0095K\2\u01b2\u01b3"+
		"\5\u00a7T\2\u01b3\u01b4\5\u00b3Z\2\u01b4\u01b5\5\u00afX\2\u01b5\u01b6"+
		"\5\u008dG\2\u01b6\u01b7\5\u00b1Y\2\u01b7.\3\2\2\2\u01b8\u01b9\5\u00af"+
		"X\2\u01b9\u01ba\5\u0095K\2\u01ba\u01bb\5\u00abV\2\u01bb\u01bc\5\u0095"+
		"K\2\u01bc\u01bd\5\u00b3Z\2\u01bd\u01be\5\u009dO\2\u01be\u01bf\5\u00af"+
		"X\2\u01bf\60\3\2\2\2\u01c0\u01c1\5\u009bN\2\u01c1\u01c2\5\u008dG\2\u01c2"+
		"\u01c3\5\u00b1Y\2\u01c3\u01c4\5\u00b3Z\2\u01c4\u01c5\5\u008dG\2\u01c5"+
		"\62\3\2\2\2\u01c6\u01c7\5\u00adW\2\u01c7\u01c8\5\u00b5[\2\u01c8\u01c9"+
		"\5\u0095K\2\u01c9\64\3\2\2\2\u01ca\u01cb\5\u00abV\2\u01cb\u01cc\5\u008d"+
		"G\2\u01cc\u01cd\5\u00afX\2\u01cd\u01ce\5\u008dG\2\u01ce\66\3\2\2\2\u01cf"+
		"\u01d0\5\u0091I\2\u01d0\u01d1\5\u00a9U\2\u01d1\u01d2\5\u00a7T\2\u01d2"+
		"8\3\2\2\2\u01d3\u01d4\5\u00abV\2\u01d4\u01d5\5\u008dG\2\u01d5\u01d6\5"+
		"\u00b1Y\2\u01d6\u01d7\5\u00a9U\2\u01d7:\3\2\2\2\u01d8\u01d9\5\u0097L\2"+
		"\u01d9\u01da\5\u009dO\2\u01da\u01db\5\u00a7T\2\u01db\u01dc\5\u00abV\2"+
		"\u01dc\u01dd\5\u008dG\2\u01dd\u01de\5\u00afX\2\u01de\u01df\5\u008dG\2"+
		"\u01df<\3\2\2\2\u01e0\u01e1\5\u008fH\2\u01e1\u01e2\5\u00a9U\2\u01e2\u01e3"+
		"\5\u00afX\2\u01e3\u01e4\5\u00afX\2\u01e4\u01e5\5\u008dG\2\u01e5\u01e6"+
		"\5\u00afX\2\u01e6>\3\2\2\2\u01e7\u01e8\5\u00a3R\2\u01e8\u01e9\5\u009d"+
		"O\2\u01e9\u01ea\5\u00a5S\2\u01ea\u01eb\5\u00abV\2\u01eb\u01ec\5\u009d"+
		"O\2\u01ec\u01ed\5\u008dG\2\u01ed\u01ee\5\u00afX\2\u01ee@\3\2\2\2\u01ef"+
		"\u01f0\5\u00abV\2\u01f0\u01f1\5\u008dG\2\u01f1\u01f2\5\u00a7T\2\u01f2"+
		"\u01f3\5\u00b3Z\2\u01f3\u01f4\5\u008dG\2\u01f4\u01f5\5\u00a3R\2\u01f5"+
		"\u01f6\5\u00a3R\2\u01f6\u01f7\5\u008dG\2\u01f7B\3\2\2\2\u01f8\u01f9\5"+
		"\u0095K\2\u01f9\u01fa\5\u00b1Y\2\u01fa\u01fb\5\u00abV\2\u01fb\u01fc\5"+
		"\u0095K\2\u01fc\u01fd\5\u00afX\2\u01fd\u01fe\5\u008dG\2\u01fe\u01ff\5"+
		"\u00afX\2\u01ffD\3\2\2\2\u0200\u0201\5\u00b1Y\2\u0201\u0202\5\u0095K\2"+
		"\u0202\u0203\5\u0099M\2\u0203\u0204\5\u00b5[\2\u0204\u0205\5\u00a7T\2"+
		"\u0205\u0206\5\u0093J\2\u0206\u0207\5\u00a9U\2\u0207\u0208\5\u00b1Y\2"+
		"\u0208\u0212\3\2\2\2\u0209\u020a\5\u00b1Y\2\u020a\u020b\5\u0095K\2\u020b"+
		"\u020c\5\u0099M\2\u020c\u020d\5\u00b5[\2\u020d\u020e\5\u00a7T\2\u020e"+
		"\u020f\5\u0093J\2\u020f\u0210\5\u00a9U\2\u0210\u0212\3\2\2\2\u0211\u0200"+
		"\3\2\2\2\u0211\u0209\3\2\2\2\u0212F\3\2\2\2\u0213\u0214\5\u00a5S\2\u0214"+
		"\u0215\5\u009dO\2\u0215\u0216\5\u00a3R\2\u0216\u0217\5\u009dO\2\u0217"+
		"\u0218\5\u00b1Y\2\u0218\u0219\5\u0095K\2\u0219\u021a\5\u0099M\2\u021a"+
		"\u021b\5\u00b5[\2\u021b\u021c\5\u00a7T\2\u021c\u021d\5\u0093J\2\u021d"+
		"\u021e\5\u00a9U\2\u021e\u021f\5\u00b1Y\2\u021fH\3\2\2\2\u0220\u0221\5"+
		"\u00b3Z\2\u0221\u0222\5\u0095K\2\u0222\u0223\5\u0091I\2\u0223\u0224\5"+
		"\u00a3R\2\u0224\u0225\5\u008dG\2\u0225J\3\2\2\2\u0226\u022a\5M\'\2\u0227"+
		"\u022a\5O(\2\u0228\u022a\5Q)\2\u0229\u0226\3\2\2\2\u0229\u0227\3\2\2\2"+
		"\u0229\u0228\3\2\2\2\u022aL\3\2\2\2\u022b\u022c\5\u0095K\2\u022c\u022d"+
		"\5\u00a7T\2\u022d\u022e\5\u00b3Z\2\u022e\u022f\5\u0095K\2\u022f\u0230"+
		"\5\u00afX\2\u0230\u0231\5\u00a9U\2\u0231\u025f\3\2\2\2\u0232\u0233\5\u0095"+
		"K\2\u0233\u0234\5\u00a7T\2\u0234\u0235\5\u00b3Z\2\u0235\u0236\5\u0095"+
		"K\2\u0236\u0237\5\u00afX\2\u0237\u0238\5\u00a9U\2\u0238\u0239\5\u00b1"+
		"Y\2\u0239\u025f\3\2\2\2\u023a\u023b\5\u00a7T\2\u023b\u023c\5\u00b5[\2"+
		"\u023c\u023d\5\u00a5S\2\u023d\u023e\5\u0095K\2\u023e\u023f\5\u00afX\2"+
		"\u023f\u0240\5\u00a9U\2\u0240\u025f\3\2\2\2\u0241\u0242\5\u00a7T\2\u0242"+
		"\u0243\5\u00b5[\2\u0243\u0244\5\u00a5S\2\u0244\u0245\5\u0095K\2\u0245"+
		"\u0246\5\u00afX\2\u0246\u0247\5\u00a9U\2\u0247\u0248\5\u00b1Y\2\u0248"+
		"\u025f\3\2\2\2\u0249\u024a\5\u00a7T\2\u024a\u024b\5\u00b5[\2\u024b\u024c"+
		"\5\u00a5S\2\u024c\u024d\5\u0095K\2\u024d\u024e\5\u00afX\2\u024e\u024f"+
		"\5\u009dO\2\u024f\u0250\5\u0091I\2\u0250\u0251\5\u00a9U\2\u0251\u025f"+
		"\3\2\2\2\u0252\u0253\5\u00afX\2\u0253\u0254\5\u0095K\2\u0254\u0255\5\u008d"+
		"G\2\u0255\u0256\5\u00a3R\2\u0256\u025f\3\2\2\2\u0257\u0258\5\u00afX\2"+
		"\u0258\u0259\5\u0095K\2\u0259\u025a\5\u008dG\2\u025a\u025b\5\u00a3R\2"+
		"\u025b\u025c\5\u0095K\2\u025c\u025d\5\u00b1Y\2\u025d\u025f\3\2\2\2\u025e"+
		"\u022b\3\2\2\2\u025e\u0232\3\2\2\2\u025e\u023a\3\2\2\2\u025e\u0241\3\2"+
		"\2\2\u025e\u0249\3\2\2\2\u025e\u0252\3\2\2\2\u025e\u0257\3\2\2\2\u025f"+
		"N\3\2\2\2\u0260\u0261\5\u00a3R\2\u0261\u0262\5\u00a9U\2\u0262\u0263\5"+
		"\u0099M\2\u0263\u0264\5\u009dO\2\u0264\u0265\5\u0091I\2\u0265\u0266\5"+
		"\u00a9U\2\u0266P\3\2\2\2\u0267\u0268\5\u0091I\2\u0268\u0269\5\u008dG\2"+
		"\u0269\u026a\5\u00afX\2\u026a\u026b\5\u008dG\2\u026b\u026c\5\u0091I\2"+
		"\u026c\u026d\5\u00b3Z\2\u026d\u026e\5\u0095K\2\u026e\u026f\5\u00afX\2"+
		"\u026f\u0286\3\2\2\2\u0270\u0271\5\u00b3Z\2\u0271\u0272\5\u0095K\2\u0272"+
		"\u0273\5\u00bb^\2\u0273\u0274\5\u00b3Z\2\u0274\u0275\5\u00a9U\2\u0275"+
		"\u0286\3\2\2\2\u0276\u0277\5\u0091I\2\u0277\u0278\5\u008dG\2\u0278\u0279"+
		"\5\u0093J\2\u0279\u027a\5\u0095K\2\u027a\u027b\5\u00a7T\2\u027b\u027c"+
		"\5\u008dG\2\u027c\u0286\3\2\2\2\u027d\u027e\5\u0091I\2\u027e\u027f\5\u008d"+
		"G\2\u027f\u0280\5\u0093J\2\u0280\u0281\5\u0095K\2\u0281\u0282\5\u00a7"+
		"T\2\u0282\u0283\5\u008dG\2\u0283\u0284\5\u00b1Y\2\u0284\u0286\3\2\2\2"+
		"\u0285\u0267\3\2\2\2\u0285\u0270\3\2\2\2\u0285\u0276\3\2\2\2\u0285\u027d"+
		"\3\2\2\2\u0286R\3\2\2\2\u0287\u0289\t\2\2\2\u0288\u0287\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2"+
		"\2\2\u028c\u028e\t\3\2\2\u028d\u028f\t\2\2\2\u028e\u028d\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291T\3\2\2\2"+
		"\u0292\u0294\t\2\2\2\u0293\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0293"+
		"\3\2\2\2\u0295\u0296\3\2\2\2\u0296V\3\2\2\2\u0297\u029b\t\4\2\2\u0298"+
		"\u029a\13\2\2\2\u0299\u0298\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u029c\3"+
		"\2\2\2\u029b\u0299\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029b\3\2\2\2\u029e"+
		"\u029f\t\4\2\2\u029fX\3\2\2\2\u02a0\u02a1\5\u00b7\\\2\u02a1\u02a2\5\u0095"+
		"K\2\u02a2\u02a3\5\u00afX\2\u02a3\u02a4\5\u0093J\2\u02a4\u02a5\5\u008d"+
		"G\2\u02a5\u02a6\5\u0093J\2\u02a6\u02a7\5\u0095K\2\u02a7\u02a8\5\u00af"+
		"X\2\u02a8\u02a9\5\u00a9U\2\u02a9Z\3\2\2\2\u02aa\u02ab\5\u0097L\2\u02ab"+
		"\u02ac\5\u008dG\2\u02ac\u02ad\5\u00a3R\2\u02ad\u02ae\5\u00b1Y\2\u02ae"+
		"\u02af\5\u00a9U\2\u02af\\\3\2\2\2\u02b0\u02b1\7=\2\2\u02b1^\3\2\2\2\u02b2"+
		"\u02b3\7>\2\2\u02b3\u02b4\7/\2\2\u02b4`\3\2\2\2\u02b5\u02b6\7*\2\2\u02b6"+
		"b\3\2\2\2\u02b7\u02b8\7+\2\2\u02b8d\3\2\2\2\u02b9\u02ba\7]\2\2\u02baf"+
		"\3\2\2\2\u02bb\u02bc\7_\2\2\u02bch\3\2\2\2\u02bd\u02be\7.\2\2\u02bej\3"+
		"\2\2\2\u02bf\u02c0\7@\2\2\u02c0\u02c1\7?\2\2\u02c1l\3\2\2\2\u02c2\u02c3"+
		"\7>\2\2\u02c3\u02c4\7?\2\2\u02c4n\3\2\2\2\u02c5\u02c6\7>\2\2\u02c6\u02c7"+
		"\7@\2\2\u02c7p\3\2\2\2\u02c8\u02c9\7@\2\2\u02c9r\3\2\2\2\u02ca\u02cb\7"+
		">\2\2\u02cbt\3\2\2\2\u02cc\u02cd\7?\2\2\u02cdv\3\2\2\2\u02ce\u02d1\5\u00bd"+
		"_\2\u02cf\u02d1\7(\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1x"+
		"\3\2\2\2\u02d2\u02d5\5\u00a9U\2\u02d3\u02d5\7~\2\2\u02d4\u02d2\3\2\2\2"+
		"\u02d4\u02d3\3\2\2\2\u02d5z\3\2\2\2\u02d6\u02d7\5\u00a7T\2\u02d7\u02d8"+
		"\5\u00a9U\2\u02d8\u02db\3\2\2\2\u02d9\u02db\7\u0080\2\2\u02da\u02d6\3"+
		"\2\2\2\u02da\u02d9\3\2\2\2\u02db|\3\2\2\2\u02dc\u02dd\7-\2\2\u02dd~\3"+
		"\2\2\2\u02de\u02df\7/\2\2\u02df\u0080\3\2\2\2\u02e0\u02e1\7,\2\2\u02e1"+
		"\u0082\3\2\2\2\u02e2\u02e3\7\61\2\2\u02e3\u0084\3\2\2\2\u02e4\u02e5\7"+
		"`\2\2\u02e5\u0086\3\2\2\2\u02e6\u02ec\7\'\2\2\u02e7\u02e8\5\u00a5S\2\u02e8"+
		"\u02e9\5\u00a9U\2\u02e9\u02ea\5\u0093J\2\u02ea\u02ec\3\2\2\2\u02eb\u02e6"+
		"\3\2\2\2\u02eb\u02e7\3\2\2\2\u02ec\u0088\3\2\2\2\u02ed\u02ee\7<\2\2\u02ee"+
		"\u008a\3\2\2\2\u02ef\u02f3\t\5\2\2\u02f0\u02f2\t\6\2\2\u02f1\u02f0\3\2"+
		"\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u008c\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f7\t\7\2\2\u02f7\u008e\3\2"+
		"\2\2\u02f8\u02f9\t\b\2\2\u02f9\u0090\3\2\2\2\u02fa\u02fb\t\t\2\2\u02fb"+
		"\u0092\3\2\2\2\u02fc\u02fd\t\n\2\2\u02fd\u0094\3\2\2\2\u02fe\u02ff\t\13"+
		"\2\2\u02ff\u0096\3\2\2\2\u0300\u0301\t\f\2\2\u0301\u0098\3\2\2\2\u0302"+
		"\u0303\t\r\2\2\u0303\u009a\3\2\2\2\u0304\u0305\t\16\2\2\u0305\u009c\3"+
		"\2\2\2\u0306\u0307\t\17\2\2\u0307\u009e\3\2\2\2\u0308\u0309\t\20\2\2\u0309"+
		"\u00a0\3\2\2\2\u030a\u030b\t\21\2\2\u030b\u00a2\3\2\2\2\u030c\u030d\t"+
		"\22\2\2\u030d\u00a4\3\2\2\2\u030e\u030f\t\23\2\2\u030f\u00a6\3\2\2\2\u0310"+
		"\u0311\t\24\2\2\u0311\u00a8\3\2\2\2\u0312\u0313\t\25\2\2\u0313\u00aa\3"+
		"\2\2\2\u0314\u0315\t\26\2\2\u0315\u00ac\3\2\2\2\u0316\u0317\t\27\2\2\u0317"+
		"\u00ae\3\2\2\2\u0318\u0319\t\30\2\2\u0319\u00b0\3\2\2\2\u031a\u031b\t"+
		"\31\2\2\u031b\u00b2\3\2\2\2\u031c\u031d\t\32\2\2\u031d\u00b4\3\2\2\2\u031e"+
		"\u031f\t\33\2\2\u031f\u00b6\3\2\2\2\u0320\u0321\t\34\2\2\u0321\u00b8\3"+
		"\2\2\2\u0322\u0323\t\35\2\2\u0323\u00ba\3\2\2\2\u0324\u0325\t\36\2\2\u0325"+
		"\u00bc\3\2\2\2\u0326\u0327\t\37\2\2\u0327\u00be\3\2\2\2\u0328\u0329\t"+
		" \2\2\u0329\u00c0\3\2\2\2\u032a\u032c\t!\2\2\u032b\u032a\3\2\2\2\u032c"+
		"\u032d\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2"+
		"\2\2\u032f\u0330\ba\2\2\u0330\u00c2\3\2\2\2\u0331\u0332\7\61\2\2\u0332"+
		"\u0333\7\61\2\2\u0333\u0337\3\2\2\2\u0334\u0336\n\"\2\2\u0335\u0334\3"+
		"\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u033a\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u033b\bb\2\2\u033b\u00c4\3\2"+
		"\2\2\26\2\u00e5\u0110\u0124\u013e\u0211\u0229\u025e\u0285\u028a\u0290"+
		"\u0295\u029b\u02d0\u02d4\u02da\u02eb\u02f3\u032d\u0337\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}