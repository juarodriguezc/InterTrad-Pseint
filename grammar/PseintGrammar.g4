grammar PseintGrammar;

//REGLAS SINTACTICAS
code            : fun_salg_spro* main fun_salg_spro* EOF;

fun_salg_spro   : F_SALG_SP return_funcion? ID f_params? commands FIN_F_SALG_SP;

return_funcion  : ID ASIG;

f_params        : PAR_IZQ f_args PAR_DER;

f_args          : ID (COMA ID)*
                |
                ;

main            : PROC_ALG ID commands FIN_PROC_ALG;

commands        : command*;

command         : definicion
                | dimension
                | asignacion
                | leer
                | escribir
                | si
                | segun
                | mientras
                | repetir
                | para
                | borrar
                | esperar
                | call
                ;

definicion      : DEFINIR def_vars COMO T_DATO PYC;
def_vars        : ID (COMA ID)*;

dimension       : DIMENSION dim_vars PYC;
dim_vars        : ID COR_IZQ dim_sizes COR_DER (COMA ID COR_IZQ dim_sizes COR_DER )*;
dim_sizes       : expr (COMA expr)*;


num_expr        : num_expr oper_num num_expr
                | PAR_IZQ num_expr PAR_DER
                | MENOS num_expr
                | TD_REAL
                | TD_ENTERO
                | ID
                ;

oper_num        : MAS
                | MENOS
                | MUL
                | DIV
                | MOD
                | POT
                ;

asignacion      : ID (COR_IZQ array_pos COR_DER)? ASIG expr PYC;

expr            : expr oper_dos expr
                | oper_uni expr
                | PAR_IZQ expr PAR_DER
                | ID (PAR_IZQ func_par PAR_DER)?
                | ID (COR_IZQ array_pos COR_DER)?
                | TD_REAL
                | TD_ENTERO
                | TD_CADENA
                | VERDADERO
                | FALSO
                ;

oper_dos        : MAS
                | MENOS
                | MUL
                | DIV
                | MOD
                | POT
                | OP_Y
                | OP_OR
                | GEQ
                | LEQ
                | DIFT
                | GRE
                | LOW
                | EQU
                ;

oper_uni        : MENOS
                | OP_NEG
                ;

array_pos       : expr (COMA expr)*;

func_par        : expr (COMA expr)*
                | ;

leer            : LEER ID (COR_IZQ array_pos COR_DER)? (COMA ID (COR_IZQ array_pos COR_DER)?)* PYC;
escribir        : ESCRIBIR expr (COMA expr)* PYC;
si              : siparte sino? FINSI;
siparte         : SI expr ENTONCES command+;
sino            : SINO command+;
//segun           : SEGUN expr HACER (CASO expr DOSP command+)* (DE OTRO MODO DOSP command+)? FINSEGUN;
segun           : SEGUN expr HACER cases* defcase? FINSEGUN;
cases           : expr DOSP command+;
defcase         : DE OTRO MODO DOSP command+;
mientras        : MIENTRAS expr HACER command+ FINMIENTRAS;
repetir         : REPETIR commands HASTA QUE expr;
para            : PARA ID(COR_IZQ array_pos COR_DER)? ASIG expr HASTA expr (CON PASO expr)? HACER commands FINPARA;
borrar          : (BORRAR | LIMPIAR) PANTALLA PYC;
esperar         : ESPERAR (tiempo|tecla) PYC;

tiempo          : expr (SEGUNDOS | MILISEGUNDOS);
tecla           : TECLA;

call            : ID (PAR_IZQ func_par PAR_DER)? PYC;
//TOKENS
F_SALG_SP       : F U N C I O N
                | S U B P R O C E S O
                | S U B A L G O R I T M O
                ;

FIN_F_SALG_SP   : F I N F U N C I O N
                | F I N S U B P R O C E S O
                | F I N S U B A L G O R I T M O
                ;

PROC_ALG        : P R O C E S O
                | A L G O R I T M O
                ;

FIN_PROC_ALG    : F I N P R O C E S O
                | F I N A L G O R I T M O
                ;

DEFINIR         : D E F I N I R;
COMO            : C O M O;
DIMENSION       : D I M E N S I O N;
LEER            : L E E R;
ESCRIBIR        : E S C R I B I R;
SI              : S I ;
ENTONCES        : E N T O N C E S;
SINO            : S I N O;
FINSI           : F I N S I;
SEGUN           : S E G U N;
HACER           : H A C E R;
CASO            : C A S O;
DE              : D E;
OTRO            : O T R O;
MODO            : M O D O;
FINSEGUN        : F I N S E G U N;
MIENTRAS        : M I E N T R A S;
FINMIENTRAS     : F I N M I E N T R A S;
REPETIR         : R E P E T I R;
HASTA           : H A S T A;
QUE             : Q U E;
PARA            : P A R A;
CON             : C O N;
PASO            : P A S O;
FINPARA         : F I N P A R A;

BORRAR          : B O R R A R;
LIMPIAR         : L I M P I A R;

PANTALLA        : P A N T A L L A ;

ESPERAR         : E S P E R A R;
SEGUNDOS        : S E G U N D O S;
MILISEGUNDOS    : M I L I S E G U N D O S;
TECLA           : T E C L A;

T_DATO          : T_NUM
                | T_LOGICO
                | T_CARAC
                ;

T_NUM           : E N T E R O
                | N U M E R O
                | N U M E R I C O
                | R E A L
                ;

T_LOGICO        : L O G I C O;

T_CARAC         : C A R A C T E R
                | T E X T O
                | C A D E N A
                ;

TD_REAL         : [0-9]+([.][0-9]+);
TD_ENTERO       : [0-9]+;
TD_CADENA       : ('"' | '\'') .*? ('"' | '\'') ;

VERDADERO       : V E R D A D E R O;
FALSO           : F A L S O;

PYC             : ';';
ASIG            : '<-';
PAR_IZQ         : '(';
PAR_DER         : ')';
COR_IZQ         : '[';
COR_DER         : ']';
COMA            : ',';

GEQ             : '>=';
LEQ             : '<=';
DIFT            : '<>';
GRE             : '>';
LOW             : '<';
EQU             : '=';

OP_Y            :( Y | '&');
OP_OR           :( O | '|');
OP_NEG          :( N O | '~');

MAS             : '+';
MENOS           : '-';
MUL             : '*';
DIV             : '/';
POT             :('^');
MOD             :('%' | M O D);

DOSP            : ':';

ID              : [a-zA-Z][a-zA-Z0-9_]* ;


//CASE INSENSITIVE

fragment A: ('a'|'A');
fragment B: ('b'|'B');
fragment C: ('c'|'C');
fragment D: ('d'|'D');
fragment E: ('e'|'E');
fragment F: ('f'|'F');
fragment G: ('g'|'G');
fragment H: ('h'|'H');
fragment I: ('i'|'I');
fragment J: ('j'|'J');
fragment K: ('k'|'K');
fragment L: ('l'|'L');
fragment M: ('m'|'M');
fragment N: ('n'|'N');
fragment O: ('o'|'O');
fragment P: ('p'|'P');
fragment Q: ('q'|'Q');
fragment R: ('r'|'R');
fragment S: ('s'|'S');
fragment T: ('t'|'T');
fragment U: ('u'|'U');
fragment V: ('v'|'V');
fragment W: ('w'|'W');
fragment X: ('x'|'X');
fragment Y: ('y'|'Y');
fragment Z: ('z'|'Z');

//REGLAS LEXICAS
WS		: [ \t\r\n]+ -> skip ;
COMMENT 	: '//' ~[\r\n]* -> skip ;
