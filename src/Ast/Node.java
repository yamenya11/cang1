package Ast;

public abstract class Node {
    public abstract void accept(Node visitor);
}