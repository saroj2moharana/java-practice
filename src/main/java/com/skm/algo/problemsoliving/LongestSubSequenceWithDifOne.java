package com.skm.algo.problemsoliving;

import java.util.ArrayList;

/**
 * @author saroj on 10/18/2019
 */
public class LongestSubSequenceWithDifOne {
    public static void main(String[] args) {
        String str = generateString(4);
        System.out.println("Generated String:"+str);

        ArrayList al = new ArrayList();
        generatePermutation("",str,al);
        StringBuilder stringBuilder = new StringBuilder((String)al.get(0));
        String str1 = stringBuilder.reverse().toString();
        System.out.println("Permutations:"+al);
        System.out.println(al.get(0)+str1);
    }
    static String generateString(int n){
        String str = "";
        for(int i=n/2;i>0;i--){
            if(i==1){
                str += "5";
            }else{
                str += "4";
            }
        }
        return str;
    }
    static void generatePermutation(String permStr, String inputStr, ArrayList al){
        if(inputStr.length()==0 ){
            al.add(permStr);
        }else{
            for(int i=0;i<inputStr.length();i++){
                generatePermutation(permStr+inputStr.charAt(i),
                        inputStr.substring(0,i)+inputStr.substring(i+1,inputStr.length()),al);
            }
        }
    }
}
