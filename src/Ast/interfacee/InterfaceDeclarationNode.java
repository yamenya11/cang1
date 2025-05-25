package Ast.interfacee;
import Ast.Node;
import java.util.List;

public class InterfaceDeclarationNode extends Node {
    private String interfaceName;
    private List<PropertySignatureNode> properties;
    private List<MethodSignatureNode> methods;

    public InterfaceDeclarationNode(String interfaceName, List<PropertySignatureNode> properties, List<MethodSignatureNode> methods) {
        this.interfaceName = interfaceName;
        this.properties = properties;
        this.methods = methods;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public List<PropertySignatureNode> getProperties() {
        return properties;
    }

    public List<MethodSignatureNode> getMethods() {
        return methods;
    }

    @Override
    public String toString() {
        return "InterfaceDeclarationNode{" +
                "interfaceName='" + interfaceName + '\'' +
                ", properties=" + properties +
                ", methods=" + methods +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }


}
