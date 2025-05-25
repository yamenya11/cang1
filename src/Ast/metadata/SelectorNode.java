package Ast.metadata;

import Ast.Node;

public class SelectorNode extends MetadataEntryNode{
    private String value;

    public SelectorNode(String identifier, String value) {
        super(identifier);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BasicMetadataNode{" +
                "selsctor='" + key + '\'' +'\n'+
                ", value='" + value + '\'' +'\n'+
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
