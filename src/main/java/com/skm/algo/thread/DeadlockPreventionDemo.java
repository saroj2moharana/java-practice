package com.skm.algo.thread;

/**
 * In this example I have just changed the order of synchronized blocks from previous example so that there won't be
 * any deadlock...
 */
public class DeadlockPreventionDemo {
    public static void main(String[] args) {
        String r1 = "Resource1";
        String r2 = "Resource2";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (r1) {
                    System.out.println("Processing r1 in Thread1");
                    synchronized (r2) {
                        System.out.println("Processing r2 in Thread1");
                    }
                }
            }
        };
        //just maintain order of synchronized blocks to avoid deadlock...
        Thread t2 = new Thread() {
            public void run() {
                synchronized (r1) {
                    System.out.println("Processing r1 in Thread2");
                    synchronized (r2) {
                        System.out.println("Processing r2 in Thread2...");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
