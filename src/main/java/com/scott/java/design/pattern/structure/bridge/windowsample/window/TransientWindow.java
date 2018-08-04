package com.scott.java.design.pattern.structure.bridge.windowsample.window;

import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.WindowImpl;

/**
 * Created by lizhaok on 2016/12/13.
 */
public class TransientWindow extends Window {

    public TransientWindow(WindowImpl windowImpl) {
        super(windowImpl);
    }

    public TransientWindow() {

    }

    public void drawCloseBox() {
        drawRect();
    }
}
