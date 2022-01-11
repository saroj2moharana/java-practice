package com.skm.algo.recurssion;

/**
 * @author saroj on 9/24/2019
 */
public class ArraySum {
    public static void main(String arg[]){
        int a[] = {0,1,3,4,5,6};
        int sum = sum(a,a.length);
        System.out.println("Sum:"+sum);
    }
    public static int sum(int a[],int curPtr){
        System.out.println("curptr:"+curPtr);
        if(curPtr == 0){
            System.out.println("curt:"+curPtr);
            return a[0];
        }
        int sum = sum(a,curPtr-1)+a[curPtr-1];
        return sum;
    }
}
