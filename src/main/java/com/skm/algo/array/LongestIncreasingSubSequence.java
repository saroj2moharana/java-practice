package com.skm.algo.array;

import java.util.Arrays;

/**
 * Created by saroj on 4/24/2019.
 */
public class LongestIncreasingSubSequence {

    // Iterative function to find length of longest increasing sub-sequence
    // of given array
    public static int LIS(int[] A)
    {
        // array to store sub-problem solution. L[i] stores the length
        // of the longest increasing sub-sequence ends with A[i]
        int[] L = new int[A.length];

        // longest increasing sub-sequence ending with A[0] has length 1
        L[0] = 1;

        // start from second element in the array
        for (int i = 1; i < A.length; i++)
        {
            // do for each element in sub-array A[0..i-1]
            for (int j = 0; j < i; j++)
            {
                System.out.println("Array, L["+j+"]:"+L[j]+",    L["+i+"]:"+L[i]);
                // find longest increasing sub-sequence that ends with A[j]
                // where A[j] is less than the current element A[i]
                if (A[j] < A[i] && L[j] > L[i]) {
                    L[i] = L[j];
                }
            }
            // include A[i] in LIS
            L[i]++;
        }
        System.out.println("After Processing, Array Element- L[] : "+Arrays.toString(L));
        // return longest increasing sub-sequence (having maximum length)
        return Arrays.stream(L).max().getAsInt();
    }

    // main function
    public static void main(String[] args)
    {
        int[] A = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };

        System.out.print("Length of LIS is " + LIS(A));
    }
}
