package com.skm.algo.array;

import com.skm.algo.util.ArrayUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Saroj on 19/07/22
 **/
public class RightSmallestCount {
    public static void main(String[] args) {
        int[] res = constructLowerArray(new int[]{12, 1, 2, 3, 0, 11, 4},7);
        ArrayUtil.printArray(res);
    }
    static int[] constructLowerArray(int[] arr, int n) {
        // code here
        int org[] = new int[n];
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]>arr[j]) org[i] += 1;
            }
        }
        return org;
    }
}
