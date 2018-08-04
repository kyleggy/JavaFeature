package com.scott.java.design.pattern.behavior.commands.application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhaok on 5/28/2018.
 */
public class MacroCommands implements Command {
    private List<Command>  commands;

    public MacroCommands() {
        this.commands = new ArrayList<>();
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void removeCommand(Command command) {
        this.commands.remove(command);
    }
}
