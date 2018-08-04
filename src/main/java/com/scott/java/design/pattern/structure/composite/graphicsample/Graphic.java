package com.scott.java.design.pattern.structure.composite.graphicsample;

import java.util.List;

/**
 * Created by lizhaok on 2016/12/11.
 */
public abstract class Graphic {
   protected String name;

    public Graphic(String name) {
        this.name = name;
    }

    public Graphic add(Graphic child) {
        return null;
    }

    public Graphic remove(Graphic child) {
        return null;
    }

    public Graphic getChild(int index) {
        return null;
    }

    public abstract void draw();
}
