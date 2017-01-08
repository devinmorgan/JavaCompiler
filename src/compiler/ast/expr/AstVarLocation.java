package compiler.ast.expr;

import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstVarLocation extends AstExpr {
    final String varName;

    public AstVarLocation(int line, int col, String varName) {
        super(line, col);
        this.varName = varName;
    }
}
