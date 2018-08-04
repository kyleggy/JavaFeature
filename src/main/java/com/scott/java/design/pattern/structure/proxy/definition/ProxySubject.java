package com.scott.java.design.pattern.structure.proxy.definition;

/**
 * Created by lizhaok on 2017/3/4.
 */
public class ProxySubject implements Subject{
    private RealSubject realSubject;

    private RealSubject getRealSubject() {
        return realSubject;
    }

    @Override
    public void request() {
        if(getRealSubject() == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
