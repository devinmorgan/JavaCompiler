package compiler.ast.expr;

import compiler.ast.expr.binary.AstBinaryExpr;
import compiler.ast.type.AstType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstAssignExpr extends AstExpr{
    final AstExpr storeLoc;
    final AstExpr value;

    public AstAssignExpr(AstExpr storeLoc, AstExpr value) {
        super(storeLoc.getLine(), storeLoc.getCol());
        this.storeLoc = storeLoc;
        this.value = value;
    }

    @Override
    public AstType getType() {
        if (! this.storeLoc.getType().equals(this.value.getType())) {
            throw new BinaryExpressionTypeMismatch(this.storeLoc.getType(), this.value.getType());
        }
        return this.storeLoc.getType();
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // semantically validate the lhs
        this.storeLoc.performSemanticAnalysis(environment, errorMessage);

        // semantically validate the rhs
        this.value.performSemanticAnalysis(environment, errorMessage);

        // verify that the lhs and the rhs have the same type
        if (! this.storeLoc.getType().equals(this.value.getType())) {
            String message = "Evaluated type of rhs of assignment does " +
                    "not match the type on the lhs. Line: " + this.getLine();
            errorMessage.append(message);
        }
    }
}
