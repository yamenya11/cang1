package Ast.html;

import Ast.Node;

public class AngularButtonNode extends Node {
    private String identifier;
    private String expression;
    private String buttonText;

    public AngularButtonNode(String identifier, String expression, String buttonText) {
        this.identifier = identifier;
        this.expression = expression;
        this.buttonText = buttonText;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getExpression() {
        return expression;
    }

    public String getButtonText() {
        return buttonText;
    }

    @Override
    public String toString() {
        return "<button " + identifier + "=\"" + expression + "\">" + buttonText + "</button>";
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
