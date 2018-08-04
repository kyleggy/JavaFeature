package com.scott.java.design.pattern.structure.proxy.protectionproxy;

/**
 * Created by lizhaok on 1/6/2018.
 */
public class Wizard {
    private final String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
