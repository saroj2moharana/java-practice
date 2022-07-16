package com.skm.algo.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Saroj on 17/07/22
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 **/
public class LongestUniqueSubString {
    public static void main(String[] args) {
        String str = "abcabcbb";
        Map<Character, Integer> map = new HashMap<>();
        int i=0, j=0;
        int max = 0;
        char[] ch = str.toCharArray();
        while(j<ch.length) {
            if (!map.containsKey(ch[j])) {
                map.put(ch[j], 1);
                max = Integer.max(max, j - i + 1);
                j++;
            } else {
                while (map.containsKey(ch[j])) {
                    map.remove(ch[i]);
                    i++;
                    max = Integer.max(max, j - i + 1);
                }
            }
        }
        System.out.println(max);
    }

}
