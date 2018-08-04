package com.scott.java.design.pattern.behavior.chainofresponsibility.buttonsample;

/**
 * Created by lizhaok on 5/13/2018.
 */
public class Button extends Widget {
    Button(HelpHandler parentHelpHandler, HelpTopic helpTopic) {
        super(parentHelpHandler, helpTopic);
    }

    public void handleHelp() {
        if (showHelp()) {
            System.out.println("Help from button");
        } else {
            parentHelpHandler.handleHelp();
        }
    }

}
