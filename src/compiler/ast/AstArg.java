package compiler.ast;

import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstArg extends Ast {
    final AstExpr value;

    public AstArg(int line, int col, AstExpr value) {
        super(line, col);
        this.value = value;
    }
}
