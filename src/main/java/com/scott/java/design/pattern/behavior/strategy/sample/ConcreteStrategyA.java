package com.scott.java.design.pattern.behavior.strategy.sample;

/**
 * Created by lizhaok on 1/29/2018.
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("Strategy A executed");
    }
}
