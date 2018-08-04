package com.scott.java.feature.thread.guardedlock;

/**
 * Created by lizhaok on 2017/1/19.
 */
public class ProducerConsumerExample {

    public static void main(String[] args) {
        Drop drop = new Drop();
        new Thread(new Producer(drop)).start();
        new Thread(new Consumer(drop)).start();
    }
}
