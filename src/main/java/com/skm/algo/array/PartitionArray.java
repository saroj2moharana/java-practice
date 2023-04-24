package com.skm.algo.array;

import java.util.Arrays;

/**
 * @author saroj on 13/04/23
 */
public class PartitionArray {
    public static void main(String[] args) {
        int a[] = {13,11,1,18,20,3,5,14,10,17};
        //int a[] = {4,4,4,4};
        //int a[] = {4,2,2,5,1};
        long res = minDifference(a.length, a);
        System.out.println("res:"+res);
    }
    public static long minDifference(int n, int a[]) {
        int partitionValue = Math.round((float) n/4);
        System.out.println("PartitionValue:"+partitionValue);
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        Arrays.sort(a);
        // code here
        int i = 0;
        while(i<n){
            int j = 0;
            int sum = 0;
            System.out.println("Starting position : "+i);
            while(j<partitionValue && i<n){
                sum += a[i];
                i++;
                j++;
            }
            System.out.println("Ending position : "+i);
            System.out.println("Sum : "+sum+", minSum:"+minSum+", maxSum:"+maxSum);
            minSum = Math.min(minSum, sum);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum-minSum;
    }
}
