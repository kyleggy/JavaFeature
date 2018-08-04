package com.scott.java.design.pattern.structure.bridge.windowsample.windowimplementor;

/**
 * Created by lizhaok on 2016/12/13.
 */
public class PMWindowImpl implements WindowImpl {
    private PMDraw pmDraw = new PMDraw();


    @Override
    public void devDrawLine() {
        pmDraw.pmDrawLine();

    }

    @Override
    public void devDrawText() {
        pmDraw.pmDrawText();
    }
}
