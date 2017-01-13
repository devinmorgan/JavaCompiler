package compiler.ast.type;

import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstArrayType extends AstNonVoidType {
    final AstNonVoidType type;
    final int dimensions;

    public AstArrayType(AstNonVoidType type, int dimensions) {
        super(type.getLine(), type.getCol());
        this.type = type;
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        String str = this.type.toString();
        for (int i = 0; i < this.dimensions; i++) {
            str += "[]";
        }
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstArrayType) {
            AstArrayType that = (AstArrayType) obj;

            return this.type.equals(that.type)
                    && this.dimensions == that.dimensions;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.dimensions * this.type.hashCode();
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // validate the AstNonVoidType
        this.type.performSemanticAnalysis(environment, errorMessage);

        if (this.dimensions <= 0) {
            throw new RuntimeException("Array dimensions are 0 or fewer for an array. Whaaaa?");
        }
    }
}
