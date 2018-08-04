package com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor;

import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.WindowImpl;
import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.XDraw;

/**
 * Created by lizhaok on 2016/12/13.
 */
public class XWindowImpl implements WindowImpl {
    private XDraw xDraw = new XDraw();

    @Override
    public void devDrawLine() {
        xDraw.xDrawLine();

    }

    @Override
    public void devDrawText() {
        xDraw.xDrawText();
    }
}
