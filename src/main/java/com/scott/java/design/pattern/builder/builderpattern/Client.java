package com.scott.java.design.pattern.builder.builderpattern;

import org.junit.Test;

/**
 * Created by lizhaok on 5/12/2015.
 */
public class Client {

    @Test
    public void runBuilderAPattern() {
        Builder builder = new ConcreteBuilderA();
        Director director = new Director(builder);
        director.setProduct();
        //System.out.println(builder.getProduct().getProductA() + " and " + builder.getProduct().getProductB());
    }

    @Test
    public void runBuilderBPattern() {
        Builder builder = new ConcreteBuilderB();
        Director director = new Director(builder);
        director.setProduct();
        //System.out.println(builder.getProduct().getProductA() + " and " + builder.getProduct().getProductB());
    }

}
