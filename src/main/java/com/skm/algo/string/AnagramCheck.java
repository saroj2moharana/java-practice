package com.skm.algo.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by saroj on 5/5/2019.
 * Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are anagram of each other or not.
 * An anagram of a string is another string that contains same characters, only the order of characters can be different.
 * For example, “act” and “tac” are anagram of each other.
 */
public class AnagramCheck {
    public static void main(String arg[]){
        System.out.print("Please enter 2 strings : ");
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        checkAnagram(first,second);
    }

    /**
     * This is for checking anagram between two strings...
     * @param first
     * @param second
     */
    private static void checkAnagram(String first, String second){
        char a[] = first.toLowerCase().toCharArray();
        Arrays.sort(a);
        char b[] = second.toLowerCase().toCharArray();
        Arrays.sort(b);
        if(a.length == b.length && Arrays.equals(a,b)){
            System.out.println("Above two strings are anagram");
        }else{
            System.out.println("Above two strings are not anagram");
        }
    }
}
