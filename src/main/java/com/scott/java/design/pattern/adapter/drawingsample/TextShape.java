package com.scott.java.design.pattern.adapter.drawingsample;

/**
 * Created by lizhaok on 2016/8/22.
 */
public class TextShape extends Shape {
    TextView textView;

    TextShape(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void BoundingBox() {
        textView.getExtent();
    }

    @Override
    public Manipulator createManipulator() {
        return  new TextManipulator();
    }
}
