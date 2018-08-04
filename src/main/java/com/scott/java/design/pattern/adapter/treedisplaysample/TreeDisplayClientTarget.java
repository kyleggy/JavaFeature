package com.scott.java.design.pattern.adapter.treedisplaysample;

/**
 * Created by lizhaok on 2016/8/22.
 */
public abstract class TreeDisplayClientTarget {

    public abstract Node getChildren(Node node);

    public abstract Node createGraphicNode(Node node);

    public void display() {

    };

    public void BuildTree(Node node){
        getChildren(node);
        createGraphicNode(node);
    }


}
