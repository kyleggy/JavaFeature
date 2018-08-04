package com.scott.java.design.pattern.structure.decorator.sample;

/**
 * Created by lizhaok on 2016/12/18.
 */
public class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
