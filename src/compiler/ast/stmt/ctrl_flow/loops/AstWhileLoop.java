package compiler.ast.stmt.ctrl_flow.loops;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstWhileLoop extends AstStmt{
    final AstExpr condtion;
    final AstStmt whileBody;
}
