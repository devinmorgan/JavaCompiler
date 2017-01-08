package compiler.ast;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstInterfaceUse extends Ast {
    final String name;

    public AstInterfaceUse(int line, int col, String name) {
        super(line, col);
        this.name = name;
    }
}
