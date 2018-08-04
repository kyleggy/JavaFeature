package com.scott.java.design.pattern.structure.decorator.userinterface;

/**
 * Created by lizhaok on 2016/12/18.
 */
public class DecoratorComponent extends VisualComponent {
    private VisualComponent visualComponent;

    public DecoratorComponent(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }


    @Override
    public void draw() {
        visualComponent.draw();

    }

    @Override
    public void resize() {
        visualComponent.resize();
    }
}
