package Ast.expressions;

import Ast.Node;

public class PlusExpressionNode extends ExpressionNode{

    public PlusExpressionNode(ExpressionNode left, ExpressionNode right) {
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
                "left=" + expressions.get(0).toString() +'\n'+
                ", right=" + expressions.get(1).toString() +'\n'+
                '}';
    }
}
