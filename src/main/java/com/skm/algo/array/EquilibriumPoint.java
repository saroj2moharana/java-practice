package com.skm.algo.array;

import com.skm.algo.util.ArrayUtil;

import java.util.stream.IntStream;


/**
 * Created by saroj on 4/20/2019.
 */
public class EquilibriumPoint {
    public static void main(String arg[]){
        int arr[] = ArrayUtil.initiateIntArray();
        findEquilibrium(arr);
    }
    public static void findEquilibrium(int arr[]){
        int rightSum = IntStream.of(arr).sum();
        int leftSum = 0;
        System.out.print("Equilibrium Points : {");
        for(int i=0; i<arr.length; i++){
            //get current element...
            int curElement = arr[i];
            rightSum -= curElement;
            //System.out.println(leftSum+" : "+rightSum);
            if(rightSum == leftSum){
                System.out.print(curElement+",");
            }
            leftSum += curElement;
        }
        System.out.print("\b}");
    }
}
