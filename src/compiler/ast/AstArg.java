package compiler.ast;

import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstArg extends Ast {
    final AstExpr value;

    public AstArg(AstExpr value) {
        super(value.getLine(), value.getCol());
        this.value = value;
    }
}
