package com.scott.java.design.pattern.behavior.commands;

/**
 * Created by lizhaok on 5/28/2018.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
