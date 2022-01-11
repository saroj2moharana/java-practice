package com.skm.algo.array;

import com.skm.algo.util.ArrayUtil;

/**
 * @author saroj on 8/3/2020
 */
public class KthElementFromArray {
    public static void main(String[] args) {
        int a[] = {7,10,4,2,5,9,11};
        KthElementFromArray q = new KthElementFromArray();
        int k = 5;
        int r = q.doQuickSort(k,a,0,a.length-1);
        System.out.println(r);

        ArrayUtil.printArray(a);
    }
    public int doQuickSort(int k, int a[], int lb, int ub){
        if(lb < ub){
            int pivotIndexAfterPartition = partition(a, lb, ub);
            if(pivotIndexAfterPartition == k)
                return a[pivotIndexAfterPartition];
            if(k<pivotIndexAfterPartition) return doQuickSort(k, a,lb,pivotIndexAfterPartition-1);
            if(k>=pivotIndexAfterPartition) return doQuickSort(k, a,pivotIndexAfterPartition+1,ub);
        }
        return 0;
    }
    private int partition(int a[], int lb, int ub){
        int pivot = a[lb];
        int start = lb;
        int end = ub;
        while(start  < end){
            while(a[start] <= pivot)
                start++;
            while(a[end] > pivot)
                end--;
            if(start<end)
                swap(a, start, end);
        }
        swap(a, lb, end);
        return end;
    }

    private void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
