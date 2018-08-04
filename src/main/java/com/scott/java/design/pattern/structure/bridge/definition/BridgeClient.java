package com.scott.java.design.pattern.structure.bridge.definition;

import org.junit.Test;

/**
 * Created by lizhaok on 2016/12/12.
 */
public class BridgeClient {

    @Test
    public void testBridge() {
        Implementor implementor = new ConcreteImplementorA();
        RefinedAbstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();

        Implementor implementorB = new ConcreteImplementorB();
        abstraction = new RefinedAbstraction(implementorB);
        abstraction.operation();
    }
}
