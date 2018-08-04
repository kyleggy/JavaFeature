package com.scott.java.design.pattern.behavior.commands.application;

/**
 * Created by lizhaok on 5/28/2018.
 */
public class DeleteCommand implements Command {
    public Document document;

    public DeleteCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.delete();
    }
}
