package com.scott.java.design.pattern.behavior.commands.application;

import org.junit.Test;

/**
 * Created by lizhaok on 5/28/2018.
 */
public class ApplicationClient {

    @Test
    public void test() {
        Application application = new Application();
        Document aDocument = new Document("Scott Document");
        Document bDocument = new Document("Billy Document");
        Document cDocument = new Document("James Document");
        Command openCommand = new OpenCommand(application);
        openCommand.execute();

        Command pasteCommand = new PasteCommand(bDocument);
        Command deleteCommand = new DeleteCommand(cDocument);
        MacroCommands macroCommands = new MacroCommands();
        macroCommands.addCommand(pasteCommand);
        macroCommands.addCommand(deleteCommand);
        macroCommands.execute();


    }

    @Test
    public void testOpen() {
        Application application = new Application();
        Command openCommand = new OpenCommand(application);
        MenuItem menuItem = new OpenMenuItem(openCommand);
        menuItem.click();

    }


}
