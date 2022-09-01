package com.skm.algo.math;

/**
 * @author Saroj on 01/09/22
 **/
public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 8;
        String converted = convertToBinary(n);
        System.out.println("Binary Conversion of "+n+" is : "+converted);
    }
    public static String convertToBinary(int n){
        String str = "";
        while(n>1){
            str = (n%2)+str;
            n = n/2;
        }
        return n+str;
    }
}
