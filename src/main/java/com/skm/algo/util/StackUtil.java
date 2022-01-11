package com.skm.algo.util;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by saroj on 5/4/2019.
 */
public class StackUtil {
    /**
     * Initiate stack...
     * @return
     */
    public static Stack initiateStack(){
        Stack stack = new Stack();
        System.out.println("Please enter elements for stack");
        Scanner sc = new Scanner(System.in);
        do{
            stack.push(sc.nextInt());
            System.out.print("Do you still want to add few more elemnt : ");
        }while ("y".equalsIgnoreCase(sc.next()));
        return stack;
    }
}
