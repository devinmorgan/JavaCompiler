package compiler.ast.stmt.ctrl_flow;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstIfStmt extends AstStmt {
    final AstExpr condition;
    final AstStmt thenCode;

    public AstIfStmt(int line, int col, AstExpr condition, AstStmt thenCode) {
        super(line, col);
        this.condition = condition;
        this.thenCode = thenCode;
    }
}
