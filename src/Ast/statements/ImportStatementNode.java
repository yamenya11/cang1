package Ast.statements;

import Ast.Node;

public class ImportStatementNode extends Node {
    private String imported;
    private String source;
    private String key;


    public ImportStatementNode(String imported, String source,String key) {
        this.imported = imported;
        this.source = source;
        this.key=key;
    }

    // Getter and Setter for imported
    public String getImported() {
        return imported;
    }

    public void setImported(String imported) {
        this.imported = imported;
    }

    // Getter and Setter for source
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "ImportStatementNode{" +
                "imported='" + imported + '\n' +
                ", source='" + source + '\n' +
                ",key='"+key+'\n'+
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
