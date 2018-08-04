package com.scott.java.design.pattern.factorymethod.figuremanipulator;

/**
 * Created by lizhaok on 5/22/2017.
 */
public class LineManipulator implements Manipulator {
    @Override
    public void downClick() {
        System.out.println("Line Manipulator down click");
    }

    @Override
    public void drag() {
        System.out.println("Line Manipulator drag");
    }

    @Override
    public void upClick() {
        System.out.println("Line Manipulator up click");
    }
}
