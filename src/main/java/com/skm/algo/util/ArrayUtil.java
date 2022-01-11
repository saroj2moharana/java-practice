package com.skm.algo.util;

import java.util.Scanner;

/**
 * Created by saroj on 4/17/2019.
 */
public class ArrayUtil {
    /**
     * This is for initiating array...
     * @return
     */
    public static int[] initiateIntArray(){
        System.out.println("Please enter how many elements you want to add...");
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[scn.nextInt()];

        System.out.println("Please enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print("arr[]: {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println(" }");
        return arr;
    }

    /**
     * This is for displaying elements in array...
     * @param a
     */
    public static void printArray(int a[]){
        System.out.print("Elements in Array : {");
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]+",");
        }
        System.out.print("\b}");
    }
}
