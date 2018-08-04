package com.scott.java.feature.thread.threadlocal;

import org.junit.Test;

import java.util.function.Supplier;

/**
 * Created by lizhaok on 6/7/2017.
 */
public class ThreadLocalSample {

    public static class MyRunnable implements Runnable {

        //Initialize value are shared through different threads
        private ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 8;
            }
        });

        private  ThreadLocal<Boolean> isDataPrepared = new ThreadLocal<Boolean>() {
            @Override
            protected Boolean initialValue() {
                return false;
            }
        };

        private ThreadLocal<String> threadLocalStr = new ThreadLocal<String>() {
            @Override
            protected String initialValue() {
                return "S";
            }
        };

        @Override
        public void run() {
            System.out.println("Initialize value: " + threadLocal.get());

            threadLocal.set((int)(Math.random() * 100D));

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(threadLocal.get());
        }
    }


    @Test
    public void testThreadLocal() {
        MyRunnable sharedRunnableInstance = new MyRunnable();
        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
