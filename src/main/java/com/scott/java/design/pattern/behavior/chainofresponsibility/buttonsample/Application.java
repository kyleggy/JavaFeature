package com.scott.java.design.pattern.behavior.chainofresponsibility.buttonsample;

/**
 * Created by lizhaok on 5/13/2018.
 */
public class Application extends Widget {

    Application(HelpHandler parentHelpHandler, HelpTopic helpTopic) {
        super(parentHelpHandler, helpTopic);
    }

    public void handleHelp() {
        if (showHelp()) {
            System.out.println("Help from application");
        } else {
            parentHelpHandler.handleHelp();
        }
    }
}
