package com.skm.algo.matrix;

/**
 * @author saroj on 9/8/2019
 * This is for finding row index which contains maximum 1 in binary matrix(0,1) having sorted)
 */
public class MaximuRowContians1 {
    public static void main(String arg[]){
        //initiate a 2D array... Make sure array is sorted...
        int a[][] = {{0,0,0,1},{0,0,1,1},{0,1,1,1},{0,0,1,1}};
        int i = 0, j=a.length-1, rowIndex = -1;
        //start from top-corner
        while (i<=a.length-1 && j>=0){
            if(a[i][j] == 1){
                j--;
                rowIndex = i;
            }else{
                i++;
            }
        }
        rowIndex++;
        System.out.println("Maximum number of 1 contains in rowIndex : "+rowIndex);
    }
}
