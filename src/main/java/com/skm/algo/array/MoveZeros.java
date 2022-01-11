package com.skm.algo.array;

import java.util.Arrays;

/**
 * @author SAROJ on 20-10-2021
 * Arrays: move zeros to the left
 * Given an integer array, move all elements that are 0 to the left while maintaining the order of other elements in the array.
 * The array has to be modified in-place. Try it yourself before reviewing the solution and explanation.
 *
 * Input 1 10 20 0 59 63 0 88 0
 *
 *
 * output 0 0 0 1 10 20 59 63 88
 */
public class MoveZeros {
    public static void main(String[] args) {
        int[] ar = new int[]{1, 10, 20, 0, 59, 63, 0, 88, 0};
        moveZerosLeft(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void moveZerosLeft(int ar[]){
        int j = ar.length-1;
        int nonZeroI = ar.length-1;
        while(j>=0){
            if(ar[j] != 0){
                ar[nonZeroI] = ar[j];
                nonZeroI--;
            }
            j--;
        }
        //after arrangement of all non-zero elements we can put 0's remaining block...
        while(nonZeroI >= 0 ){
            ar[nonZeroI] = 0;
            nonZeroI--;
        }
    }
}
