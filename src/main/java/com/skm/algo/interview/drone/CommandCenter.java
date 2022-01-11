package com.skm.algo.interview.drone;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

/**
 * Created by saroj on 7/15/2019.
 */
public class CommandCenter extends Thread {
    private boolean productAvailableToDeliver = true;
    private final Scanner sc = new Scanner(System.in);
    private final Queue<Product> sharedQueue;
    CommandCenter(Queue<Product> sharedQueue){
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run(){
        while(productAvailableToDeliver){
            synchronized (sharedQueue) {
                Product product = sharedQueue.peek();
                while(product != null && !sharedQueue.peek().isDelivered()) {
                    try {
                        sharedQueue.wait();
                    }catch (InterruptedException ex) {
                        ex.printStackTrace();
                        productAvailableToDeliver = false;
                    }
                }
                if(!sharedQueue.isEmpty()) {
                    System.out.println("Current Status of Product:" + product);
                }
                System.out.print("Do you want to add a product to deliver? Y : N - ");
                String decission = sc.next();
                if ("n".equalsIgnoreCase(decission)) {
                    productAvailableToDeliver = false;
                    break;
                }
                if(product != null)
                    product = sharedQueue.poll();
                System.out.println("Please enter product Name : ");
                String name = sc.next();
                System.out.println("Please enter deliver Address : ");
                String address = sc.next();
                product = new Product(name, address);
                sharedQueue.add(product);
                sharedQueue.notify();
            }
        }
    }
}
