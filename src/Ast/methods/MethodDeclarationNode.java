package Ast.methods;

import Ast.Node;
import Ast.statements.StatementNode;

import java.util.List;

public class MethodDeclarationNode extends Node {
    private String name;
    private List<ParameterNode> parameters;
    private List<StatementNode> body;
    private String returnType;  //

    public MethodDeclarationNode(String name, List<ParameterNode> parameters, List<StatementNode> body, String returnType) {
        this.name = name;
        this.parameters = parameters;
        this.body = body;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterNode> parameters) {
        this.parameters = parameters;
    }

    public List<StatementNode> getBody() {
        return body;
    }

    public void setBody(List<StatementNode> body) {
        this.body = body;
    }

    public String getReturnType() {
        return returnType;  // getter لنوع الإرجاع
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;  // setter لنوع الإرجاع
    }

    // toString
    @Override
    public String toString() {
        return "MethodDeclarationNode{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                ", body=" + body +
                ", returnType='" + returnType + '\'' +  // طباعة نوع الإرجاع
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
