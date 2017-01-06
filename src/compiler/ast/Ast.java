package compiler.ast;

/**
 * Created by devinmorgan on 1/5/17.
 */
public abstract class Ast {
    final int line;
    final int column;

    Ast(int line, int column) {
        this.line = line;
        this.column = column;
    }
}
