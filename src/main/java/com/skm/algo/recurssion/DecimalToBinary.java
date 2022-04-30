package com.skm.algo.recurssion;

/**
 * @Author saroj on 30/04/22
 **/
public class DecimalToBinary {
    public static void main(String[] args) {
        int a = 6;
        String r = getBinary(a);
        System.out.println("Binary-Conversion:"+r);
    }
    public static String getBinary(int a){
        //base condition...
        if(a == 0) return "";
        return getBinary(a/2)+a%2+"";//for f(n) = f(n/2)+n%2+"" i.e. [1+0+0+""]. it's string concatenation...
    }
}
