package com.scott.java.design.pattern.adapter.object;

/**
 * Created by lizhaok on 2016/8/21.
 */
public class Adapter implements Target {
    public Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
