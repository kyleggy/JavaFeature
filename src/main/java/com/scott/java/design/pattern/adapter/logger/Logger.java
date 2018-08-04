package com.scott.java.design.pattern.adapter.logger;

/**
 * Created by lizhaok on 2017/3/5.
 */
public abstract class Logger {
    abstract public void trace(String str);
    abstract public void debug(String str);
    abstract public void log(String str);
    public static Logger create() {
       // return new LoggerImpl();
        return new ApacheCommonsLogAdapter();
    }
}
