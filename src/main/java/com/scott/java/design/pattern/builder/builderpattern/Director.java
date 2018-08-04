package com.scott.java.design.pattern.builder.builderpattern;

/**
 * Created by lizhaok on 5/12/2015.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setProduct() {
        builder.BuildPartOne();
        builder.BuildPartTwo();
        System.out.println(builder.getProduct().getPartOne() + " + " + builder.getProduct().getPartTwo());

        //System.out.println(builder.getProduct().getProductA() + " + " + builder.getProduct().getProductB());

    }
}
