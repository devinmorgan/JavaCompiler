parser grammar JavaParser;


options
{
   language = 'Java';
   tokenVocab = 'JavaScanner';
   superClass = 'Parser'; //classes JavaParser extends Parser;
   //buildAST = true;
}


@parser::header {
    package compiler.grammar;
}


// Java glue code that makes error reporting easier.
// You can insert arbitrary Java code into your parser/lexer this way.
@lexer::members
{
 // Do our own reporting of errors so the parser can return a non-zero status
 // if any errors are detected.
 /** Reports if any errors were reported during parse. */
 private boolean error;


 @Override
 public void reportError (RecognitionException ex) {
   // Print the error via some kind of error reporting mechanism.
   error = true;
 }
 @Override
 public void reportError (String s) {
   // Print the error via some kind of error reporting mechanism.
   error = true;
 }
 public boolean getError () {
   return error;
 }


 // Selectively turns on debug mode.


 /** Whether to display debug information. */
 private boolean trace = false;


 public void setTrace(boolean shouldTrace) {
   trace = shouldTrace;
 }
 @Override
 public void traceIn(String rname) throws TokenStreamException {
   if (trace) {
     super.traceIn(rname);
   }
 }
 @Override
 public void traceOut(String rname) throws TokenStreamException {
   if (trace) {
     super.traceOut(rname);
   }
 }
}

program :
    decl+
;

decl
    : var_decl
    | func_decl
    | class_decl
    | interface_decl
;

var_decl
    : type ID (COMMA ID)* SEMI_COL
;

type
    : (RES_INT | RES_BOOLEAN | RES_STRING | ID) array_unit+
    | RES_INT
    | RES_BOOLEAN
    | RES_STRING
    | ID
;

array_unit
    : L_SQUARE R_SQUARE
;

func_decl
    : (type | RES_VOID) ID L_PAREN params? R_PAREN stmt_block
;

params
    : type ID (COMMA type ID)*
;

class_decl
    : RES_CLASS ID parent_class? interface_use? L_CURL (var_decl | func_decl)* R_CURL
;

parent_class
    : RES_EXTENDS ID
;

interface_use
    : RES_IMPLEMENTS ID (COMMA ID)*
;

interface_decl
    : RES_INTERFACE ID L_CURL method_sig* R_CURL
;

method_sig
    : (type | RES_VOID) ID L_PAREN params? R_PAREN SEMI_COL
;

stmt_block
    : L_CURL (var_decl | stmt)* R_CURL
;

stmt
    : expr SEMI_COL #ExprStmt
    | RES_IF L_PAREN expr R_PAREN stmt else_stmt #IfElseStmt
    | RES_IF L_PAREN expr R_PAREN stmt #IfStmt
    | RES_WHILE L_PAREN expr R_PAREN stmt #WhileStmt
    | RES_FOR L_PAREN expr? SEMI_COL expr SEMI_COL expr? R_PAREN stmt #ForStmt
    | RES_BREAK SEMI_COL #BreakStmt
    | RES_CONTINUE SEMI_COL #ContinueStmt
    | RES_RETURN expr SEMI_COL #NonVoidReturnStmt
    | RES_RETURN SEMI_COL #VoidReturnStmt
    | RES_PRINT L_PAREN expr R_PAREN SEMI_COL #PrintStmt
    | stmt_block #CodeBlock
;

else_stmt
    : RES_ELSE stmt
;

expr
    : L_PAREN expr R_PAREN #ParenthExpr
    | SUB_OP expr #NegateExpr
    | NOT_OP expr #NotExpr
    | expr (MUL_OP | DIV_OP | MOD_OP) expr #MultiplicativeExpr
    | expr (ADD_OP | SUB_OP) expr #AdditiveExpr
    | expr (LT_OP | GT_OP | LEQ_OP | GEQ_OP) expr #RelationalExpr
    | expr (EQ_OP | NEQ_OP) expr #EqualityExpr
    | expr AND_OP expr #AndExpr
    | expr OR_OP expr #OrExpr
    | expr AS_OP expr #AssignExpr
    | expr array_struct #ArrayAccessExpr
    | expr DOT method_call #ObjectMethodCall
    | method_call #GlobalMethodCall
    | expr DOT expr #ObjectProperty
    | RES_THIS #ThisExpr
    | RES_NEW (ID | RES_INT | RES_BOOLEAN | RES_STRING) array_struct #NewArrayExpr
    | RES_READ_INT L_PAREN R_PAREN #ReadIntExpr
    | RES_READ_LINE L_PAREN R_PAREN #ReadLineExpr
    | RES_NEW ID L_PAREN R_PAREN #NewObjExpr
    | ID #VarAccessExpr
    | BOOL #BoolLiteralExpr
    | STRING #StringLiteralExpr
    | INT #IntLiteralExpr
    | RES_NULL #NullLiteralExpr
;

method_call
    : ID L_PAREN args? R_PAREN
;

array_struct
    : (L_SQUARE expr R_SQUARE)+
;

args
    : expr (COMMA expr)*
;
