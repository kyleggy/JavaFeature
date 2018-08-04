package com.scott.java.design.pattern.structure.bridge.windowsample.window;

import com.scott.java.design.pattern.structure.bridge.windowsample.factory.PMWindowImplFactory;
import com.scott.java.design.pattern.structure.bridge.windowsample.factory.WindowImplFactory;
import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.WindowImpl;

/**
 * Created by lizhaok on 2016/12/13.
 */
public abstract class Window {
    private WindowImpl windowImpl;
    private WindowImplFactory windowImplFactory;

    public Window(WindowImpl windowImpl) {
        this.windowImpl = windowImpl;
    }

    public Window() {

    }

    public void drawText(){
        windowImpl.devDrawText();
        windowImpl.devDrawText();
        windowImpl.devDrawText();
        windowImpl.devDrawText();
    }

    public void drawRect(){
        windowImpl.devDrawLine();
        windowImpl.devDrawLine();
        windowImpl.devDrawLine();
        windowImpl.devDrawLine();
    }

    public WindowImpl getWindowImpl() {
        if (windowImpl == null) {
            windowImplFactory = new PMWindowImplFactory();
        }
        windowImpl = windowImplFactory.createWindowImpl();
        return windowImpl;
    }
}
