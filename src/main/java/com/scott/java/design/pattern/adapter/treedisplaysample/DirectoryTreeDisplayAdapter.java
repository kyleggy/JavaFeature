package com.scott.java.design.pattern.adapter.treedisplaysample;

/**
 * Created by lizhaok on 2016/8/22.
 */
public class DirectoryTreeDisplayAdapter extends TreeDisplayClientTarget {
    FileSystemEntityAdaptee fileSystemEntityAdaptee;

    DirectoryTreeDisplayAdapter(FileSystemEntityAdaptee fileSystemEntityAdaptee) {
        this.fileSystemEntityAdaptee = fileSystemEntityAdaptee;
    }

    @Override
    public Node getChildren(Node node) {
        return null;
    }

    @Override
    public Node createGraphicNode(Node node) {
        return  fileSystemEntityAdaptee.createEntity();

    }
}
