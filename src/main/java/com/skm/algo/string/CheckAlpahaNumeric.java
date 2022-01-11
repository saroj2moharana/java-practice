package com.skm.algo.string;

/**
 * Created by saroj on 7/27/2019.
 */
public class CheckAlpahaNumeric {
    public static void main(String arg[]){
        checkAlphabets('a');
        checkAlphabets('B');
        checkAlphabets('Y');
        checkAlphabets('*');
    }
    public static void checkAlphabets(char a){
        if((a>='a' && a<='z') || (a>='A' && a<='Z')){
            System.out.println("Valid Alphabet...");
        }else{
            System.out.println("InValid Alphabet...");
        }
    }
}
