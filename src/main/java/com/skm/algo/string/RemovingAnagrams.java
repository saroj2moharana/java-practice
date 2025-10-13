package com.skm.algo.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * You are given a 0-indexed string array words, where words[i] consists of lowercase English letters.
 *
 * In one operation, select any index i such that 0 < i < words.length and words[i - 1]
 * and words[i] are anagrams, and delete words[i] from words. Keep performing this operation as long as you can
 * select an index that satisfies the conditions.
 *
 * Input: words = ["abba","baba","bbaa","cd","cd"]
 * Output: ["abba","cd"]
 */
public class RemovingAnagrams {
    public static void main(String[] args) {
        String[] words = {"abba","baba","bbaa","cd","cd"};
        //String[] words = {"a","b","c","d","e"}; output : ["a","b","c","d","e"]
        RemovingAnagrams r1 = new RemovingAnagrams();
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        String prev = words[0];
        for(int i=1; i<words.length; i++){
            if(!r1.checkAnagram(prev, words[i])){
                result.add(words[i]);
                prev = words[i];
            }
        }
        System.out.println("Anagram checked : "+result);
    }
    private boolean checkAnagram(String a, String b){
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        if(a1.length != b1.length) return false;
        Arrays.sort(a1);
        Arrays.sort(b1);
        for(int i=0; i<a1.length; i++){
            if(a1[i] != b1[i]) return false;
        }
        return true;
    }
}
