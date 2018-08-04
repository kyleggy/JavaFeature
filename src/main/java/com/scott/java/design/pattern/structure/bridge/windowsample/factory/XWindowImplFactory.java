package com.scott.java.design.pattern.structure.bridge.windowsample.factory;

import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.WindowImpl;
import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.XWindowImpl;

/**
 * Created by lizhaok on 2016/12/13.
 */
public class XWindowImplFactory implements WindowImplFactory {
    @Override
    public WindowImpl createWindowImpl() {
        return new XWindowImpl();
    }
}
