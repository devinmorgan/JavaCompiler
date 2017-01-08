package compiler.ast.expr.object.array;

import compiler.ast.expr.AstExpr;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstArrayAccess extends AstExpr {
    final AstArraySruct offsetParams;
    final AstExpr arrayObject;
}
