package com.skm.algo.array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author saroj on 11/4/2019
 */
public class DistinctElementsFinder {
    public static void main(String[] args) {
        int a[] = {1,2,1,4,5,6,9,6,10};
        HashSet hs = new HashSet();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        System.out.println("After Filter:"+hs);
    }
}
