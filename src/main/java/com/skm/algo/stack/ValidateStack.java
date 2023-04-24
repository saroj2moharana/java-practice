package com.skm.algo.stack;

import java.util.Stack;

/**
 * @author saroj on 13/04/23
 * LeetCode : 946. Validate Stack Sequences
 */
public class ValidateStack {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {4,5,3,2,1};
        boolean flag = validateStackSequences(a,b);
        System.out.println(flag);
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length != popped.length) return false;
        if(pushed.length>1000) return false;
        int j=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<pushed.length;i++){
            st.push(pushed[i]);
            while(!st.isEmpty() && st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}
