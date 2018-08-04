package com.scott.java.design.pattern.structure.decorator.userinterface;

import org.junit.Test;

/**
 * Created by lizhaok on 2016/12/18.
 */
public class TestDecorator {

    @Test
    public void testDecorator() {
        Windows windows = new Windows();
        windows.setComponent(new ScrollDecorator(new BorderDecorator(new TextView(), 5), Scroll.up));
        windows.resize();
        windows.draw();
    }
}
