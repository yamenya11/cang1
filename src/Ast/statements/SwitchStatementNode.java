package Ast.statements;

import Ast.Node;
import Ast.expressions.ExpressionNode;
import java.util.List;

public class SwitchStatementNode extends Node {
    private ExpressionNode expression;
    private List<CaseClauseNode> cases;

    public SwitchStatementNode(ExpressionNode expression, List<CaseClauseNode> cases) {
        this.expression = expression;
        this.cases = cases;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public void setExpression(ExpressionNode expression) {
        this.expression = expression;
    }

    public List<CaseClauseNode> getCases() {
        return cases;
    }

    public void setCases(List<CaseClauseNode> cases) {
        this.cases = cases;
    }

    @Override
    public String toString() {
        return "SwitchStatementNode{" +
                "expression=" + expression +
                ", cases=" + cases +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
