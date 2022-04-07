package com.skm.algo.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author saroj on 07/04/22
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 **/
public class TwoSum {
    public static void main(String arg[]){
        TwoSum twoSum = new TwoSum();
        int a[] = {0,4,3,0};
        int target = 0;
        int res[] = twoSum.twoSum(a,target);
        for(int i=0; i<res.length;i++){
            System.out.println(res[i]);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        map.put(nums[i],i++);
        int result[] = new int[2];
        int l = nums.length;
        while(i<l){
            Integer position = map.get(target-nums[i]);
            if(position != null){
                result[0] = position;
                result[1] = i;
                return result;
            }else map.put(nums[i],i++);
        }

        return result;
    }
}
