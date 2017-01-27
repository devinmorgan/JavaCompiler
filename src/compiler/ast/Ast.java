package compiler.ast;

import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public abstract class Ast {
    final int line;
    final int col;

    public Ast(int line, int col) {
        this.line = line;
        this.col = col;
    }

    public int getLine() {
        return line;
    }

    public int getCol() {
        return col;
    }

    public abstract void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage);
}
