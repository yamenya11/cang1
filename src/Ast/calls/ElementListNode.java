package Ast.calls;

import Ast.Node;

import java.util.List;

public class ElementListNode extends Node {
    private List<ElementNode> elements;

    public ElementListNode(List<ElementNode> elements) {
        this.elements = elements;
    }

    public List<ElementNode> getElements() {
        return elements;
    }

    public void setElements(List<ElementNode> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("ElementListNode {\n");
        for (ElementNode element : elements) {
            builder.append("  ").append(element).append("\n");
        }
        builder.append("}");
        return builder.toString();
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
