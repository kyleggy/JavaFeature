package com.scott.java.design.pattern.adapter.treedisplaydelegate;

/**
 * Created by lizhaok on 2016/11/19.
 */
public interface TreeAccessorDelegate {

    public Node getChildren(TreeDisplay treeDisplay, Node node);

    public Node createGraphicNode(TreeDisplay treeDisplay, Node node);


}
