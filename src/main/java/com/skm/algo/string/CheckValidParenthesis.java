package com.skm.algo.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Saroj on 07/08/22
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 **/
public class CheckValidParenthesis {
    public static void main(String[] args) {
        boolean flag = isValid("()");
        System.out.println(flag);
    }
    public static boolean isValid(String s) {
        int l = s.length();
        if(l%2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = initiate();
        for(int i=0; i<l; i++){
            if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
            else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
            else stack.push(s.charAt(i));
        }
        return stack.isEmpty();

    }

    public static Map<Character, Character> initiate(){
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        return map;
    }
}
