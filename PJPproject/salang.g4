grammar salang;

prog: stat+ EOF;


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
    | LPARAN expr RPARAN
    | BOOL_VAL
    | INT_VAL
    | FLOAT_VAL
    | STRING_VAL
    | prefix=SUB expr
    | prefix=NEG expr
    | expr op=(MUL|DIV|MOD) expr
    | expr op=(ADD|SUB|CON) expr
    | expr op=(LES|GRE) expr
    | expr op=(EQ|NEQ) expr
    | expr AND expr
    | expr OR expr
    | <assoc=right> ID '=' expr
    ;

primitive_type
   : type=INT
   | type=FLOAT
   | type=STRING
   | type=BOOL
   ;

STRING_VAL: '"' StringCharacters? '"';
fragment StringCharacters: StringCharacter+;
fragment StringCharacter: ~["\\\r\n] | EscapeSequence;

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

SEMI:  ';';
COMA:  ',';

INT:    'int';
FLOAT:  'float';
STRING: 'string';
BOOL: 'bool';

IF: 'if';
ELSE: 'else';

WHILE: 'while';

READ: 'read';
WRITE: 'write';

ID: [a-zA-Z] ([a-zA-Z0-9]*)?;

FLOAT_VAL: [0-9]+'.'[0-9]+;
INT_VAL: [0-9]+; 
BOOL_VAL: ('true'|'false');

ASSIGN: '=';

MUL: '*'; 
DIV: '/';
ADD: '+';
SUB: '-';
MOD: '%';
CON: '.';

LES: '<' ;
GRE: '>' ;
NEG: '!' ;
EQ: '==' ;
NEQ: '!=';

AND: '&&' ;
OR: '||' ;

LPARAN: '(';
RPARAN: ')';
LCPARAN: '{';
RCPARAN: '}';

WS : [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;