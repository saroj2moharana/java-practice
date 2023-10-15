package com.skm.algo.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saroj on 15/10/23
 */
public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int a[] = {1,5,7,1};
        int l = a.length;
        int k = 6;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<l; i++){
            if(map.containsKey(k-a[i]))
                count += map.get(k-a[i]);
            Integer val = map.get(a[i]);
            if(val == null) val = 0;
            map.put(a[i],++val);
        }
        System.out.println("Total Count:"+count);
    }


}
