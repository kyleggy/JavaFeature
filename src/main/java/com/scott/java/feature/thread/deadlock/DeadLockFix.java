package com.scott.java.feature.thread.deadlock;

/**
 * Created by lizhaok on 2017/1/19.
 * Shrink the size of the synchronize can resolve the dead lock issue
 */
public class DeadLockFix {
    static class Friend {
        private final String name;
        public Friend(String name) {
            this.name = name;
        }

        private Object fix1 = new Object();
        private Object fix2 = new Object();

        public String getName() {
            return this.name;
        }

        public  void bow(Friend bower) {
            synchronized (fix1) {
                System.out.format("%s: %s"
                                + "  has bowed to me!%n",
                        this.name, bower.getName());
                bower.bowBack(this);
            }

        }
        public void bowBack(Friend bower) {
            synchronized(fix2) {
                System.out.format("%s: %s"
                                + " has bowed back to me!%n",
                        this.name, bower.getName());
            }

        }
    }

    public static void main(String[] args) {
        final Friend alphonse =
                new Friend("Alphonse");
        final Friend gaston =
                new Friend("Gaston");
        new Thread(new Runnable() {
            public void run() { alphonse.bow(gaston); }
        }).start();
        new Thread(new Runnable() {
            public void run() { gaston.bow(alphonse); }
        }).start();
    }
}
