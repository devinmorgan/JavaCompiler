package compiler.ast.stmt.ctrl_flow.loops;

import compiler.ast.stmt.AstStmt;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstContinueStmt extends AstStmt {

    public AstContinueStmt(int line, int col) {
        super(line, col);
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // verify that the break stmt is currently in a for or while loop
        if (!environment.isCurrentlyInALoop()) {
            String message = "Continue stmt found outside of a for or while loop. Line " + this.getLine();
            errorMessage.append(message);
        }
    }
}
