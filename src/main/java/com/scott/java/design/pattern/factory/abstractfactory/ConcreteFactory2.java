package com.scott.java.design.pattern.factory.abstractfactory;

/**
 * Created by lizhaok on 5/1/2015.
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
