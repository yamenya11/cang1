package Ast.statements;

import Ast.Node;
import Ast.expressions.ExpressionNode;

import java.util.List;

public class WhileStatementNode extends Node {
    private ExpressionNode condition;
    private List<StatementNode> body;

    public WhileStatementNode(ExpressionNode condition, List<StatementNode> body) {
        this.condition = condition;
        this.body = body;
    }

    public ExpressionNode getCondition() {
        return condition;
    }

    public void setCondition(ExpressionNode condition) {
        this.condition = condition;
    }

    public List<StatementNode> getBody() {
        return body;
    }

    public void setBody(List<StatementNode> body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "WhileStatementNode{" +
                "condition=" + condition +
                ", body=" + body +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
