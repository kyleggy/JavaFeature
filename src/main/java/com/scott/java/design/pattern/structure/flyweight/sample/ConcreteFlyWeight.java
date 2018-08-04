package com.scott.java.design.pattern.structure.flyweight.sample;

/**
 * Created by lizhaok on 12/24/2017.
 */
public class ConcreteFlyWeight implements FlyWeight {
    private String intrinsicState;
    private String extrinsicState;

    public ConcreteFlyWeight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        this.extrinsicState = extrinsicState;
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "ConcreteFlyWeight{" +
                "intrinsicState='" + intrinsicState + '\'' +
                ", extrinsicState='" + extrinsicState + '\'' +
                '}';
    }
}
