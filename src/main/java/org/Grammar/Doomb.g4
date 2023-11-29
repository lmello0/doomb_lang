grammar Doomb;

// Parser Rules (grammar)
program:
    declare_block?
    main_block;

declare_block: DECLARE OPEN_CBRACKET (variable_declaration DEL | function_declaration)* CLOSE_CBRACKET;

main_block: MAIN exec_block EOF;

exec_block: OPEN_CBRACKET statement+ CLOSE_CBRACKET;

string: STRING_DEF (CONCAT_OP (STRING_DEF | ID))*;

variable: ID | NUMBER_DEF | INT_DEF | DOUBLE_DEF | BOOLEAN_DEF | string;

variable_declaration: ID COLON TYPE ASSIGN_OP (ID | INT_DEF | DOUBLE_DEF | NUMBER_DEF | BOOLEAN_DEF | string);

function_declaration: ID DOUBLE_COLON parameter_list COLON TYPE OPEN_CBRACKET statement+ CLOSE_CBRACKET;

function_call: ID RIGHT_ARROW function_params;

parameter_list: (TYPE ID (COMMA TYPE ID)*)?;

function_params: ((TYPE | variable) (COMMA (TYPE | variable))*)?;

statement: expr
         | if_statement
         | for_statement
         | while_statement
         | jump_statement
         ;

jump_statement: (CONTINUE
              | BREAK
              | RETURN (expr | string)?
              )
              DEL
              ;

expr:(ID ASSIGN_OP expr | math_expr | variable | function_call) DEL
    | function_call
    | OPEN_PAREN expr CLOSE_PAREN
    | EXCLAMATION expr
    | math_expr
    ;

math_expr: ADD_OP value
         | math_expr (MULT_OP | ADD_OP) math_expr
         | value ADD_OP ADD_OP
         | value
         ;

value: ID
     | INT_DEF
     | DOUBLE_DEF
     | NUMBER_DEF
     | BOOLEAN_DEF
     | OPEN_PAREN math_expr CLOSE_PAREN
     ;

relational_op: NOT_EQUAL_OP
             | EQUAL
             | GT_OP
             | GT_EQUAL_OP
             | LT_OP
             | LT_EQUAL_OP
             ;

bool_op: BOOL_OPERATOR;

if_statement: IF OPEN_PAREN comparation CLOSE_PAREN exec_block (ELSE exec_block)?;

comparation: variable relational_op variable (bool_op variable relational_op variable)?
           | expr relational_op expr
           ;

for_statement: FOR OPEN_PAREN variable_declaration DEL comparation DEL expr CLOSE_PAREN exec_block;

while_statement: WHILE OPEN_PAREN expr CLOSE_PAREN exec_block;

// Lexer rules (tokens)
fragment DIGIT: [0-9];
fragment UPPER: [A-Z];
fragment LOWER: [a-z];

// Keywords
DECLARE: 'declare';
MAIN: 'main';
IF: 'if';
ELSE: 'else';
CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';
FOR: 'for';
WHILE: 'while';
fragment INT: 'int';
fragment DOUBLE: 'double';
fragment NUMBER: 'number';
fragment STR: 'string';
fragment BOOLEAN: 'boolean';
DOUBLE_COLON: '::';
COLON: ':';
RIGHT_ARROW: '->';
EXCLAMATION: '!';
DOUBLE_SLASH: '//';

// Math operators
ADD_OP: '+' | '-';
MULT_OP: '*' | '/';

// Relational Ops
NOT_EQUAL_OP: '!=';
EQUAL: '==';
GT_OP: '>';
GT_EQUAL_OP: '>=';
LT_OP: '<';
LT_EQUAL_OP: '<=';
ASSIGN_OP: '=';
BOOL_OPERATOR: 'and' | 'or';
CONCAT_OP: '||';

// Type definitions
INT_DEF: DIGIT+;
DOUBLE_DEF: DIGIT+ '.' DIGIT+;
NUMBER_DEF: INT_DEF | DOUBLE_DEF;
STRING_DEF: '\'' ~'\''* '\'';
BOOLEAN_DEF: 'TRUE' | 'FALSE';
TYPE: INT | DOUBLE | NUMBER | STR | BOOLEAN;

// Variable naming rule
ID: (LOWER | UPPER) (LOWER | UPPER | '_' | '$')* | ('_' | '$') (LOWER | UPPER | '_' | '$')+;

// Limiters
WHITESPACE: [ \t\r\n]+ -> skip;
DEL: ';';
OPEN_CBRACKET: '{';
CLOSE_CBRACKET: '}';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
COMMA: ',';

// Comment
COMMENT: DOUBLE_SLASH ~[\r\n]* -> skip;