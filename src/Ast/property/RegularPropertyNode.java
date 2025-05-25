package Ast.property;

import Ast.expressions.ExpressionNode;

public class RegularPropertyNode extends PropertyDeclarationNode{
    public final ExpressionNode initializer; // يمكن أن يكون null

    public RegularPropertyNode(String name, String type, ExpressionNode initializer) {
        super(name, type);
        this.initializer = initializer;
    }
    @Override
    public String toString() {
        return "RegularProperty{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", initializer=" + (initializer != null ? initializer.toString() : "null") +
                '}';
    }

}
