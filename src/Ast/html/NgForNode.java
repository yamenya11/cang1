package Ast.html;

import Ast.Node;

public class NgForNode extends Node {
    private String expression;

    public NgForNode(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }
    public void setNgForNode(String expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "NgForNode{" +
                "expression='" + expression + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
