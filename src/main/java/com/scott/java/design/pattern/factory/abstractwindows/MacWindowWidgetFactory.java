package com.scott.java.design.pattern.factory.abstractwindows;

/**
 * Created by lizhaok on 2016/3/7.
 */
public class MacWindowWidgetFactory implements AbstractWidgetFactory {
    @Override
    public AbstractWindow createWindow() {
        return new MacWindow();
    }
}
