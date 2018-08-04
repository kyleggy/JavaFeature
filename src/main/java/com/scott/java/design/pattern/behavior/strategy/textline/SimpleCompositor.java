package com.scott.java.design.pattern.behavior.strategy.textline;

/**
 * Created by lizhaok on 1/29/2018.
 */
public class SimpleCompositor implements Compositor {
    @Override
    public void compose(int position, int componentCount) {
        System.out.println("Simple compositor called with position " + position + " and component count  " + componentCount);
    }
}
