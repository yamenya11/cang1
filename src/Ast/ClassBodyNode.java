package Ast;

import java.util.ArrayList;
import java.util.List;

public class ClassBodyNode extends Node {
    private List<Node> classElements;

    // المُنشئ الافتراضي
    public ClassBodyNode() {
        this.classElements = new ArrayList<>();
    }

    // مُنشئ لتحديد العناصر مباشرة
    public ClassBodyNode(List<Node> classElements) {
        this.classElements = (classElements != null) ? classElements : new ArrayList<>();
    }

    // Getter و Setter
    public List<Node> getClassElements() {
        return classElements;
    }

    public void setClassElements(List<Node> classElements) {
        this.classElements = (classElements != null) ? classElements : new ArrayList<>();
    }

    // إضافة عنصر جديد
    public void addClassElement(Node element) {
        if (element != null) {
            this.classElements.add(element);
        }
    }

    // إزالة عنصر
    public void removeClassElement(Node element) {
        this.classElements.remove(element);
    }





    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ClassBodyNode {\n"+'\n'+'\t');
        if (classElements.isEmpty()) {
            sb.append("No elements available.\n");
        } else {
            for (Node element : classElements) {
                sb.append(element.toString()).append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
