package com.skm.algo.string;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by saroj on 6/22/2019.
 */
public class LongestPalindrome {
    public static void main(String arg[]){
        longestPallindrome("abacdadc");
    }
    static void longestPallindrome(String s){
        System.out.println("Pallindrom of :"+s+" is as below :");
        HashSet pStrings = new LinkedHashSet();
        for(int i=1; i<s.length();i++){
            String temp = currentPallindrom(i,s);
            if(temp != null) pStrings.add(temp);
        }
        System.out.println(pStrings);
        System.out.println("Longest Palindrome:"+Collections.max(pStrings));
    }
    static String currentPallindrom(int curPosition,String s){
        int left = curPosition;
        int right = curPosition;
        while(left>0 && right<s.length()-1 && s.charAt(left-1) == s.charAt(right+1)){
            left--;
            right++;
        }
        if(left != right) return s.substring(left,right+1);
        //return s.substring(left,right);
        return null;
    }
}
