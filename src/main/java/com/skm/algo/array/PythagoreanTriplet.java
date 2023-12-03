package com.skm.algo.array;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author saroj on 04/11/23
 * Given an array arr of n integers, write a function that returns true if there is a triplet (a, b, c) from the array
 * (where a, b, and c are on different indexes) that satisfies a2 + b2 = c2, otherwise return false.
 * Example :
 * Arr[] = {3, 2, 4, 6, 5}
 * Output: Yes
 * Explanation: a=3, b=4, and c=5 forms a pythagorean triplet.
 */
public class PythagoreanTriplet {
    public static void main(String[] args) {
        int a[] = {3, 2, 4, 6, 5};
        boolean flag = checkTriplet(a,a.length);
        System.out.println("Triplet check : "+flag);
    }
    static boolean checkTriplet(int[] a, int n) {
        // code here
        Set<Integer> set = Arrays.stream(a).boxed().map(i->i*i).collect(Collectors.toSet());
        for(int i=0; i<n ;i++){

        }
        return false;
    }
}
