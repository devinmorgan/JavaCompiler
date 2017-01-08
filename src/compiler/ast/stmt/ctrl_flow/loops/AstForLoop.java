package compiler.ast.stmt.ctrl_flow.loops;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstForLoop extends AstStmt{
    final AstExpr condtion;
    AstExpr startExpr;
    AstExpr incrementExpr;
    final AstStmt forBody;

    public AstForLoop(int line, int col,
                      AstExpr condition,
                      AstExpr startExpr,
                      AstExpr incrementExpr,
                      AstStmt forBody) {
        super(line, col);
        this.condtion = condition;
        this.startExpr = startExpr;
        this.incrementExpr = incrementExpr;
        this.forBody = forBody;
    }

}
