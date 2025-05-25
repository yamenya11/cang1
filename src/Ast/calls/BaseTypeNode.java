package Ast.calls;

import Ast.Node;
import Ast.expressions.ExpressionNode;

import Ast.Node;

public class BaseTypeNode extends Node {
    private String baseType;

    public BaseTypeNode(String baseType) {
        this.baseType = baseType;
    }

    public String getBaseType() {
        return baseType;
    }

    @Override
    public String toString() {
        return "BaseTypeNode{" +
                "baseType='" + baseType + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
