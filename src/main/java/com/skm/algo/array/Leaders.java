package com.skm.algo.array;

import com.skm.algo.util.ArrayUtil;

/**
 * Created by saroj on 4/26/2019.
 * Write a program to print all the LEADERS in the array.
 * An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader.
 * For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
 */
public class Leaders {
    public static void main(String arg[]){
        int arr[] = ArrayUtil.initiateIntArray();
        findLeaders(arr);
    }

    /**
     * This is for finding leaders in array...
     * @param arr
     */
    private static void findLeaders(int arr[]){
        System.out.print("Leaders in Array : {");
        for(int i=0; i<arr.length; i++){
            int j = i+1;
            while(j<arr.length && arr[i]>arr[j]){
                ++j;
            }
            if(j==arr.length)
                System.out.print(arr[i]+",");
        }
        System.out.print("\b}");
    }
}
