package com.scott.java.design.pattern.factory.abstractfactory;

/**
 * Created by lizhaok on 5/1/2015.
 */
public class ConcreteFactory1 implements AbstractFactory {

//    public AbstractProductA createProductA() {
//        return new ProductA1();
//    }
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
