package com.scott.java.design.pattern.adapter.logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;

/**
 * Created by lizhaok on 2017/3/5.
 */
public class ApacheCommonsLogAdapter extends Logger {
    private Log log = new Log4JLogger("MyLogger");
    @Override
    public void trace(String str) {
        log.trace(str);
    }

    @Override
    public void debug(String str) {
        log.debug(str);
    }

    @Override
    public void log(String str) {
        log.info(str);

    }
}
