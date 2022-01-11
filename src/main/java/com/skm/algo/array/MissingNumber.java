package com.skm.algo.array;

import com.skm.algo.util.ArrayUtil;

/**
 * Created by saroj on 4/17/2019.
 */
public class MissingNumber {
    public static void main(String arg[]){
        int a[] = ArrayUtil.initiateIntArray();
        int sum = (a[a.length-1]*(a[a.length-1]+1))/2;
        System.out.println("Total Sum : "+sum);
        for(int i=0;i<a.length;i++){
            sum -= a[i];
        }
        System.out.println("Missing element:"+sum);
    }
}
