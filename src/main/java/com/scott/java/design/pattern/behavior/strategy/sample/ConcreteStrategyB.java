package com.scott.java.design.pattern.behavior.strategy.sample;

/**
 * Created by lizhaok on 1/29/2018.
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("Strategy B executed");
    }
}
