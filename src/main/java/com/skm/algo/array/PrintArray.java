package com.skm.algo.array;

/**
 * @author saroj on 12/04/23
 *
 * ProblemStatement  :
 * from an array [1,2,3], it should display [1],[2],[3],[1,2],[1,3],[1,2,3],[2,3]
 */
public class PrintArray {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,6};
        int length = a.length;
        for(int i=0;i<length; i++) {
            displayArray(a, length, i, String.valueOf(a[i]));
        }
        System.out.print("\b");
    }
    public static void displayArray(int a[],int l, int start, String text){
        System.out.print("["+text+"],");
        for(int i=start+1; i<l; i++) displayArray(a, l, i,text+","+a[i]);
    }
}
