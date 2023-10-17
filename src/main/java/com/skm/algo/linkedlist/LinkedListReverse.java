package com.skm.algo.linkedlist;

import com.skm.algo.util.ListUtil;

/**
 * @Author saroj on 21/04/22
 **/
public class LinkedListReverse {
    public static void main(String arg[]){
        //10-->20-->30-->40-->50-->null
        SingleListNode head = ListUtil.getDefaultSingleListNode();
        System.out.println("Normal : "+ head);
        //SingleListNode revList = reverseListWithoutRecursion(head);
        SingleListNode revList = reverseWithRecursion(head);
        ListUtil.displayNodes(revList);
    }
    public static SingleListNode reverseListWithoutRecursion(SingleListNode curNode){
        SingleListNode prevNode = null;
        while(curNode != null){
            SingleListNode nextNode = curNode.nextNode;
            curNode.nextNode = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        //return prevNode because we have already reached curNode as null so prevNode will be head of this linkedList...
        return prevNode;
    }
    /*public static SingleListNode reverseWithRecursion(SingleListNode node){
        //base condition...
        if(node.nextNode == null) return node;
        SingleListNode head = reverseWithRecursion(node.nextNode);
        //now reverse...
        //1. Just keep nextNode in a temp instance so that it will be needed in later case...
        SingleListNode tempNextNode = node.nextNode;
        //2. assign nextNode.nextNode with currentNode.nextNode...
        node.nextNode = node.nextNode.nextNode;
        //3. Assign nextNode.nextNode with currentNode
        tempNextNode.nextNode = node;

        //now return head pointer...
        return head;
    }*/

    //short form of above method...
    public static SingleListNode reverseWithRecursion(SingleListNode head){
        if(head.nextNode == null) return head;
        SingleListNode prev = reverseListWithoutRecursion(head.nextNode);
        SingleListNode temp = head.nextNode.nextNode;
        head.nextNode.nextNode = head;
        head.nextNode = temp;
        return prev;
    }
}
