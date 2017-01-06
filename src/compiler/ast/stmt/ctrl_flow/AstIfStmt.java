package compiler.ast.stmt.ctrl_flow;

import compiler.ast.stmt.AstStmt;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstIfStmt extends AstStmt {
    final AstExpr condition;
    final AstStmt thenCode;
}
