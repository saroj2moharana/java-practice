package com.skm.algo.string;

/**
 * @Author saroj on 08/05/22
 **/
public class MaxPalindromSubString {
    public static void main(String[] args) {
        String str = "sarorask";
        String res = getMaxPalindromeSubString(str);
        System.out.println(res);
    }

    /**
     * This is solved by dynamic programming....
     * @param str
     * @return
     */
    public static String getMaxPalindromeSubString(String str){
        boolean p[][] = new boolean[str.length()][str.length()];
        int start = 0, end = 0;
        for(int gap=0; gap<str.length(); gap++){
            for(int i=0,j=gap; j<str.length(); i++,j++ ){
                if(gap == 0){
                    p[i][j] = true;
                }else if(gap == 1){
                    p[i][j] = str.charAt(i) == str.charAt(j);
                }else if (str.charAt(i) == str.charAt(j) && p[i + 1][j - 1]) {
                    start = i;
                    end = j;
                    p[i][j] = true;
                }
            }
        }
        return str.substring(start+1,end);
    }
}
