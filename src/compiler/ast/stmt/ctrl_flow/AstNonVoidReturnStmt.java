package compiler.ast.stmt.ctrl_flow;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstNonVoidReturnStmt extends AstStmt {
    final AstExpr returnValue;

    public AstNonVoidReturnStmt(AstExpr returnValue) {
        super(returnValue.getLine(), returnValue.getCol());
        this.returnValue = returnValue;
    }
}
