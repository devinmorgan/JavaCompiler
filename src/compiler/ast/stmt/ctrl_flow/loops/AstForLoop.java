package compiler.ast.stmt.ctrl_flow.loops;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;
import compiler.ast.type.AstBoolType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstForLoop extends AstStmt{
    final AstExpr condtion;
    AstExpr startExpr;
    AstExpr incrementExpr;
    final AstStmt forBody;

    public AstForLoop(int line, int col,
                      AstExpr condition,
                      AstExpr startExpr,
                      AstExpr incrementExpr,
                      AstStmt forBody) {
        super(line, col);
        this.condtion = condition;
        this.startExpr = startExpr;
        this.incrementExpr = incrementExpr;
        this.forBody = forBody;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // semantically validate the initial expr (if it exists)
        if (this.startExpr != null) this.startExpr.performSemanticAnalysis(environment, errorMessage);

        // semantically validate the condition
        this.condtion.performSemanticAnalysis(environment, errorMessage);

        // semantically validate the incrementer expr (if it exists)
        if (this.incrementExpr != null) this.incrementExpr.performSemanticAnalysis(environment, errorMessage);

        // verify that the condition expr is a boolean
        if (!(this.condtion.getType() instanceof AstBoolType)) {
            String message = "For loop condition must be of type boolean. Line " + this.condtion.getType() + "\n";
        }

        // enter the loop body
        environment.enterLoop();

        // semantically validate the forBody
        this.forBody.performSemanticAnalysis(environment, errorMessage);

        // exit the loop body
        environment.exitLoop();
    }
}
