package Ast.types;


import Ast.Node;

public class BaseTypeNode extends Node {
    private String baseType;

    public BaseTypeNode(String baseType) {
        this.baseType = baseType;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
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

