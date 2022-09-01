package com.skm.algo.math;

/**
 * @author Saroj on 01/09/22
 **/
public class BinaryToDecimal {
    public static void main(String[] args) {
        String n = "1000";//6
        int r = covertToDecimal(n);
        System.out.println("Decimal Conversion of "+n+" is : "+r);
    }
    public static int covertToDecimal(String n){
        int r = 0;
        int l = n.length();
        for(int i=0; i<l; i++){
            r += Integer.parseInt(String.valueOf(n.charAt(i)))*Math.pow(2,l-1-i);
        }
        return r;
    }
}
