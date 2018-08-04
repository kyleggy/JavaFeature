package com.scott.java.design.pattern.behavior.chainofresponsibility.buttonsample;

/**
 * Created by lizhaok on 5/13/2018.
 */
public abstract class HelpHandler {
    HelpHandler parentHelpHandler;
    HelpTopic helpTopic;

    HelpHandler(HelpHandler parentHelpHandler, HelpTopic helpTopic) {
        this.parentHelpHandler = parentHelpHandler;
        this.helpTopic = helpTopic;
    }


    public void handleHelp() {
        if (parentHelpHandler != null) {
            parentHelpHandler.handleHelp();
        }
    };

    boolean showHelp() {
        return !HelpTopic.NO_HELP.equals(helpTopic);
    };

}
