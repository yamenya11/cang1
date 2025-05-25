package Ast.application;

import Ast.Node;

public class InjectableLabelNode extends Node {
    private String injectableName;

    public InjectableLabelNode(String injectableName) {
        this.injectableName = injectableName;
    }

    @Override
    public String toString() {
        return "InjectableLabelNode{injectableName='" + injectableName + "'}";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
