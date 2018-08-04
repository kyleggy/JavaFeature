package com.scott.java.design.pattern.behavior.commands.application;

/**
 * Created by lizhaok on 5/28/2018.
 */
public class OpenCommand implements Command {
    private Application application;

    public OpenCommand(Application application) {
        this.application = application;
    }

    @Override
    public void execute() {

        if (askUser() != null) {
            Document document = new Document(askUser());
            document.open();
        }

    }

    protected String askUser() {
        return "Ask user";
    }
}
