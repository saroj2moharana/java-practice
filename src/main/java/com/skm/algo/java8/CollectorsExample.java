package com.skm.algo.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author saroj on 27/04/23
 */
public class CollectorsExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("saroj","kumar","moharana");
        list = list.stream().map(str -> "mr-"+str).collect(java.util.stream.Collectors.toList());
        System.out.println(list);
    }
}
