package com.skm.algo.problemsoliving;

/**
 * @author saroj on 2/29/2020
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int a[] = {1,2,9,5,3,7,11,10};
        int dp[] = new int[a.length];
        int ss[] = new int[a.length];
        dp[0] = 1;
        ss[0] = -1;
        int maxIndex = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(a[j] <= a[i]){
                    ss[i] = j;
                    dp[i] = Math.max(dp[i],dp[j]+1);
                    if(dp[i] > maxSum)
                        maxIndex = i;
                    maxSum = Math.max(maxSum,dp[i]);
                }
            }
        }

        System.out.println("\nmaxSum:"+maxSum+",maxIndex:"+maxIndex);
        System.out.println("MaxSubSequence in reverse:");
        while(maxIndex>-1){
            System.out.print(a[maxIndex]+",");
            maxIndex = ss[maxIndex];
        }

    }
}
