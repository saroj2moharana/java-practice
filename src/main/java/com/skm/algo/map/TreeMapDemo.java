package com.skm.algo.map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author saroj on 9/18/2019
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        ValuesComparator valueComparator = new ValuesComparator();
        TreeMap treeMap = new TreeMap(valueComparator);
        //valueComparator.setMap(treeMap);
        treeMap.put("saroj3",1);
        System.out.println("Current Map:"+treeMap);
        treeMap.put("saroj1",3);
        System.out.println("Current Map:"+treeMap);
        treeMap.put("saroj4",10);
        System.out.println("Current Map:"+treeMap);
        treeMap.put("saroj5",1);
        System.out.println("Current Map:"+treeMap);
        treeMap.put("saroj",2);
        System.out.println("Current Map:"+treeMap);
        treeMap.put("saroj",45);
        System.out.println("Current Map:"+treeMap);
    }
}
class ValuesComparator implements Comparator<String>{
    @Override
    public int compare(String k1, String k2) {
        return k1.compareTo(k2);
    }
}