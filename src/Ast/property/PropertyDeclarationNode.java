package Ast.property;

import Ast.Node;
import Ast.expressions.ExpressionNode;

import java.util.ArrayList;
import java.util.List;

public abstract  class PropertyDeclarationNode extends Node {
    public  String name;
    public  String type;

    public PropertyDeclarationNode(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "PropertyDeclarationNode{name='\n" + name +
                "type='\n"+type+
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
