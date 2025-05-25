package Ast.calls;
import Ast.Node;
import Ast.expressions.ExpressionNode;
import java.util.List;

public class FunctionCallNode extends Node {
    private String functionName;
    private List<ExpressionNode> arguments;

    // المُنشئ
    public FunctionCallNode(String functionName, List<ExpressionNode> arguments) {
        this.functionName = functionName;
        this.arguments = arguments;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }

    public void setArguments(List<ExpressionNode> arguments) {
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        return "Function Call: " + functionName + "(" + arguments + ")";
    }

    @Override
    public void accept( Node visitor) {
        visitor.accept(this);
    }
}
