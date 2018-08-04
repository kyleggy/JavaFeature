package com.scott.java.design.pattern.structure.bridge.draw;

/**
 * Created by lizhaok on 6/11/2017.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
