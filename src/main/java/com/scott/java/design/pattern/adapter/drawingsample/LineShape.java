package com.scott.java.design.pattern.adapter.drawingsample;

/**
 * Created by lizhaok on 2016/8/22.
 */
public class LineShape extends Shape {
    private LineView lineView;

    public LineShape(LineView lineView) {
        this.lineView = lineView;
    }

    @Override
    public void BoundingBox() {
        lineView.getExtent();
    }

    @Override
    public Manipulator createManipulator() {
        return new LineManipulator();
    }
}
