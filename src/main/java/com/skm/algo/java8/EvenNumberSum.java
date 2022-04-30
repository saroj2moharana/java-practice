package com.skm.algo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author saroj on 23/04/22
 **/
public class EvenNumberSum {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
        /*AtomicInteger r = new AtomicInteger();
        integers.stream().filter(n->n%2==0).forEach(n->{
            r.addAndGet(n * 2);
        });*/
        //get sum by java-8...
        int s = integers.stream().filter(n->n%2==0).mapToInt(n->n*2).sum();
        System.out.println("sum:"+s);
    }
}
