package com.skm.algo.array;


import java.util.Stack;

/**
 * @author saroj on 8/28/2019
 * This is for finding next greater element of current element in a sequential array.
 * suppose array contains elements : 5,4,9,3,6,1
 * Then it would display like as below  :
 * 5-->9, 4-->9, 9-->-1(as there is no greater element), 3-->6, 6-->-1(as threre is no greater element)
 * 1-->-1 as there is no greater element...
 */
public class NextGreaterElement {
    public static void main(String arg[]){
        int a[] = {5,4,9,3,6,1};
        //Integer a1[] = new Integer[]{5,4,6};
        Stack<Integer> stack = new Stack<>();
        //we need to insert
        for(int i=0; i<a.length;i++){
            while(!stack.isEmpty() && a[i]>=stack.peek()){
                System.out.println("Next Greater Element of:"+stack.pop()+"--> "+a[i]);
            }
            stack.push(a[i]);
        }
        while(!stack.isEmpty()){
            System.out.println("Next Greater Element of:"+stack.pop()+"--> -1");
        }
    }
}
