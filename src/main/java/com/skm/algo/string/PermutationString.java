package com.skm.algo.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by saroj on 6/3/2019.
 */
public class PermutationString {
    //private static HashSet<String> values = new LinkedHashSet<>();
    static List values = new ArrayList<>();

    private static void StringPermutation(String permutation, String input){
        System.out.println("Permutation:"+permutation+" -- input:"+input);
        if(input.length() == 0){
            values.add(permutation);//for avoidinig duplication...
        }else{
            for (int i = 0; i < input.length(); i++){
                StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
            }
        }
    }

    public static void main(String[] args){
        StringPermutation("", "abc");
        System.out.println(values);

    }
}
