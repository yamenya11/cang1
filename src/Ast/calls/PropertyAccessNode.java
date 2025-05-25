package Ast.calls;

import Ast.Node;

public class PropertyAccessNode extends Node {
    private String property;
    private Node object;

    public PropertyAccessNode(String property, Node object) {
        this.property = property;
        this.object = object;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Node getObject() {
        return object;
    }

    public void setObject(Node object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "PropertyAccessNode{" +
                "property='" + property + '\'' +
                ", object=" + object +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
