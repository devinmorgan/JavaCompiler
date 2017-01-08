package compiler.ast.expr.object.array;

import compiler.ast.Ast;
import compiler.ast.expr.AstExpr;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstArrayStruct extends Ast {
    final ArrayList<AstExpr> dimensionsList;

    public AstArrayStruct(int line, int col, ArrayList<AstExpr> dimensionsList) {
        super(line, col);
        this.dimensionsList = dimensionsList;
    }
}
