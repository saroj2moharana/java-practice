package com.skm.algo.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * This example is for producer-consumer problem using inter-thread communication...
 */
public class ProducerConsumerProblem {
    private static Queue<Integer> queue = new LinkedList<>();
    private static int qCap = 10;
    private static boolean flag = true;
    private static Random random = new Random(10);


    public static void main(String[] args) {
        Runnable producer = () -> {
            while (flag) {
                synchronized (queue) {
                    if (queue.isEmpty()) {
                        int a = random.nextInt();
                        System.out.println("Added element in queue:" + a);
                        queue.add(a);
                        queue.notify();
                    } else {
                        try {
                            queue.wait();
                            Thread.sleep(1000);//gives some time to process by other thread...
                        } catch (InterruptedException e) {
                            System.out.println("Thread got interrupted with exception:" + e);
                        }
                    }
                }
            }
        };

        Runnable consumer = () -> {
            while (flag) {
                synchronized (queue) {
                    if (!queue.isEmpty()) {
                        System.out.println("New Element from queue:" + queue.poll());
                        queue.notify();
                    } else {
                        try {
                            queue.wait();
                            Thread.sleep(1000);//gives some break to process by other thread...
                        } catch (InterruptedException ex) {
                            System.out.println("Thread got interrupted with exception:" + ex);
                        }
                    }
                }
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
        System.out.println("After completing all tasks...");
    }
}
