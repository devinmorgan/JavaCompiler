package compiler.ast;

import compiler.ast.expr.AstExpr;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstArg extends Ast {
    final AstExpr value;

    public AstArg(AstExpr value) {
        super(value.getLine(), value.getCol());
        this.value = value;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        this.value.performSemanticAnalysis(environment, errorMessage);
    }
}
