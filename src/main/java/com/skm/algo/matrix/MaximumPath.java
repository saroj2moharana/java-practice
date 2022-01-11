package com.skm.algo.matrix;

/**
 * @author saroj on 2/16/2020
 */
public class MaximumPath {
    public static void main(String[] args) {
        int a[][] = {{10,0,4,20},{4,5,2,10},{1,20,13,5},{3,10,5,10}};
        int sum[][] = new int[4][4];
        boolean visited[][] = new boolean[4][4];

        System.out.println("Row : " + a.length);
        System.out.println("Column : " + a[0].length);
        int maxPath = maxPath(a);
    }

    public static int maxPath(int a[][]){
        return 0;
    }
}
