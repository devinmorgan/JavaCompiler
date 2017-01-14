package compiler.ast.expr.unary.bool;

import compiler.ast.expr.AstExpr;
import compiler.ast.expr.unary.AstUnaryExpr;
import compiler.ast.type.AstBoolType;
import compiler.ast.type.AstType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstNotExpr extends AstUnaryExpr {
    public AstNotExpr(int line, int col, AstExpr arg) {
        super(line, col, arg);
    }

    @Override
    public AstType getType() {
        // verify that the type of the expression is boolean
        AstBoolType booleanType = new AstBoolType(-1, -1);
        if (! this.arg.getType().equals(booleanType)) {
            throw new UnaryExpressionArgumentMismatch(booleanType, this.arg.getType());
        }
        return booleanType;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // semantically validate the argExpr
        this.arg.performSemanticAnalysis(environment, errorMessage);

        // verify that the argExpr is a boolean type
        if (! this.arg.getType().equals(new AstBoolType(-1, -1))) {
            String message = "The ! operator requires a boolean type but found "
                    + this.arg.getType() + ". Line: " + this.getLine() +  "\n";
            errorMessage.append(message);
        }
    }
}
