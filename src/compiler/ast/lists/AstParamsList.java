package compiler.ast.lists;

import compiler.ast.Ast;
import compiler.ast.AstParam;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstParamsList extends Ast {
    final ArrayList<AstParam> paramsList = new ArrayList<>();

    public AstParamsList(int line, int col) {
        super(line, col);
    }

    public void addParam(AstParam param) {
        this.paramsList.add(param);
    }
}
