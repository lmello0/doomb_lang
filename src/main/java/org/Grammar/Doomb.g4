grammar Doomb;

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
INT: 'int';
DOUBLE: 'double';
NUMBER: 'number';
STRING: 'str';
BOOLEAN: 'boolean';
DOUBLE_COLON: '::';
COLON: ':';
RIGHT_ARROW: '->';
EXCLAMATION: '!';

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

// Parser Rules (grammar)
program:
    declare_block*
    main_block;

declare_block: DECLARE OPEN_CBRACKET declaration* CLOSE_CBRACKET;
// declare { declarations }

main_block: MAIN exec_block EOF;
// main { exec_block }

exec_block: OPEN_CBRACKET statement+ CLOSE_CBRACKET;

type: INT // int
    | DOUBLE // double
    | NUMBER // number
    | STRING // str
    | BOOLEAN // boolean
    ;

string: STRING_DEF (CONCAT_OP (STRING_DEF | ID))*;

variable: ID | NUMBER_DEF | INT_DEF | DOUBLE_DEF | string | BOOLEAN_DEF;

declaration: variable_declaration | function_declaration;

variable_declaration: ID COLON type ASSIGN_OP (ID | INT_DEF | DOUBLE_DEF | NUMBER_DEF | string) DEL;
// height: double = 'asdasd' || weight;

function_declaration: ID DOUBLE_COLON parameter_list COLON type OPEN_CBRACKET statement+ CLOSE_CBRACKET;
// calculateBMI :: double height, double weight : double { statements+ }

function_call: ID RIGHT_ARROW function_params;
// funcao -> variavel, outra_variavel

parameter_list: (type ID (COMMA type ID)*)?;
// int asdasd, int asdasd

function_params: (variable (COMMA variable)*)?;
// variavel, outra_variavel, ...

statement: expr //
         | if_statement // if (variavel == variavel) { statements } else { statements }
         | for_statement // for (expr; variavel == variavel; expr) exec_block
         | while_statement // while (true) exec_block
         | jump_statement
         ;

jump_statement: (CONTINUE // continue;
              | BREAK // break;
              | RETURN (expr | string)? // return; | return variavel; | return 'variavel';
              )
              DEL
              ;

expr:(ID ASSIGN_OP expr // variavel = ;
    | ID ASSIGN_OP math_expr // variavel = 1 + (2 * 3);
    | ID ASSIGN_OP variable // variavel = variavel;
    | ID ASSIGN_OP function_call // variavel = funcao -> outra_variavel, mais_uma_variavel;
    | function_call // putStr -> 'asdasdasd' || asdasd || 'asda';
    ) DEL // ;
    | OPEN_PAREN expr CLOSE_PAREN // ()
    | EXCLAMATION expr // !variavel
    | math_expr // 1 + (2 * 3)
    ;

math_expr: ADD_OP value // -1
         | math_expr MULT_OP math_expr // -1 (*|/) 1 
         | math_expr ADD_OP math_expr // -1 (+|-) 1
         | value // variavel | 123123 | 0.1 | (123123 | 0.1) | (math_expr)
         ;

value: ID
     | INT_DEF
     | DOUBLE_DEF
     | NUMBER_DEF
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
// and | or

if_statement: IF OPEN_PAREN comparation CLOSE_PAREN exec_block (ELSE exec_block)?;
// if (variavel == variavel) { statements } else { statements }

comparation: variable relational_op variable (bool_op variable relational_op variable)?;
// variavel == variavel and variavel2 == variavel2

for_statement: FOR OPEN_PAREN expr DEL comparation DEL expr CLOSE_PAREN exec_block;
// for (expr; variavel == variavel; expr) exec_block

while_statement: WHILE OPEN_PAREN expr CLOSE_PAREN exec_block;
// while (true) exec_block
