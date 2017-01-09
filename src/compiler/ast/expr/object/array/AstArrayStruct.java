package compiler.ast.expr.object.array;

import compiler.ast.Ast;
import compiler.ast.expr.AstExpr;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstArrayStruct extends Ast {
    final AstExpr offsetArg;

    public AstArrayStruct(AstExpr offsetArg) {
        super(offsetArg.getLine(), offsetArg.getCol());
        this.offsetArg = offsetArg;
    }
}
