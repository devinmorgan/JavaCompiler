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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstInterfaceUse) {
            AstInterfaceUse that = (AstInterfaceUse) obj;

            return this.name.equals(that.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
