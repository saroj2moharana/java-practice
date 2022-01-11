package com.skm.algo.stack;

import com.skm.algo.util.StackUtil;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by saroj on 5/4/2019.
 * This is for getting minimum element with O(1)
 *
 * in this case we will take help of another stack which will keep minimum element.
 * every push it will check with top element, if it is lesser then add this element in this stack otherwise push only in mainstack
 * for every pop, it will check from another stack if it is same pop from here as well as pop from mainstack...
 */
public class FindMinimumElement {
    public static void main(String arg[]){
        findMinimumElement();
    }

    private static void findMinimumElement(){
        Stack sortedStack = new Stack();
        Stack mainStack = new Stack();
        System.out.print("Do you want to add an elemnt in stack, 'i' for insert : ");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        do{
            if("i".equalsIgnoreCase(option)){//pushing elements in stack...
                System.out.print("Please enter an element for stack : ");
                int a = sc.nextInt();
                //if sorted stack is empty or element is less than or equals to top of the sorted-stack then push to sorted-stack...
                if(sortedStack.isEmpty() || a <= (int)sortedStack.peek()){
                    sortedStack.push(a);
                }
                mainStack.push(a);
            }else if("r".equalsIgnoreCase(option)){//removing top element in stack...
                if(mainStack.isEmpty()){
                    System.out.println("Stack is empty please enter few more elemnts...");
                    return;
                }else{
                    int topElement = (int)mainStack.pop();
                    if(topElement == (int)sortedStack.peek()) sortedStack.pop();
                }
            }else{
                System.out.println("Ah!!! Sorry wrong input...");
            }
            System.out.print("Do you still want to add/remove few more elemnt 'i' for insert && 'r'for remove : ");
            option = sc.next();
        }while ("i".equalsIgnoreCase(option) || "r".equalsIgnoreCase(option));

        //display stack...
        System.out.println("Final stack : "+mainStack);
        //get minimum element from stack...
        System.out.println("Minimum element from above stack:"+sortedStack.peek());
    }

}
