package Ast.statements;

import Ast.Node;

public class StatementNode extends Node {
    private Node statement; // بيان أو تعبير داخل الجملة (statement)
    public StatementNode(Node statement) {
        this.statement = statement;

    }

    public Node getStatement() {
        return statement;
    }
    public void setStatement(Node statement) {
        this.statement = statement;
    }

    @Override
    public String toString() {
        return "StatementNode{" +
                "statement=" + statement +
                '}';
    }

    @Override
    public void accept( Node visitor) {
        visitor.accept(this);
    }
}
