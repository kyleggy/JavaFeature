package com.scott.java.feature.anonymousclass.argument;

/**
 * Created by lizhaok on 6/9/2017.
 */
public class BaseClass {
    private String s;
    public BaseClass (String s) {
        this.s = s;
    }

    public void Hello() {
        System.out.println(s);
    }
}
