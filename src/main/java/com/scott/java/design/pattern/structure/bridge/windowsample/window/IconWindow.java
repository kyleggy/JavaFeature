package com.scott.java.design.pattern.structure.bridge.windowsample.window;

import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.WindowImpl;

/**
 * Created by lizhaok on 2016/12/13.
 */
public class IconWindow extends Window {

    public IconWindow(WindowImpl windowImpl) {
        super(windowImpl);
    }

    public IconWindow() {

    }
    public void drawBorder() {
        super.drawRect();
        super.drawText();
    }
}
