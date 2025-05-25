package Ast.methods;

import java.util.List;

import Ast.Node;

public class ConstructorNode extends Node {
    private String name;
    private List<Node> parameters;
    private List<Node> statements;


    public ConstructorNode(String name, List<Node>  parameters, List<Node>  statements) {
        this.name = name;
        this.parameters = parameters;
        this.statements = statements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node>  getParameters() {
        return parameters;
    }

    public void setParameters(List<Node>  parameters) {
        this.parameters = parameters;
    }

    public List<Node>  getStatements() {
        return statements;
    }

    public void setStatements(List<Node>  statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConstructorNode{\n");
        sb.append("  name='").append(name).append("'\n");
        sb.append("  parameters:\n");
        for (Node param : parameters) {
            sb.append("    ").append(param).append("\n");
        }
        sb.append("  statements:\n");
        for (Node stmt : statements) {
            sb.append("    ").append(stmt).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }


    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
