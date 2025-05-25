package Ast.property;

public class EmptyArrayNode extends PropertyDeclarationNode {
    public EmptyArrayNode(String name, String type) {
        super(name, type);
    }
    @Override
    public String toString() {
        return "EmptyArrayDeclaration{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
