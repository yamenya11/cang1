package Ast.methods;

import java.util.List;

import Ast.Node;

public class ConstructorNode extends Node {
    private String name;
    private List<String> parameters;
    private List<String> statements;

    public ConstructorNode(String name, List<String> parameters, List<String> statements) {
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

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public List<String> getStatements() {
        return statements;
    }

    public void setStatements(List<String> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "ConstructorNode{" +
                "name='\n" + name +'\n'+ '\'' +
                ", parameters=\n" + parameters +'\n'+
                ", statements=\n" + statements +'\n'+
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
