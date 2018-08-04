package com.scott.java.feature.thread.synchronize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhaok on 2017/1/9.
 */
public class SynchronizedCounter {
    private int c = 0;
    private String lastName;
    private int nameCount = 0;
    private List<String> nameList = new ArrayList<>();

    public synchronized void increment() {
        c ++;
    }

    public synchronized void decrement() {
        c --;
    }

    public synchronized int value() {
        return c;
    }

    public void addName(String name) {
        synchronized(this) {
            this.lastName = name;
            nameCount++;
        }
        nameList.add(lastName);
    }



}
