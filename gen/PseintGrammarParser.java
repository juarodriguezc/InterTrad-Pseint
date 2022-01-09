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
		RULE_leer = 21, RULE_escribir = 22, RULE_si = 23, RULE_segun = 24, RULE_mientras = 25, 
		RULE_repetir = 26, RULE_para = 27, RULE_borrar = 28, RULE_esperar = 29, 
		RULE_tiempo = 30, RULE_tecla = 31, RULE_call = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "fun_salg_spro", "return_funcion", "f_params", "f_args", "main", 
			"commands", "command", "definicion", "def_vars", "dimension", "dim_vars", 
			"dim_sizes", "num_expr", "oper_num", "asignacion", "expr", "oper_dos", 
			"oper_uni", "array_pos", "func_par", "leer", "escribir", "si", "segun", 
			"mientras", "repetir", "para", "borrar", "esperar", "tiempo", "tecla", 
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==F_SALG_SP) {
				{
				{
				setState(66);
				fun_salg_spro();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			main();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==F_SALG_SP) {
				{
				{
				setState(73);
				fun_salg_spro();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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
			setState(81);
			match(F_SALG_SP);
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(82);
				return_funcion();
				}
				break;
			}
			setState(85);
			match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAR_IZQ) {
				{
				setState(86);
				f_params();
				}
			}

			setState(89);
			commands();
			setState(90);
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
			setState(92);
			match(ID);
			setState(93);
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
			setState(95);
			match(PAR_IZQ);
			setState(96);
			f_args();
			setState(97);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(ID);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(100);
					match(COMA);
					setState(101);
					match(ID);
					}
					}
					setState(106);
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
			setState(110);
			match(PROC_ALG);
			setState(111);
			match(ID);
			setState(112);
			commands();
			setState(113);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << DIMENSION) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << BORRAR) | (1L << LIMPIAR) | (1L << ESPERAR))) != 0) || _la==ID) {
				{
				{
				setState(115);
				command();
				}
				}
				setState(120);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				definicion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				dimension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				asignacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				leer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				escribir();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				si();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				segun();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				mientras();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(129);
				repetir();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(130);
				para();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(131);
				borrar();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(132);
				esperar();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(133);
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
			setState(136);
			match(DEFINIR);
			setState(137);
			def_vars();
			setState(138);
			match(COMO);
			setState(139);
			match(T_DATO);
			setState(140);
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
			setState(142);
			match(ID);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(143);
				match(COMA);
				setState(144);
				match(ID);
				}
				}
				setState(149);
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
			setState(150);
			match(DIMENSION);
			setState(151);
			dim_vars();
			setState(152);
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
			setState(154);
			match(ID);
			setState(155);
			match(COR_IZQ);
			setState(156);
			dim_sizes();
			setState(157);
			match(COR_DER);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(158);
				match(COMA);
				setState(159);
				match(ID);
				setState(160);
				match(COR_IZQ);
				setState(161);
				dim_sizes();
				setState(162);
				match(COR_DER);
				}
				}
				setState(168);
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
			setState(169);
			expr(0);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(170);
				match(COMA);
				setState(171);
				expr(0);
				}
				}
				setState(176);
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
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAR_IZQ:
				{
				setState(178);
				match(PAR_IZQ);
				setState(179);
				num_expr(0);
				setState(180);
				match(PAR_DER);
				}
				break;
			case MENOS:
				{
				setState(182);
				match(MENOS);
				setState(183);
				num_expr(4);
				}
				break;
			case TD_REAL:
				{
				setState(184);
				match(TD_REAL);
				}
				break;
			case TD_ENTERO:
				{
				setState(185);
				match(TD_ENTERO);
				}
				break;
			case ID:
				{
				setState(186);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
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
					setState(189);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(190);
					oper_num();
					setState(191);
					num_expr(7);
					}
					} 
				}
				setState(197);
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
			setState(198);
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
			setState(200);
			match(ID);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COR_IZQ) {
				{
				setState(201);
				match(COR_IZQ);
				setState(202);
				array_pos();
				setState(203);
				match(COR_DER);
				}
			}

			setState(207);
			match(ASIG);
			setState(208);
			expr(0);
			setState(209);
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
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(212);
				oper_uni();
				setState(213);
				expr(9);
				}
				break;
			case 2:
				{
				setState(215);
				match(PAR_IZQ);
				setState(216);
				expr(0);
				setState(217);
				match(PAR_DER);
				}
				break;
			case 3:
				{
				setState(219);
				match(ID);
				setState(224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(220);
					match(PAR_IZQ);
					setState(221);
					func_par();
					setState(222);
					match(PAR_DER);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(226);
				match(ID);
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(227);
					match(COR_IZQ);
					setState(228);
					array_pos();
					setState(229);
					match(COR_DER);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(233);
				match(TD_REAL);
				}
				break;
			case 6:
				{
				setState(234);
				match(TD_ENTERO);
				}
				break;
			case 7:
				{
				setState(235);
				match(TD_CADENA);
				}
				break;
			case 8:
				{
				setState(236);
				match(VERDADERO);
				}
				break;
			case 9:
				{
				setState(237);
				match(FALSO);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
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
					setState(240);
					if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
					setState(241);
					oper_dos();
					setState(242);
					expr(11);
					}
					} 
				}
				setState(248);
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
			setState(249);
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
			setState(251);
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
			setState(253);
			expr(0);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(254);
				match(COMA);
				setState(255);
				expr(0);
				}
				}
				setState(260);
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
			setState(270);
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
				setState(261);
				expr(0);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(262);
					match(COMA);
					setState(263);
					expr(0);
					}
					}
					setState(268);
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
			setState(272);
			match(LEER);
			setState(273);
			match(ID);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COR_IZQ) {
				{
				setState(274);
				match(COR_IZQ);
				setState(275);
				array_pos();
				setState(276);
				match(COR_DER);
				}
			}

			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(280);
				match(COMA);
				setState(281);
				match(ID);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COR_IZQ) {
					{
					setState(282);
					match(COR_IZQ);
					setState(283);
					array_pos();
					setState(284);
					match(COR_DER);
					}
				}

				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
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
			setState(295);
			match(ESCRIBIR);
			setState(296);
			expr(0);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(297);
				match(COMA);
				setState(298);
				expr(0);
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
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
		public TerminalNode SI() { return getToken(PseintGrammarParser.SI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(PseintGrammarParser.ENTONCES, 0); }
		public TerminalNode FINSI() { return getToken(PseintGrammarParser.FINSI, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode SINO() { return getToken(PseintGrammarParser.SINO, 0); }
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
			setState(306);
			match(SI);
			setState(307);
			expr(0);
			setState(308);
			match(ENTONCES);
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(309);
				command();
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << DIMENSION) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << BORRAR) | (1L << LIMPIAR) | (1L << ESPERAR))) != 0) || _la==ID );
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(314);
				match(SINO);
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(315);
					command();
					}
					}
					setState(318); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << DIMENSION) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << BORRAR) | (1L << LIMPIAR) | (1L << ESPERAR))) != 0) || _la==ID );
				}
			}

			setState(322);
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

	public static class SegunContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(PseintGrammarParser.SEGUN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode HACER() { return getToken(PseintGrammarParser.HACER, 0); }
		public TerminalNode FINSEGUN() { return getToken(PseintGrammarParser.FINSEGUN, 0); }
		public List<TerminalNode> CASO() { return getTokens(PseintGrammarParser.CASO); }
		public TerminalNode CASO(int i) {
			return getToken(PseintGrammarParser.CASO, i);
		}
		public List<TerminalNode> DOSP() { return getTokens(PseintGrammarParser.DOSP); }
		public TerminalNode DOSP(int i) {
			return getToken(PseintGrammarParser.DOSP, i);
		}
		public TerminalNode DE() { return getToken(PseintGrammarParser.DE, 0); }
		public TerminalNode OTRO() { return getToken(PseintGrammarParser.OTRO, 0); }
		public TerminalNode MODO() { return getToken(PseintGrammarParser.MODO, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
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
		enterRule(_localctx, 48, RULE_segun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(SEGUN);
			setState(325);
			expr(0);
			setState(326);
			match(HACER);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASO) {
				{
				{
				setState(327);
				match(CASO);
				setState(328);
				expr(0);
				setState(329);
				match(DOSP);
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(330);
					command();
					}
					}
					setState(333); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << DIMENSION) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << BORRAR) | (1L << LIMPIAR) | (1L << ESPERAR))) != 0) || _la==ID );
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DE) {
				{
				setState(340);
				match(DE);
				setState(341);
				match(OTRO);
				setState(342);
				match(MODO);
				setState(343);
				match(DOSP);
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(344);
					command();
					}
					}
					setState(347); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << DIMENSION) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << BORRAR) | (1L << LIMPIAR) | (1L << ESPERAR))) != 0) || _la==ID );
				}
			}

			setState(351);
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PseintGrammarParser.MIENTRAS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PseintGrammarParser.HACER, 0); }
		public TerminalNode FINMIENTRAS() { return getToken(PseintGrammarParser.FINMIENTRAS, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
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
		enterRule(_localctx, 50, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(MIENTRAS);
			setState(354);
			expr(0);
			setState(355);
			match(HACER);
			setState(357); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(356);
				command();
				}
				}
				setState(359); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINIR) | (1L << DIMENSION) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA) | (1L << BORRAR) | (1L << LIMPIAR) | (1L << ESPERAR))) != 0) || _la==ID );
			setState(361);
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
		public TerminalNode REPETIR() { return getToken(PseintGrammarParser.REPETIR, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode HASTA() { return getToken(PseintGrammarParser.HASTA, 0); }
		public TerminalNode QUE() { return getToken(PseintGrammarParser.QUE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 52, RULE_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(REPETIR);
			setState(364);
			commands();
			setState(365);
			match(HASTA);
			setState(366);
			match(QUE);
			setState(367);
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
		public TerminalNode CON() { return getToken(PseintGrammarParser.CON, 0); }
		public TerminalNode PASO() { return getToken(PseintGrammarParser.PASO, 0); }
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
		enterRule(_localctx, 54, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(PARA);
			setState(370);
			match(ID);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COR_IZQ) {
				{
				setState(371);
				match(COR_IZQ);
				setState(372);
				array_pos();
				setState(373);
				match(COR_DER);
				}
			}

			setState(377);
			match(ASIG);
			setState(378);
			expr(0);
			setState(379);
			match(HASTA);
			setState(380);
			expr(0);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(381);
				match(CON);
				setState(382);
				match(PASO);
				setState(383);
				expr(0);
				}
			}

			setState(386);
			match(HACER);
			setState(387);
			commands();
			setState(388);
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
		enterRule(_localctx, 56, RULE_borrar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !(_la==BORRAR || _la==LIMPIAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(391);
			match(PANTALLA);
			setState(392);
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
		enterRule(_localctx, 58, RULE_esperar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(ESPERAR);
			setState(397);
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
				setState(395);
				tiempo();
				}
				break;
			case TECLA:
				{
				setState(396);
				tecla();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
		enterRule(_localctx, 60, RULE_tiempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			expr(0);
			setState(402);
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
		enterRule(_localctx, 62, RULE_tecla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
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
		enterRule(_localctx, 64, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(ID);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAR_IZQ) {
				{
				setState(407);
				match(PAR_IZQ);
				setState(408);
				func_par();
				setState(409);
				match(PAR_DER);
				}
			}

			setState(413);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u01a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13"+
		"\2\3\2\3\2\3\3\3\3\5\3V\n\3\3\3\3\3\5\3Z\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\5\6o\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\7\bw\n\b\f\b\16\bz\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0089\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\7\13\u0094\n\13\f\13\16\13\u0097\13\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a7\n\r\f\r\16\r\u00aa\13\r\3"+
		"\16\3\16\3\16\7\16\u00af\n\16\f\16\16\16\u00b2\13\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00be\n\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00c4\n\17\f\17\16\17\u00c7\13\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00d0\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e3\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00ea\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f1\n\22\3\22\3"+
		"\22\3\22\3\22\7\22\u00f7\n\22\f\22\16\22\u00fa\13\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\7\25\u0103\n\25\f\25\16\25\u0106\13\25\3\26\3\26\3"+
		"\26\7\26\u010b\n\26\f\26\16\26\u010e\13\26\3\26\5\26\u0111\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u0119\n\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0121\n\27\7\27\u0123\n\27\f\27\16\27\u0126\13\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\7\30\u012e\n\30\f\30\16\30\u0131\13\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\6\31\u0139\n\31\r\31\16\31\u013a\3\31\3\31\6\31\u013f"+
		"\n\31\r\31\16\31\u0140\5\31\u0143\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\6\32\u014e\n\32\r\32\16\32\u014f\7\32\u0152\n\32\f\32\16"+
		"\32\u0155\13\32\3\32\3\32\3\32\3\32\3\32\6\32\u015c\n\32\r\32\16\32\u015d"+
		"\5\32\u0160\n\32\3\32\3\32\3\33\3\33\3\33\3\33\6\33\u0168\n\33\r\33\16"+
		"\33\u0169\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u017a\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0183"+
		"\n\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u0190"+
		"\n\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u019e\n\"\3\"\3"+
		"\"\3\"\2\4\34\"#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@B\2\7\3\2@E\4\2\67>@E\4\2??AA\3\2 !\3\2$%\2\u01ba\2G\3\2\2"+
		"\2\4S\3\2\2\2\6^\3\2\2\2\ba\3\2\2\2\nn\3\2\2\2\fp\3\2\2\2\16x\3\2\2\2"+
		"\20\u0088\3\2\2\2\22\u008a\3\2\2\2\24\u0090\3\2\2\2\26\u0098\3\2\2\2\30"+
		"\u009c\3\2\2\2\32\u00ab\3\2\2\2\34\u00bd\3\2\2\2\36\u00c8\3\2\2\2 \u00ca"+
		"\3\2\2\2\"\u00f0\3\2\2\2$\u00fb\3\2\2\2&\u00fd\3\2\2\2(\u00ff\3\2\2\2"+
		"*\u0110\3\2\2\2,\u0112\3\2\2\2.\u0129\3\2\2\2\60\u0134\3\2\2\2\62\u0146"+
		"\3\2\2\2\64\u0163\3\2\2\2\66\u016d\3\2\2\28\u0173\3\2\2\2:\u0188\3\2\2"+
		"\2<\u018c\3\2\2\2>\u0193\3\2\2\2@\u0196\3\2\2\2B\u0198\3\2\2\2DF\5\4\3"+
		"\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JN\5\f\7"+
		"\2KM\5\4\3\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2"+
		"\2QR\7\2\2\3R\3\3\2\2\2SU\7\3\2\2TV\5\6\4\2UT\3\2\2\2UV\3\2\2\2VW\3\2"+
		"\2\2WY\7G\2\2XZ\5\b\5\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\16\b\2\\]\7"+
		"\4\2\2]\5\3\2\2\2^_\7G\2\2_`\7\61\2\2`\7\3\2\2\2ab\7\62\2\2bc\5\n\6\2"+
		"cd\7\63\2\2d\t\3\2\2\2ej\7G\2\2fg\7\66\2\2gi\7G\2\2hf\3\2\2\2il\3\2\2"+
		"\2jh\3\2\2\2jk\3\2\2\2ko\3\2\2\2lj\3\2\2\2mo\3\2\2\2ne\3\2\2\2nm\3\2\2"+
		"\2o\13\3\2\2\2pq\7\5\2\2qr\7G\2\2rs\5\16\b\2st\7\6\2\2t\r\3\2\2\2uw\5"+
		"\20\t\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\17\3\2\2\2zx\3\2\2\2"+
		"{\u0089\5\22\n\2|\u0089\5\26\f\2}\u0089\5 \21\2~\u0089\5,\27\2\177\u0089"+
		"\5.\30\2\u0080\u0089\5\60\31\2\u0081\u0089\5\62\32\2\u0082\u0089\5\64"+
		"\33\2\u0083\u0089\5\66\34\2\u0084\u0089\58\35\2\u0085\u0089\5:\36\2\u0086"+
		"\u0089\5<\37\2\u0087\u0089\5B\"\2\u0088{\3\2\2\2\u0088|\3\2\2\2\u0088"+
		"}\3\2\2\2\u0088~\3\2\2\2\u0088\177\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0081"+
		"\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088"+
		"\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\21\3\2\2"+
		"\2\u008a\u008b\7\7\2\2\u008b\u008c\5\24\13\2\u008c\u008d\7\b\2\2\u008d"+
		"\u008e\7\'\2\2\u008e\u008f\7\60\2\2\u008f\23\3\2\2\2\u0090\u0095\7G\2"+
		"\2\u0091\u0092\7\66\2\2\u0092\u0094\7G\2\2\u0093\u0091\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\25\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\t\2\2\u0099\u009a\5\30\r\2\u009a\u009b\7"+
		"\60\2\2\u009b\27\3\2\2\2\u009c\u009d\7G\2\2\u009d\u009e\7\64\2\2\u009e"+
		"\u009f\5\32\16\2\u009f\u00a8\7\65\2\2\u00a0\u00a1\7\66\2\2\u00a1\u00a2"+
		"\7G\2\2\u00a2\u00a3\7\64\2\2\u00a3\u00a4\5\32\16\2\u00a4\u00a5\7\65\2"+
		"\2\u00a5\u00a7\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\31\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00b0\5\"\22\2\u00ac\u00ad\7\66\2\2\u00ad\u00af\5\"\22\2\u00ae\u00ac"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\33\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\b\17\1\2\u00b4\u00b5\7\62"+
		"\2\2\u00b5\u00b6\5\34\17\2\u00b6\u00b7\7\63\2\2\u00b7\u00be\3\2\2\2\u00b8"+
		"\u00b9\7A\2\2\u00b9\u00be\5\34\17\6\u00ba\u00be\7+\2\2\u00bb\u00be\7,"+
		"\2\2\u00bc\u00be\7G\2\2\u00bd\u00b3\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd"+
		"\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c5\3\2"+
		"\2\2\u00bf\u00c0\f\b\2\2\u00c0\u00c1\5\36\20\2\u00c1\u00c2\5\34\17\t\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\35\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9"+
		"\t\2\2\2\u00c9\37\3\2\2\2\u00ca\u00cf\7G\2\2\u00cb\u00cc\7\64\2\2\u00cc"+
		"\u00cd\5(\25\2\u00cd\u00ce\7\65\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cb\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2"+
		"\u00d3\5\"\22\2\u00d3\u00d4\7\60\2\2\u00d4!\3\2\2\2\u00d5\u00d6\b\22\1"+
		"\2\u00d6\u00d7\5&\24\2\u00d7\u00d8\5\"\22\13\u00d8\u00f1\3\2\2\2\u00d9"+
		"\u00da\7\62\2\2\u00da\u00db\5\"\22\2\u00db\u00dc\7\63\2\2\u00dc\u00f1"+
		"\3\2\2\2\u00dd\u00e2\7G\2\2\u00de\u00df\7\62\2\2\u00df\u00e0\5*\26\2\u00e0"+
		"\u00e1\7\63\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e3\u00f1\3\2\2\2\u00e4\u00e9\7G\2\2\u00e5\u00e6\7\64\2\2\u00e6"+
		"\u00e7\5(\25\2\u00e7\u00e8\7\65\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e5\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f1\3\2\2\2\u00eb\u00f1\7+\2\2\u00ec"+
		"\u00f1\7,\2\2\u00ed\u00f1\7-\2\2\u00ee\u00f1\7.\2\2\u00ef\u00f1\7/\2\2"+
		"\u00f0\u00d5\3\2\2\2\u00f0\u00d9\3\2\2\2\u00f0\u00dd\3\2\2\2\u00f0\u00e4"+
		"\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f8\3\2\2\2\u00f2\u00f3\f\f"+
		"\2\2\u00f3\u00f4\5$\23\2\u00f4\u00f5\5\"\22\r\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f2\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9#\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\t\3\2\2\u00fc%\3\2"+
		"\2\2\u00fd\u00fe\t\4\2\2\u00fe\'\3\2\2\2\u00ff\u0104\5\"\22\2\u0100\u0101"+
		"\7\66\2\2\u0101\u0103\5\"\22\2\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2"+
		"\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105)\3\2\2\2\u0106\u0104\3"+
		"\2\2\2\u0107\u010c\5\"\22\2\u0108\u0109\7\66\2\2\u0109\u010b\5\"\22\2"+
		"\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u0111\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u0107\3\2\2\2\u0110\u010f\3\2\2\2\u0111+\3\2\2\2\u0112\u0113\7\n\2\2"+
		"\u0113\u0118\7G\2\2\u0114\u0115\7\64\2\2\u0115\u0116\5(\25\2\u0116\u0117"+
		"\7\65\2\2\u0117\u0119\3\2\2\2\u0118\u0114\3\2\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u0124\3\2\2\2\u011a\u011b\7\66\2\2\u011b\u0120\7G\2\2\u011c\u011d"+
		"\7\64\2\2\u011d\u011e\5(\25\2\u011e\u011f\7\65\2\2\u011f\u0121\3\2\2\2"+
		"\u0120\u011c\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u011a"+
		"\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\60\2\2\u0128-\3\2\2\2"+
		"\u0129\u012a\7\13\2\2\u012a\u012f\5\"\22\2\u012b\u012c\7\66\2\2\u012c"+
		"\u012e\5\"\22\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0133\7\60\2\2\u0133/\3\2\2\2\u0134\u0135\7\f\2\2\u0135\u0136\5\"\22"+
		"\2\u0136\u0138\7\r\2\2\u0137\u0139\5\20\t\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0142\3\2"+
		"\2\2\u013c\u013e\7\16\2\2\u013d\u013f\5\20\t\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2"+
		"\2\2\u0142\u013c\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\7\17\2\2\u0145\61\3\2\2\2\u0146\u0147\7\20\2\2\u0147\u0148\5\""+
		"\22\2\u0148\u0153\7\21\2\2\u0149\u014a\7\22\2\2\u014a\u014b\5\"\22\2\u014b"+
		"\u014d\7F\2\2\u014c\u014e\5\20\t\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151"+
		"\u0149\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u015f\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\7\23\2\2\u0157"+
		"\u0158\7\24\2\2\u0158\u0159\7\25\2\2\u0159\u015b\7F\2\2\u015a\u015c\5"+
		"\20\t\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7\26\2\2\u0162\63\3\2\2\2\u0163\u0164"+
		"\7\27\2\2\u0164\u0165\5\"\22\2\u0165\u0167\7\21\2\2\u0166\u0168\5\20\t"+
		"\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7\30\2\2\u016c\65\3\2\2\2\u016d"+
		"\u016e\7\31\2\2\u016e\u016f\5\16\b\2\u016f\u0170\7\32\2\2\u0170\u0171"+
		"\7\33\2\2\u0171\u0172\5\"\22\2\u0172\67\3\2\2\2\u0173\u0174\7\34\2\2\u0174"+
		"\u0179\7G\2\2\u0175\u0176\7\64\2\2\u0176\u0177\5(\25\2\u0177\u0178\7\65"+
		"\2\2\u0178\u017a\3\2\2\2\u0179\u0175\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\7\61\2\2\u017c\u017d\5\"\22\2\u017d\u017e\7"+
		"\32\2\2\u017e\u0182\5\"\22\2\u017f\u0180\7\35\2\2\u0180\u0181\7\36\2\2"+
		"\u0181\u0183\5\"\22\2\u0182\u017f\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\7\21\2\2\u0185\u0186\5\16\b\2\u0186\u0187\7\37\2"+
		"\2\u01879\3\2\2\2\u0188\u0189\t\5\2\2\u0189\u018a\7\"\2\2\u018a\u018b"+
		"\7\60\2\2\u018b;\3\2\2\2\u018c\u018f\7#\2\2\u018d\u0190\5> \2\u018e\u0190"+
		"\5@!\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0192\7\60\2\2\u0192=\3\2\2\2\u0193\u0194\5\"\22\2\u0194\u0195\t\6\2"+
		"\2\u0195?\3\2\2\2\u0196\u0197\7&\2\2\u0197A\3\2\2\2\u0198\u019d\7G\2\2"+
		"\u0199\u019a\7\62\2\2\u019a\u019b\5*\26\2\u019b\u019c\7\63\2\2\u019c\u019e"+
		"\3\2\2\2\u019d\u0199\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\7\60\2\2\u01a0C\3\2\2\2\'GNUYjnx\u0088\u0095\u00a8\u00b0\u00bd"+
		"\u00c5\u00cf\u00e2\u00e9\u00f0\u00f8\u0104\u010c\u0110\u0118\u0120\u0124"+
		"\u012f\u013a\u0140\u0142\u014f\u0153\u015d\u015f\u0169\u0179\u0182\u018f"+
		"\u019d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}