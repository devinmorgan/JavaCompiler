package compiler.ast.decl;

import compiler.ast.Ast;
import compiler.ast.type.AstNonVoidType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstVarDecl extends AstDecl {
    final String name;
    final AstNonVoidType type;

    public AstVarDecl(int line, int col, String name, AstNonVoidType type) {
        super(line, col);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public AstNonVoidType getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstVarDecl) {
            AstVarDecl that = (AstVarDecl) obj;

            return this.name.equals(that.name)
                    && this.type.equals(that.type);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * this.type.hashCode();
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // check if the variable has already been declared
        if (environment.addVariableDeclarationToLocalScope(this.name, this.type, errorMessage)) {

            // check the validity of the AstNonVoidType
            this.type.performSemanticAnalysis(environment, errorMessage);
        }
    }

}
