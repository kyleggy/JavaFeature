package com.scott.java.design.pattern.structure.bridge.windowsample.client;

import com.scott.java.design.pattern.structure.bridge.windowsample.factory.PMWindowImplFactory;
import com.scott.java.design.pattern.structure.bridge.windowsample.factory.WindowImplFactory;
import com.scott.java.design.pattern.structure.bridge.windowsample.factory.XWindowImplFactory;
import com.scott.java.design.pattern.structure.bridge.windowsample.window.IconWindow;
import com.scott.java.design.pattern.structure.bridge.windowsample.window.TransientWindow;
import com.scott.java.design.pattern.structure.bridge.windowsample.window.Window;
import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.PMWindowImpl;
import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.WindowImpl;
import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.XWindowImpl;
import org.junit.Test;

/**
 * Created by lizhaok on 2016/12/13.
 */
public class WindowClient {

    @Test
    public void testWindow() {
        WindowImpl windowImpl;
        windowImpl = new PMWindowImpl();
        IconWindow window = new IconWindow(windowImpl);
        window.drawBorder();

        //run time change
        windowImpl = new XWindowImpl();
        TransientWindow transientWindow = new TransientWindow(windowImpl);
        transientWindow.drawCloseBox();

    }

    @Test
    public void testUseFactoryImplementor() {
        WindowImplFactory windowImplFactory;
        windowImplFactory = new PMWindowImplFactory();
        callFactory(windowImplFactory);
        windowImplFactory = new XWindowImplFactory();
        callFactory(windowImplFactory);

    }

    public void callFactory(WindowImplFactory windowImplFactory) {
        IconWindow iconWindow = new IconWindow(windowImplFactory.createWindowImpl());
        iconWindow.drawBorder();

        TransientWindow transientWindow = new TransientWindow(windowImplFactory.createWindowImpl());
        transientWindow.drawCloseBox();
    }

    @Test
    public void testGetImplWindow() {
        IconWindow iconWindow = new IconWindow();
        iconWindow.getWindowImpl();
        iconWindow.drawBorder();
    }
}
