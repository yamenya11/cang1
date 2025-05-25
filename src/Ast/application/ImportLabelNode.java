package Ast.application;

import Ast.Node;

public class ImportLabelNode extends Node {
    private String importStatement;

    public ImportLabelNode(String importStatement) {
        this.importStatement = importStatement;
    }

    @Override
    public String toString() {
        return "ImportLabelNode{importStatement='\n" + importStatement + "\n'}";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}