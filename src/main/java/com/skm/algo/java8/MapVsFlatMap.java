package com.skm.algo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author saroj on 15/10/23
 */
public class MapVsFlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list = Stream.of(Arrays.asList(1,2), Arrays.asList(3,4)).collect(Collectors.toList());
        System.out.println(list);//[[1, 2], [3, 4]]
        list.stream().map(x->x).collect(Collectors.toList());
        List<Integer> result = list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(result);//[1, 2, 3, 4]
    }
}
