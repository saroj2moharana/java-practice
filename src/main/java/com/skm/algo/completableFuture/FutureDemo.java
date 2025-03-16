package com.skm.algo.completableFuture;

import java.util.concurrent.CompletableFuture;

public class FutureDemo {
    public static void main(String args[]) {
        int a = 5;
        int b = 6;
        FutureDemo fd = new FutureDemo();
        fd.printThreadName("main");
        CompletableFuture<Void> result = fd.add(a, b)
                .thenCompose(fd::result)
                .thenRunAsync(() -> {
                    fd.printThreadName("async");
                    try {
                        Thread.sleep(5000L);
                        System.out.println("After 5000ms...");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("running asynchronously....");
                }).thenRunAsync(() -> {
                    System.out.println("Inside last async-1");
                    fd.printThreadName("last-async-1");
                });
        CompletableFuture.runAsync(() -> {
            System.out.println("Inside last async-2");
            fd.printThreadName("last-async-2");
        });
        result.join();
        System.out.println("RESULT : ");

    }

    public CompletableFuture<Integer> add(int a, int b) {
        printThreadName("add");
        return CompletableFuture.completedFuture(a + b);
    }

    public CompletableFuture<String> result(int res) {
        printThreadName("result");
        String str = "result : " + res;
        System.out.println("Inside result:" + str);
        return CompletableFuture.completedFuture(str);
    }

    private void printThreadName(String methodName) {
        System.out.println("Inside method:" + methodName + ", thread:" + Thread.currentThread().getName());
    }
}
