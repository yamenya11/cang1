package Ast.metadata;

import Ast.Node;
import Ast.html.HtmlElementNode;
import java.util.List;

// HtmlMetadataNode يجب أن يرث من MetadataEntryNode
public class HtmlMetadataNode extends MetadataEntryNode {
    private List<HtmlElementNode> body;

    public HtmlMetadataNode(String key, List<HtmlElementNode> body) {
        super(key);  // استخدام الـ constructor الأب
        this.body = body;
    }

    public List<HtmlElementNode> getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "HtmlMetadataNode{" +
                "key='" + key + '\'' +  // نستخدم key من class الأب MetadataEntryNode
                ", body=" + body +
                '}';
    }

    @Override
    public void accept(Node visitor) {
        visitor.accept(this);
    }
}
