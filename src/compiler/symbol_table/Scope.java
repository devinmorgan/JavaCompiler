package compiler.symbol_table;

import compiler.ast.type.AstType;

import java.util.HashMap;

/**
 * Created by devinmorgan on 1/13/17.
 */
public class Scope {
    final HashMap<String, AstType> variables = new HashMap<>();
    final AstType returnType;
    final String className;
    boolean currentlyInALoop = false;

    public Scope() {
        this.returnType = null;
        this.className = null;
    }

    public Scope(AstType returnType) {
        this.returnType = returnType;
        this.className = null;
    }

    public Scope(String className) {
        this.className = className;
        this.returnType = null;
    }

    public void enterLoop() {
        this.currentlyInALoop = true;
    }

    public void exitLoop() {
        this.currentlyInALoop = false;
    }
}
