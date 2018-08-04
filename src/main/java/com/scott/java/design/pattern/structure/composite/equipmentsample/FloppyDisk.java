package com.scott.java.design.pattern.structure.composite.equipmentsample;

/**
 * Created by lizhaok on 2016/12/11.
 */
public class FloppyDisk extends Equipment {

    public FloppyDisk(String name) {
        super(name);
    }

    @Override
    public int power() {
        return 10;
    }

    @Override
    public int netPrice() {
        return 30;
    }

    @Override
    public int disCountPrice() {
        return 25;
    }
}
