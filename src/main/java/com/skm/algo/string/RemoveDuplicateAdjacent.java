package com.skm.algo.string;

/**
 * Created by saroj on 6/22/2019.
 */
public class RemoveDuplicateAdjacent {
    public static void main(String arg[]){
        String a = "aaababbbcdff";
        removeAdjacent(a);
    }
    public static void removeAdjacent(String a){
        System.out.println("Original String : "+a);
        String result = "";
        int i = 0;
        while(i<a.length()){
            if(i==a.length()-1){
                result += a.charAt(i);
                i++;
            }else if(a.charAt(i) != a.charAt(i+1)){
                result += a.charAt(i);
                i++;
            }else{
                char temp = a.charAt(i);
                while(i<a.length() && temp == a.charAt(i)){
                    i++;
                }
            }
        }
        System.out.println("After removing adjacent duplicate letters, result : "+result);
    }
}
