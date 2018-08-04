package com.scott.java.design.pattern.adapter.object;

/**
 * Created by lizhaok on 2016/8/21.
 */
public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
