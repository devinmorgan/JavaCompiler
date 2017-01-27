package compiler.ast.stmt.ctrl_flow;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstNonVoidReturnStmt extends AstStmt {
    final AstExpr returnValue;

    public AstNonVoidReturnStmt(AstExpr returnValue) {
        super(returnValue.getLine(), returnValue.getCol());
        this.returnValue = returnValue;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // semantically validate the return expression
        this.returnValue.performSemanticAnalysis(environment, errorMessage);

        // verify that the type of the return expression matches the method type
        if (! environment.getCurrentScopeReturnType().equals(this.returnValue.getType())) {
            String message = "Type of return value " + this.returnValue.getType()
                    + " does not match return type from the method signature "
                    + environment.getCurrentScopeReturnType() + ". Line " + this.getLine() + "\n";
            errorMessage.append(message);
        }
    }
}
