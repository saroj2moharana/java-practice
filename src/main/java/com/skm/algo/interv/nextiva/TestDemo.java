package com.skm.algo.interv.nextiva;

import java.util.Scanner;

/**
 * Implement a thread-safe Producer-Consumer system using Java.
 *
 */
public class TestDemo {
    public static void main(String[] args) {
        Resource sharedResource = new Resource();
        ConsumerApp consumerApp = new ConsumerApp(sharedResource);
        ProducerApp producerApp = new ProducerApp(sharedResource);
        consumerApp.start();
        producerApp.start();
    }
}
class ConsumerApp extends Thread{
    private final Resource resource;

    ConsumerApp(Resource resource) {
        this.resource = resource;
    }
    @Override
    public void run(){
        while(true){
            if(resource.getMsg() != null){
                System.out.println("Sony:"+resource.getMsg());
                resource.setMsg(null);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
class ProducerApp extends Thread{
    private final Resource resource;
    private final Scanner sc;

    ProducerApp(Resource resource) {
        this.resource = resource;
        this.sc = new Scanner(System.in);
    }

    @Override
    public void run(){
        while(true){
            if(resource.getMsg() == null){
                System.out.print("Saroj:");
                resource.setMsg(sc.nextLine());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Resource{
 private String msg;

    public synchronized String getMsg(){
        return msg;
    }
    public synchronized void setMsg(String msg){
        this.msg = msg;
    }
}
