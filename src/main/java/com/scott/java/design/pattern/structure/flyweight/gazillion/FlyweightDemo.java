package com.scott.java.design.pattern.structure.flyweight.gazillion;

/**
 * Created by lizhaok on 12/27/2017.
 */
public class FlyweightDemo {
    public static final int ROWS = 6, COLS = 10;

    public static void main(String[] args) {
        Factory theFactory = new Factory(ROWS);
        for (int i=0; i < ROWS; i++) {
            for (int j=0; j < COLS; j++)
                theFactory.getFlyweight(i).report(j);
            System.out.println();
        }
    }
}
