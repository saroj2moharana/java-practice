package com.skm.algo.string;

/**
 * @author Saroj on 19/07/22
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 **/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"f","flow","flight"};
        String p = longestCommonPrefix(strs);
        System.out.println(p);
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        String st = strs[0];
        int l = st.length();
        int ptr = 0;
        while(ptr<l) {
            for (String s : strs) {
                if (s.length() < l) l = s.length();
                if ((s.length() == 0) || (st.charAt(ptr) != s.charAt(ptr))) return str.toString();
            }
            str.append(st.charAt(ptr));
            ptr++;
        }
        return str.toString();
    }
}
