package Ast;

public class VariableNode extends Node {
    private String name;
    private String type;
    private String initialValue;

    public VariableNode(String name, String type, String initialValue) {
        this.name = name;
        this.type = type;
        this.initialValue = initialValue;
    }

    @Override
    public String toString() {
        return "VariableNode{name='" + name + "', type='" + type + "', value='" + initialValue + "'}";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}

