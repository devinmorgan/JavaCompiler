package compiler.ast;

import compiler.ast.type.AstNonVoidType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstParam extends Ast {
    final AstNonVoidType type;
    final String name;

    public AstParam(AstNonVoidType type, String name) {
        super(type.getLine(), type.getCol());
        this.type = type;
        this.name = name;
    }

    public AstNonVoidType getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    /**
     * 2 AstParams are equivalent IFF they have the same name
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstParam) {
            AstParam that = (AstParam) obj;

            return this.name.equals(that.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // check if the param has already been declared
        if (environment.addVariableDeclarationToLocalScope(this.name, this.type, errorMessage)) {

            // check the validity of the AstNonVoidType
            this.type.performSemanticAnalysis(environment, errorMessage);
        }
    }
}
