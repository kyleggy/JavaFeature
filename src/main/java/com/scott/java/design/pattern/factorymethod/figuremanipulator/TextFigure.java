package com.scott.java.design.pattern.factorymethod.figuremanipulator;

/**
 * Created by lizhaok on 5/22/2017.
 */
public class TextFigure implements Figure {
    @Override
    public Manipulator createManipulator() {
        return new TextManipulator();
    }
}
