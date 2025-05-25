package Ast.interfacee;
import Ast.Node;
import java.util.List;
import Ast.methods.ParameterNode;

public class MethodSignatureNode extends Node {
    private String methodName;
    private List<ParameterNode> parameters;
    private String returnType;

    public MethodSignatureNode(String methodName, List<ParameterNode> parameters, String returnType) {
        this.methodName = methodName;
        this.parameters = parameters;
        this.returnType = returnType;
    }

    public String getMethodName() {
        return methodName;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public String getReturnType() {
        return returnType;
    }

    @Override
    public String toString() {
        return "MethodSignatureNode{" +
                "methodName='" + methodName + '\'' +
                ", parameters=" + parameters +
                ", returnType='" + returnType + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
