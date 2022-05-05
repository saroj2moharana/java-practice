package com.skm.algo.matrix;

/**
 * @Author saroj on 05/05/22
 * Program for printing a matrix in spiral view
 **/
public class SpiralView {
    public static void main(String[] args) {
        int a[][] = {{0,1,2,3,4},
                     {5,6,7,8,9},
                     {10,11,12,13,14},
                     {15,16,17,18,19},
                     {20,21,22,23,24}
        };
        //output should be 0,1,2,3,4, 9,14,19,24,23, 22,21,20,15,10, 5,6,7,8,13, 18,17,16,11,12
        printSpiral(a);
    }
    public static void printSpiral(int a[][]){
        //pointer...
        int i=0;
        //boundaries...
        int top = 0;
        int left = 0;
        int bottom = a.length-1;
        int right = a[0].length-1;

        while(left <= right){
            //print top view...
            while(i <= right){
                System.out.print(a[top][i]+",");
                i++;
            }
            top++;
            i = top;

            //print right-side view...
            while(i <= bottom){
                System.out.print(a[i][right]+",");
                i++;
            }
            right--;
            i = right;

            //print bottom view...
            while(i >= left){
                System.out.print(a[bottom][i]+",");
                i--;
            }
            bottom--;
            i = bottom;

            //print left-side view...
            while(i >= top){
                System.out.print(a[i][left]+",");
                i--;
            }
            left++;
            i = left;
        }
        System.out.print("\b");
    }
}
