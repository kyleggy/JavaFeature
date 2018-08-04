package com.scott.java.design.pattern.structure.bridge.definition;

/**
 * Created by lizhaok on 2016/12/12.
 */
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("Operation refined called");
        super.operation();
    }

}
