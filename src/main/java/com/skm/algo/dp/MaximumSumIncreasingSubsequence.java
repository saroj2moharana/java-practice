package com.skm.algo.dp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author saroj on 23/10/23
 */
public class MaximumSumIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = { 1, 101, 2, 3, 100 };
        MaximumSumIncreasingSubsequence m = new MaximumSumIncreasingSubsequence();
        int r = m.maxSumIS(arr, arr.length);
        System.out.println("Max Sum Increasing sub-sequence : "+r);
        new ArrayList<>(Arrays.asList(new int[]{-1}));
    }
    public int maxSumIS(int arr[], int n){
        //code here.
        int dp[] = new int[n];
        dp[0] = arr[0];
        //start from 1st index...
        int maxSum = dp[0];
        for(int i=1; i<n; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(arr[j]<arr[i]) max = Integer.max(max, dp[j]);
            }
            dp[i] = arr[i] + max;
            maxSum = Integer.max(dp[i],maxSum);
        }
        return maxSum;
    }
}
