package compiler.ast.decl;

import compiler.ast.lists.AstInterfaceUseList;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by devinmorgan on 1/7/17.
 */
public class AstClassDecl extends AstDecl {
    final String className;
    String parentClass;
    AstInterfaceUseList implementedInterfaces;
    final HashSet<AstDecl> declsList;

    public AstClassDecl(int line, int col,
                        String className,
                        String parentClass,
                        AstInterfaceUseList implementedInterfaces,
                        HashSet<AstDecl> declsList) {
        super(line, col);
        this.className = className;
        this.parentClass = parentClass;
        this.implementedInterfaces = implementedInterfaces;
        this.declsList = declsList;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AstClassDecl) {
            AstClassDecl that = (AstClassDecl) obj;

            // no 2 classes can have the same name
            return this.className.equals(that.className);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.className.hashCode();
    }
}
