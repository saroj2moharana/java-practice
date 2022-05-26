package com.skm.algo.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author saroj on 19/05/22
 **/
public class FrequencyMap {
    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("hello", "bye", "ciao", "bye", "ciao");
        Map<String, Long> map = wordsList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        getCount("aabbacab");
    }

    public static void getCount(String word){
        Map<Character, Long> countMap = word.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countMap);
        Set<Character> set = new HashSet<>();
    }

}
