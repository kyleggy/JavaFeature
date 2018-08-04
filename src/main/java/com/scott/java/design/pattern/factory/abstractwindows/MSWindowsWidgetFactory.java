package com.scott.java.design.pattern.factory.abstractwindows;

/**
 * Created by lizhaok on 2016/3/7.
 */
public class MSWindowsWidgetFactory implements AbstractWidgetFactory {
    @Override
    public AbstractWindow createWindow() {
        return new MSWindow();
    }
}
