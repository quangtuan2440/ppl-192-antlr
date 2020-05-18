grammar Chat;

/*
 * Parser Rules
 */
mc                  : declaration+ EOF ;
declaration         : vardeclar | funcdeclar;

vardeclar           : TYPE_N_ID ';';
funcdeclar          : TYPE ID paramdeclar funcbody;
paramdeclar: '(' (TYPE_N_ID (',' TYPE_N_ID))* ')';

funcbody: '{' ( vardeclar | statement )* '}';
statement: assignment | call | return_statement;

assignment: ID '=' expression ';';
call: ID '(' (expression (',' expression)*)* ')';
return_statement: KEY_RETURN expression;

expression: '(' simple_exp ')' | simple_exp;
simple_exp: operands operators operands;

operators: '+' | '-' | '*' | '/';
// operands: INT | FLOAT | ID | call | expression;
operands: INT | FLOAT | ID | call; 
                                        

/*
 * Lexer Rules
 */
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment NUMBER     : [0-9] ;

ID                  : (LOWERCASE | UPPERCASE)+  ;
TYPE_N_ID: TYPE ID (',' ID)*;
TYPE: TYPE_INT | TYPE_FLOAT;
TYPE_INT: 'int';
TYPE_FLOAT: 'float';
KEY_RETURN: 'return';
INT: NUMBER+;
FLOAT: NUMBER+ '.' NUMBER+;

WS  :   [ \t\n\r]+ -> skip ;