package com.scott.java.feature.thread.startthread.threadinterference;

/**
 * Created by lizhaok on 2017/1/15.
 */
public class ThreadInterference implements Runnable {
    private Counter counter;

    public ThreadInterference(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i ++) {
            counter.increment();
            System.out.println(Thread.currentThread().getName() +  " counter value is: " + counter.getCounter());
        }

    }

    public static void main(String args[]) {
        Counter counter = new Counter();
        ThreadInterference threadInterferenceA = new ThreadInterference(counter);
        ThreadInterference threadInterferenceB = new ThreadInterference(counter);
        new Thread(threadInterferenceA).start();
        new Thread(threadInterferenceB).start();
//        threadInterferenceA.run();
//        threadInterferenceB.run();
    }
}
