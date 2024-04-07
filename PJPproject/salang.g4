grammar salang;

prog: stat+ EOF;


stat
    : LCPARAN stat (stat)* RCPARAN #paranStat
    | primitive_type ID (COMA ID)* SEMI #declarationOfVariable
    | IF LPARAN expr RPARAN pos=stat (ELSE neg=stat)? #ifStat
    | WHILE LPARAN expr RPARAN stat #whileLoop
    | FOR LPARAN expr SEMI expr SEMI expr RPARAN stat #forLoop
    | READ ID (COMA ID)* SEMI #readStat
    | WRITE expr (COMA expr)* SEMI #writeStat
    | expr SEMI #exprStat
    | SEMI #semiStat
    ;

expr 
    : ID #idExpr
    | LPARAN expr RPARAN #paranExpr
    | BOOL_VAL #boolExpr
    | INT_VAL #intExpr
    | FLOAT_VAL #floatExpr
    | STRING_VAL #stringExpr
    | prefix=SUB expr #subExpr
    | prefix=NEG expr #negExpr
    | expr op=(MUL|DIV|MOD) expr #mulDivModExpr
    | expr op=(ADD|SUB|CON) expr #addSubConExpr
    | expr op=(LES|GRE) expr #lesGreExpr
    | expr op=(EQ|NEQ) expr #eqNeqExpr
    | expr op=AND expr #andExpr
    | expr op=OR expr #orExpr
    | <assoc=right> ID ASSIGN expr #assignExpr
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
FOR: 'for';

READ: 'read';
WRITE: 'write';

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

ID: [a-zA-Z] ([a-zA-Z0-9]*)?;

WS : [ \t\r\n]+ -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;

