package com.scott.java.design.pattern.structure.decorator.userinterface;

/**
 * Created by lizhaok on 2016/12/18.
 */
public class TextView extends VisualComponent {
    @Override
    public void draw() {
        System.out.println("Text view draw");
    }

    @Override
    public void resize() {
        System.out.println("Text view resize");
    }
}
