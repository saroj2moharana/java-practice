package com.skm.algo.map;

import java.util.*;

/**
 * @author saroj on 3/14/2020
 */
public class SortArrayDemo {
    public static void main(String[] args) {
        int a[] = {1,3,4,2,1,3,5};
        getOrder(a);
    }
    public static void getOrder(int a[]){
        HashMap hm = new HashMap();
        for(int i=0;i<a.length;i++){
            Integer value = (Integer) hm.get(a[i]);
            if(value == null){
                value = 0;
            }
            hm.put(a[i],++value);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort(new ValueComparatorDemo());
        //System.out.println(list)
    }
}
class ValueComparatorDemo implements Comparator<Map.Entry<String,Integer>> {
    @Override
    public int compare(Map.Entry<String,Integer> entrySet1, Map.Entry<String,Integer> entrySet2) {
        System.out.println("Compare with entrySet1:"+entrySet1);
        System.out.println("Compare with entrySet2:"+entrySet2);
        return entrySet2.getValue().compareTo(entrySet1.getValue());
    }
}
