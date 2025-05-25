package Ast.types;

import Ast.Node;

public class ArrayTypeNode extends Node {
    private String elementType;

    public ArrayTypeNode(String elementType) {
        this.elementType = elementType;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    @Override
    public String toString() {
        return "ArrayTypeNode{" +
                "elementType='" + elementType + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
