package Ast.application;

import Ast.Node;

public class ImportLabelNode extends Node {
    private String importStatement;

    public ImportLabelNode(String importStatement) {
        this.importStatement = importStatement;
    }

    @Override
    public String toString() {
        return "ImportLabelNode{importStatement='" + importStatement + "'}";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this); // يقوم الزائر بزيارة العقدة هذه
    }
}