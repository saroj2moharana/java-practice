package com.skm.algo.array;

import com.skm.algo.util.ArrayUtil;

import java.util.Scanner;

/**
 * Created by saroj on 4/29/2019.
 * If you are given an integer array and an integer 'k' as input, write a program to print elements with
 * maximum values from each possible sub-array (of given input array) of size 'k'.
 * If the given input array is {9,6,11,8,10,5,14,13,93,14} and for k = 4, output should be 11,11,11,14,14,93,93.
 * Please observe that 11 is the largest element in the first, second and third sub-arrays - {9,6,11,8}, {6,11,8,10}
 * and {11,8,10,5}; 14 is the largest element for fourth and fifth sub-array and 93 is the largest element for
 * remaining sub-arrays.
 */
public class MaximumOfAllSubArray {
    public static void main(String arg[]){
        int arr[] = ArrayUtil.initiateIntArray();
        System.out.println("Please enter sub-array-size : ");
        Scanner sc = new Scanner(System.in);
        int sas = sc.nextInt();
        findMax(arr,sas);
    }
    private static void findMax(int arr[], int sas){
        System.out.print("Maximum of all sub array are : {");
        for(int i=0; i<arr.length; i++){
            int j = i+1;
            int subArraySize = i+sas;
            if(i+sas > arr.length) subArraySize = arr.length-i;
            int max = arr[i];
            while (j<subArraySize){
                max = Integer.max(max,arr[j]);
                j++;
            }
            System.out.print(max+",");
        }
        System.out.print("\b}");
    }
}
