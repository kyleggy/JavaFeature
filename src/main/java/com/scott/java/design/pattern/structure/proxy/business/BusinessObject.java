package com.scott.java.design.pattern.structure.proxy.business;

/**
 * Created by lizhaok on 2017/3/4.
 */
public abstract class BusinessObject {

    public abstract void sayHi();

    public static BusinessObject create() {
        return new BusinessObjectProxy(new BusinessObjectImplementation());
    }



}
