package com.scott.java.design.pattern.behavior.commands.application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhaok on 5/28/2018.
 */
public class Application {
    private List<Document> documents;

    public Application() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document document) {
        this.documents.add(document);
    }
}
