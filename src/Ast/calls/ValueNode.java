package Ast.calls;

import Ast.Node;
import Ast.expressions.ExpressionNode;

public class ValueNode extends Node {
    private String value;

    public ValueNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ValueNode{" + "value='" + value + "'}";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
