package com.scott.java.design.pattern.structure.composite.equipmentsample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhaok on 2016/12/11.
 */
public class CompositeEquipment extends Equipment {
    private List<Equipment> equipmentList = new ArrayList<>();

    public CompositeEquipment(String name) {
        super(name);
    }

    @Override
    public int power() {
        return 0;
    }

    @Override
    public int netPrice() {
        int price = 0;
        for( int i = 0; i < equipmentList.size(); i ++) {
            price += equipmentList.get(i).netPrice();
        }
        return price;
    }

    @Override
    public int disCountPrice() {
        int price = 0;
        for (int i = 0; i < equipmentList.size(); i ++) {
            price += equipmentList.get(i).disCountPrice();
        }
        return price;
    }

    @Override
    public Equipment add(Equipment child) {
        equipmentList.add(child);
        return child;
    }

    @Override
    public Equipment remove(Equipment child) {
        equipmentList.remove(child);
        return child;
    }
}
