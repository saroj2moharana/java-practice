package com.skm.algo.array;

import java.util.Arrays;

/**
 * @author saroj on 8/19/2020
 */
public class TestDemo2 {
    public static void main(String[] args) {
        String str1 = "Triangley";//96+24 != 45+75;
        String str2 = "Integral";

        if(compare(str1.toLowerCase(),str2.toLowerCase()))
            System.out.println("Equal...");
        else
            System.out.println("Not Equal...");



       /* //sort the charArrays...
        char ch1[] = str1.toLowerCase().toCharArray();
        char ch2[] = str2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String str3 = new String(ch1);
        String str4 = new String(ch2);
        if(str3.contentEquals(str4)){
            System.out.println("Equal...");
        }else
            System.out.println("Not Equal...");
*/
    }

    private static boolean compare(String str1, String str2){
        for(int i=0 ; i<str1.length();i++){
            char ch = str1.charAt(i);
            if(str2.indexOf(ch) < 0){
                return false;
            }
        }
        return true;
    }

}
