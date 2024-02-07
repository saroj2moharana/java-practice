package com.skm.algo.recurssion;

/**
 * @author saroj on 16/10/23
 */
public class Fibonacci {
    public static void main(String[] args) {
        int res = nthFibonacci(14521);
        System.out.println(res);
    }
    static int nthFibonacci(){
        int n = 5;
        for(int i=1; i<n; i++){
            System.out.println(i);
            i = i+1;
        }
        return 0;
    }
    static int nthFibonacci(int n){
        // code here
        if(n>0 && n<=100000){
            int f = 0;
            int s = 1;
            if(n==0) return 0;
            if(n == 1) return 1;
            for(int i=2; i<=n; i++){
                int temp = f+s;
                temp %= 1000000007;
                f = s;
                s=temp;
            }
            return s;
        }
        return 0;
    }
}
