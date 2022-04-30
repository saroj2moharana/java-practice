package com.skm.algo.linkedlist;

import com.skm.algo.util.ListUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author saroj on 21/04/22
 **/
public class RemoveDupNode {
    public static void main(String[] args) {
        //10-->20-->30-->20-->50-->null
        SingleListNode head = ListUtil.getDefaultDupSingleListNode();
        System.out.println("Original:"+head);
        SingleListNode res =removeDuplicate(head);
        System.out.println("After removing:"+res);
    }
    public static SingleListNode removeDuplicate(SingleListNode head){
        Set<Integer> set = new HashSet<>();
        SingleListNode curNode = head;
        while(curNode.nextNode != null){
            if(!set.add(curNode.nextNode.data)){
                //remove duplicate one...
                curNode.nextNode = curNode.nextNode.nextNode;
            }
            curNode = curNode.nextNode;
        }
        return head;
    }
}
