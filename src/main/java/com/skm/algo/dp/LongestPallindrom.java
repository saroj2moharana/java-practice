package com.skm.algo.dp;

/**
 * @author saroj on 14/04/23
 */
public class LongestPallindrom {
    public static void main(String[] args) {
        String str = "bbbab";
        int res = getLongesstPallindrom(str);
        System.out.println("longestPallindrom : "+res);
    }
    public static int getLongesstPallindrom(String str){
        int length = str.length();
        int startIndex = 0;
        int endIndex = 0;
        boolean a[][] = new boolean[length][length];
        for(int i=0; i<length; i++){
            for(int j = i; j<length; j++){
                if(i==j) a[i][j] = true;
            }
        }
        for(int i=0; i<length; i++){
            for(int j = i; j<length; j++) {
                if(str.charAt(i) == str.charAt(j)){
                    if(a[i+1][j-1]) {
                        startIndex = i;
                        endIndex = 1;
                        a[i][j] = true;
                    }else a[i][j] = false;
                }
            }
        }
        System.out.println(endIndex+"--"+startIndex);
        return endIndex-startIndex+1;
    }
}
