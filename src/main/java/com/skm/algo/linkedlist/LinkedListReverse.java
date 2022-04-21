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
        SingleListNode revList = reverseListWithoutRecursion(head);
        System.out.println("reverse : "+ revList);
    }
    public static SingleListNode reverseListWithoutRecursion(SingleListNode head){
        SingleListNode nextNode = null;
        SingleListNode curNode = head;
        SingleListNode prevNode = null;
        while(curNode != null){
            nextNode = curNode.nextNode;
            curNode.nextNode = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        //return prevNode because we have already reached curNode as null so prevNode will be head of this linkedList...
        return prevNode;
    }
}
