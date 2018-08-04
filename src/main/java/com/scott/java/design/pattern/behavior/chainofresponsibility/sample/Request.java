package com.scott.java.design.pattern.behavior.chainofresponsibility.sample;

/**
 * Created by lizhaok on 5/13/2018.
 */
public interface Request {

    public void print();

    public RequestType getType();
}
