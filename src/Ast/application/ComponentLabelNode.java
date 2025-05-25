    package Ast.application;

    import Ast.Node;
    import Ast.components.ComponentNode;

    public class ComponentLabelNode extends Node {
        private ComponentNode component;

        public ComponentLabelNode(ComponentNode component) {
            this.component = component;
        }

        @Override
        public String toString() {
            return "ComponentLabelNode{" + component + "}";
        }

        @Override
        public void accept(Node visitor) {
            visitor.accept(this);
        }
    }