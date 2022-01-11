package com.skm.algo.recurssion;

/**
 * @author saroj on 9/24/2019
 */
public class StringReverse {
    public static void main(String arg[]){
        String str = "saroj";
        String reverseString = reverseString(str);
        System.out.println("Reverse of "+str+" is :"+reverseString);
    }
    public static String reverseString(String str){
        System.out.println(str);
        if(str.length()==1) {
            System.out.println("s:"+str);
            return str;
        }
        str = reverseString(str.substring(1)) + str.charAt(0);
        return str;
    }
}
