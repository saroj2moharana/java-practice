package com.skm.algo.array;

/**
 * Created by Saroj on 04/01/22
 * Print 1 to 10 without loop.
 **/
public class PrintDemo {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(int a){
        if(a>10) return;
        System.out.println(a);
        print(++a);
    }
}
