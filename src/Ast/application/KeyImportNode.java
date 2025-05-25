package Ast.application;

import Ast.Node;

import java.util.ArrayList;
import java.util.List;

public class KeyImportNode extends Node {
 String Idintifire;

    public KeyImportNode(String idintifire) {
        Idintifire = idintifire;
    }

    @Override
    public String toString() {
        return "KeyImportNode{" +
                "Idintifire=" + Idintifire +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }

}
