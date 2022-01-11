package com.skm.algo.interview.drone;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by saroj on 7/15/2019.
 */
public class Drone extends Thread {
    private final Queue<Product> sharedQueue;
    Drone(Queue<Product> sharedQueue){
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run(){
        while (true){
            synchronized (sharedQueue) {
                while(sharedQueue.isEmpty() || sharedQueue.peek().isDelivered()){
                    try {
                        sharedQueue.wait();
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }
                try {
                    Product product = sharedQueue.peek();
                    product.setStatus(Product.Status.DELIVERED);
                    Thread.sleep(5000);
                    sharedQueue.notify();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
}
