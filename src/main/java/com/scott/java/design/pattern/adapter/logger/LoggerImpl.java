package com.scott.java.design.pattern.adapter.logger;

/**
 * Created by lizhaok on 2017/3/5.
 */
public class LoggerImpl extends Logger {

    @Override
    public void trace(String str) {
        System.out.print("Trace ");
        System.out.println(str);
    }

    @Override
    public void debug(String str) {
        System.out.print("Debug ");
        System.out.println(str);
    }

    @Override
    public void log(String str) {
        System.out.print("Log ");
        System.out.println(str);
    }
}
