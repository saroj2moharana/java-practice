package com.skm.algo.problemsoliving;

/**
 * @author Saroj on 19/07/22
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral.
 *
 * Example 1:
 *
 * Input: num = 3
 * Output: "III"
 * Explanation: 3 is represented as 3 ones.
 * Example 2:
 *
 * Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 * Example 3:
 *
 * Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 * Constraints:
 *
 * 1 <= num <= 3999
 **/
public class IntegerToRoman {
    static StringBuilder stringBuilder = new StringBuilder();
    public static void main(String[] args) {
        int n = 1994;
        String st = intToRoman(n);
        System.out.println(st);
    }
    public static String intToRoman(int num) {
        if(num == 0 ) return stringBuilder.toString();
        if(num>=1000){
            formStr(num,1000,"M");
        }else if(num>=900){
            formStr(num,900,"CM");
        }else if(num >= 500){
            formStr(num,500,"D");
        }else if(num >= 400){
            formStr(num,400,"CD");
        }else if(num >= 100){
            formStr(num,100,"C");
        }else if(num >= 90){
            formStr(num,90,"XC");
        }else if(num >= 50){
            formStr(num,50,"L");
        }else if(num >= 40){
            formStr(num,40,"XL");
        }else if(num >= 10){
            formStr(num,10,"X");
        }else if(num == 9){
            formStr(num,9,"IX");
        }else if(num >= 5){
            formStr(num,5,"V");
        }else if(num == 4){
            formStr(num,4,"IV");
        }else if(num >= 1){
            formStr(num,1,"I");
        }
        return stringBuilder.toString();
    }
    public static void buildStr(int n, String ch){
        stringBuilder.append(ch.repeat(n));
    }

    public static void formStr(int num, int d, String s ){
        int a = num/d;
        buildStr(a,s);
        num = num%d;
        intToRoman(num);
    }
}
