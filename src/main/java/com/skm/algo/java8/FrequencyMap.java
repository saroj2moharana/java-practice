package com.skm.algo.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author saroj on 19/05/22
 **/
public class FrequencyMap {
    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("hello", "bye", "ciao", "bye", "ciao");
        Map<String, Long> map = wordsList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        getCount("aabbacab");
        sortMapByLength("aabbacab");
    }

    public static void getCount(String word){
        Map<Character, Long> countMap = word.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("countMap"+countMap);
        Set<Character> set = new HashSet<>();
    }
    public static void sortMapByLength(String word){
        Map<Character,Long> map = word.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<Character,Long>comparingByValue().reversed()).collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),(e1,e2)->e1,LinkedHashMap::new))
                ;
        System.out.println(map);

    }

}
