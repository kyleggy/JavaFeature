package com.scott.java.feature.thread.startthread.threadinterference;

/**
 * Created by lizhaok on 2017/1/15.
 */
public class Counter {
    private int c = 0;

    public void increment() {
        c ++;
    }

    public void decrement() {
        c --;
    }

    public int getCounter() {
        return c;
    }
}
