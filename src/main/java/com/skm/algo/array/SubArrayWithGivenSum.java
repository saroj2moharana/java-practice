package com.skm.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author saroj on 23/10/23
 */
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        //int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] a = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,
                117,119,96,48,127,172,139,70,113,68,100,36,
                95,104,12,123,134};
       List<Integer> list = subarraySum(a,a.length,468);
       System.out.println(list);
        list = subarraySumOptimized(a,a.length,468);
        System.out.println(list);
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        int sum = arr[0];
        int i = 1;
        int start = 0;
        int end = -1;
        while(i<n){
            sum += arr[i];
            while(sum>s && start<i){
                sum -= arr[start];
                start++;
            }
            if(sum == s){
                end = i;
                break;
            }
            i++;
        }
        if(end == -1) return (new ArrayList<>(Arrays.asList(new Integer[]{end})));
        return (new ArrayList<>(Arrays.asList(new Integer[]{++start,++end})));
    }

    //By using below method time-complexity would be O(n)...
    static ArrayList<Integer> subarraySumOptimized(int[] arr, int n, int s){
        if(s == arr[0]) return (new ArrayList<>(Arrays.asList(new Integer[]{1,1})));
        // Your code here
        int sum = 0;
        int start = 0;
        int end = 0;
        while(start<=end){
            //System.out.println("start:"+start+",end:"+end+",sum:"+sum);
            if(sum<s && end<n){
                sum += arr[end++];
            }else if(sum>s){
                sum -= arr[start++];
            }
            if(sum == s) break;
        }
        //System.out.println(sum);
        if(sum != s) return (new ArrayList<>(Arrays.asList(new Integer[]{-1})));
        return (new ArrayList<>(Arrays.asList(new Integer[]{++start,end})));
    }
}
