package com.scott.java.feature.thread.volatiles;

/**
 * Created by lizhaok on 2017/1/13.
 */
public class Exchange {
    private Object object = null;
    private volatile Boolean hasNewObject = false;

    public void put(Object newObject) {
        while (hasNewObject) {

        }
        object = newObject;  // non-volatile also reads from main memory, no re-order
        hasNewObject = true;
    }

    public Object take() {
        while (!hasNewObject) {

        }
        Object obj = object;
        hasNewObject = false;
        return obj;
    }
}
