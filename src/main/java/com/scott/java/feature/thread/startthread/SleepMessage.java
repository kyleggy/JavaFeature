package com.scott.java.feature.thread.startthread;

/**
 * Created by lizhaok on 2017/1/14.
 */
public class SleepMessage {
    static String[] messages = {"one", "two", "three", "four"};

    public static void main(String args[]) throws InterruptedException {
        for(int i = 0; i < 4; i ++) {
            Thread.sleep(4000);
            if(Thread.interrupted()) {
                throw new InterruptedException();
            }
            System.out.println(messages[i]);
        }
    }

}
