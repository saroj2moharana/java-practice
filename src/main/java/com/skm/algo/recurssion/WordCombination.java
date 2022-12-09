package com.skm.algo.recurssion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Saroj on 08/12/22
 **/
public class WordCombination {
    public static void main(String[] args) {
        WordCombination wc = new WordCombination();
        Map<String, List<String>> dimensions = wc.generateObject();
        wc.generateWords(dimensions);
    }

    private void generateWords(Map<String, List<String>> dimensions) {
        List<List<String>> values = new ArrayList<>(dimensions.values());
        System.out.println("values : "+values);
        Set<String> result = new LinkedHashSet<>();
        generateCombinations(values,result,0,"");
        System.out.println("result : "+result);

        splitResults(result,new ArrayList<>(dimensions.keySet()));
        /*List<List<String>> results = combinations(values);
        System.out.println(results);*/

    }

    private void splitResults(Set<String> results, ArrayList<String> es) {
        List<Map<String,String>> list = new ArrayList<>();
        for(String str : results){
            String[] strings = str.split("-");
            Map<String, String> map = new LinkedHashMap<>();
            String pixel = "";
            for(int i=0; i<strings.length; i++){
                map.put(es.get(i), strings[i]);
                if(i>0) pixel += "&" + es.get(i) + "=" + strings[i];
                else pixel = es.get(i) + "=" + strings[i];
            }
            map.put("pixel",pixel);
            list.add(map);
        }
        System.out.println(list);
    }

    public static <T> List<List<T>> combinations(List<List<T>> lists) {
        // incorrect incoming data
        if (lists == null) return Collections.emptyList();
        return lists.stream()
                // non-null and non-empty lists
                .filter(list -> list != null && list.size() > 0)
                // represent each list element as a singleton list
                .map(list -> list.stream().map(Collections::singletonList)
                        // Stream<List<List<T>>>
                        .collect(Collectors.toList()))
                // summation of pairs of inner lists
                .reduce((list1, list2) -> list1.stream()
                        // combinations of inner lists
                        .flatMap(inner1 -> list2.stream()
                                // merge two inner lists into one
                                .map(inner2 -> Stream.of(inner1, inner2)
                                        .flatMap(List::stream)
                                        .collect(Collectors.toList())))
                        // list of combinations
                        .collect(Collectors.toList()))
                // otherwise an empty list
                .orElse(Collections.emptyList());
    }
    //generatePermutations(lists, result, 0, "");
    void generateCombinations(List<List<String>> lists, Set<String> result, int depth, String current) {
        if (depth == lists.size()) {
            result.add(current.substring(1));
            return;
        }
        for (int i = 0; i < lists.get(depth).size(); i++) {
            generateCombinations(lists, result, depth + 1, current +"-"+ lists.get(depth).get(i));
        }
    }

    public Map<String, List<String>> generateObject(){
        Map<String, List<String>> map = new LinkedHashMap<>();
        List<String> strings = Arrays.asList("pub1", "pub2");
        map.put("ut1", Arrays.asList("x", "y"));
        map.put("ut2", Arrays.asList("a", "a"));
        map.put("ut3", Arrays.asList("i", "j"));
        //map.put("ut4", Arrays.asList("l", "m"));
        return map;
    }
}
