package Ast.calls;

import Ast.Node;
import Ast.expressions.ExpressionNode;

import Ast.Node;


import Ast.Node;

public class PairNode extends Node {
    private String key;
    private String value;

    public PairNode(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PairNode{" +
                "key='\n" + key + '\'' +"\n"+
                ", value=\n" + value +"\n"+
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
