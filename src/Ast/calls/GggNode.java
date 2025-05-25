package Ast.calls;

import Ast.Node;
import Ast.expressions.ExpressionNode;

import java.util.List;

public class GggNode extends Node {
    private List<ElementNode> elementList;

    public GggNode(List<ElementNode> elementList) {
        this.elementList = elementList;
    }

    public List<ElementNode> getElementList() {
        return elementList;
    }

    public void setElementList(List<ElementNode> elementList) {
        this.elementList = elementList;
    }

    @Override
    public String toString() {
        return "GggNode with elements:\n " + '\n'+elementList;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
