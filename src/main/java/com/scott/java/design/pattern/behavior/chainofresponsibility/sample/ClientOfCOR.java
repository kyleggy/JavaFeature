package com.scott.java.design.pattern.behavior.chainofresponsibility.sample;

import org.junit.Test;

/**
 * Created by lizhaok on 5/13/2018.
 */
public class ClientOfCOR {

    @Test
    public void testCOR() {
        AbstractHandler abstractHandler2 = new ConcreteHandler2(null);
        AbstractHandler abstractHandler1 = new ConcreteHandler1(abstractHandler2);
        abstractHandler1.handlerRequest(new ConcreteRequest1());
    }
}
