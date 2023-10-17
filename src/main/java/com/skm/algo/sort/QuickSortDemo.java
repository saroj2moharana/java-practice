package com.skm.algo.sort;

import com.skm.algo.util.ArrayUtil;

/**
 * @author saroj on 3/2/2020
 */
public class QuickSortDemo {
    public static void main(String[] args) {
        int a[] = {7,10,4,2,5,9,11};
        QuickSortDemo q = new QuickSortDemo();
        q.doQuickSort(a,0,a.length-1);

        ArrayUtil.printArray(a);
    }
    public void doQuickSort(int a[], int lb, int ub){
        if(lb < ub){
            int pivotIndexAfterPartition = partition(a, lb, ub);
            doQuickSort(a,lb,pivotIndexAfterPartition-1);
            doQuickSort(a,pivotIndexAfterPartition+1,ub);
        }
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
            if(a[start]>a[end] && start<end)
                swap(a, start, end);
        }
        //at last swap lb with end to get proper pivot element index...
        swap(a, lb, end);
        return end;
    }

    private void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
