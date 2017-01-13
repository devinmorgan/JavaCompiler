package compiler.ast.stmt.ctrl_flow;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;
import compiler.ast.type.AstBoolType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstIfElseStmt extends AstIfStmt{
    final AstStmt elseCode;

    public AstIfElseStmt(int line, int col, AstExpr condition, AstStmt thenCode, AstStmt elseCode) {
        super(line, col, condition, thenCode);
        this.elseCode = elseCode;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        super.performSemanticAnalysis(environment, errorMessage);

        // semantically validate the elseCode
        this.elseCode.performSemanticAnalysis(environment, errorMessage);
    }
}
