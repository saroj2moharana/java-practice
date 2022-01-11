package com.skm.algo.array;

import com.skm.algo.util.ArrayUtil;

/**
 * Created by saroj on 4/17/2019.
 */
public class Sort012SArray {
    public static void main(String arg[]) {
        //initiate array...
        int a[] = {0,0,1,0,-1,1,0};
        int mid=0;
        int high = a.length-1;
        int low=0;
        while(mid <= high){
            switch (a[mid]){
                case -1 :{
                    swap(low,mid,a);
                    low++;
                    mid++;
                    break;
                } case 0 :{
                    mid++;
                    break;
                } case 1 :{
                    swap(high,mid,a);
                    high--;
                    break;
                }
            }
        }
        //display sorted array...
        ArrayUtil.printArray(a);
    }
    private static void swap(int low, int mid,int a[]){
        int temp = a[low];
        a[low] = a[mid];
        a[mid] = temp;
    }
}
