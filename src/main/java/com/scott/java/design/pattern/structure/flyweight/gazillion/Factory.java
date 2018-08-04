package com.scott.java.design.pattern.structure.flyweight.gazillion;

/**
 * Created by lizhaok on 12/27/2017.
 */
public class Factory {
    private Gazillion[] pool;

    public Factory(int maxRows) {
        pool = new Gazillion[maxRows];
    }

    public Gazillion getFlyweight(int row) {
        if (pool[row] == null) {
            pool[row] = new Gazillion(row);
        }
        return pool[row];
    }
}
