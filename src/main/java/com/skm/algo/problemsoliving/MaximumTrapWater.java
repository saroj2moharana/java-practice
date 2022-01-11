package com.skm.algo.problemsoliving;

/**
 * @author SAROJ on 25-10-2021
 */
public class MaximumTrapWater {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        //int[] arr = {3,0,2,0,4};
        int n = arr.length;
        System.out.print(maxWater(arr, n));
    }
    static int maxWater(int[] arr, int n){
        // indices to traverse the array
        int left = 0;
        int right = n - 1;

        // To store Left max and right max
        // for two pointers left and right
        int l_max = 0;
        int r_max = 0;

        // To store the total amount
        // of rain water trapped
        int result = 0;
        while (left <= right){
            // We need check for minimum of left and right max for each element
            if(r_max <= l_max){
                // Add the difference between current value and right max at index r
                result += Math.max(0, r_max-arr[right]);

                // Update right max
                r_max = Math.max(r_max, arr[right]);

                // Update right pointer
                right -= 1;
            }else{
                // Add the difference between current value and left max at index l
                result += Math.max(0, l_max-arr[left]);

                // Update left max
                l_max = Math.max(l_max, arr[left]);

                // Update left pointer
                left += 1;
            }
        }
        return result;
    }
}
