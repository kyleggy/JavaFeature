package com.scott.java.design.pattern.structure.decorator.userinterface;

/**
 * Created by lizhaok on 2016/12/18.
 */
public class Windows {
    private VisualComponent visualComponent;

    public void setComponent(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    public void draw() {
        visualComponent.draw();
    }

    public void resize() {
        visualComponent.resize();
    }

}
