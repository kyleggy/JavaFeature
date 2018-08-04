package com.scott.java.design.pattern.behavior.chainofresponsibility.buttonsample;

import org.junit.Test;

/**
 * Created by lizhaok on 5/13/2018.
 */

public class ApplicationClient {

    @Test
    public void testChainOfResponsibility() {
        Application application = new Application(null, HelpTopic.APPLICATION_HELP);
        Dialog dialog = new Dialog(application, HelpTopic.DIALOG_HELP);
        Button button = new Button(dialog, HelpTopic.NO_HELP);
        button.handleHelp();
        dialog.handleHelp();
        application.handleHelp();
    }
}
