package com.scott.java.design.pattern.adapter.drawingsample;

/**
 * Created by lizhaok on 2016/8/22.
 */
public class TextManipulator implements Manipulator {

    @Override
    public void manipulatorShape() {
        System.out.println("Text manipulator");
    }
}
