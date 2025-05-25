package Ast.statements;
import Ast.Node;
import Ast.expressions.ExpressionNode;

import java.util.List;

public class CaseClauseNode extends Node {
    private ExpressionNode caseExpression;
    private List<StatementNode> statements;
    private boolean isDefault;

    public CaseClauseNode(ExpressionNode caseExpression, List<StatementNode> statements, boolean isDefault) {
        this.caseExpression = caseExpression;
        this.statements = statements;
        this.isDefault = isDefault;
    }

    public ExpressionNode getCaseExpression() {
        return caseExpression;
    }

    public List<StatementNode> getStatements() {
        return statements;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setCaseExpression(ExpressionNode caseExpression) {
        this.caseExpression = caseExpression;
    }

    public void setStatements(List<StatementNode> statements) {
        this.statements = statements;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "CaseClauseNode{" +
                "caseExpression=" + caseExpression +
                ", statements=" + statements +
                ", isDefault=" + isDefault +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
