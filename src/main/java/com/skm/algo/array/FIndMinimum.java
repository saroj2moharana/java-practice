package com.skm.algo.array;

import java.util.Arrays;

/**
 * @author saroj on 05/06/23
 */
public class FIndMinimum {
    public static void main(String[] args) {
        System.out.println(String.format("id=%08.2f",423.147));
        int a[] = new int[]{-1, -3};
        int r = solution(a);
        System.out.println(r);
    }
    public static int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        for(int i=1; i<A.length; i++){
            int r = A[i]-A[i-1];
            if(A[i]<0 && A[i-1]<0) r = A[i-1]-A[i];
            if(r == 0 || r == 1){
                continue;
            }else if(r > 1){
                return A[i-1]+1;
            }else{
                return 1;
            }
        }
        return A[A.length-1]+1;
    }
}
