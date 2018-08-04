package com.scott.java.design.pattern.behavior.chainofresponsibility.buttonsample;

/**
 * Created by lizhaok on 5/13/2018.
 */
public class Dialog extends Widget {
    Dialog(HelpHandler parentHelpHandler, HelpTopic helpTopic) {
        super(parentHelpHandler, helpTopic);
    }

    public void handleHelp() {
        if (showHelp()) {
            System.out.println("Help from dialog");
        } else {
            parentHelpHandler.handleHelp();
        }
    }
}
