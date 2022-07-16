package com.skm.algo.string;


/**
 * @author Saroj on 17/07/22
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 *
 * Input: s = "A", numRows = 1
 * Output: "A"
 **/
public class ZigZagConversion {
    public static void main(String[] args) {

        String str = "A";
        int l = str.length();
        int rows = 2;
        StringBuilder[] builder = new StringBuilder[rows];
        int i =0;
        while(i<l){
            int j = 0;
            while(j<rows && i<l){
                if(builder[j] == null) builder[j] = new StringBuilder().append(str.charAt(i));
                else builder[j].append(str.charAt(i));
                j++;
                i++;
            }

            j = rows-2;
            while(j>0 && i<l){
                builder[j].append(str.charAt(i));
                System.out.println(i+"-"+j+"-"+builder[j]);
                i++;
                j--;
            }
        }
        StringBuilder finalBuilder = new StringBuilder().append(builder[0]);
        for(int j=1; j<rows; j++){
            if(builder[j] != null) finalBuilder.append(builder[j]);
        }
        System.out.println(finalBuilder.toString());
    }
}
