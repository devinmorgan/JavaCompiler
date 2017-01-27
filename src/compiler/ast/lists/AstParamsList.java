package compiler.ast.lists;

import compiler.ast.Ast;
import compiler.ast.AstParam;
import compiler.ast.type.AstType;
import compiler.symbol_table.SymbolTable;

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

    /**
     * 2 AstParamsLists are equal if they have the same
     * number of params and have the same types of
     * params in the same order
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstParamsList) {
            AstParamsList that = (AstParamsList) obj;

            if (this.paramsList.size() == that.paramsList.size()) {
                for (int i = 0; i < this.paramsList.size(); i++ ) {
                    AstType thisParamType = this.paramsList.get(i).getType();
                    AstType thatParamType = that.paramsList.get(i).getType();

                    if (! thisParamType.equals(thatParamType))
                        return false;
                }

                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (AstParam param : this.paramsList) {
            AstType type = param.getType();
            hash *= type.hashCode();
        }
        return hash;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // validate each parameter individually
        for (AstParam param : this.paramsList) {
            param.performSemanticAnalysis(environment, errorMessage);
        }
    }
}