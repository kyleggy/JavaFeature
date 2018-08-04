package com.scott.java.design.pattern.factory.abstractwindows;

/**
 * Created by lizhaok on 2016/3/7.
 */
public class MacWindow implements AbstractWindow {
    @Override
    public void setTitle(String text) {
        System.out.println("Mac title: " + text);
    }

    @Override
    public void repaint() {
        System.out.println("Mac repaint");
    }
}
