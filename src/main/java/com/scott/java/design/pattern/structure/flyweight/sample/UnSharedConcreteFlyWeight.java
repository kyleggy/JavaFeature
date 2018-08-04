package com.scott.java.design.pattern.structure.flyweight.sample;

/**
 * Created by lizhaok on 12/24/2017.
 */
public class UnSharedConcreteFlyWeight implements FlyWeight {
    private String extrinsicState;

    @Override
    public void operation(String extrinsicState) {
        this.extrinsicState = extrinsicState;
    }


    @Override
    public String toString() {
        return "UnSharedConcreteFlyWeight{" +
                "extrinsicState='" + extrinsicState + '\'' +
                '}';
    }
}
