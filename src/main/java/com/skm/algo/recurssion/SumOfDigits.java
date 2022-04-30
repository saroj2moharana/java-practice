package com.skm.algo.recurssion;

import java.util.Scanner;

/**
 * @Author saroj on 30/04/22
 * Find sum of digits using recursion...
 **/
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, please enter a number to find the sum of digits...");
        int n = sc.nextInt();

        int s = digitSum(n);
        System.out.println("Sum : "+s);
    }
    public static int digitSum(int n){
        //base condition...
        if(n<=0) return 0;
        int r = n%10;
        return r+digitSum(n/10); // this is the recursion body as [f(n) = n%10 + f(n/10]
    }
}
