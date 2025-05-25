package Ast.html;

import Ast.Node;

public class NgIfNode extends Node {
    private String expression;

    public NgIfNode(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }
    public void setNgIfNode(String expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "NgIfNode{" +
                "expression='" + expression + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
