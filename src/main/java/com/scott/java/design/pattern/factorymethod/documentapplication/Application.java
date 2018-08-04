package com.scott.java.design.pattern.factorymethod.documentapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhaok on 2016/4/24.
 */
public abstract class Application {
    List<Document> documents;

    public Application() {
        documents = new ArrayList<>();
    }

    public void OpenDocument() {

    }

    public void newDocument() {
        Document document = createDocument();
        documents.add(document);
        document.open();

    }
    protected abstract Document createDocument();
}
