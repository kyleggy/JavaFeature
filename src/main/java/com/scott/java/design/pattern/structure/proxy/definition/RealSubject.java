package com.scott.java.design.pattern.structure.proxy.definition;

/**
 * Created by lizhaok on 2017/3/4.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Real subject called");
    }
}
