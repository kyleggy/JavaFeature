package com.scott.java.design.pattern.structure.composite.equipmentsample;

/**
 * Created by lizhaok on 2016/12/11.
 */
public class Card extends Equipment {

    public Card(String name) {
        super(name);
    }

    @Override
    public int power() {
        return 0;
    }

    @Override
    public int netPrice() {
        return 3;
    }

    @Override
    public int disCountPrice() {
        return 1;
    }
}
