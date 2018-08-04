package com.scott.java.feature.thread.startthread;

/**
 * Created by lizhaok on 2017/1/14.
 */
public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from runnable interface");
    }

    public static void main(String args[]) {
        new Thread(new HelloRunnable()).start();
    }

}
