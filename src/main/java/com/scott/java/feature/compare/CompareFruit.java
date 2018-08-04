package com.scott.java.feature.compare;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lizhaok on 8/13/2014.
 */
public class CompareFruit {

    public static void main(String[] args) {
        ArrayList<Fruit> fruitArrayList = new ArrayList<Fruit>();
        fruitArrayList.add(new Fruit("Apple", "Good", 35));
        fruitArrayList.add(new Fruit("Pear", "Aood", 3));
        fruitArrayList.add(new Fruit("CC", "Bad", 89));

        Collections.sort(fruitArrayList);
        for(Fruit a : fruitArrayList) {
            System.out.println(a.getFruitName() + ": " + a.getQuantity());
        }

        Collections.sort(fruitArrayList, new FruitNameComparator());
        for(Fruit a : fruitArrayList) {
            System.out.println(a.getFruitName() + ": " + a.getQuantity());
        }
    }
}
