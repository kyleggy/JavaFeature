package com.scott.java.design.pattern.behavior.commands;

/**
 * Created by lizhaok on 5/28/2018.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}
