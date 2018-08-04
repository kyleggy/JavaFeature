package com.scott.java.design.pattern.behavior.commands.application;

/**
 * Created by lizhaok on 5/28/2018.
 */
public class OpenMenuItem implements MenuItem {
    public Command command;

    public OpenMenuItem(Command command) {
        this.command = command;
    }
    @Override
    public void click() {
        command.execute();
    }
}
