package compiler.ast.stmt;

import compiler.ast.expr.AstExpr;
import compiler.ast.stmt.AstStmt;
import compiler.ast.type.AstBoolType;
import compiler.ast.type.AstIntType;
import compiler.ast.type.AstStringType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstPrintStmt extends AstStmt{
    final AstExpr arg;

    public AstPrintStmt(int line, int col, AstExpr arg) {
        super(line, col);
        this.arg = arg;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // validate the argument
        this.arg.performSemanticAnalysis(environment, errorMessage);

        // print stmts can only accept ints, booleans, or Strings
        if (!(this.arg.getType() instanceof AstIntType)
                && !(this.arg.getType() instanceof AstBoolType)
                && !(this.arg.getType() instanceof AstStringType)) {
            String message = "Invalid argument for print(). Valid arguments must be int, " +
                    "boolean, or String. Line: " + this.arg.getLine() + "\n";
            errorMessage.append(message);
        }
    }
}
