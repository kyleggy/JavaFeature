package com.scott.java.design.pattern.behavior.chainofresponsibility.sample;

/**
 * Created by lizhaok on 5/13/2018.
 */
public class ConcreteRequest1 implements Request {

    @Override
    public void print() {
        System.out.println("Request 1 print");

    }

    @Override
    public RequestType getType() {
        return RequestType.Handler1;
    }
}
