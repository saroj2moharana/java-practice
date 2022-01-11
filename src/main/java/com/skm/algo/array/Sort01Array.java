package com.skm.algo.array;

import com.skm.algo.util.ArrayUtil;
import com.skm.algo.util.TreeUtil;

/**
 * Created by saroj on 7/24/2019.
 */
public class Sort01Array {
    public static void main(String[] arg){
        int a[]={0,1,1,0,1,0};
        //sortBySelection(a);
        a = sortByOptimized(a);
        ArrayUtil.printArray(a);
    }
    private static int[] sortByOptimized(int a[]){
        int low=0, right = a.length-1;
        while(low<=right){
            if(a[low]>a[right]){
                int temp = a[low];
                a[low] = a[right];
                a[right] = temp;
            }
            if(a[low] == 0) low++;
            if(a[right] == 1) right--;
        }
        return a;
    }
    private static void sortBySelection(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
