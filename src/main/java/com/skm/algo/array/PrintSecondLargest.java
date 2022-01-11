package com.skm.algo.array;

/**
 * Created by Saroj on 04/01/22
 **/
public class PrintSecondLargest {
    public static void main(String[] args) {
        int a[] = new int[]{10,9,2,3,5};
        int s = findSecondLargest(a);
        System.out.println(s);
    }
    public static int f=0,b=0;
    public static int findSecondLargest(int a[]){
        for(int i=0; i< a.length; i++){
            if(a[i]>f){
                f=a[i];
            }else{
                if(a[i]>b){
                    b = a[i];
                }
            }
        }
        return b;
    }
}
