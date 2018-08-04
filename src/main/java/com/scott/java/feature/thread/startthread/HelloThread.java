package com.scott.java.feature.thread.startthread;

/**
 * Created by lizhaok on 2017/1/14.
 */
public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello thread");
    }

    public static void main(String args[]) {
        new HelloThread().start();
    }
}
