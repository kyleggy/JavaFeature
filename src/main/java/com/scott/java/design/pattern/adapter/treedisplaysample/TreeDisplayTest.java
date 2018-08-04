package com.scott.java.design.pattern.adapter.treedisplaysample;

import org.junit.Test;

/**
 * Created by lizhaok on 2016/8/22.
 */
public class TreeDisplayTest {

    @Test
    public void testTreeDisplay() {
        TreeDisplayClientTarget treeDisplayClientTarget = new DirectoryTreeDisplayAdapter(new FileSystemEntityAdaptee());
        treeDisplayClientTarget.BuildTree(new Node("Hi"));
    }
}
