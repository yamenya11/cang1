package Ast;

import Ast.methods.ParameterNode;
import Ast.statements.StatementNode;

import java.util.List;

public class SelectedProductNode extends Node {
    String name;
    private List<ParameterNode> parameters;
    private boolean isVoid;
    private List<StatementNode> statements;

    public SelectedProductNode(String name, List<ParameterNode> parameters, List<StatementNode> statements) {
       this.name=name;
        this.parameters = parameters;
        this.statements = statements;
        this.isVoid = false;
    }

    // Setters و Getters
    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParameters(List<ParameterNode> parameters) {
        this.parameters = parameters;
    }

    public boolean isVoid() {
        return isVoid;
    }

    public void setVoid(boolean isVoid) {
        this.isVoid = isVoid;
    }

    public List<StatementNode> getStatements() {
        return statements;
    }

    public void setStatements(List<StatementNode> statements) {
        this.statements = statements;
    }

    // إضافة معطيات Metadata
    public void addMetaData(String description) {
        System.out.println("MetaData: " + description);
    }

    // تعديل التابع toString لعرض كافة البيانات بشكل أفضل
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
                sb. append("SelectedProductNode {")
                .append("\n name").append(name)
                .append("\n  Parameters: ").append(parameters)
                .append("\n  Is Void: ").append(isVoid)
                .append("\n  Statements: ")
        ;


        sb.append("\n}");
        return sb.toString();
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
