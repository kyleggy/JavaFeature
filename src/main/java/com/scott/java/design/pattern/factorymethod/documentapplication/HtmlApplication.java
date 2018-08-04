package com.scott.java.design.pattern.factorymethod.documentapplication;

/**
 * Created by lizhaok on 2016/4/24.
 */
public class HtmlApplication extends Application {
    @Override
    protected Document createDocument() {
        return new HtmlDocument();
    }
}
