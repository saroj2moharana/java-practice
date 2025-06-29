package com.skm.algo.thread;

public class DeadlockDemo {
    public static String r1 = "Resource1";
    public static String r2 = "Resource2";

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1(r1,r2));
        Thread t2 = new Thread(new Thread2(r1,r2));
        t1.start();
        t2.start();
    }



}
class Thread1 implements Runnable{
    String r1;
    String r2;

    public Thread1(String r1, String r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run(){
        synchronized (r1){
            System.out.println("Processing r1 in thread1...");
            synchronized (r2){
                System.out.println("Processing r2 in thread1...");
            }
        }
    }
}
class Thread2 implements Runnable{
    String r1;
    String r2;

    public Thread2(String r1, String r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public void run(){
        synchronized (r2){
            System.out.println("Processing r2 in thread2...");
            synchronized (r1){
                System.out.println("Processing r1 in thread2...");
            }
        }
    }
}
