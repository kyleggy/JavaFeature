package com.scott.java.design.pattern.adapter.drawingsample;

/**
 * Created by lizhaok on 2016/8/21.
 */
public abstract class Shape {

    public abstract void BoundingBox();

    public abstract Manipulator createManipulator();
}
