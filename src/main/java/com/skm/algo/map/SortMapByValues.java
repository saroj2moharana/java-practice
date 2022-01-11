package com.skm.algo.map;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by saroj on 7/5/2019.
 */
public class SortMapByValues {
    public static void main(String arg[]){
        Map<String,Integer> maps = new HashMap<>();
        maps.put("saroj",10);
        maps.put("saroj1",30);
        maps.put("saroj2",15);
        maps.put("saroj3",40);
        maps.put("saroj4",25);
        System.out.println("Maps:"+maps);

        //(e1,e2)->e1 --- merge function, it will merge if key will conflict...
        Map<String, Integer> sortedMap = maps.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
        Map<String, Integer> sortedMap2 = maps.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                e1-> e1.getKey(),e2->e2.getValue(),(e1,e2)->e1, LinkedHashMap::new));
        System.out.println(sortedMap);
        List<Map.Entry<String,Integer>> list = new ArrayList<>(maps.entrySet());
        //list.sort(Map.Entry.comparingByValue());
        System.out.println("List : "+list);

        list.sort(new ValueComparator());
        System.out.println("Sorted List:"+list);


    }
}
class ValueComparator implements Comparator<Map.Entry<String,Integer>> {
    @Override
    public int compare(Map.Entry<String,Integer> entrySet1, Map.Entry<String,Integer> entrySet2) {
        System.out.println("Compare with entrySet1:"+entrySet1);
        System.out.println("Compare with entrySet2:"+entrySet2);
        return entrySet2.getValue().compareTo(entrySet1.getValue());
    }
}
