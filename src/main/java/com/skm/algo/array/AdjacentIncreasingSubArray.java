package com.skm.algo.array;


import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdjacentIncreasingSubArray {
    public static void main(String[] args) {
        AdjacentIncreasingSubArray a = new AdjacentIncreasingSubArray();
        Assert.assertFalse(a.hasIncreasingSubarrays(List.of(-3,-19,-8,-16), 2));
        Assert.assertFalse(a.hasIncreasingSubarrays(List.of(1,2,3,4,4,4,4,5,6,7), 5));
        Assert.assertFalse(a.hasIncreasingSubarrays(List.of(6,13,-17,-20,2), 2));
        Assert.assertTrue(a.hasIncreasingSubarrays(List.of(5, 8, -2, -1), 2));
        Assert.assertTrue(a.hasIncreasingSubarrays(List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1), 3));
    }

    /*public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int l = nums.size();
        if(k ==1 || (k==2 && l == 4)) return true;
        int i = 2;
        int c = k;
        int resCount = 0;
        int prev = nums.get(1);
        int prevDiff = prev - nums.get(0);
        while (i < l & c > 0) {
            int curDiff = nums.get(i) - prev;
            if (curDiff == prevDiff) {
                c--;
            }
            prev = nums.get(i);
            prevDiff = curDiff;
            System.out.println("i:"+i+",c:"+c+",resCount:"+resCount);
            if (c == k-1) {
                resCount++;
                c = k;
            }
            i++;
        }
        return resCount == 2;
    }*/

    /*public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int inc = 1, prevInc = 0, maxLen = 0;
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) inc++;
            else {
                prevInc = inc;
                inc = 1;
            }
            maxLen = Math.max(maxLen, Math.max(inc >> 1, Math.min(prevInc, inc)));
            if (maxLen >= k) return true;
        }
        return false;
    }*/
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (k == 1) return true;
        int l = nums.size();
        int t = 0;
        int a[] = new int[l];
        a[0] = 1;
        for (int i = 1; i < l; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                a[i] = Math.min(k,a[i-1]+1);
            } else a[i] = 1;
        }
        System.out.println(Arrays.toString(a));
        for(int i=0; i<l-(2*k-1); i++){
            if(a[i+k-1] == k && a[i+k-1] == a[i+2*k-1]){
                return true;
            }
        }
        return false;
    }

}
