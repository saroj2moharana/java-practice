package com.skm.algo.array;

import com.skm.algo.util.ArrayUtil;

import java.util.Arrays;

/**
 * Created by saroj on 4/27/2019.
 * You are given arrival and departure time of trains reaching to a particular station.
 * You need to find minimum number of platforms required to accommodate the trains at any point of time.
 * arrival[] = {1:00, 1:40, 1:50, 2:00, 2:15, 4:00}
 * departure[] = {1:10, 3:00, 2:20, 2:30, 3:15, 6:00}
 */
public class MinimumPlatforms {
    public static void main(String arg[]){
        System.out.println("Please Enter arrival details...");
        int arr[] = ArrayUtil.initiateIntArray();
        System.out.println("Please enter deparature details...");
        int dep[] = ArrayUtil.initiateIntArray();
        findMinimumPlatforms(arr,dep);
    }

    /**
     * Finding minimum platforms...
     * @param arr
     * @param dep
     */
    private static void findMinimumPlatforms(int arr[], int dep[]){
        //sort arrival timings...
        Arrays.sort(arr);
        //sort deparature timings...
        Arrays.sort(dep);

        //Total platforms...
        int totalPlatforms = 0;
        int minPlatforms = 0;
        int i=0,j=0;
        //Loop arrival timings...
        while(i<arr.length && j <dep.length){
            if(arr[i]<=dep[j]){
                i++;
                totalPlatforms++;
            }else{
                j++;
                totalPlatforms--;
            }
            if(minPlatforms < totalPlatforms)
                minPlatforms = totalPlatforms;
        }
        System.out.println("TotalPlatforms : "+minPlatforms);

    }
}

/*
0100
0140
0150
0200
0215
0400

0110
0300
0220
0230
0315
0600
*/