package com.scott.java.design.pattern.behavior.chainofresponsibility.buttonsample;

import com.scott.java.design.pattern.behavior.chainofresponsibility.buttonsample.HelpHandler;
import com.scott.java.design.pattern.behavior.chainofresponsibility.buttonsample.HelpTopic;

/**
 * Created by lizhaok on 5/13/2018.
 */
public class Widget extends HelpHandler {

    Widget(HelpHandler parentHelpHandler, HelpTopic helpTopic) {
        super(parentHelpHandler, helpTopic);
    }
}
