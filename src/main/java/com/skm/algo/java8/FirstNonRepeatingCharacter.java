package com.skm.algo.java8;


import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author saroj on 16/10/23
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        char ch = findNonRepeatCharacter("eleoo");
        System.out.println(ch);
    }
    static char findNonRepeatCharacter(String s){
        Map.Entry entry = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().min(Map.Entry.comparingByValue()).get();
        if(entry != null){
            long val = (long)entry.getValue();
            if(val == 1l){
                return (char) entry.getKey();
            }
        }
        return '$';
    }
}
