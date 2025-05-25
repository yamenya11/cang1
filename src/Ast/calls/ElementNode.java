package Ast.calls;

import Ast.Node;
import java.util.List;

public class ElementNode extends Node {
    private List<PairNode> pairs;

    public ElementNode(List<PairNode> pairs) {
        this.pairs = pairs;
    }

    public List<PairNode> getPairs() {
        return pairs;
    }

    public void setPairs(List<PairNode> pairs) {
        this.pairs = pairs;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("ElementNode {\n");
        for (PairNode pair : pairs) {
            builder.append("  ").append(pair).append("\n");
        }
        builder.append("}");
        return builder.toString();
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
