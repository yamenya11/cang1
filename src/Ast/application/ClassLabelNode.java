package Ast.application;


import Ast.Node;

public class ClassLabelNode extends Node {
    private String className;

    public ClassLabelNode(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ClassLabelNode{className='" + className +"'\n}";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}

