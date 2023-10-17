package com.skm.algo.util;

import com.skm.algo.linkedlist.SingleListNode;

/**
 * @Author saroj on 21/04/22
 **/
public class ListUtil {
    //10-->20-->30-->40-->50-->null
    public static SingleListNode getDefaultSingleListNode(){
        SingleListNode head = new SingleListNode();
        head.data = 10;

        SingleListNode n1 = new SingleListNode(20);
        head.nextNode = n1;

        SingleListNode n2 = new SingleListNode(30);
        n1.nextNode = n2;

        SingleListNode n3 = new SingleListNode(40);
        n2.nextNode = n3;

        SingleListNode n4 = new SingleListNode(50);
        n3.nextNode = n4;

        return head;
    }

    public static SingleListNode getDefaultDupSingleListNode(){
        SingleListNode head = new SingleListNode();
        head.data = 10;

        SingleListNode n1 = new SingleListNode(20);
        head.nextNode = n1;

        SingleListNode n2 = new SingleListNode(30);
        n1.nextNode = n2;

        SingleListNode n3 = new SingleListNode(20);
        n2.nextNode = n3;

        SingleListNode n4 = new SingleListNode(50);
        n3.nextNode = n4;

        return head;
    }

    public static void displayNodes(SingleListNode node){
        while(node != null){
            System.out.print(node.data+"-->");
            node = node.nextNode;
        }
        System.out.print("null");
    }
}
