package com.skm.algo.array;

import com.skm.algo.util.ArrayUtil;

import java.util.Arrays;

/**
 * Created by saroj on 4/25/2019.
 */
public class MaximumSumIncreasingSubsequence {
    public static void main(String arg[]){
        int arr[] = ArrayUtil.initiateIntArray();
        findMaximumSum(arr);
    }
    private static void findMaximumSum(int arr[]){
        int sumArr[] = Arrays.copyOfRange(arr,0, arr.length);
        int indexArr[] = new int[arr.length];
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<=i; j++){
                if((arr[j] < arr[i]) && (sumArr[j]+arr[i]>sumArr[i])){
                    //store maximum number between existing value with newly added value...
                    sumArr[i] = sumArr[j]+arr[i];
                    //store from index...
                    indexArr[i] = j;
                }
            }
        }
        int max = Arrays.stream(sumArr).max().getAsInt();
        System.out.println("Maximu-Sum-Increasing:"+max);
        int maxIndex = 0;
        for(int i=0; i<sumArr.length; i++){
            if(max == sumArr[i]){
                maxIndex = i;
            }
        }
        System.out.print("Display Maximum Sum Increasing Sub Sequence : {");
        displaySequence(arr,indexArr,maxIndex);
        System.out.print("}");
    }

    public static void displaySequence(int arr[], int indexArr[], int maxIndex){
        if(maxIndex == 0){
            System.out.print(arr[maxIndex]);
        }
        if(maxIndex > 0){
            System.out.print(arr[maxIndex]+",");
            maxIndex = indexArr[maxIndex];
            displaySequence(arr,indexArr,maxIndex);
        }
    }

}
