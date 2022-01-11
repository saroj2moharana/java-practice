package com.skm.algo.linkedlist;


/**
 * @author SAROJ on 10-11-2021
 */
public class KthLastNodeFromLinkedList {
    public static void main(String[] args) {
        SingleListNode head = new SingleListNode(10);
        SingleListNode listNode1 = new SingleListNode(20);
        SingleListNode listNode2 = new SingleListNode(30);
        SingleListNode listNode3 = new SingleListNode(40);
        SingleListNode listNode4 = new SingleListNode(50);
        //10-->20-->30-->40-->50-->null
        //middle element would be 30
        //10-->20-->30-->40-->50--> 60 -->null
        //middle element would be 40

        head.nextNode = listNode1;
        listNode1.nextNode = listNode2;
        listNode2.nextNode = listNode3;
        listNode3.nextNode = listNode4;

        int k = 3;
        SingleListNode lastNode = findKthLastNode(head, k);
        System.out.println(lastNode.data);

    }

    private static SingleListNode findKthLastNode(SingleListNode head, int k) {
        SingleListNode kthNode = null;
        SingleListNode ptr1 = head;
        SingleListNode ptr2 = head;
        while(k>0){
            ptr2 = ptr2.nextNode;
            k--;
        }
        while(ptr2 != null){
            ptr2 = ptr2.nextNode;
            ptr1 = ptr1.nextNode;
        }
        return ptr1;
    }
}
