package Ast.statements;

import Ast.Node;

public class LetVariableDeclarationNode extends Node {
    private String name;
    private String type;
    private String assignedType; // لأن القيمة هي type مو expression

    public LetVariableDeclarationNode(String name, String type, String assignedType) {
        this.name = name;
        this.type = type;
        this.assignedType = assignedType;
    }

    // Getters
    public String getName() { return name; }
    public String getType() { return type; }
    public String getAssignedType() { return assignedType; }

    @Override
    public String toString() {
        return "LetVariableDeclarationNode{let \n" + name +"\n" + ": " + type + " = " + assignedType + '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
