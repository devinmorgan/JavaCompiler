package compiler.ast.stmt.ctrl_flow.loops;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;
import compiler.ast.type.AstBoolType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstWhileLoop extends AstStmt{
    final AstExpr condition;
    final AstStmt whileBody;

    public AstWhileLoop(int line, int col, AstExpr condition, AstStmt whileBody) {
        super(line, col);
        this.condition = condition;
        this.whileBody = whileBody;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // semantically validate the condition expression
        this.condition.performSemanticAnalysis(environment, errorMessage);

        // verify that the condition expr is a boolean
        if (!(this.condition.getType() instanceof AstBoolType)) {
            String message = "The condition for while loop must be of type boolean. Line: " + this.getLine() + "\n";
            errorMessage.append(message);
        }

        // enter the loop body
        environment.enterLoop();

        // semantically validate the forBody
        this.whileBody.performSemanticAnalysis(environment, errorMessage);

        // exit the loop body
        environment.exitLoop();
    }
}
