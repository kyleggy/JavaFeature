package com.scott.java.design.pattern.factory.abstractfactory;

import org.junit.Test;




/**
 * Created by lizhaok on 5/1/2015.
 */
public class RunAbstractFactory {

    @Test
    public  void test() {
        AbstractFactoryClient abstractFactoryClient = new AbstractFactoryClient();
        abstractFactoryClient.setAbstractFactory(new ConcreteFactory1());
        abstractFactoryClient.createProductA().helloA();
        abstractFactoryClient.createProductB().helloB();

        abstractFactoryClient.setAbstractFactory(new ConcreteFactory2());
        abstractFactoryClient.createProductA().helloA();
        abstractFactoryClient.createProductB().helloB();

    }
}
