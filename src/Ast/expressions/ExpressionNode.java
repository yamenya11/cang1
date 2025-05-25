package Ast.expressions;

import Ast.Node;

import java.util.ArrayList;
import java.util.List;

public abstract class ExpressionNode extends Node {
    protected List<ExpressionNode> expressions;
    public ExpressionNode() {
        this.expressions = new ArrayList<>();
    }

    public void addExpression(ExpressionNode expression) {
        expressions.add(expression);
    }

    public List<ExpressionNode> getExpressions() {
        return expressions;
    }
    public abstract void accept(Node visitor);
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "expressions=" + expressions.toString() +'\n'+
                '}';
    }
}
