package com.scott.java.design.pattern.structure.decorator.sample;

/**
 * Created by lizhaok on 2016/12/18.
 */
public class ConcreteDecoratorState extends Decorator {
    private State state;

    public ConcreteDecoratorState(Component component, State state) {
        super(component);
        this.state = state;
    }

    @Override
    public void operation() {
        super.operation();
        addState();
    }

    private void addState() {
        System.out.println("Concrete Decorator State: " + this.state);
    }

}
