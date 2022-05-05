package com.skm.algo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

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
        executeArray();
    }
    public static void executeArray(){
        System.out.println("Hello World");
        int a[] = {1,2,3,4,5,6};
        //Arrays.stream(a).filter(i -> i%2==0).map(i -> i+2).boxed().collect(Collectors.toList());
        List<Integer> list = Arrays.stream(a).filter(i->i%2==0).map(i->i+2).boxed().collect(Collectors.toList());
        System.out.println(list);
    }
}
