package Ast.property;

public class LetDeclrationNode extends PropertyDeclarationNode {
    public  String value;

    public LetDeclrationNode(String name, String type, String value) {
        super(name, type);
        this.value = value;
    }
    @Override
    public String toString() {
        return "LetDeclaration{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
