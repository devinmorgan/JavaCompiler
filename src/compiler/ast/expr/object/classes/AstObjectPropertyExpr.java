package compiler.ast.expr.object.classes;

import compiler.ast.expr.AstExpr;
import compiler.ast.expr.AstVarLocationExpr;
import compiler.ast.type.AstIdType;
import compiler.ast.type.AstNonVoidType;
import compiler.ast.type.AstType;
import compiler.symbol_table.SymbolTable;

/**
 * Created by devinmorgan on 1/5/17.
 */
public class AstObjectPropertyExpr extends AstExpr {
    final AstExpr object;
    final AstExpr property;
    private AstNonVoidType propertyType;
    private String propertyName;

    public AstObjectPropertyExpr(AstExpr object, AstExpr property) {
        super(object.getLine(), object.getCol());
        this.object = object;
        this.property = property;
    }

    @Override
    public AstType getType() {
        if (this.propertyType == null) {
            throw new UnknownVariableTypeException(this.propertyName);
        }
        return this.propertyType;
    }

    @Override
    public void performSemanticAnalysis(SymbolTable environment, StringBuilder errorMessage) {
        // verify that .property was an ID and thus is an AstVarLocationExpr
        if (!(this.property instanceof AstVarLocationExpr)) {
            String message = "Invalid use of the object.property accessor. The" +
                    " property must a valid field for some valid class only " +
                    "accessed from within that class. Line: " + this.getLine() + "\n";
            errorMessage.append(message);
        }
        else {
            AstVarLocationExpr propertyField = (AstVarLocationExpr) this.property;

            // verify that object is the type of some valid class
            if (!(this.object.getType() instanceof AstIdType)) {
                String message = "Invalid use of the object.property accessor. The" +
                        " object must an instance of some valid class and the property can only " +
                        "accessed from within that class. Line: " + this.getLine() + "\n";
                errorMessage.append(message);
            }
            else {
                AstIdType objectType = (AstIdType) this.object.getType();
                String currentClassName = environment.getNameOfCurrentClass();

                // verify that .property is only being accessed from inside a class
                if (currentClassName == null) {
                    String message = "Invalid use of the object.property accessor. It can " +
                            "only accessed from within the class that object is an " +
                            "instance of. Line: " + this.getLine() + "\n";
                    errorMessage.append(message);
                }

                // verify that object the .property is being used in the class that we are currently in
                else if (! objectType.getTypeName().equals(currentClassName)) {
                    String message = "Invalid use of the object.property accessor. It can " +
                            "only accessed from within the class that object is an " +
                            "instance of. Line: " + this.getLine() + "\n";
                    errorMessage.append(message);
                }

                else {
                    AstNonVoidType propertyType = environment.getTypeForFieldOfClass(
                            propertyField.getVarName(), currentClassName
                    );

                    // verify that .property is a declared field of the current class
                    if (propertyType != null) {
                        String message = "Invalid object.property access. The property "
                                + propertyField.getVarName() + " is not a property of the class "
                                + currentClassName + ". Line: " + this.getLine() + "\n";
                        errorMessage.append(message);
                    }

                    // everything checks out so determine the property's type
                    else {
                        this.propertyName = propertyField.getVarName();
                        this.propertyType = propertyType;
                    }
                }
            }
        }

    }

}
