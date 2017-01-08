package compiler.ast.stmt;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstPrintStmt extends AstStmt{
    final AstExpr arg;

    public AstPrintStmt(int line, int col, AstExpr arg) {
        super(line, col);
        this.arg = arg;
    }
}
