package com.skm.algo.array;

import java.util.stream.IntStream;

/**
 * @author Saroj on 20/09/22
 **/
public class EquilibriumPointIndex {
    public static void main(String[] args) {
        int ar[] = new int[]{1,2,3,4,5,1};
        int index = findEquilibrium(ar);
        System.out.println("Index:"+index);
    }
    public static int findEquilibrium(int arr[]){
        int rightSum = IntStream.of(arr).sum();
        int leftSum = 0;
        for(int i=0; i<arr.length; i++){
            //get current element...
            int curElement = arr[i];
            rightSum -= curElement;
            if(rightSum == leftSum) return i;
            leftSum += curElement;
        }
        return -1;
    }
}
