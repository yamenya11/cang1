package Ast.statements;

import Ast.Node;
import Ast.expressions.ExpressionNode;

import java.util.List;

public class IfStatementNode extends Node {
    private ExpressionNode condition;
    private List<StatementNode> statements;
    private List<StatementNode> elseStatements;

    public IfStatementNode(ExpressionNode condition, List<StatementNode> statements, List<StatementNode> elseStatements) {
        this.condition = condition;
        this.statements = statements;
        this.elseStatements = elseStatements;
    }

    // Getters
    public ExpressionNode getCondition() {
        return condition;
    }

    public List<StatementNode> getStatements() {
        return statements;
    }

    public List<StatementNode> getElseStatements() {
        return elseStatements;
    }
    public void setCondition(ExpressionNode condition) {
        this.condition = condition;
    }

    public void setStatements(List<StatementNode> statements) {
        this.statements = statements;
    }

    public void setElseStatements(List<StatementNode> elseStatements) {
        this.elseStatements = elseStatements;
    }
    @Override
    public String toString() {
        return "IfStatementNode{" +
                "condition=" + condition +
                ", statements=" + statements +
                ", elseStatements=" + elseStatements +
                '}';
    }
    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
