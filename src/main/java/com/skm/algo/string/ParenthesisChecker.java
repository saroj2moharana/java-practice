package com.skm.algo.string;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by saroj on 5/5/2019.
 * Given an expression string exp. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
 * For example, the program should print 'balanced' for exp = “[()]{}{[()()]()}” and 'not balanced' for exp = “[(])”
 */
public class ParenthesisChecker {
    public static void main(String arg[]){
        System.out.println("Please enter expression:");
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        parenthesisChecker(exp);
    }
    private static void parenthesisChecker(String exp){
        Stack stack =  new Stack();
        boolean isBalanced = true;
        //for every left expression we should push & for every right expression we should pop and match with current element, if it doesn't match
        //then its not balanced...
        char a[] = exp.toCharArray();
        for(int i=0; i<a.length; i++){
            //System.out.println(a[i]);
            if(isLeftExpression(a[i]))
                stack.push(a[i]);
            else if(stack.isEmpty() || getLeftExp(a[i]) != (char)stack.pop()) {
                isBalanced = false;
                break;
            }
        }
        if(!isBalanced || !stack.isEmpty()) System.out.println("Above string is not balanced...");
        else System.out.println("Above string is balanced...");
    }
    private static boolean isLeftExpression(char a){
        switch (a) {
            case '{': {
                return true;
            }case '(': {
                return true;
            }case '[':{
                return true;
            }
            default:
                return false;
        }
    }

    private static char getLeftExp(char a){
        switch (a) {
            case '}': {
                return '{';
            }case ')': {
                return '(';
            }case ']':{
                return '[';
            }
            default:
                return '\u0000';
        }
    }

}
