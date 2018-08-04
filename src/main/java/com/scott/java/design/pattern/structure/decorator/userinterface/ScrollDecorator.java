package com.scott.java.design.pattern.structure.decorator.userinterface;

/**
 * Created by lizhaok on 2016/12/18.
 */
public class ScrollDecorator extends DecoratorComponent {
   private Scroll scroll;

    public ScrollDecorator(VisualComponent visualComponent, Scroll scroll) {
        super(visualComponent);
        this.scroll = scroll;
    }

    @Override
    public void draw() {
        super.draw();
        setScroll();
    }

    @Override
    public void resize() {
        super.resize();
        setScroll();
    }

    private void setScroll() {
        System.out.println("Scroll Sets to:" + this.scroll);
    }
}
