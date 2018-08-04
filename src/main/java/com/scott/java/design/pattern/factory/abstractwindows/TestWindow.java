package com.scott.java.design.pattern.factory.abstractwindows;

import org.junit.Test;

/**
 * Created by lizhaok on 2016/3/7.
 */
public class TestWindow {

    @Test
    public void testWindow() {
        GUIBuilder guiBuilder = new GUIBuilder();
        guiBuilder.buildWindow(new MSWindowsWidgetFactory());
        guiBuilder.repaint(new MacWindowWidgetFactory());

    }
}
