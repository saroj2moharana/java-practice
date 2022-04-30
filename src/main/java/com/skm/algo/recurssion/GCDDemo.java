package com.skm.algo.recurssion;

/**
 * @Author saroj on 30/04/22
 **/
public class GCDDemo {
    public static void main(String[] args) {
        int a = 50, b=18;
        int r = getGCD(a,b);
        System.out.println("GCD : "+r);
    }
    //assume that a is greater than b...
    public static int getGCD(int a, int b){
        if(b == 0) return a;
        return getGCD(b,a%b);
    }
}
