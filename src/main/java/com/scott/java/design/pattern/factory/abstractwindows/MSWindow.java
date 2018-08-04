package com.scott.java.design.pattern.factory.abstractwindows;

/**
 * Created by lizhaok on 2016/3/7.
 */
public class MSWindow implements AbstractWindow {
    @Override
    public void setTitle(String text) {
        System.out.println("windows title: " + text);
    }

    @Override
    public void repaint() {
        System.out.println("Print windows");
    }
}
