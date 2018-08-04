package com.scott.java.design.pattern.factorymethod.documentapplication;

/**
 * Created by lizhaok on 2016/4/24.
 */
public class DocDocument implements Document {
    @Override
    public void open() {
        System.out.println("Doc document opened");

    }

    @Override
    public void close() {

    }

    @Override
    public void save() {

    }

    @Override
    public void revert() {

    }
}
