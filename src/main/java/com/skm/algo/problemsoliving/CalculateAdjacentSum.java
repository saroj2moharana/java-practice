package com.skm.algo.problemsoliving;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by saroj on 7/12/2019.
 * For list of numbers, find sum of maximum elements and remove adjacent element of corresponding maximum element
 * e.g. 8,1,7,9,2,12 so from this list fist pick max element i.e. 12 and then find adjacent element i.e. 13,11
 * check from list so its not present. then check next max element i.e. 9 check adjacent element i.e. 8,10
 * here 8 exist so remove from list and sum of max elements i.e. 22
 * then check max element i.e. 8 but its removed then 7, its adacent will be 6,8 none of them exist
 * continue like this so sum of maximum elements will be 12+9+7+2=30
 */
public class CalculateAdjacentSum {
    public static void main(String arg[]){
        //int a[]=new int[5];
        Integer a[] = {8,1,7,9,2,12,11};
        HashSet hs = new HashSet(Arrays.asList(a));
        System.out.println(hs);
        Integer maxElement = (Integer) Collections.max(hs);
        int sum = 0;
        while(hs.size()>0){
            if(hs.contains(maxElement+1)){
                hs.remove(maxElement+1);
            }
            if(hs.contains(maxElement-1)){
                hs.remove(maxElement-1);
            }
            hs.remove(maxElement);
            sum = sum+maxElement;
            if(!hs.isEmpty()) maxElement = (Integer) Collections.max(hs);
            System.out.println("MxElement:"+maxElement);
            System.out.println("HashSet:"+hs);
        }
        System.out.println("Result:"+sum);

    }
}
