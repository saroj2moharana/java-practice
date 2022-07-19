package com.skm.algo.problemsoliving;

/**
 * @author Saroj on 19/07/22
 *
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
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 *
 * Example 1:
 *
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * Example 2:
 *
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 3:
 *
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 * Constraints:
 *
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 **/
public class RomanToInteger {
    public static void main(String[] args) {
        int s = romanToInt("MCDLXXVI");
        System.out.println(s);
    }
    public static int romanToInt(String s) {
        int n = 0;
        int l = s.length();
        for(int i=0; i<l; i++){
            char ch = s.charAt(i);
            if(ch == 'M'){
                n += 1000;
            }else if(ch == 'D'){
                n += 500;
            }else if(ch == 'C'){
                if(i<l-1 && s.charAt(i+1) == 'M'){
                    n += 900;
                    i++;
                }else if(i<l-1 && s.charAt(i+1) == 'D'){
                    n += 400;
                    i++;
                }else n+= 100;
            }else if(ch == 'L'){
                n += 50;
            }else if(ch == 'X'){
                if(i<l-1 && s.charAt(i+1) == 'C'){
                    n += 90;
                    i++;
                }else if(i<l-1 && s.charAt(i+1) == 'L'){
                    n += 40;
                    i++;
                }else n+= 10;
            }else if(ch == 'V'){
                n += 5;
            }else if(ch == 'I'){
                if(i<l-1 && s.charAt(i+1) == 'X'){
                    n += 9;
                    i++;
                }else if(i<l-1 && s.charAt(i+1) == 'V'){
                    n += 4;
                    i++;
                }else n+= 1;
            }
        }
        return n;
    }
}
