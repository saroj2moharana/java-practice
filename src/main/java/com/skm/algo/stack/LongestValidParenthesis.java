package com.skm.algo.stack;

import java.util.Map;
import java.util.Stack;

/**
 * @author Saroj on 26/05/22
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()".
 * Example 2:
 *
 * Input: s = ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()".
 * Example 3:
 *
 * Input: s = ""
 * Output: 0
 *
 * input: s = "((()))"
 **/
public class LongestValidParenthesis {
    public static void main(String[] args) {
        int r = longestParenthesis1("()(()");
        System.out.println("r:"+r);
    }

    private static int longestParenthesis1(String s) {
        boolean left = false;
        int maxSofar = 0;
        int curMax = 0;
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '('){
                if(left) curMax = 0;
                left = true;
            }else if(s.charAt(i) == ')'){
                if(left) curMax += 2;
                else if(!left){
                    maxSofar = Math.max(maxSofar,curMax);
                    curMax = 0;
                }
                left = false;
            }
            maxSofar = Math.max(maxSofar,curMax);
        }
        return maxSofar;
    }

    private static int longestParenthesis(String s) {
        if(s.length() == 0) return 0;
        Stack stack = new Stack<>();
        int maxSofar = 0;
        int curMax = 0;
        int prev = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
                prev = i;
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                    if(i-1 == prev) curMax +=2;
                    else{
                        maxSofar = Math.max(maxSofar,curMax);
                        curMax = 0;
                    }
                    prev = i;
                }
            }
        }
        maxSofar = Math.max(curMax,maxSofar);
        return maxSofar;
    }
}
