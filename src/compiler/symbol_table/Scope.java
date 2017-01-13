package compiler.symbol_table;

import compiler.ast.type.AstType;

import java.util.HashMap;

/**
 * Created by devinmorgan on 1/13/17.
 */
public class Scope {
    final HashMap<String, AstType> variables = new HashMap<>();
    final AstType returnType;

    public Scope() {
        this.returnType = null;
    }

    public Scope(AstType returnType) {
        this.returnType = returnType;
    }
}
