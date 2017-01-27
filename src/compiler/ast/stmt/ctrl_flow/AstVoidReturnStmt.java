package compiler.ast.stmt.ctrl_flow;

import compiler.ast.stmt.AstStmt;
import compiler.ast.type.AstVoidType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstVoidReturnStmt extends AstStmt {
    public AstVoidReturnStmt(int line, int col) {
        super(line, col);
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // verify that the return type of the method is void
        if (! environment.getCurrentScopeReturnType().equals(new AstVoidType(-1, -1))) {
            String message = "Return of type void does not match return type " +
                    "from the method signature " + environment.getCurrentScopeReturnType()
                    + ". Line: " + this.getLine() + "\n";
            errorMessage.append(message);
        }
    }
}
