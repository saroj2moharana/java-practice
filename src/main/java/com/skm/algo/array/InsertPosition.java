package com.skm.algo.array;

/**
 * @author Saroj on 08/08/22
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 **/
public class InsertPosition {
    public static void main(String[] args) {
        int r = searchInsert(new int[]{1,3,5,6},2);
        System.out.println(r);
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        if(target>nums[end]) return end+1;
        while(start<end){
            //mid = (int)Math.round(((float)start+end)/2);
            mid = (start+end)/2;
            //System.out.println(mid);
            if(nums[mid] == target) return mid;
            else if(target>nums[mid] && target<nums[mid+1]) return mid+1;
            else if(nums[mid] > target) end = mid;
            else start = mid+1;
        }
        return mid+1;
    }
}
