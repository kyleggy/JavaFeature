package com.scott.java.design.pattern.structure.flyweight.gazillion;

/**
 * Created by lizhaok on 12/27/2017.
 */
public class Gazillion {
    private int row;

    public Gazillion(int row) {
        this.row = row;
        System.out.println("ctor: " + this.row);
    }

    void report(int col) {
        System.out.print(" " + row + col);
    }
}
