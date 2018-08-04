package com.scott.java.design.pattern.adapter.treedisplaydelegate;

import java.io.File;

/**
 * Created by lizhaok on 2016/11/19.
 */
public class DirectoryBrowser implements TreeAccessorDelegate {
    FileSystemEntity fileSystemEntity;

    public DirectoryBrowser(FileSystemEntity fileSystemEntity) {
        this.fileSystemEntity = fileSystemEntity;
    }
    @Override
    public Node getChildren(TreeDisplay treeDisplay, Node node) {
        return null;
    }

    @Override
    public Node createGraphicNode(TreeDisplay treeDisplay, Node node) {
        return null;
    }

    public File createFile() {
        return fileSystemEntity.createFile();
    }

    public void deleteFile() {
        fileSystemEntity.deleteFile();
    }


}
