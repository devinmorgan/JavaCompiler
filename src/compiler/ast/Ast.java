package compiler.ast;

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
}
