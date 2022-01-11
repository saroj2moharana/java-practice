package com.skm.algo.array;

/**
 * Created by saroj on 4/16/2019.
 */
public class SumSubArray {
    public static void main(String arg[]){
        SubArray subArray = new SubArray();
        int a[] = {1,2,3,4,5,7};
        subArray.findSumSubArray(a,10);
    }
}

class SubArray{
    public void findSumSubArray(int a[],int sum){
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            int res = 0;
            System.out.println("Starting point:"+a[i]);
            for(int j=i;j<a.length;j++){
                res += a[j];
                //System.out.println("res:"+res);
                if(res == sum){
                    displayArray(a,i,j);
                    break;
                }
            }
        }
    }
    public void displayArray(int a[],int i, int j){
        for(int k=i;k<=j;k++){
            System.out.print(a[k]+",");
        }
        System.out.println();
    }
}
