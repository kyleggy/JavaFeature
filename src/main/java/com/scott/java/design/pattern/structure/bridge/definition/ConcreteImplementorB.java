package com.scott.java.design.pattern.structure.bridge.definition;

/**
 * Created by lizhaok on 2016/12/12.
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("Concrete Implementor B called");
    }
}
