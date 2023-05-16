package com.skm.algo.array;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author saroj on 03/05/23
 */
public class ArrayDifference {
    public static void main(String[] args) {
        int n1[] = {1,2,3};
        int n2[] = {2,4,6};
        System.out.println(findDifference(n1,n2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> num1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> num2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();

        for(Integer key : num1Set){
            if(!num2Set.contains(key)) r1.add(key);
        }

        for(Integer key : num2Set){
            if(!num1Set.contains(key)) r2.add(key);
        }
        List<List<Integer>> finalList = new ArrayList<>();
        finalList.add(r1);
        finalList.add(r2);
        return finalList;
    }
}
