package Ast.declarations;

import Ast.ClassBodyNode;
import Ast.Node;
import Ast.methods.MethodDeclarationNode;
import Ast.interfacee.PropertyDeclarationNode;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclarationNode extends Node {
    private String className;
    private String superClass;
    private List<Node> classBodyElements;


    public ClassDeclarationNode(String className, String superClass, List<Node> classBodyElements) {
        this.className = className;
        this.superClass = superClass;
        this.classBodyElements = classBodyElements;
    }

    // Getter و Setter
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSuperClass() {
        return superClass;
    }

    public void setSuperClass(String superClass) {
        this.superClass = superClass;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClassDeclarationNode {\n");
        sb.append("  className='").append(className).append("'\n");
        sb.append("  superClass='").append(superClass).append("'\n");
        sb.append("  classBodyElements:\n");
        for (Node node : classBodyElements) {
            sb.append("    ").append(node.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
