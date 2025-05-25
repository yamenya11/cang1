package Ast.html;

import Ast.Node;

import java.util.ArrayList;
import java.util.List;

public class HtmlContentNode extends Node {
    private List<Node> children = new ArrayList<>();

    public void addChild(Node child) {
        children.add(child);
    }

    public List<Node> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "HtmlContentNode{" +
                "children=" + children +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
