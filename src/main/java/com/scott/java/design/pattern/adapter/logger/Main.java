package com.scott.java.design.pattern.adapter.logger;

/**
 * Created by lizhaok on 2017/3/5.
 */
public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.create();
        logger.debug("Some debug message");
        logger.trace("Some trace message");
        logger.log("Some log message");
    }
}
