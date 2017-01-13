package compiler.ast;

import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/9/17.
 */
public class AstParentClass extends Ast {
    final String name;

    public AstParentClass(int line, int col, String name) {
        super(line, col);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstParentClass) {
            AstParentClass that = (AstParentClass) obj;

            return this.name.equals(that.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    /**
     * checkClassesForSemanticErrors() would have already
     * checked whether the parent class is a valid class
     * (i.e. was declared and no cyclic inheritance)
     */
    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        return;
    }

}
