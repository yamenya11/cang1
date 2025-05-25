package Ast.declarations;

import Ast.ClassBodyNode;
import Ast.Node;
import Ast.methods.MethodDeclarationNode;
import Ast.interfacee.PropertyDeclarationNode;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclarationNode extends Node {
    private String className;  // اسم الفئة
    private String superClass; // اسم الفئة الأساسية (إذا كانت الوراثة موجودة)
    private String classBodyElements  ;
    // Constructor
    public ClassDeclarationNode(String className, String superClass,String classBodyElements) {
        this.className = className;
        this.superClass = superClass;
        this.classBodyElements=classBodyElements;
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

    public String getClassBodyElements() {
        return classBodyElements;
    }

    public void setClassBodyElements(String classBodyElements) {
        this.classBodyElements = classBodyElements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClassDeclarationNode{")
                .append("className='\n").append(className).append('\''+'\n')
                .append(", superClass='\n").append(superClass).append('\''+'\n');

        // إضافة classBodyElements في التمثيل النصي
        if (classBodyElements != null && !classBodyElements.isEmpty()) {
            sb.append(", classBodyElements=\n").append(classBodyElements);
        } else {
            sb.append(", classBodyElements=[]"+'\n');
        }

        sb.append('}');
        return sb.toString();
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
