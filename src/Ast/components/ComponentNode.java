package Ast.components;

import Ast.Node;
import Ast.metadata.MetadataEntryNode;
import Ast.metadata.MetadataNode;

import java.util.List;

public class ComponentNode extends Node {
    private String componentName;
    private List<MetadataEntryNode> metadata;

    public ComponentNode(String componentName,List<MetadataEntryNode> metadata) {
        this.componentName = componentName;
        this.metadata = metadata;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public List<MetadataEntryNode> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<MetadataEntryNode> metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "ComponentNode{" +
                "componentName='\n" + componentName +"\n"+ '\'' +
                ", metadata=' \n" + metadata +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
