package com.scott.java.design.pattern.structure.composite.equipmentsample;

/**
 * Created by lizhaok on 2016/12/11.
 */
public abstract class Equipment {
    protected String name;

    public Equipment(String name) {
        this.name = name;
    }

    public abstract int power();

    public abstract int netPrice();

    public abstract int disCountPrice();

    public Equipment add(Equipment child) {
        return null;
    }

    public Equipment remove(Equipment child) {
        return null;
    }


}
