package compiler.ast.type;

import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstIdType extends AstNonVoidType {
    final String typeName; // class name OR interface name

    public AstIdType(int line, int col, String typeName) {
        super(line, col);
        this.typeName = typeName;
    }

    public String getTypeName() {
        return this.typeName;
    }

    @Override
    public String toString() {
        return this.typeName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstIdType) {
            AstIdType that = (AstIdType) obj;

            return this.typeName.equals(that.typeName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.typeName.hashCode();
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        if (! environment.isIdADeclaredClassOrInterface(this.typeName)) {
            String message = "Invalid param type. No declared class or interface "
                    + this.typeName + ". Line: " + this.getLine() + "\n";
            errorMessage.append(message);
        }
    }
}
