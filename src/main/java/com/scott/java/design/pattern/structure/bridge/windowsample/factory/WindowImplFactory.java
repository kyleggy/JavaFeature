package com.scott.java.design.pattern.structure.bridge.windowsample.factory;

import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.WindowImpl;

/**
 * Created by lizhaok on 2016/12/13.
 */
public interface WindowImplFactory {

    public WindowImpl createWindowImpl();
}
