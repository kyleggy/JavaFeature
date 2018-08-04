package com.scott.java.design.pattern.factorymethod.structure;

/**
 * Created by lizhaok on 2016/4/24.
 */
public class ConcreteCreatorA extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProductA();
    }
}
