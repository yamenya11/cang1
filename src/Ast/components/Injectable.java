package Ast.components;

import Ast.Node;
import Ast.declarations.ClassDeclarationNode;
import Ast.metadata.MetadataNode;


public class Injectable extends Node {
    private MetadataNode metadata;
    //private ClassDeclarationNode classDeclaration;
String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Injectable(MetadataNode metadata, String name) {
        this.metadata = metadata;
       // this.classDeclaration = classDeclaration;
        this.name=name;
    }

    public MetadataNode getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataNode metadata) {
        this.metadata = metadata;
    }



    @Override
    public String toString() {
        return "Injectable{" +
                "metadata=" + metadata +
              //  ", classDeclaration=" + classDeclaration +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
