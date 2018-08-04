package com.scott.java.design.pattern.structure.composite.graphicsample;

/**
 * Created by lizhaok on 2016/12/11.
 */
public class Text extends Graphic {

    public Text(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Text: " + name + " called");
    }
}
