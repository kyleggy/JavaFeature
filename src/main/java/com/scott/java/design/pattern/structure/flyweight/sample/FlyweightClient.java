package com.scott.java.design.pattern.structure.flyweight.sample;

import org.junit.Test;

/**
 * Created by lizhaok on 12/24/2017.
 */
public class FlyweightClient {
    String[] intrinsicStates =  {"one", "two", "three"};

    @Test
    public void testFlyweight() {

        for (int i = 0 ; i < 20 ; i ++){

            FlyweightFactory.getFlyweight(intrinsicStates[(int)(Math.random()*3)]).operation("hi" + i);
        }
    }
}
