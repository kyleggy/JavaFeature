package com.scott.java.design.pattern.adapter.drawingsample;

/**
 * Created by lizhaok on 2016/8/21.
 */
public class DrawingEditor {

    public static void main(String[] args) {
        Shape textShape = new TextShape(new TextView());
        textShape.BoundingBox();
        textShape.createManipulator().manipulatorShape();

        Shape lineShape = new LineShape(new LineView());
        lineShape.BoundingBox();
        lineShape.createManipulator().manipulatorShape();
    }
}
