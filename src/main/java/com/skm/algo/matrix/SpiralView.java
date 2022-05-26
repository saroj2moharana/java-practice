package com.skm.algo.matrix;

/**
 * @Author saroj on 05/05/22
 * Program for printing a matrix in spiral view
 **/
public class SpiralView {
    public static void main(String[] args) {
        //int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int a[][] = {{2,3}};

        //output should be 0,1,2,3,4, 9,14,19,24,23, 22,21,20,15,10, 5,6,7,8,13, 18,17,16,11,12
        printSpiral(a);
        System.out.println();
        spiralMatrixPrint(a);
    }
    public static void printSpiral(int a[][]){
        //pointer...
        int i=0;
        //boundaries...
        int top = 0;
        int left = 0;
        int bottom = a.length-1;
        int right = a[0].length-1;

        while(left <= right && top<=bottom){
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

    public static void spiralMatrixPrint(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;
        // Defining the boundaries of the matrix.
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        // Defining the direction in which the array is to be traversed.
        int dir = 1;

        while (top <= bottom && left <= right) {

            if (dir == 1) {    // moving left->right
                for (int i = left; i <= right; ++i) {
                    System.out.print(arr[top][i] + " ");
                }
                // Since we have traversed the whole first
                // row, move down to the next row.
                ++top;
                dir = 2;
            }
            else if (dir == 2) {     // moving top->bottom
                for (int i = top; i <= bottom; ++i) {
                    System.out.print(arr[i][right]+ " ");
                }
                // Since we have traversed the whole last
                // column, move left to the previous column.
                --right;
                dir = 3;
            }
            else if (dir == 3) {     // moving right->left
                for (int i = right; i >= left; --i) {
                    System.out.print(arr[bottom][i]+ " ");
                }
                // Since we have traversed the whole last
                // row, move up to the previous row.
                --bottom;
                dir = 4;
            }
            else if (dir == 4) {     // moving bottom->up
                for (int i = bottom; i >= top; --i) {
                    System.out.print(arr[i][left]+ " ");
                }
                // Since we have traversed the whole first
                // col, move right to the next column.
                ++left;
                dir = 1;
            }
        }
    }
}
