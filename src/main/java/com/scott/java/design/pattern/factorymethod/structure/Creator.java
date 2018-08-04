package com.scott.java.design.pattern.factorymethod.structure;

/**
 * Created by lizhaok on 2016/4/24.
 */
public abstract class Creator {

    public void anOperation() {
        Product product = factoryMethod();
        System.out.println(product.productName());
    }

    protected abstract Product factoryMethod();

}
