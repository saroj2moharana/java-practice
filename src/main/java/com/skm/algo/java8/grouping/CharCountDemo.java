package com.skm.algo.java8.grouping;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountDemo {
    public static void main(String[] args) {
        String str = "Saroj kumar moharana";
        //finding char frequency...
        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(charCountMap);
        //finding those chars whose count is greater than 1...
        charCountMap
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1L)
                .forEach(System.out::println);

        int[] a = new int[]{10, 40, 20, 30};
        //getting max element from an int array...
        int res = Arrays.stream(a)
                .max()
                .getAsInt();
        System.out.println("max:" + res);
        //getting 3rd largest element from int array...
        Arrays.stream(a)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .skip(2)
                .forEach(System.out::println);

        //null check in object and in each item as well.
        List<String> list = new ArrayList<>();
        list.add("saroj");
        list.add(null);
        list.add("kumar");
        list.add(null);
        list.add("moharana");
        Optional.of(list)
                .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
                .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
                .map(String::toLowerCase) // method reference, consider only tag name
                .forEach(System.out::println); // it will print tag names
    }
}
