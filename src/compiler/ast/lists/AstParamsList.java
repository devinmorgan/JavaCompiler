package compiler.ast.lists;

import compiler.ast.Ast;
import compiler.ast.AstParam;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstParamsList extends Ast {
    final ArrayList<AstParam> paramsList;

    public AstParamsList(int line, int col, ArrayList<AstParam> paramsList) {
        super(line, col);
        this.paramsList = paramsList;
    }
}
