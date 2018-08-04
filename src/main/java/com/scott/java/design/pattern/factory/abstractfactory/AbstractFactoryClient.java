package com.scott.java.design.pattern.factory.abstractfactory;

/**
 * Created by lizhaok on 5/1/2015.
 */
public class AbstractFactoryClient {

    AbstractFactory abstractFactory;

    public AbstractProductA createProductA() {
        return abstractFactory.createProductA();
    }

    public AbstractProductB createProductB() {
        return abstractFactory.createProductB();
    }

    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }
}
