package com.skm.algo.string;

/**
 * @author Saroj on 17/07/22
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 **/
public class ReverseInteger {
    public static void main(String[] args) {

        int r = reverse(-2147483648);
        System.out.println(r);
    }
    public static int reverse(int x) {
        int signMultiplier = 1;
        if (x < 0) {
            signMultiplier = -1;
            x = signMultiplier * x;
        }

        int res = 0;
        while (x > 0) {

            // Check if the result is within MaxInt32 and MinInt32 bounds
            if (res * signMultiplier > Integer.MAX_VALUE / 10 || res * signMultiplier < Integer.MIN_VALUE / 10) {
                return 0;
            }
            // Add the current digit into result
            res = res * 10 + x % 10;

            x = x / 10;
        }
        // Restore to original sign of number (+ or -)
        return (signMultiplier * res);
    }
}
