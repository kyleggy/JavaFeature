package com.scott.java.design.pattern.factorymethod.documentapplication;

/**
 * Created by lizhaok on 2016/4/24.
 */
public interface Document {

    void open();
    void close();
    void save();
    void revert();
}
