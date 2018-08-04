package com.scott.java.design.pattern.structure.decorator.userinterface;

/**
 * Created by lizhaok on 2016/12/18.
 */
public class BorderDecorator extends DecoratorComponent {
    private int width;

    public BorderDecorator(VisualComponent visualComponent, int width) {
        super(visualComponent);
        this.width = width;
    }

    @Override
    public void draw() {
        super.draw();
        setWidth();
    }

    @Override
    public void resize() {
        super.resize();
        setWidth();
    }

    private void setWidth() {
        System.out.println("Border width is: " + width);
    }


}
