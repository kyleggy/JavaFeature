package com.scott.java.design.pattern.structure.composite.graphicsample;

/**
 * Created by lizhaok on 2016/12/11.
 */
public class Rectangle extends Graphic {

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: " + name + " called");
    }
}
