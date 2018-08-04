package com.scott.java.design.pattern.behavior.chainofresponsibility.sample;

/**
 * Created by lizhaok on 5/13/2018.
 */
public class ConcreteHandler2 extends AbstractHandler implements Handler {

    public ConcreteHandler2(AbstractHandler successor) {
        super(successor);
    }

    @Override
    public void handlerRequest(Request request) {
        System.out.println("Request send from concrete handler 2");

    }
}
