package compiler.ast.stmt.ctrl_flow.loops;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstWhileLoop extends AstStmt{
    final AstExpr condtion;
    final AstStmt whileBody;

    public AstWhileLoop(int line, int col, AstExpr condtion, AstStmt whileBody) {
        super(line, col);
        this.condtion = condtion;
        this.whileBody = whileBody;
    }
}
