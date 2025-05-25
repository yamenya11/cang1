package Ast.statements;
import Ast.Node;

import java.util.List;

public class LoopStatementNode extends Node {
    private String identifier;
    private String inIdentifier;
    private List<StatementNode> statements;

    // Constructor
    public LoopStatementNode(String identifier, String inIdentifier, List<StatementNode> statements) {
        this.identifier = identifier;
        this.inIdentifier = inIdentifier;
        this.statements = statements;
    }

    // Getter and Setter for 'identifier'
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    // Getter and Setter for 'inIdentifier'
    public String getInIdentifier() {
        return inIdentifier;
    }

    public void setInIdentifier(String inIdentifier) {
        this.inIdentifier = inIdentifier;
    }

    // Getter and Setter for 'statements'
    public List<StatementNode> getStatements() {
        return statements;
    }

    public void setStatements(List<StatementNode> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return "LoopStatementNode{" +
                "identifier='" + identifier + '\'' +
                ", inIdentifier='" + inIdentifier + '\'' +
                ", statements=" + statements +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
