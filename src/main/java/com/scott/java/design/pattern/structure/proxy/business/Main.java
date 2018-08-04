package com.scott.java.design.pattern.structure.proxy.business;

/**
 * Created by lizhaok on 2017/3/4.
 */
public class Main {

    public static void main(String[] args) {
        BusinessObject businessObject = BusinessObject.create();
        businessObject.sayHi();
    }
}
