package compiler.ast.decl;

import compiler.ast.lists.AstInterfaceUseList;
import compiler.symbol_table.SymbolTable;

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

    public String getClassName() {
        return this.className;
    }

    public HashSet<AstDecl> getDeclsList() {
        return this.declsList;
    }

    public String getParentClass() {
        return this.parentClass;
    }

    public AstInterfaceUseList getImplementedInterfaces() {
        return this.implementedInterfaces;
    }

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

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // create a new local scope
        environment.pushNewScope();

        // validate each field and method in the class
        for (AstDecl decl : this.declsList) {
            decl.performSemanticAnalysis(environment, errorMessage);
        }

        // remove the current local scope
        environment.popLocalScope();
    }
}
