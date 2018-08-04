package com.scott.java.design.pattern.factorymethod.documentapplication;

import org.junit.Test;

/**
 * Created by lizhaok on 2016/4/24.
 */
public class Client {

    @Test
    public void testHtml() {
        Application application = new HtmlApplication();
        application.newDocument();
    }

    @Test
    public void testDoc() {
        Application application = new DocApplication();
        application.newDocument();
    }
}
