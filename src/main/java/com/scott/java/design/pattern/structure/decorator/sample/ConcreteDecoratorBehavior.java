package com.scott.java.design.pattern.structure.decorator.sample;

/**
 * Created by lizhaok on 2016/12/18.
 */
public class ConcreteDecoratorBehavior extends Decorator {
    private Behavior behavior;

    public ConcreteDecoratorBehavior(Component component, Behavior behavior) {
        super(component);
        this.behavior = behavior;
    }

    public void operation() {
        super.operation();
        addBehavior();
    }

    private void addBehavior() {
        System.out.println("Concrete Decorator Behavior: " + this.behavior);
    }
}
