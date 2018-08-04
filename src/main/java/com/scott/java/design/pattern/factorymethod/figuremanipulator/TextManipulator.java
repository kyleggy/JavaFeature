package com.scott.java.design.pattern.factorymethod.figuremanipulator;

/**
 * Created by lizhaok on 5/22/2017.
 */
public class TextManipulator implements Manipulator {
    @Override
    public void downClick() {
        System.out.println("Text Manipulator down click");
    }

    @Override
    public void drag() {
        System.out.println("Text Manipulator drag");
    }

    @Override
    public void upClick() {
        System.out.println("Text Manipulator up click");
    }
}
