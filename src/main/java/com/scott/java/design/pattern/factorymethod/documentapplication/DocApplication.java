package com.scott.java.design.pattern.factorymethod.documentapplication;

/**
 * Created by lizhaok on 5/21/2017.
 */
public class DocApplication extends Application {
    @Override
    protected Document createDocument() {
        return new DocDocument();
    }
}
