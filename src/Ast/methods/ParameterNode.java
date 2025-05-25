package Ast.methods;

import Ast.Node;

public class ParameterNode extends Node {
    private String name;
    private String type;
    private String modifier;

    public ParameterNode(String name, String type, String modifier) {
        this.name = name;
        this.type = type;
        this.modifier = modifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    // toString
    @Override
    public String toString() {
        return "ParameterNode{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", modifier='" + modifier + '\'' +
                '}';
    }

    // Accept method for visitor pattern
    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
