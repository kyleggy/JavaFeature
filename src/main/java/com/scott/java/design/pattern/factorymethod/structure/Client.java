package com.scott.java.design.pattern.factorymethod.structure;

import org.junit.Test;

/**
 * Created by lizhaok on 2016/4/24.
 */
public class Client {

    @Test
    public void callA() {
        Creator creator = new ConcreteCreatorA();
        creator.anOperation();
    }

    @Test
    public void callB() {
        Creator creator = new ConcreteCreatorB();
        creator.anOperation();
    }
}
