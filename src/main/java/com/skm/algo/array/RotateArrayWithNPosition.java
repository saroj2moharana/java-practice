package com.skm.algo.array;

import com.skm.algo.util.ArrayUtil;

/**
 * @author saroj on 12/1/2019
 * Assuming we are given {1,2,3,4,5,6} and order 2. The basic idea is:
 * 1. Divide the array two parts: 1,2,3,4 and 5, 6
 * 2. Reverse first part: 4,3,2,1,5,6
 * 3. Reverse second part: 4,3,2,1,6,5
 * 4. Reverse the whole array: 5,6,1,2,3,4
 * we do this in O(1) space and in O(n) time
 */
public class RotateArrayWithNPosition {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        rotate(a,2);
    }
    public static void rotate(int[] arr, int order) {
        if (arr == null || arr.length==0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        if(order > arr.length){
            order = order %arr.length;
        }

        //length of first part
        int a = arr.length - order;

        reverse(arr, 0, a-1);
        reverse(arr, a, arr.length-1);
        reverse(arr, 0, arr.length-1);
        ArrayUtil.printArray(arr);
    }

    public static void reverse(int[] arr, int left, int right){
        if(arr == null || arr.length == 1)
            return;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
