package Ast.interfacee;
import Ast.Node;

public class PropertySignatureNode extends Node {
    private String propertyName;
    private String propertyType;

    public PropertySignatureNode(String propertyName, String propertyType) {
        this.propertyName = propertyName;
        this.propertyType = propertyType;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public String getPropertyType() {
        return propertyType;
    }

    @Override
    public String toString() {
        return "PropertySignatureNode{" +
                "propertyName='" + propertyName + '\'' +
                ", propertyType='" + propertyType + '\'' +
                '}';
    }



    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}

