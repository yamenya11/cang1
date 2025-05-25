package Ast.metadata;

import Ast.Node;
import java.util.List;

public class MetadataNode extends Node {
    private List<MetadataEntryNode> entries;

    public MetadataNode(List<MetadataEntryNode> entries) {
        this.entries = entries;
    }

    public List<MetadataEntryNode> getEntries() {
        return entries;
    }

    public void setEntries(List<MetadataEntryNode> entries) {
        this.entries = entries;
    }

    @Override
    public String toString() {
        return "MetadataNode{" + "entries=" + entries + '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
