package com.scott.java.design.pattern.factorymethod.figuremanipulator;

/**
 * Created by lizhaok on 5/22/2017.
 */
public class LineFigure implements Figure {
    @Override
    public Manipulator createManipulator() {
        return new LineManipulator();
    }
}
