package com.skm.algo.array;

/**
 * @author Saroj on 26/05/22
 * Two strings word1 and word2 are considered almost equivalent if the differences between the frequencies of each letter from 'a' to 'z' between word1 and word2 is at most 3.
 *
 * Given two strings word1 and word2, each of length n, return true if word1 and word2 are almost equivalent, or false otherwise.
 *
 * The frequency of a letter x is the number of times it occurs in the string.
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = "aaaa", word2 = "bccb"
 * Output: false
 * Explanation: There are 4 'a's in "aaaa" but 0 'a's in "bccb".
 * The difference is 4, which is more than the allowed 3.
 **/
public class EquivalentWords {
    public static void main(String[] args) {
        boolean flag =  checkEquivalentWords("iiiaaa","jjjj");
        System.out.println(flag);
    }

    private static boolean checkEquivalentWords(String word1, String word2) {
        int count1[] = new int[26];
        int count2[] = new int[26];
        int l = word2.length();

        for(int i = 0; i< word1.length(); i++){
            count1[word1.charAt(i)-'a']++;
            if(i<l) count2[word2.charAt(i)-'a']++;
        }

        for(int i=0; i< count1.length; i++){
            int d = count1[i]-count2[i];
            if(Math.abs(d)>3) return false;
        }

        return true;
    }
}
