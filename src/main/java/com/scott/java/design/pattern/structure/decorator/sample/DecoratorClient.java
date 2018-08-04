package com.scott.java.design.pattern.structure.decorator.sample;

import org.junit.Test;

/**
 * Created by lizhaok on 2016/12/18.
 */
public class DecoratorClient {

    @Test
    public void testDecorator() {
        Component component = new ConcreteDecoratorBehavior(new ConcreteDecoratorState(new ConcreteComponent(), State.high), Behavior.play);
        component.operation();
    }
}
