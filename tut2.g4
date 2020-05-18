grammar tut2;

/*
 * Parser Rules
 */
mc                  
 : listdeclaration EOF 
 ;

listdeclaration
 : declaration listdeclaration
 | declaration
 |
 ;

declaration         
 : vardeclar 
 | funcdeclar
 ;

type
 : INT
 | FLOAT
 ;

vardeclar           
 : INT listid SM
 | FLOAT listid SM
 ;

listid
 : ID CM listid
 | ID
 ;

funcdeclar          
 : type ID paramdeclar funcbody
 ;

paramdeclar
 : LP listparam RP
 | 
 ;

listparam
 : type listid SM listparam
 | type listid
 ;

funcbody
 : LB bodylist RB
 | LB RB
 ;

bodylist
 : bodycommand bodylist
 | bodycommand
 ;

bodycommand
 : vardeclar
 | statement
 ;

statement
 : assignment 
 | call 
 | return_statement
 ;

assignment
 : ID EQ expression SM
 ;

call
 : ID LP listexpression RP SM
 | ID LP RP SM
 ;

listexpression
 : expression CM listexpression
 | expression
 ;

return_statement
 : KEY_RETURN expression SM
 | KEY_RETURN call
 ;

expression
 : expression1 ADD expression
 | expression1
 ;

expression1
 : expression2 SUB expression2
 | expression2
 ;

expression2
 : expression2 MUL expression3
 | expression3
 ;

expression3
 : expression3 DIV expression4
 | expression4
 ;

expression4
 : INTLIT
 | FLOATLIT
 | ID
 | call
 | subexpression
 ;

subexpression
 : LP expression RP
 ;
// expression
//  : LP simple_exp RP | simple_exp
//  ;

// simple_exp
//  : simple_exp operators simple_exp
//  | operands
//  ;

// operators
//  : ADD 
//  | SUB 
//  | MUL 
//  | DIV
//  ;
// operands: INT | FLOAT | ID | call | expression;

/*
 * Lexer Rules
 */
fragment LOWERCASE  
 : [a-z] 
 ;

fragment UPPERCASE  
 : [A-Z] 
 ;

fragment NUMBER     
 : [0-9] 
 ;

INT
 : 'int'
 ;

FLOAT
 : 'float'
 ;

KEY_RETURN

 : ('return')
 ;

INTLIT
 : NUMBER+
 ;

FLOATLIT
 : NUMBER+ '.' NUMBER+
 ;

ID
 : LOWERCASE (LOWERCASE | UPPERCASE)*  
 ;


LB
   : ('{')
   ;


RB
   : ('}')
   ;

LRB
   : ('[')
   ;


RRB
   : (']')
   ;

LP
   : ('(')
   ;


RP
   : (')')
   ;


ADD
   : ('+')
   ;


SUB
   : ('-')
   ;


MUL
   : ('*')
   ;


DIV
   : ('/')
   ;

EQ
   : ('=')
   ;

CM
   : (',')
   ;

SM
   : (';')
   ;

WS  
 : [ \t\n\r]+ -> skip 
 ;
