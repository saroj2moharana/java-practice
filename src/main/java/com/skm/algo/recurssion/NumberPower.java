package com.skm.algo.recurssion;

/**
 * @Author saroj on 30/04/22
 **/
public class NumberPower {
    public static void main(String arg[]){
        int r = power(5,3);
        System.out.println("result:"+r);
    }
    public static int power(int n, int p){
        //base condition...
        if(p==0) return 1;
        return n*power(n,p-1);//this is the body of recursion as [f(n,p) = n*f(n,p-1)]
    }
}
