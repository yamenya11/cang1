package Ast.application;

import Ast.Node;

import java.util.ArrayList;
import java.util.List;

public class ApplicationNode extends Node {
    private List<Node> applicationnode=new ArrayList<>();

    public ApplicationNode(List<Node> applicationnode) {
        this.applicationnode = applicationnode;
    }


    public void setApplicationnode(List<Node> applicationnode) {
        this.applicationnode = applicationnode;
    }



    @Override
    public String toString() {
        return "ApplicationNode{" +
                "applicationnode=" + applicationnode +
                '}';
    }

    public List<Node> getApplicationnode() {
        return applicationnode;
    }
    @Override
    public void accept(Node visitor) {
        StringBuilder sb =new StringBuilder();
        sb.append(visitor).append("classbody:\n");

        visitor.accept(this);
    }
}
