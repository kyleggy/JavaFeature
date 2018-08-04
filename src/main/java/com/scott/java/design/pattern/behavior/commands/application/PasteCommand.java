package com.scott.java.design.pattern.behavior.commands.application;

/**
 * Created by lizhaok on 5/28/2018.
 */
public class PasteCommand implements Command {
    private Document document;

    public PasteCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.Paste();

    }
}
