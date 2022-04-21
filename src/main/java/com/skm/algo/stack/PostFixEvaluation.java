package com.skm.algo.stack;

import java.util.Stack;

/**
 * @Author saroj on 20/04/22
 * Input: S = "231*+9-"
 * Output: -4
 **/
public class PostFixEvaluation {
    public static void main(String[] args) {
        int r = evaluatePostFixExpression("231*+9-");
        System.out.println(r);
    }
    public static int evaluatePostFixExpression(String str){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))) stack.push(Integer.parseInt(String.valueOf(str.charAt(i))));
            else{
                int b = stack.pop();
                int a = stack.pop();
                //System.out.println(a+"-"+b+"-"+a+b);
                switch (str.charAt(i)){
                    case '+' :
                        stack.push(a+b);
                        break;
                    case '-' :
                        stack.push(a-b);
                        break;
                    case '*' :
                        stack.push(a*b);
                        break;
                    case '/' :
                        stack.push(a/b);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
