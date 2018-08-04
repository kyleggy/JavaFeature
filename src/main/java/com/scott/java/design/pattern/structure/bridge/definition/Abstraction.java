package com.scott.java.design.pattern.structure.bridge.definition;

/**
 * Created by lizhaok on 2016/12/12.
 */
public abstract class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImpl();
    }

}
