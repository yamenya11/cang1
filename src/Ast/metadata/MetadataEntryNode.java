package Ast.metadata;

import Ast.Node;

// الكلاس MetadataEntryNode ككلاس عادي (غير abstract)
public class MetadataEntryNode extends Node {
    protected String key;

    public MetadataEntryNode(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "MetadataEntryNode{" +
                "key='" + key + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
