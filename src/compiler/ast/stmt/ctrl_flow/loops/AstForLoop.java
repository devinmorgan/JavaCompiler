package compiler.ast.stmt.ctrl_flow.loops;

import compiler.ast.stmt.AstStmt;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstForLoop extends AstStmt{
    final AstExpr condtion;
    AstExpr startExpr;
    AstExpr incrementExpr;
    final Stmt forBody;


}
