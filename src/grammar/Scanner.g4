lexer grammar Scanner;

options
{
  language = 'Java';
  superClass = 'Lexer'; //class DecafScanner extends Lexer;
}

@lexer::header {
    package grammar;
}

// Selectively turns on debug tracing mode.
// You can insert arbitrary Java code into your parser/lexer this way.
@lexer::memebers
{
  /** Whether to display debug information. */
  private boolean trace = false;

  public void setTrace(boolean shouldTrace) {
    trace = shouldTrace;
  }
  @Override
  public void traceIn(String rname) throws CharStreamException {
    if (trace) {
      super.traceIn(rname);
    }
  }
  @Override
  public void traceOut(String rname) throws CharStreamException {
    if (trace) {
      super.traceOut(rname);
    }
  }
}


// comments and white space
WS_ : (' ' | '\t' | '\n' ) -> skip;
BLOCK_COMMENT : '/*' (BLOCK_COMMENT | . )*? '*/' -> skip ;
LINE_COMMENT  : '//' .*? '\n' -> skip ;

// Miscillaneous characters
L_SQUARE : '[';
R_SQUARE : ']';
L_PAREN : '(';
R_PAREN : ')';
L_CURL : '{';
R_CURL : '}';
COMMA : ',';
SEMI_COL :  ';';

// boolean ops
LT_OP : '<';
GT_OP : '>';
LEQ_OP : '<=';
GEQ_OP : '>=';
EQ_OP : '==';
NEQ_OP : '!=';
AND_OP : '&&';
OR_OP : '||';
NOT_OP : '!';

// arithmatic ops
ADD_OP : '+';
SUB_OP : '-';
MUL_OP : '*';
DIV_OP : '/';
MOD_OP : '%';

// assignment ops
AS_OP : '=';

// Reserved words
RES_CLASS : 'class';
RES_PUBLIC : 'public';
RES_STATIC : 'static';
RES_VOID : 'void';
RES_MAIN : 'main';
RES_STRING : 'String';
RES_EXTEND : 'extends';
RES_INT : 'int';
RES_BOOLEAN : 'boolean';
RES_IF : 'if';
RES_RETURN : 'return';
RES_WHILE : 'while';
RES_PRINT : 'System.out.println';
RES_TRUE : 'true';
RES_FALSE : 'false';
RES_THIS : 'this';
RES_NEW : 'new';

// main tokens
STRING : '"' (ESC | ALLOWED_CHARS )* '"';
INT : DIGIT+;
ID : (ALL_LETTERS | '_')(ALL_LETTERS | DIGIT | '_')*;

// fragments
fragment ESC : '\\n' | '\\t' | '\\\\' | '\\"' | '\\\''; //'\\' ('n' | 't' | '\\' | '"' | '\'');
fragment ALLOWED_CHARS : ' '..'!' | '#'..'&' | '('..'[' | ']'..'~' ;
fragment DIGIT : '0'..'9';
fragment ALL_LETTERS : 'a'..'z' | 'A'..'Z';