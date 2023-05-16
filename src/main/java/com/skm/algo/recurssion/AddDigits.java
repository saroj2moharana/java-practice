package com.skm.algo.recurssion;

/**
 * @author saroj on 26/04/23
 * LeetCode - 258. Add Digits
 */
public class AddDigits {
    public static void main(String[] args) {
        int n = 9999;
        int r = getDigitsSum(n);
        System.out.println(r);
    }
    public static int getDigitsSum(int n){
        if(n<10) return n;
        int r = 0;
        while(n>0) {
            r += (n % 10);
            n /= 10;
        }
        if(r>9) r = getDigitsSum(r);
        return r;
    }
}
