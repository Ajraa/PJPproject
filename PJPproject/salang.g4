grammar salang;

prog: stat+;


stat
    : LCPARAN stat (stat)* RCPARAN
    | primitive_type ID (COMA ID)* SEMI
    | IF LPARAN expr RPARAN pos=stat (ELSE neg=stat)?
    | WHILE LPARAN expr RPARAN stat
    | READ ID (COMA ID)* SEMI
    | WRITE expr (COMA expr)* SEMI
    | expr SEMI
    | SEMI
    ;

expr
    : ID
    | BOOL_VAL
    | INT_VAL
    | FLOAT_VAL
    | STRING
    | prefix=SUB expr
    | prefix=NEG expr
    | LPARAN expr RPARAN
    | expr op=(MUL|DIV|MOD) expr
    | expr op=(ADD|SUB) expr
    | expr op=(LES|GRE) expr
    | expr op=(EQ|NEQ) expr
    | expr AND expr
    | expr OR expr
    | <assoc=right> ID ASSIGN expr
    ;

primitive_type
    : integral_type
    | floating_point_type
    | type=STRING
    | type=BOOL
    ;

integral_type
    : type=SHORT
    | type=INT
    | type=LONG
    ;

floating_point_type
    : type=FLOAT
    | type=DOUBLE
    ;

STRING_VAL: QUOTE StringCharacters? QUOTE;
fragment StringCharacters: StringCharacter+;
fragment StringCharacter: ~["\\\r\n] | EscapeSequence;
TextBlock: '"""' [ \t]* [\n\r] [.\r\b]* '"""';

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | OctalEscape
    | UnicodeEscape
    ;

fragment OctalEscape
    : '\\' OctalDigit
    | '\\' OctalDigit OctalDigit
    | '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment UnicodeEscape: '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit;
fragment HexDigit: [0-9a-fA-F];
fragment OctalDigit: [0-7];
fragment ZeroToThree: [0-3];

BOOL_VAL
    : 'true'
    | 'false'
    ;

SEMI:   ';';
COMA:  ',';

SHORT: 'short';
INT: 'int';
LONG: 'long';
FLOAT: 'float';
DOUBLE: 'double';
STRING: 'string';
BOOL: 'bool';

IF: 'if';
ELSE: 'else';

WHILE: 'while';

READ: 'read';
WRITE: 'write';

ID: [a-zA-Z].([a-zA-Z0-9]*)?;
FLOAT_VAL : [0-9]+'.'[0-9]+;
INT_VAL : [0-9]+; 

ASSIGN: '=';

MUL: '*'; 
DIV: '/';
ADD: '+';
SUB: '-';
MOD: '%';

LES: '<' ;
GRE: '>' ;
NEG: '!' ;
EQ: '==' ;
NEQ: '!=' ;

AND: '&&' ;
OR: '||' ;

LPARAN: '(';
RPARAN: ')';
LCPARAN: '{';
RCPARAN: '}';
QUOTE: '"';

WS : [ \t\r\n]+ -> skip ;
COMMENT: '/*' .*? '*/' -> skip ;
LINE_COMMENT: '//' ~[\r\n]* -> skip ;