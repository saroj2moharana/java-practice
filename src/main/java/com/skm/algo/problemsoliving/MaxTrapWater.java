package com.skm.algo.problemsoliving;

/**
 * @author SAROJ on 25-10-2021
 */
public class MaxTrapWater {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        //int[] arr = {3,0,2,0,4};
        int n = arr.length;
        System.out.print(maxWater(arr, n));
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     * @param arr
     * @param n
     * @return
     */
    private static int maxWater(int[] arr, int n) {
        int result = 0;
        //left index, rightIndex
        int left = 0, right = n-1;
        int maxLeft = 0, maxRight = 0;

        while(left<=right){
            if(maxLeft <= maxRight){
                result += Math.max(0, maxLeft-arr[left]);
                maxLeft = Math.max(maxLeft,arr[left]);
                left++;
            }else{
                result += Math.max(0, maxRight - arr[right]);
                maxRight = Math.max(maxRight, arr[right]);
                right--;
            }
        }

        return result;
    }
}
