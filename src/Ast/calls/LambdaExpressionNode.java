package Ast.calls;

import Ast.Node;
import Ast.expressions.ExpressionNode;
import java.util.List;

public class LambdaExpressionNode extends Node {
    private String identifier;
    private List<ExpressionNode> parameters;
    private ExpressionNode functionBody;

    public LambdaExpressionNode(String identifier, ExpressionNode functionBody) {
        this.identifier = identifier;
        this.functionBody = functionBody;
        this.parameters = null;
    }

    public LambdaExpressionNode(List<ExpressionNode> parameters, ExpressionNode functionBody) {
        this.parameters = parameters;
        this.functionBody = functionBody;
        this.identifier = null;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public List<ExpressionNode> getParameters() {
        return parameters;
    }

    public void setParameters(List<ExpressionNode> parameters) {
        this.parameters = parameters;
    }

    public ExpressionNode getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(ExpressionNode functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        String params = (parameters == null || parameters.isEmpty()) ? "" : parameters.toString();
        return "LambdaExpression" + (identifier != null ? " " + identifier : "") + "(" + params + ") => " + functionBody;
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
