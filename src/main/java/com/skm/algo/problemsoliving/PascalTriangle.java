package com.skm.algo.problemsoliving;

import java.util.*;

/**
 * @author Saroj on 19/07/22
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 * Example 1:
 *
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 *
 * Input: numRows = 1
 * Output: [[1]]
 *
 *
 * Constraints:
 *
 * 1 <= numRows <= 30
 **/
public class PascalTriangle {
    public static void main(String[] args) {
        int r = 5;
        List<List<Integer>> output = generate(r);
        System.out.println(output);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        output.add(list);
        for(int i=1; i<numRows; i++){
            list = new ArrayList<>();
            List<Integer> prev = output.get(i-1);
            int l = prev.size();
            list.add(1);
            for(int j=1; j<l; j++){
                list.add(prev.get(j-1)+prev.get(j));
            }
            list.add(1);
            output.add(list);
        }
        return output;
    }
}
