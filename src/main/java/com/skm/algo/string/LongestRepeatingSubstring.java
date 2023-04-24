package com.skm.algo.string;

/**
 * @author saroj on 19/04/23
 */
public class LongestRepeatingSubstring {
    public static void main(String[] args) {
        String str = "agstbbuvzaz";
        String res = findRepeatingSubstring(str);
        System.out.println(res);
    }
    public static String findRepeatingSubstring(String str){
        StringBuilder builder = new StringBuilder();
        char ch = str.charAt(0);
        for(int i=1; i<str.length();i++){
            if(str.charAt(i) == ch) builder.append(ch);
            else ch = str.charAt(i);
        }
        return builder.toString();
    }
}
