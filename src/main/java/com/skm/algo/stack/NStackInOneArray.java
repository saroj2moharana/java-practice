package com.skm.algo.stack;

import java.util.Scanner;

/**
 * @author saroj on 7/29/2020
 */
public class NStackInOneArray {
    int n = 9;
    int stackSize = 3;

    int arr[] = new int[n];
    int next[] = new int[n];
    int stackTop[] = new int[stackSize];
    int nextAvailableSlot;

    public NStackInOneArray() {
        for(int i=0;i<n; i++) {
            int j = i+1;
            next[i] = j;
        }
        next[n-1] = -1;
        for(int i=0; i<stackSize; i++)
            stackTop[i] = -1;
        this.nextAvailableSlot = 0;
    }

    public void push(int stackNumber, int element){
        if(nextAvailableSlot == -1){
            System.out.println("Stack Overflow...");
        }
        //insert here...
        //store element in array...
        arr[nextAvailableSlot] = element;
        int temp = nextAvailableSlot;
        //maintain availableSlot...
        nextAvailableSlot = next[nextAvailableSlot];
        //maintain nextIndex...
        next[temp] = stackTop[stackNumber];
        //maintain stack top...
        stackTop[stackNumber] = temp;
    }

    public void displayStack(){
        System.out.println("\nNext Element...");
        for(int i=0;i<n; i++)
            System.out.print(" ,next["+i+"]="+next[i]);
        System.out.println("\nStackTop...");
        for(int i=0; i<stackSize; i++)
            System.out.print(" ,stackTop["+i+"]="+stackTop[i]);
        System.out.println("\nArray Element...");
        for(int i=0; i<n; i++)
            System.out.print(" ,arr["+i+"]="+arr[i]);
    }

    public static void main(String[] args) {
        NStackInOneArray oneArray = new NStackInOneArray();
        oneArray.displayStack();
        oneArray.push(1,20);
        oneArray.push(1,25);
        System.out.println("\n====================After adding 20, 25 =============================");
        oneArray.displayStack();

    }
}
