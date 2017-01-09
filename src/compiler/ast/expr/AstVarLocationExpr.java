package compiler.ast.expr;

import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstVarLocationExpr extends AstExpr {
    final String varName;

    public AstVarLocationExpr(int line, int col, String varName) {
        super(line, col);
        this.varName = varName;
    }
}
