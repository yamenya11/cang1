package Ast.expressions;

import Ast.Node;

public class MinusExpressionNode extends ExpressionNode  {
String mines;
    public MinusExpressionNode(ExpressionNode left, ExpressionNode right) {
        super();
        addExpression(left);
        addExpression(right);
    }

    @Override
    public void accept(Node visitor) {

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "left=" + expressions.get(0).toString() +
                ", right=" + expressions.get(1).toString() +
                '}';
    }
}
