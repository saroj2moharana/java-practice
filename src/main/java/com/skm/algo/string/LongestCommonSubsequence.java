package com.skm.algo.string;

/**
 * @author saroj on 06/09/23
 */
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String a = "Saroj";
        String b = "kumar";
        int[][] m= new int[a.length()+1][b.length()+1];
        fillArray(a,b,m);
        System.out.println("max:"+m[a.length()][b.length()]);
        String res = printLongestSubSequence(a,b,m);
        System.out.print("Longest Subsequence:"+res);
    }

    /**
     * Printing longest common subsequence...
     * @param a
     * @param b
     * @param m
     * @return
     */
    private static String printLongestSubSequence(String a, String b, int[][] m) {
        int l1 = a.length();
        int l2 = b.length();
        int i = l1, j = l2;
        String str = "";
        while(i>1 && j>1){
            if(b.charAt(i-1) == a.charAt(j-1)){
                str = a.charAt(j-1)+str;
                i--;
                j--;
            }else if(m[i][j-1] > m[i-1][j]) j--;
            else i--;
            }
        return str;
    }

    /**
     * Filling 2d array for better calculation...
     * @param a
     * @param b
     * @param m
     */
    public static void fillArray(String a, String b, int m[][]){
        int l1 = a.length();
        int l2 = b.length();
        for(int i=1; i <= l1; i++){
            for(int j=1; j <= l2; j++) {
                if(b.charAt(i-1) == a.charAt(j-1)){
                    m[i][j] = 1+m[i-1][j-1];
                }else {
                    m[i][j] = Integer.max(m[i-1][j],m[i][j-1]);
                }
            }
        }
    }
}
