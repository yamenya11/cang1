package Ast.calls;

import Ast.Node;

public class ProductsNode extends Node {
    private String identifier;
    private ElementListNode elementList;

    public ProductsNode(String identifier, ElementListNode elementList) {
        this.identifier = identifier;
        this.elementList = elementList;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public ElementListNode getElementList() {
        return elementList;
    }

    public void setElementList(ElementListNode elementList) {
        this.elementList = elementList;
    }

    @Override
    public String toString() {
        return "ProductsNode{\n" +
                "identifier='\n" + identifier + '\'' +
                ",\nelementList=\n" +'\n'+ elementList + "\n}";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
