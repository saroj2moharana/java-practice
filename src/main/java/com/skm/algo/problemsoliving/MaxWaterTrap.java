package com.skm.algo.problemsoliving;

import java.sql.SQLOutput;

/**
 * @author SAROJ on 10-11-2021
 */
public class MaxWaterTrap {
    public static void main(String[] args) {
        int[] ar = new int[]{3,0,2,0,4};
        findMaxWaterTrap(ar);
    }

    private static void findMaxWaterTrap(int[] ar) {
        int left = 0, right = ar.length-1;
        int lm = 0, rm=0;
        int res = 0;
        while (left<=right){
            if(rm<=lm){
                res += Integer.max(0,rm-ar[right]);
                rm = Integer.max(rm,ar[right]);
                right--;
            }else{
                res += Integer.max(0,lm-ar[left]);
                lm = Integer.max(lm,ar[left]);
                left++;
            }
        }
        System.out.println(res);
    }

}
