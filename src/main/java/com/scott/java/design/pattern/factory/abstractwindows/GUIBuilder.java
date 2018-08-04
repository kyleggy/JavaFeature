package com.scott.java.design.pattern.factory.abstractwindows;

/**
 * Created by lizhaok on 2016/3/7.
 */
public class GUIBuilder {

    public void buildWindow(AbstractWidgetFactory factory) {
        AbstractWindow abstractWindow = factory.createWindow();
        abstractWindow.setTitle("New Window");
        abstractWindow.repaint();
    }

    public void repaint(AbstractWidgetFactory  factory) {
        AbstractWindow abstractWindow = factory.createWindow();
        abstractWindow.repaint();
    }
}
