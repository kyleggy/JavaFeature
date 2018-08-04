package com.scott.java.design.pattern.adapter.treedisplaydelegate;

/**
 * Created by lizhaok on 2016/8/22.
 */
public class Node {
    private Node childNode;
    private String value;

    public Node(String value) {
        this.value = value;
    }

    public Node getChildNode() {
        return childNode;
    }

    public void setChildNode(Node childNode) {
        this.childNode = childNode;
    }

}
