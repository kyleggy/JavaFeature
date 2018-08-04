package com.scott.java.design.pattern.structure.proxy.business;

/**
 * Created by lizhaok on 2017/3/4.
 */
public class BusinessObjectProxy extends BusinessObject {
    private final BusinessObject target;

    public BusinessObjectProxy(BusinessObject target) {
        this.target = target;
    }

    @Override
    public void sayHi() {
        System.out.println("About to call real...");
        this.target.sayHi();
        System.out.println("Completed call to real...");
    }
}
