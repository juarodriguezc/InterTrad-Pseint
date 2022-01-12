// Generated from C:/Users/juans/Desktop/Lenguajes de programacion/InterTrad/grammar\PseintGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseintGrammarParser extends Parser {
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
	public static final int
		RULE_code = 0, RULE_fun_salg_spro = 1, RULE_return_funcion = 2, RULE_f_params = 3, 
		RULE_f_args = 4, RULE_main = 5, RULE_commands = 6, RULE_command = 7, RULE_definicion = 8, 
		RULE_def_vars = 9, RULE_dimension = 10, RULE_dim_vars = 11, RULE_dim_sizes = 12, 
		RULE_num_expr = 13, RULE_oper_num = 14, RULE_asignacion = 15, RULE_expr = 16, 
		RULE_oper_dos = 17, RULE_oper_uni = 18, RULE_array_pos = 19, RULE_func_par = 20, 
		RULE_leer = 21, RULE_escribir = 22, RULE_si = 23, RULE_siparte = 24, RULE_sino = 25, 
		RULE_segun = 26, RULE_cases = 27, RULE_defcase = 28, RULE_mientras = 29, 
		RULE_repetir = 30, RULE_repcomm = 31, RULE_repcond = 32, RULE_para = 33, 
		RULE_parapaso = 34, RULE_borrar = 35, RULE_esperar = 36, RULE_tiempo = 37, 
		RULE_tecla = 38, RULE_call = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "fun_salg_spro", "return_funcion", "f_params", "f_args", "main", 
			"commands", "command", "definicion", "def_vars", "dimension", "dim_vars", 
			"dim_sizes", "num_expr", "oper_num", "asignacion", "expr", "oper_dos", 
			"oper_uni", "array_pos", "func_par", "leer", "escribir", "si", "siparte", 
			"sino", "segun", "cases", "defcase", "mientras", "repetir", "repcomm", 
			"repcond", "para", "parapaso", "borrar", "esperar", "tiempo", "tecla", 
			"call"
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

	@Override
	public String getGrammarFileName() { return "PseintGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseintGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PseintGrammarParser.EOF, 0); }
		public List<Fun_salg_sproContext> fun_salg_spro() {
			return getRuleContexts(Fun_salg_sproContext.class);
		}
		public Fun_salg_sproContext fun_salg_spro(int i) {
			return getRuleContext(Fun_salg_sproContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==F_SALG_SP) {
				{
				{
				setState(80);
				fun_salg_spro();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			main();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==F_SALG_SP) {
				{
				{
				setState(87);
				fun_salg_spro();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(EOF);
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

	public static class Fun_salg_sproContext extends ParserRuleContext {
		public TerminalNode F_SALG_SP() { return getToken(PseintGrammarParser.F_SALG_SP, 0); }
		public TerminalNode ID() { return getToken(PseintGrammarParser.ID, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode FIN_F_SALG_SP() { return getToken(PseintGrammarParser.FIN_F_SALG_SP, 0); }
		public Return_funcionContext return_funcion() {
			return getRuleContext(Return_funcionContext.class,0);
		}
		public F_paramsContext f_params() {
			return getRuleContext(F_paramsContext.class,0);
		}
		public Fun_salg_sproContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_salg_spro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterFun_salg_spro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitFun_salg_spro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitFun_salg_spro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_salg_sproContext fun_salg_spro() throws RecognitionException {
		Fun_salg_sproContext _localctx = new Fun_salg_sproContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fun_salg_spro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(F_SALG_SP);
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(96);
				return_funcion();
				}
				break;
			}
			setState(99);
			match(ID);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAR_IZQ) {
				{
				setState(100);
				f_params();
				}
			}

			setState(103);
			commands();
			setState(104);
			match(FIN_F_SALG_SP);
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

	public static class Return_funcionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseintGrammarParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(PseintGrammarParser.ASIG, 0); }
		public Return_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterReturn_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitReturn_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitReturn_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_funcionContext return_funcion() throws RecognitionException {
		Return_funcionContext _localctx = new Return_funcionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_return_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			match(ASIG);
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

	public static class F_paramsContext extends ParserRuleContext {
		public TerminalNode PAR_IZQ() { return getToken(PseintGrammarParser.PAR_IZQ, 0); }
		public F_argsContext f_args() {
			return getRuleContext(F_argsContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(PseintGrammarParser.PAR_DER, 0); }
		public F_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterF_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitF_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitF_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final F_paramsContext f_params() throws RecognitionException {
		F_paramsContext _localctx = new F_paramsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_f_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(PAR_IZQ);
			setState(110);
			f_args();
			setState(111);
			match(PAR_DER);
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

	public static class F_argsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PseintGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseintGrammarParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(PseintGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PseintGrammarParser.COMA, i);
		}
		public F_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterF_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitF_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitF_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final F_argsContext f_args() throws RecognitionException {
		F_argsContext _localctx = new F_argsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_f_args);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(ID);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(114);
					match(COMA);
					setState(115);
					match(ID);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PAR_DER:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode PROC_ALG() { return getToken(PseintGrammarParser.PROC_ALG, 0); }
		public TerminalNode ID() { return getToken(PseintGrammarParser.ID, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode FIN_PROC_ALG() { return getToken(PseintGrammarParser.FIN_PROC_ALG, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(PROC_ALG);
			setState(125);
			match(ID);
			setState(126);
			commands();
			setState(127);
			match(FIN_PROC_ALG);
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

	public static class CommandsContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_commands);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					command();
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class CommandContext extends ParserRuleContext {
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public EscribirContext escribir() {
			return getRuleContext(EscribirContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public SegunContext segun() {
			return getRuleContext(SegunContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public BorrarContext borrar() {
			return getRuleContext(BorrarContext.class,0);
		}
		public EsperarContext esperar() {
			return getRuleContext(EsperarContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_command);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				definicion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				dimension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				asignacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				leer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				escribir();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				si();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				segun();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				mientras();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				repetir();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(144);
				para();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(145);
				borrar();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(146);
				esperar();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(147);
				call();
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

	public static class DefinicionContext extends ParserRuleContext {
		public TerminalNode DEFINIR() { return getToken(PseintGrammarParser.DEFINIR, 0); }
		public Def_varsContext def_vars() {
			return getRuleContext(Def_varsContext.class,0);
		}
		public TerminalNode COMO() { return getToken(PseintGrammarParser.COMO, 0); }
		public TerminalNode T_DATO() { return getToken(PseintGrammarParser.T_DATO, 0); }
		public TerminalNode PYC() { return getToken(PseintGrammarParser.PYC, 0); }
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterDefinicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitDefinicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitDefinicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_definicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(DEFINIR);
			setState(151);
			def_vars();
			setState(152);
			match(COMO);
			setState(153);
			match(T_DATO);
			setState(154);
			match(PYC);
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

	public static class Def_varsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PseintGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseintGrammarParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(PseintGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PseintGrammarParser.COMA, i);
		}
		public Def_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterDef_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitDef_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitDef_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_varsContext def_vars() throws RecognitionException {
		Def_varsContext _localctx = new Def_varsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_def_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(157);
				match(COMA);
				setState(158);
				match(ID);
				}
				}
				setState(163);
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

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(PseintGrammarParser.DIMENSION, 0); }
		public Dim_varsContext dim_vars() {
			return getRuleContext(Dim_varsContext.class,0);
		}
		public TerminalNode PYC() { return getToken(PseintGrammarParser.PYC, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(DIMENSION);
			setState(165);
			dim_vars();
			setState(166);
			match(PYC);
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

	public static class Dim_varsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PseintGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseintGrammarParser.ID, i);
		}
		public List<TerminalNode> COR_IZQ() { return getTokens(PseintGrammarParser.COR_IZQ); }
		public TerminalNode COR_IZQ(int i) {
			return getToken(PseintGrammarParser.COR_IZQ, i);
		}
		public List<Dim_sizesContext> dim_sizes() {
			return getRuleContexts(Dim_sizesContext.class);
		}
		public Dim_sizesContext dim_sizes(int i) {
			return getRuleContext(Dim_sizesContext.class,i);
		}
		public List<TerminalNode> COR_DER() { return getTokens(PseintGrammarParser.COR_DER); }
		public TerminalNode COR_DER(int i) {
			return getToken(PseintGrammarParser.COR_DER, i);
		}
		public List<TerminalNode> COMA() { return getTokens(PseintGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PseintGrammarParser.COMA, i);
		}
		public Dim_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterDim_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitDim_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitDim_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dim_varsContext dim_vars() throws RecognitionException {
		Dim_varsContext _localctx = new Dim_varsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dim_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(169);
			match(COR_IZQ);
			setState(170);
			dim_sizes();
			setState(171);
			match(COR_DER);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(172);
				match(COMA);
				setState(173);
				match(ID);
				setState(174);
				match(COR_IZQ);
				setState(175);
				dim_sizes();
				setState(176);
				match(COR_DER);
				}
				}
				setState(182);
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

	public static class Dim_sizesContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(PseintGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PseintGrammarParser.COMA, i);
		}
		public Dim_sizesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_sizes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterDim_sizes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitDim_sizes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitDim_sizes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dim_sizesContext dim_sizes() throws RecognitionException {
		Dim_sizesContext _localctx = new Dim_sizesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dim_sizes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			expr(0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(184);
				match(COMA);
				setState(185);
				expr(0);
				}
				}
				setState(190);
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

	public static class Num_exprContext extends ParserRuleContext {
		public TerminalNode PAR_IZQ() { return getToken(PseintGrammarParser.PAR_IZQ, 0); }
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
		}
		public TerminalNode PAR_DER() { return getToken(PseintGrammarParser.PAR_DER, 0); }
		public TerminalNode MENOS() { return getToken(PseintGrammarParser.MENOS, 0); }
		public TerminalNode TD_REAL() { return getToken(PseintGrammarParser.TD_REAL, 0); }
		public TerminalNode TD_ENTERO() { return getToken(PseintGrammarParser.TD_ENTERO, 0); }
		public TerminalNode ID() { return getToken(PseintGrammarParser.ID, 0); }
		public Oper_numContext oper_num() {
			return getRuleContext(Oper_numContext.class,0);
		}
		public Num_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterNum_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitNum_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitNum_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_exprContext num_expr() throws RecognitionException {
		return num_expr(0);
	}

	private Num_exprContext num_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Num_exprContext _localctx = new Num_exprContext(_ctx, _parentState);
		Num_exprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_num_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_IZQ:
				{
				setState(192);
				match(PAR_IZQ);
				setState(193);
				num_expr(0);
				setState(194);
				match(PAR_DER);
				}
				break;
			case MENOS:
				{
				setState(196);
				match(MENOS);
				setState(197);
				num_expr(4);
				}
				break;
			case TD_REAL:
				{
				setState(198);
				match(TD_REAL);
				}
				break;
			case TD_ENTERO:
				{
				setState(199);
				match(TD_ENTERO);
				}
				break;
			case ID:
				{
				setState(200);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Num_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
					setState(203);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(204);
					oper_num();
					setState(205);
					num_expr(7);
					}
					} 
				}
				setState(211);
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

	public static class Oper_numContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(PseintGrammarParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(PseintGrammarParser.MENOS, 0); }
		public TerminalNode MUL() { return getToken(PseintGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PseintGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PseintGrammarParser.MOD, 0); }
		public TerminalNode POT() { return getToken(PseintGrammarParser.POT, 0); }
		public Oper_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterOper_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitOper_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitOper_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_numContext oper_num() throws RecognitionException {
		Oper_numContext _localctx = new Oper_numContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_oper_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (MAS - 62)) | (1L << (MENOS - 62)) | (1L << (MUL - 62)) | (1L << (DIV - 62)) | (1L << (POT - 62)) | (1L << (MOD - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseintGrammarParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(PseintGrammarParser.ASIG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PYC() { return getToken(PseintGrammarParser.PYC, 0); }
		public TerminalNode COR_IZQ() { return getToken(PseintGrammarParser.COR_IZQ, 0); }
		public Array_posContext array_pos() {
			return getRuleContext(Array_posContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(PseintGrammarParser.COR_DER, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ID);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COR_IZQ) {
				{
				setState(215);
				match(COR_IZQ);
				setState(216);
				array_pos();
				setState(217);
				match(COR_DER);
				}
			}

			setState(221);
			match(ASIG);
			setState(222);
			expr(0);
			setState(223);
			match(PYC);
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

	public static class ExprContext extends ParserRuleContext {
		public Oper_uniContext oper_uni() {
			return getRuleContext(Oper_uniContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PAR_IZQ() { return getToken(PseintGrammarParser.PAR_IZQ, 0); }
		public TerminalNode PAR_DER() { return getToken(PseintGrammarParser.PAR_DER, 0); }
		public TerminalNode ID() { return getToken(PseintGrammarParser.ID, 0); }
		public Func_parContext func_par() {
			return getRuleContext(Func_parContext.class,0);
		}
		public TerminalNode COR_IZQ() { return getToken(PseintGrammarParser.COR_IZQ, 0); }
		public Array_posContext array_pos() {
			return getRuleContext(Array_posContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(PseintGrammarParser.COR_DER, 0); }
		public TerminalNode TD_REAL() { return getToken(PseintGrammarParser.TD_REAL, 0); }
		public TerminalNode TD_ENTERO() { return getToken(PseintGrammarParser.TD_ENTERO, 0); }
		public TerminalNode TD_CADENA() { return getToken(PseintGrammarParser.TD_CADENA, 0); }
		public TerminalNode VERDADERO() { return getToken(PseintGrammarParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(PseintGrammarParser.FALSO, 0); }
		public Oper_dosContext oper_dos() {
			return getRuleContext(Oper_dosContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(226);
				oper_uni();
				setState(227);
				expr(9);
				}
				break;
			case 2:
				{
				setState(229);
				match(PAR_IZQ);
				setState(230);
				expr(0);
				setState(231);
				match(PAR_DER);
				}
				break;
			case 3:
				{
				setState(233);
				match(ID);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(234);
					match(PAR_IZQ);
					setState(235);
					func_par();
					setState(236);
					match(PAR_DER);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(240);
				match(ID);
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(241);
					match(COR_IZQ);
					setState(242);
					array_pos();
					setState(243);
					match(COR_DER);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(247);
				match(TD_REAL);
				}
				break;
			case 6:
				{
				setState(248);
				match(TD_ENTERO);
				}
				break;
			case 7:
				{
				setState(249);
				match(TD_CADENA);
				}
				break;
			case 8:
				{
				setState(250);
				match(VERDADERO);
				}
				break;
			case 9:
				{
				setState(251);
				match(FALSO);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(254);
					if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
					setState(255);
					oper_dos();
					setState(256);
					expr(11);
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Oper_dosContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(PseintGrammarParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(PseintGrammarParser.MENOS, 0); }
		public TerminalNode MUL() { return getToken(PseintGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PseintGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PseintGrammarParser.MOD, 0); }
		public TerminalNode POT() { return getToken(PseintGrammarParser.POT, 0); }
		public TerminalNode OP_Y() { return getToken(PseintGrammarParser.OP_Y, 0); }
		public TerminalNode OP_OR() { return getToken(PseintGrammarParser.OP_OR, 0); }
		public TerminalNode GEQ() { return getToken(PseintGrammarParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(PseintGrammarParser.LEQ, 0); }
		public TerminalNode DIFT() { return getToken(PseintGrammarParser.DIFT, 0); }
		public TerminalNode GRE() { return getToken(PseintGrammarParser.GRE, 0); }
		public TerminalNode LOW() { return getToken(PseintGrammarParser.LOW, 0); }
		public TerminalNode EQU() { return getToken(PseintGrammarParser.EQU, 0); }
		public Oper_dosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_dos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterOper_dos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitOper_dos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitOper_dos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_dosContext oper_dos() throws RecognitionException {
		Oper_dosContext _localctx = new Oper_dosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_oper_dos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (GEQ - 53)) | (1L << (LEQ - 53)) | (1L << (DIFT - 53)) | (1L << (GRE - 53)) | (1L << (LOW - 53)) | (1L << (EQU - 53)) | (1L << (OP_Y - 53)) | (1L << (OP_OR - 53)) | (1L << (MAS - 53)) | (1L << (MENOS - 53)) | (1L << (MUL - 53)) | (1L << (DIV - 53)) | (1L << (POT - 53)) | (1L << (MOD - 53)))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public static class Oper_uniContext extends ParserRuleContext {
		public TerminalNode MENOS() { return getToken(PseintGrammarParser.MENOS, 0); }
		public TerminalNode OP_NEG() { return getToken(PseintGrammarParser.OP_NEG, 0); }
		public Oper_uniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper_uni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterOper_uni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitOper_uni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitOper_uni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oper_uniContext oper_uni() throws RecognitionException {
		Oper_uniContext _localctx = new Oper_uniContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_oper_uni);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==OP_NEG || _la==MENOS) ) {
			_errHandler.recoverInline(this);
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

	public static class Array_posContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(PseintGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PseintGrammarParser.COMA, i);
		}
		public Array_posContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_pos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterArray_pos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitArray_pos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitArray_pos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_posContext array_pos() throws RecognitionException {
		Array_posContext _localctx = new Array_posContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array_pos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			expr(0);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(268);
				match(COMA);
				setState(269);
				expr(0);
				}
				}
				setState(274);
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

	public static class Func_parContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(PseintGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PseintGrammarParser.COMA, i);
		}
		public Func_parContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterFunc_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitFunc_par(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitFunc_par(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_parContext func_par() throws RecognitionException {
		Func_parContext _localctx = new Func_parContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_func_par);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TD_REAL:
			case TD_ENTERO:
			case TD_CADENA:
			case VERDADERO:
			case FALSO:
			case PAR_IZQ:
			case OP_NEG:
			case MENOS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				expr(0);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(276);
					match(COMA);
					setState(277);
					expr(0);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PAR_DER:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(PseintGrammarParser.LEER, 0); }
		public List<TerminalNode> ID() { return getTokens(PseintGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PseintGrammarParser.ID, i);
		}
		public TerminalNode PYC() { return getToken(PseintGrammarParser.PYC, 0); }
		public List<TerminalNode> COR_IZQ() { return getTokens(PseintGrammarParser.COR_IZQ); }
		public TerminalNode COR_IZQ(int i) {
			return getToken(PseintGrammarParser.COR_IZQ, i);
		}
		public List<Array_posContext> array_pos() {
			return getRuleContexts(Array_posContext.class);
		}
		public Array_posContext array_pos(int i) {
			return getRuleContext(Array_posContext.class,i);
		}
		public List<TerminalNode> COR_DER() { return getTokens(PseintGrammarParser.COR_DER); }
		public TerminalNode COR_DER(int i) {
			return getToken(PseintGrammarParser.COR_DER, i);
		}
		public List<TerminalNode> COMA() { return getTokens(PseintGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PseintGrammarParser.COMA, i);
		}
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitLeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_leer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LEER);
			setState(287);
			match(ID);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COR_IZQ) {
				{
				setState(288);
				match(COR_IZQ);
				setState(289);
				array_pos();
				setState(290);
				match(COR_DER);
				}
			}

			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(294);
				match(COMA);
				setState(295);
				match(ID);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COR_IZQ) {
					{
					setState(296);
					match(COR_IZQ);
					setState(297);
					array_pos();
					setState(298);
					match(COR_DER);
					}
				}

				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(PYC);
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

	public static class EscribirContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(PseintGrammarParser.ESCRIBIR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PYC() { return getToken(PseintGrammarParser.PYC, 0); }
		public List<TerminalNode> COMA() { return getTokens(PseintGrammarParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PseintGrammarParser.COMA, i);
		}
		public EscribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterEscribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitEscribir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitEscribir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscribirContext escribir() throws RecognitionException {
		EscribirContext _localctx = new EscribirContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_escribir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(ESCRIBIR);
			setState(310);
			expr(0);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(311);
				match(COMA);
				setState(312);
				expr(0);
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(PYC);
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

	public static class SiContext extends ParserRuleContext {
		public SiparteContext siparte() {
			return getRuleContext(SiparteContext.class,0);
		}
		public TerminalNode FINSI() { return getToken(PseintGrammarParser.FINSI, 0); }
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			siparte();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(321);
				sino();
				}
			}

			setState(324);
			match(FINSI);
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

	public static class SiparteContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(PseintGrammarParser.SI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(PseintGrammarParser.ENTONCES, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public SiparteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siparte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterSiparte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitSiparte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitSiparte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiparteContext siparte() throws RecognitionException {
		SiparteContext _localctx = new SiparteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_siparte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(SI);
			setState(327);
			expr(0);
			setState(328);
			match(ENTONCES);
			setState(329);
			commands();
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

	public static class SinoContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(PseintGrammarParser.SINO, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(SINO);
			setState(332);
			commands();
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

	public static class SegunContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(PseintGrammarParser.SEGUN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PseintGrammarParser.HACER, 0); }
		public TerminalNode FINSEGUN() { return getToken(PseintGrammarParser.FINSEGUN, 0); }
		public List<CasesContext> cases() {
			return getRuleContexts(CasesContext.class);
		}
		public CasesContext cases(int i) {
			return getRuleContext(CasesContext.class,i);
		}
		public DefcaseContext defcase() {
			return getRuleContext(DefcaseContext.class,0);
		}
		public SegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterSegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitSegun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitSegun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegunContext segun() throws RecognitionException {
		SegunContext _localctx = new SegunContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_segun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(SEGUN);
			setState(335);
			expr(0);
			setState(336);
			match(HACER);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (TD_REAL - 41)) | (1L << (TD_ENTERO - 41)) | (1L << (TD_CADENA - 41)) | (1L << (VERDADERO - 41)) | (1L << (FALSO - 41)) | (1L << (PAR_IZQ - 41)) | (1L << (OP_NEG - 41)) | (1L << (MENOS - 41)) | (1L << (ID - 41)))) != 0)) {
				{
				{
				setState(337);
				cases();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DE) {
				{
				setState(343);
				defcase();
				}
			}

			setState(346);
			match(FINSEGUN);
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

	public static class CasesContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOSP() { return getToken(PseintGrammarParser.DOSP, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitCases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitCases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			expr(0);
			setState(349);
			match(DOSP);
			setState(350);
			commands();
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

	public static class DefcaseContext extends ParserRuleContext {
		public TerminalNode DE() { return getToken(PseintGrammarParser.DE, 0); }
		public TerminalNode OTRO() { return getToken(PseintGrammarParser.OTRO, 0); }
		public TerminalNode MODO() { return getToken(PseintGrammarParser.MODO, 0); }
		public TerminalNode DOSP() { return getToken(PseintGrammarParser.DOSP, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public DefcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterDefcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitDefcase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitDefcase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcaseContext defcase() throws RecognitionException {
		DefcaseContext _localctx = new DefcaseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_defcase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(DE);
			setState(353);
			match(OTRO);
			setState(354);
			match(MODO);
			setState(355);
			match(DOSP);
			setState(356);
			commands();
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PseintGrammarParser.MIENTRAS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PseintGrammarParser.HACER, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode FINMIENTRAS() { return getToken(PseintGrammarParser.FINMIENTRAS, 0); }
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(MIENTRAS);
			setState(359);
			expr(0);
			setState(360);
			match(HACER);
			setState(361);
			commands();
			setState(362);
			match(FINMIENTRAS);
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

	public static class RepetirContext extends ParserRuleContext {
		public RepcommContext repcomm() {
			return getRuleContext(RepcommContext.class,0);
		}
		public RepcondContext repcond() {
			return getRuleContext(RepcondContext.class,0);
		}
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitRepetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitRepetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			repcomm();
			setState(365);
			repcond();
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

	public static class RepcommContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(PseintGrammarParser.REPETIR, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public RepcommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repcomm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterRepcomm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitRepcomm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitRepcomm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepcommContext repcomm() throws RecognitionException {
		RepcommContext _localctx = new RepcommContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_repcomm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(REPETIR);
			setState(368);
			commands();
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

	public static class RepcondContext extends ParserRuleContext {
		public TerminalNode HASTA() { return getToken(PseintGrammarParser.HASTA, 0); }
		public TerminalNode QUE() { return getToken(PseintGrammarParser.QUE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RepcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterRepcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitRepcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitRepcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepcondContext repcond() throws RecognitionException {
		RepcondContext _localctx = new RepcondContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_repcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(HASTA);
			setState(371);
			match(QUE);
			setState(372);
			expr(0);
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PseintGrammarParser.PARA, 0); }
		public TerminalNode ID() { return getToken(PseintGrammarParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(PseintGrammarParser.ASIG, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode HASTA() { return getToken(PseintGrammarParser.HASTA, 0); }
		public TerminalNode HACER() { return getToken(PseintGrammarParser.HACER, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode FINPARA() { return getToken(PseintGrammarParser.FINPARA, 0); }
		public TerminalNode COR_IZQ() { return getToken(PseintGrammarParser.COR_IZQ, 0); }
		public Array_posContext array_pos() {
			return getRuleContext(Array_posContext.class,0);
		}
		public TerminalNode COR_DER() { return getToken(PseintGrammarParser.COR_DER, 0); }
		public ParapasoContext parapaso() {
			return getRuleContext(ParapasoContext.class,0);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(PARA);
			setState(375);
			match(ID);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COR_IZQ) {
				{
				setState(376);
				match(COR_IZQ);
				setState(377);
				array_pos();
				setState(378);
				match(COR_DER);
				}
			}

			setState(382);
			match(ASIG);
			setState(383);
			expr(0);
			setState(384);
			match(HASTA);
			setState(385);
			expr(0);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(386);
				parapaso();
				}
			}

			setState(389);
			match(HACER);
			setState(390);
			commands();
			setState(391);
			match(FINPARA);
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

	public static class ParapasoContext extends ParserRuleContext {
		public TerminalNode CON() { return getToken(PseintGrammarParser.CON, 0); }
		public TerminalNode PASO() { return getToken(PseintGrammarParser.PASO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParapasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parapaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterParapaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitParapaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitParapaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParapasoContext parapaso() throws RecognitionException {
		ParapasoContext _localctx = new ParapasoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parapaso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(CON);
			setState(394);
			match(PASO);
			setState(395);
			expr(0);
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

	public static class BorrarContext extends ParserRuleContext {
		public TerminalNode PANTALLA() { return getToken(PseintGrammarParser.PANTALLA, 0); }
		public TerminalNode PYC() { return getToken(PseintGrammarParser.PYC, 0); }
		public TerminalNode BORRAR() { return getToken(PseintGrammarParser.BORRAR, 0); }
		public TerminalNode LIMPIAR() { return getToken(PseintGrammarParser.LIMPIAR, 0); }
		public BorrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterBorrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitBorrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitBorrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorrarContext borrar() throws RecognitionException {
		BorrarContext _localctx = new BorrarContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_borrar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !(_la==BORRAR || _la==LIMPIAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(398);
			match(PANTALLA);
			setState(399);
			match(PYC);
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

	public static class EsperarContext extends ParserRuleContext {
		public TerminalNode ESPERAR() { return getToken(PseintGrammarParser.ESPERAR, 0); }
		public TerminalNode PYC() { return getToken(PseintGrammarParser.PYC, 0); }
		public TiempoContext tiempo() {
			return getRuleContext(TiempoContext.class,0);
		}
		public TeclaContext tecla() {
			return getRuleContext(TeclaContext.class,0);
		}
		public EsperarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esperar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterEsperar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitEsperar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitEsperar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsperarContext esperar() throws RecognitionException {
		EsperarContext _localctx = new EsperarContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_esperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(ESPERAR);
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TD_REAL:
			case TD_ENTERO:
			case TD_CADENA:
			case VERDADERO:
			case FALSO:
			case PAR_IZQ:
			case OP_NEG:
			case MENOS:
			case ID:
				{
				setState(402);
				tiempo();
				}
				break;
			case TECLA:
				{
				setState(403);
				tecla();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(406);
			match(PYC);
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

	public static class TiempoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEGUNDOS() { return getToken(PseintGrammarParser.SEGUNDOS, 0); }
		public TerminalNode MILISEGUNDOS() { return getToken(PseintGrammarParser.MILISEGUNDOS, 0); }
		public TiempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterTiempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitTiempo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitTiempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiempoContext tiempo() throws RecognitionException {
		TiempoContext _localctx = new TiempoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tiempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			expr(0);
			setState(409);
			_la = _input.LA(1);
			if ( !(_la==SEGUNDOS || _la==MILISEGUNDOS) ) {
			_errHandler.recoverInline(this);
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

	public static class TeclaContext extends ParserRuleContext {
		public TerminalNode TECLA() { return getToken(PseintGrammarParser.TECLA, 0); }
		public TeclaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tecla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterTecla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitTecla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitTecla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TeclaContext tecla() throws RecognitionException {
		TeclaContext _localctx = new TeclaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tecla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(TECLA);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseintGrammarParser.ID, 0); }
		public TerminalNode PYC() { return getToken(PseintGrammarParser.PYC, 0); }
		public TerminalNode PAR_IZQ() { return getToken(PseintGrammarParser.PAR_IZQ, 0); }
		public Func_parContext func_par() {
			return getRuleContext(Func_parContext.class,0);
		}
		public TerminalNode PAR_DER() { return getToken(PseintGrammarParser.PAR_DER, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseintGrammarListener ) ((PseintGrammarListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseintGrammarVisitor ) return ((PseintGrammarVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(ID);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAR_IZQ) {
				{
				setState(414);
				match(PAR_IZQ);
				setState(415);
				func_par();
				setState(416);
				match(PAR_DER);
				}
			}

			setState(420);
			match(PYC);
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
		case 13:
			return num_expr_sempred((Num_exprContext)_localctx, predIndex);
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean num_expr_sempred(Num_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u01a9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\7\2T\n\2\f"+
		"\2\16\2W\13\2\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\3\3\3\3\5\3d\n\3"+
		"\3\3\3\3\5\3h\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\7\6w\n\6\f\6\16\6z\13\6\3\6\5\6}\n\6\3\7\3\7\3\7\3\7\3\7\3\b\7\b\u0085"+
		"\n\b\f\b\16\b\u0088\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0097\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00a2"+
		"\n\13\f\13\16\13\u00a5\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u00b5\n\r\f\r\16\r\u00b8\13\r\3\16\3\16\3\16\7\16\u00bd"+
		"\n\16\f\16\16\16\u00c0\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u00cc\n\17\3\17\3\17\3\17\3\17\7\17\u00d2\n\17\f\17\16\17"+
		"\u00d5\13\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00de\n\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u00f1\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f8\n\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00ff\n\22\3\22\3\22\3\22\3\22\7\22\u0105\n"+
		"\22\f\22\16\22\u0108\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\7\25\u0111"+
		"\n\25\f\25\16\25\u0114\13\25\3\26\3\26\3\26\7\26\u0119\n\26\f\26\16\26"+
		"\u011c\13\26\3\26\5\26\u011f\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0127"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u012f\n\27\7\27\u0131\n\27\f"+
		"\27\16\27\u0134\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u013c\n\30\f"+
		"\30\16\30\u013f\13\30\3\30\3\30\3\31\3\31\5\31\u0145\n\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u0155"+
		"\n\34\f\34\16\34\u0158\13\34\3\34\5\34\u015b\n\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u017f\n#\3#\3"+
		"#\3#\3#\3#\5#\u0186\n#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\5"+
		"&\u0197\n&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\5)\u01a5\n)\3)\3)\3"+
		")\2\4\34\"*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNP\2\7\3\2@E\4\2\67>@E\4\2??AA\3\2 !\3\2$%\2\u01b5\2U\3\2\2"+
		"\2\4a\3\2\2\2\6l\3\2\2\2\bo\3\2\2\2\n|\3\2\2\2\f~\3\2\2\2\16\u0086\3\2"+
		"\2\2\20\u0096\3\2\2\2\22\u0098\3\2\2\2\24\u009e\3\2\2\2\26\u00a6\3\2\2"+
		"\2\30\u00aa\3\2\2\2\32\u00b9\3\2\2\2\34\u00cb\3\2\2\2\36\u00d6\3\2\2\2"+
		" \u00d8\3\2\2\2\"\u00fe\3\2\2\2$\u0109\3\2\2\2&\u010b\3\2\2\2(\u010d\3"+
		"\2\2\2*\u011e\3\2\2\2,\u0120\3\2\2\2.\u0137\3\2\2\2\60\u0142\3\2\2\2\62"+
		"\u0148\3\2\2\2\64\u014d\3\2\2\2\66\u0150\3\2\2\28\u015e\3\2\2\2:\u0162"+
		"\3\2\2\2<\u0168\3\2\2\2>\u016e\3\2\2\2@\u0171\3\2\2\2B\u0174\3\2\2\2D"+
		"\u0178\3\2\2\2F\u018b\3\2\2\2H\u018f\3\2\2\2J\u0193\3\2\2\2L\u019a\3\2"+
		"\2\2N\u019d\3\2\2\2P\u019f\3\2\2\2RT\5\4\3\2SR\3\2\2\2TW\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2X\\\5\f\7\2Y[\5\4\3\2ZY\3\2\2\2[^\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\2\2\3`\3\3\2\2\2"+
		"ac\7\3\2\2bd\5\6\4\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2eg\7G\2\2fh\5\b\5\2"+
		"gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\5\16\b\2jk\7\4\2\2k\5\3\2\2\2lm\7G\2"+
		"\2mn\7\61\2\2n\7\3\2\2\2op\7\62\2\2pq\5\n\6\2qr\7\63\2\2r\t\3\2\2\2sx"+
		"\7G\2\2tu\7\66\2\2uw\7G\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y}"+
		"\3\2\2\2zx\3\2\2\2{}\3\2\2\2|s\3\2\2\2|{\3\2\2\2}\13\3\2\2\2~\177\7\5"+
		"\2\2\177\u0080\7G\2\2\u0080\u0081\5\16\b\2\u0081\u0082\7\6\2\2\u0082\r"+
		"\3\2\2\2\u0083\u0085\5\20\t\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\17\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u0097\5\22\n\2\u008a\u0097\5\26\f\2\u008b\u0097\5 \21\2"+
		"\u008c\u0097\5,\27\2\u008d\u0097\5.\30\2\u008e\u0097\5\60\31\2\u008f\u0097"+
		"\5\66\34\2\u0090\u0097\5<\37\2\u0091\u0097\5> \2\u0092\u0097\5D#\2\u0093"+
		"\u0097\5H%\2\u0094\u0097\5J&\2\u0095\u0097\5P)\2\u0096\u0089\3\2\2\2\u0096"+
		"\u008a\3\2\2\2\u0096\u008b\3\2\2\2\u0096\u008c\3\2\2\2\u0096\u008d\3\2"+
		"\2\2\u0096\u008e\3\2\2\2\u0096\u008f\3\2\2\2\u0096\u0090\3\2\2\2\u0096"+
		"\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0095\3\2\2\2\u0097\21\3\2\2\2\u0098\u0099\7\7\2\2\u0099\u009a"+
		"\5\24\13\2\u009a\u009b\7\b\2\2\u009b\u009c\7\'\2\2\u009c\u009d\7\60\2"+
		"\2\u009d\23\3\2\2\2\u009e\u00a3\7G\2\2\u009f\u00a0\7\66\2\2\u00a0\u00a2"+
		"\7G\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\t\2"+
		"\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7\60\2\2\u00a9\27\3\2\2\2\u00aa\u00ab"+
		"\7G\2\2\u00ab\u00ac\7\64\2\2\u00ac\u00ad\5\32\16\2\u00ad\u00b6\7\65\2"+
		"\2\u00ae\u00af\7\66\2\2\u00af\u00b0\7G\2\2\u00b0\u00b1\7\64\2\2\u00b1"+
		"\u00b2\5\32\16\2\u00b2\u00b3\7\65\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ae"+
		"\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\31\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00be\5\"\22\2\u00ba\u00bb\7\66"+
		"\2\2\u00bb\u00bd\5\"\22\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\33\3\2\2\2\u00c0\u00be\3\2\2"+
		"\2\u00c1\u00c2\b\17\1\2\u00c2\u00c3\7\62\2\2\u00c3\u00c4\5\34\17\2\u00c4"+
		"\u00c5\7\63\2\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7\7A\2\2\u00c7\u00cc\5\34"+
		"\17\6\u00c8\u00cc\7+\2\2\u00c9\u00cc\7,\2\2\u00ca\u00cc\7G\2\2\u00cb\u00c1"+
		"\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc\u00d3\3\2\2\2\u00cd\u00ce\f\b\2\2\u00ce\u00cf\5\36"+
		"\20\2\u00cf\u00d0\5\34\17\t\u00d0\u00d2\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\35\3\2\2"+
		"\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\t\2\2\2\u00d7\37\3\2\2\2\u00d8\u00dd"+
		"\7G\2\2\u00d9\u00da\7\64\2\2\u00da\u00db\5(\25\2\u00db\u00dc\7\65\2\2"+
		"\u00dc\u00de\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0\u00e1\5\"\22\2\u00e1\u00e2\7\60\2"+
		"\2\u00e2!\3\2\2\2\u00e3\u00e4\b\22\1\2\u00e4\u00e5\5&\24\2\u00e5\u00e6"+
		"\5\"\22\13\u00e6\u00ff\3\2\2\2\u00e7\u00e8\7\62\2\2\u00e8\u00e9\5\"\22"+
		"\2\u00e9\u00ea\7\63\2\2\u00ea\u00ff\3\2\2\2\u00eb\u00f0\7G\2\2\u00ec\u00ed"+
		"\7\62\2\2\u00ed\u00ee\5*\26\2\u00ee\u00ef\7\63\2\2\u00ef\u00f1\3\2\2\2"+
		"\u00f0\u00ec\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ff\3\2\2\2\u00f2\u00f7"+
		"\7G\2\2\u00f3\u00f4\7\64\2\2\u00f4\u00f5\5(\25\2\u00f5\u00f6\7\65\2\2"+
		"\u00f6\u00f8\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00ff"+
		"\3\2\2\2\u00f9\u00ff\7+\2\2\u00fa\u00ff\7,\2\2\u00fb\u00ff\7-\2\2\u00fc"+
		"\u00ff\7.\2\2\u00fd\u00ff\7/\2\2\u00fe\u00e3\3\2\2\2\u00fe\u00e7\3\2\2"+
		"\2\u00fe\u00eb\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa"+
		"\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0106\3\2\2\2\u0100\u0101\f\f\2\2\u0101\u0102\5$\23\2\u0102\u0103\5\""+
		"\22\r\u0103\u0105\3\2\2\2\u0104\u0100\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107#\3\2\2\2\u0108\u0106\3\2\2\2"+
		"\u0109\u010a\t\3\2\2\u010a%\3\2\2\2\u010b\u010c\t\4\2\2\u010c\'\3\2\2"+
		"\2\u010d\u0112\5\"\22\2\u010e\u010f\7\66\2\2\u010f\u0111\5\"\22\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113)\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u011a\5\"\22\2\u0116\u0117"+
		"\7\66\2\2\u0117\u0119\5\"\22\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011f\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0115\3\2\2\2\u011e\u011d\3\2\2\2\u011f"+
		"+\3\2\2\2\u0120\u0121\7\n\2\2\u0121\u0126\7G\2\2\u0122\u0123\7\64\2\2"+
		"\u0123\u0124\5(\25\2\u0124\u0125\7\65\2\2\u0125\u0127\3\2\2\2\u0126\u0122"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0132\3\2\2\2\u0128\u0129\7\66\2\2"+
		"\u0129\u012e\7G\2\2\u012a\u012b\7\64\2\2\u012b\u012c\5(\25\2\u012c\u012d"+
		"\7\65\2\2\u012d\u012f\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012f\3\2\2\2"+
		"\u012f\u0131\3\2\2\2\u0130\u0128\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0136\7\60\2\2\u0136-\3\2\2\2\u0137\u0138\7\13\2\2\u0138\u013d\5\"\22"+
		"\2\u0139\u013a\7\66\2\2\u013a\u013c\5\"\22\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7\60\2\2\u0141/\3\2\2\2\u0142\u0144"+
		"\5\62\32\2\u0143\u0145\5\64\33\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2"+
		"\2\u0145\u0146\3\2\2\2\u0146\u0147\7\17\2\2\u0147\61\3\2\2\2\u0148\u0149"+
		"\7\f\2\2\u0149\u014a\5\"\22\2\u014a\u014b\7\r\2\2\u014b\u014c\5\16\b\2"+
		"\u014c\63\3\2\2\2\u014d\u014e\7\16\2\2\u014e\u014f\5\16\b\2\u014f\65\3"+
		"\2\2\2\u0150\u0151\7\20\2\2\u0151\u0152\5\"\22\2\u0152\u0156\7\21\2\2"+
		"\u0153\u0155\58\35\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0159"+
		"\u015b\5:\36\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015d\7\26\2\2\u015d\67\3\2\2\2\u015e\u015f\5\"\22\2\u015f"+
		"\u0160\7F\2\2\u0160\u0161\5\16\b\2\u01619\3\2\2\2\u0162\u0163\7\23\2\2"+
		"\u0163\u0164\7\24\2\2\u0164\u0165\7\25\2\2\u0165\u0166\7F\2\2\u0166\u0167"+
		"\5\16\b\2\u0167;\3\2\2\2\u0168\u0169\7\27\2\2\u0169\u016a\5\"\22\2\u016a"+
		"\u016b\7\21\2\2\u016b\u016c\5\16\b\2\u016c\u016d\7\30\2\2\u016d=\3\2\2"+
		"\2\u016e\u016f\5@!\2\u016f\u0170\5B\"\2\u0170?\3\2\2\2\u0171\u0172\7\31"+
		"\2\2\u0172\u0173\5\16\b\2\u0173A\3\2\2\2\u0174\u0175\7\32\2\2\u0175\u0176"+
		"\7\33\2\2\u0176\u0177\5\"\22\2\u0177C\3\2\2\2\u0178\u0179\7\34\2\2\u0179"+
		"\u017e\7G\2\2\u017a\u017b\7\64\2\2\u017b\u017c\5(\25\2\u017c\u017d\7\65"+
		"\2\2\u017d\u017f\3\2\2\2\u017e\u017a\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0181\7\61\2\2\u0181\u0182\5\"\22\2\u0182\u0183\7"+
		"\32\2\2\u0183\u0185\5\"\22\2\u0184\u0186\5F$\2\u0185\u0184\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7\21\2\2\u0188\u0189\5"+
		"\16\b\2\u0189\u018a\7\37\2\2\u018aE\3\2\2\2\u018b\u018c\7\35\2\2\u018c"+
		"\u018d\7\36\2\2\u018d\u018e\5\"\22\2\u018eG\3\2\2\2\u018f\u0190\t\5\2"+
		"\2\u0190\u0191\7\"\2\2\u0191\u0192\7\60\2\2\u0192I\3\2\2\2\u0193\u0196"+
		"\7#\2\2\u0194\u0197\5L\'\2\u0195\u0197\5N(\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7\60\2\2\u0199K\3\2\2\2"+
		"\u019a\u019b\5\"\22\2\u019b\u019c\t\6\2\2\u019cM\3\2\2\2\u019d\u019e\7"+
		"&\2\2\u019eO\3\2\2\2\u019f\u01a4\7G\2\2\u01a0\u01a1\7\62\2\2\u01a1\u01a2"+
		"\5*\26\2\u01a2\u01a3\7\63\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a0\3\2\2\2"+
		"\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\60\2\2\u01a7Q\3"+
		"\2\2\2\"U\\cgx|\u0086\u0096\u00a3\u00b6\u00be\u00cb\u00d3\u00dd\u00f0"+
		"\u00f7\u00fe\u0106\u0112\u011a\u011e\u0126\u012e\u0132\u013d\u0144\u0156"+
		"\u015a\u017e\u0185\u0196\u01a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}