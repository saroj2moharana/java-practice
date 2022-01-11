package com.skm.algo.heap;

import java.util.Scanner;

/**
 * @author saroj on 10/11/2019
 */
public class MaxHeapInsertionDemo {
    static int heapSize = 5;
    static int a[] = new int[heapSize];
    static int heapIndex = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<heapSize; i++){
            System.out.println("Please enter a number : ");
            insertIntoHeap(sc.nextInt());
        }
        for(int i=0; i<heapSize;i++){
            System.out.print(a[i]+",");
        }
        System.out.println("\nheapIndex:"+heapIndex);
    }
    public static void insertIntoHeap(int value){
        System.out.println("Value:"+value);
        a[heapIndex] = value;
        if(heapIndex > 0){
            int i = heapIndex;
            while(i>0){
                int parentIndex = (int)Math.ceil(i/2);
                swap(parentIndex,i);
                i = parentIndex;
            }
        }
        heapIndex++;
    }
    private static void swap(int parentIndex, int currentIndex){
        if(a[parentIndex]<a[currentIndex]){
            int temp = a[parentIndex];
            a[parentIndex] = a[currentIndex];
            a[currentIndex] = temp;
        }
    }
}
