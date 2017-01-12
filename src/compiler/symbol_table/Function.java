package compiler.symbol_table;

import compiler.ast.AstParam;
import compiler.ast.lists.AstParamsList;

import java.util.ArrayList;

/**
 * Created by devinmorgan on 1/11/17.
 */
public class Function {
    final String name;
    final AstParamsList params;

    public Function(String name, AstParamsList params) {
        this.name = name;
        this.params = params;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * this.params.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Function) {
            Function that = (Function) obj;

            return this.name.equals(that.name)
                    && this.params.equals(that.params);
        }
        return false;
    }
}
