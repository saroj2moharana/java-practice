package com.skm.algo.linkedlist;

import java.util.Stack;

/**
 * @author saroj on 8/1/2020
 * Problem - 1->2->3->4->5->6
 * outpur - 1->6->2->5->3->4
 */
public class ReorderLinkedListType1 {

    public SingleListNode rearrange(SingleListNode headNode){
        //take one stack for storing the order...
        Stack<SingleListNode> listStacks = new Stack<>();
        SingleListNode curNode = headNode;
        SingleListNode finalNode = headNode;
        int count = 0;
        while (curNode != null){
            listStacks.add(curNode);
            curNode = curNode.getNextNode();
            count++;
        }
        int middle = count/2;
        int i = 0;
        while (finalNode != null && i<middle){
            SingleListNode tempNode = finalNode.getNextNode();
            finalNode.setNextNode(listStacks.pop());
            finalNode.getNextNode().setNextNode(tempNode);
            finalNode = tempNode;
            i++;
        }
        if(count%2 != 0){
            finalNode.setNextNode(listStacks.pop());
            finalNode.getNextNode().setNextNode(null);
        }else finalNode.setNextNode(null);
        return headNode;
    }

    public static void main(String[] args) {
        SingleListNode head = new SingleListNode(1);

        SingleListNode next1 = new SingleListNode(2);
        head.setNextNode(next1);

        SingleListNode next2 = new SingleListNode(3);
        next1.setNextNode(next2);

        SingleListNode next3 = new SingleListNode(4);
        next2.setNextNode(next3);

        SingleListNode next4 = new SingleListNode(5);
        next3.setNextNode(next4);

        SingleListNode next5 = new SingleListNode(6);
        next4.setNextNode(next5);

        SingleListNode next6 = new SingleListNode(7);
        next5.setNextNode(next6);

        System.out.println("Before Rearrange: "+head);
        ReorderLinkedListType1 reorderList = new ReorderLinkedListType1();
        head = reorderList.rearrange(head);
        System.out.println("After Rearrange: "+head);
    }
}
