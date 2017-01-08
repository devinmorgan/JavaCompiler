package compiler.ast.expr.method;

import compiler.ast.expr.AstExpr;
import compiler.ast.type.AstStringType;
import compiler.ast.type.AstType;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstReadLineExpr extends AstExpr {
    final AstType type = new AstStringType();
}
