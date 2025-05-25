package Ast.html;

import Ast.Node;

public class EventBindingNode extends Node {
    private String eventName;
    private String expression;

    public EventBindingNode(String eventName, String expression) {
        this.eventName = eventName;
        this.expression = expression;
    }

    public String getEventName() {
        return eventName;
    }

    public String getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "EventBindingNode{" +
                "eventName='" + eventName + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
