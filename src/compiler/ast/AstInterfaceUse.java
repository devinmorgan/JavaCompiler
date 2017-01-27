package compiler.ast;

import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstInterfaceUse extends Ast {
    final String name;

    public AstInterfaceUse(int line, int col, String name) {
        super(line, col);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstInterfaceUse) {
            AstInterfaceUse that = (AstInterfaceUse) obj;

            return this.name.equals(that.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    /**
     * Use redundancy and declaration validity should already have gotten
     * checked in SymbolTable.checkClassesforSemanticErrors() so we don't
     * need to do anything here
     */
    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        return;
    }
}
