package org.javarush;

public class Node {
    private int id;
    private int value;
    private Node left;
    private Node right;

    public Node(int id, int value, Node left, Node right) {
        this.id = id;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
