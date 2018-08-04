package com.scott.java.design.pattern.structure.bridge.windowsample.factory;

import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.PMWindowImpl;
import com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor.WindowImpl;

/**
 * Created by lizhaok on 2016/12/13.
 */
public class PMWindowImplFactory implements WindowImplFactory {
    @Override
    public WindowImpl createWindowImpl() {
        return new PMWindowImpl();
    }
}
