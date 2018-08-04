package com.scott.java.design.pattern.behavior.strategy.sample;

/**
 * Created by lizhaok on 1/29/2018.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithmInterface();
    }

    public static void main(String[] args) {
        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();
        Strategy strategyC = new ConcreteStrategyC();
        Context contextA = new Context(strategyA);
        contextA.contextInterface();
        Context contextB = new Context(strategyB);
        contextB.contextInterface();
        Context contextC = new Context(strategyC);
        contextC.contextInterface();
    }
}
