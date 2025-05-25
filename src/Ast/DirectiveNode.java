package Ast;

import Ast.expressions.ExpressionNode;

public class DirectiveNode extends Node{
    private String directiveName;
    private String expression;





    public DirectiveNode(String directiveName, String expression) {
        this.directiveName = directiveName;
        this.expression = expression;
    }
    public String getCname() {
        return directiveName;
    }

    public String getexprition() {
        return expression;
    }

    @Override
    public String toString() {
        return directiveName + ": " + expression;
    }
    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
