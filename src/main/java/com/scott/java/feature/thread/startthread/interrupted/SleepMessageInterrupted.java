package com.scott.java.feature.thread.startthread.interrupted;


/**
 * Created by lizhaok on 2017/1/14.
 */
public class SleepMessageInterrupted {

    //Two way to interrupted
    public static void main(String args[]) throws InterruptedException {
        String[] messages = {"one", "two", "three", "four"};
        for(int i = 0; i < 4; i ++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(Thread.interrupted()) {
                throw new InterruptedException();
            }

            System.out.println(messages[i]);
        }
    }
}
