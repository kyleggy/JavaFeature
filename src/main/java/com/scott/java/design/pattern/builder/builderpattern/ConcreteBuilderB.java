package com.scott.java.design.pattern.builder.builderpattern;

/**
 * Created by lizhaok on 2016/4/8.
 */
public class ConcreteBuilderB implements Builder {
    Product productB = new ProductB();

    @Override
    public void BuildPartOne() {
        productB.setPartOne("Builder B set product B's part one");

    }

    @Override
    public void BuildPartTwo() {
        productB.setPartTwo("Builder B set product B's part two");
    }

    @Override
    public Product getProduct() {
        return productB;
    }
}
