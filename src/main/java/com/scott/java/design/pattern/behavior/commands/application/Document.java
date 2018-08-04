package com.scott.java.design.pattern.behavior.commands.application;

/**
 * Created by lizhaok on 5/28/2018.
 */
public class Document {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public void delete() {
        System.out.println("Delete document: " + name);
    }

    public void open() {
        System.out.println("Open document: " + name);
    }

    public void Paste() {
        System.out.println("Paste document:" + name);
    }
}
