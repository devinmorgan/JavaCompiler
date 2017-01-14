package compiler.ast.expr;

import compiler.ast.expr.AstExpr;
import compiler.ast.type.AstType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstVarLocationExpr extends AstExpr {
    final String varName;
    private AstType varType;

    public String getVarName() {
        return this.varName;
    }

    public AstVarLocationExpr(int line, int col, String varName) {
        super(line, col);
        this.varName = varName;
    }

    @Override
    public AstType getType() {
        if (this.varType == null) {
            throw new UnknownVariableTypeException(this.varName);
        }
        return this.varType;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // grab this variables type from the environtment
        this.varType = environment.lookupVariableType(this.varName);

        // verify that the variable has been declared (i.e. it should have a type)
        if (this.varType == null) {
            String message = "Variable " + this.varName
                    + " is used before it is has been declared. Line: " + this.getLine() + "\n";
            errorMessage.append(message);
        }
    }
}
