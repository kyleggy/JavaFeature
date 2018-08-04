package com.scott.java.design.pattern.factorymethod.structure;

/**
 * Created by lizhaok on 6/25/2017.
 */
public class ConcreteCreatorB extends Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProductB();
    }
}
