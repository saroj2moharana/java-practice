package com.skm.algo.array;

import com.skm.algo.util.ArrayUtil;


/**
 * Created by saroj on 4/17/2019.
 * Kadane's Algorithm
 */
public class MaxSubArray {
    public static void main(String arg[]){
        int a[] = ArrayUtil.initiateIntArray();
        int sum = a[0];
        int result = a[0];
        int i = 1;
        //-1,-2,0,-2,-1,-3
        while(i<a.length){
            if(sum>0){
                sum += a[i];
            }else if(sum <= 0){
                sum = a[i];
            }
            result = Math.max(result,sum);
            i++;
        }
        System.out.println("max Sub arry sum : "+result);
    }

}
