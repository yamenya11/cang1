package Ast.application;

import Ast.Node;

import java.util.List;

public class ImportStatementNode extends Node {
    private String imported;
    private String source;
    private String key;
    List<KeyImportNode>app;

    public ImportStatementNode(String imported, String source,String key, List<KeyImportNode>app) {
        this.imported = imported;
        this.source = source;
        this.key=key;
       this.app = app;
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
                "imported='" + imported + '\'' +
                ", source='" + source + '\'' +
                ", key='" + key + '\'' +
                ", app=" + app +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
