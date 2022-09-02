package com.skm.algo.math;

/**
 * @author Saroj on 01/09/22
 **/
public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 101;//5
        int r = covertToDecimal(n);
        System.out.println("Decimal Conversion of "+n+" is : "+r);
    }
    /*public static int covertToDecimal(String n){
        int r = 0;
        int l = n.length();
        for(int i=0; i<l; i++){
            r += Integer.parseInt(String.valueOf(n.charAt(i)))*Math.pow(2,l-1-i);
        }
        return r;
    }*/

    public static int covertToDecimal(int n){
        if(n == 0 || n==1) return 1;
        int r = 0;
        int i = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            r += rem*Math.pow(2,i++);
        }
        return r;
    }
}
