package com.skm.algo.linkedlist;

import com.skm.algo.util.ListUtil;

import java.util.List;

/**
 * @Author saroj on 23/04/22
 **/
public class ReverseLinkedListWithGroups {
    public static void main(String[] args) {
        //10-->20-->30-->40-->50-->null
        SingleListNode listNode = ListUtil.getDefaultSingleListNode();
        SingleListNode head = reverseWithGroup(listNode,4);
        ListUtil.displayNodes(head);

    }
    public static SingleListNode reverseWithGroup(SingleListNode head, int size){
        SingleListNode curNode = head;
        SingleListNode prev = null;
        SingleListNode next = null;
        int i=0;
        while(curNode != null && i<size){
            next = curNode.nextNode;
            curNode.nextNode = prev;
            prev = curNode;
            curNode = next;
            i++;
        }
        if(next != null) head.nextNode = reverseWithGroup(curNode,size);
        return prev;
    }
}
