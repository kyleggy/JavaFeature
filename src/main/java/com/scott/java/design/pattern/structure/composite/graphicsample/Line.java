package com.scott.java.design.pattern.structure.composite.graphicsample;

/**
 * Created by lizhaok on 2016/12/11.
 */
public class Line extends Graphic {


    public Line(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Line: " + name + " called");
    }
}
