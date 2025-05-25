package Ast;

import Ast.html.HtmlElementNode;

import java.util.ArrayList;
import java.util.List;

public class TemplateUrlNode extends Node {
    private String templatePath; // مسار ملف القالب
    private List<HtmlElementNode> elementNodes; // قائمة العناصر

    // التهيئة بمسار القالب
    public TemplateUrlNode(String templatePath) {
        this.templatePath = templatePath;
        this.elementNodes = new ArrayList<>();
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public void addElement(HtmlElementNode element) {
        if (this.elementNodes == null) {
            this.elementNodes = new ArrayList<>();
        }
        this.elementNodes.add(element);
    }

    public List<HtmlElementNode> getElements() {
        if (elementNodes == null) {
            elementNodes = new ArrayList<>();
        }
        return elementNodes;
    }

    // البحث عن عنصر بواسطة اسم العلامة
    public HtmlElementNode findElementByTagName(String tagName) {
        for (HtmlElementNode element : elementNodes) {
            if (tagName.equalsIgnoreCase(element.getTagName())) {
                return element;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TemplateUrlNode{templatePath='").append(templatePath).append("', elements=\n");

        for (HtmlElementNode element : elementNodes) {
            sb.append("\t").append(element.toString().replace("\n", "\n\t")).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
        for (HtmlElementNode element : elementNodes) {
            element.accept(visitor);
        }
    }
}
