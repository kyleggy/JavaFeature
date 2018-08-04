package com.scott.java.design.pattern.builder.builderpattern;

/**
 * Created by lizhaok on 5/12/2015.
 */
public class ConcreteBuilderA implements Builder {

    Product product = new ProductA();

    @Override
    public void BuildPartOne() {
        product.setPartOne("Builder A set product A's part one");

    }

    @Override
    public void BuildPartTwo() {
        product.setPartTwo("Builder A set product A's part two");
    }

    public Product getProduct() {
        return product;
    }
}
