package com.scott.java.design.pattern.behavior.chainofresponsibility.sample;

/**
 * Created by lizhaok on 5/13/2018.
 */
public class ConcreteHandler1 extends AbstractHandler implements Handler {
    public ConcreteHandler1(AbstractHandler successor) {
        super(successor);
    }

}
