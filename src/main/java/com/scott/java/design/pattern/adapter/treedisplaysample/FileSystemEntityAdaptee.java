package com.scott.java.design.pattern.adapter.treedisplaysample;

/**
 * Created by lizhaok on 2016/8/22.
 */
public class FileSystemEntityAdaptee {

    public GraphicNode createEntity() {
        return new GraphicNode("Graphic Node");
    }
}
