package com.scott.java.design.pattern.adapter.treedisplaydelegate;

import com.scott.java.design.pattern.adapter.treedisplaysample.DirectoryTreeDisplayAdapter;

/**
 * Created by lizhaok on 2016/11/19.
 */
public class TreeDisplay {
    private TreeAccessorDelegate delegate;

    public  void setDelegate(TreeAccessorDelegate treeAccessorDelegate){
        this.delegate = treeAccessorDelegate;
    };

    public void display(){

    };

    public void buildTree(Node node) {
        Node childNode = delegate.getChildren(this, node);
        while (childNode.getChildNode() != null) {
            childNode = childNode.getChildNode();
            delegate.createGraphicNode(this, childNode);
            display();
        }
    }

    public static void main(String[] args) {
        TreeDisplay treeDisplay = new TreeDisplay();
        TreeAccessorDelegate treeAccessorDelegate = new DirectoryBrowser(new FileSystemEntity());
        treeDisplay.setDelegate(treeAccessorDelegate);

    }





}
