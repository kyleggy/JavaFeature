package com.scott.java.design.pattern.behavior.commands;

import org.junit.Test;

/**
 * Created by lizhaok on 5/28/2018.
 */
public class CommandClient {
    private Command command;
    private  Invoker invoker;

    public void registerCommand() {
        Receiver receiver = new Receiver();
        command = new ConcreteCommand(receiver);
    }

    public void registerInvoker() {
        invoker = new Invoker(command);
    }

    @Test
    public void test() {
        registerCommand();
        registerInvoker();
        invoker.invoke();
    }



}
