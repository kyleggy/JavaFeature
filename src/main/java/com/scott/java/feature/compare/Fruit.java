package com.scott.java.feature.compare;

import java.util.Comparator;

/**
 * Created by lizhaok on 8/13/2014.
 */
public class Fruit implements Comparable<Fruit>{

    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public Fruit(String fruitName, String fruitDesc, int quantity) {
        super();
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.quantity = quantity;
    }

    public String getFruitName() {
        return fruitName;
    }
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    public String getFruitDesc() {
        return fruitDesc;
    }
    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int compareTo(Fruit compareFruit) {

        int compareQuantity = ((Fruit) compareFruit).getQuantity();

        //ascending order
        return this.quantity - compareQuantity;

        //descending order
        //return compareQuantity - this.quantity;

    }
}

class FruitNameComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        String fruitName1 = o1.getFruitName().toUpperCase();
        String fruitName2 = o2.getFruitName().toUpperCase();

        //ascending order
        return fruitName1.compareTo(fruitName2);

        //descending order
        //return fruitName2.compareTo(fruitName1);
    }
}
