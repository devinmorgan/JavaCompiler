package compiler.ast.stmt.ctrl_flow;

import compiler.ast.stmt.AstStmt;
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
        return;
    }
}
