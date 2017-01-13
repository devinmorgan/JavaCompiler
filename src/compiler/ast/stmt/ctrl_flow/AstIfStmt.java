package compiler.ast.stmt.ctrl_flow;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;
import compiler.ast.type.AstBoolType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstIfStmt extends AstStmt {
    final AstExpr condition;
    final AstStmt thenCode;

    public AstIfStmt(int line, int col, AstExpr condition, AstStmt thenCode) {
        super(line, col);
        this.condition = condition;
        this.thenCode = thenCode;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // semantically validate the condition expression
        this.condition.performSemanticAnalysis(environment, errorMessage);

        // verify that the condition expr is a boolean
        if (!(this.condition.getType() instanceof AstBoolType)) {
            String message = "The condition for if-stmt must be of type boolean. Line: " + this.getLine() + "\n";
            errorMessage.append(message);
        }

        // semantically validate the thenCode
        this.thenCode.performSemanticAnalysis(environment, errorMessage);
    }
}
