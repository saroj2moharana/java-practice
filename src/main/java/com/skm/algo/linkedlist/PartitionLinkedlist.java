package com.skm.algo.linkedlist;

/**
 * @Author saroj on 05/05/22
 * This is for partitioning a linked-list i.e.
 * 10-->20-->5-->3-->30-->2-->null, partition-element = 5 then output would be as below
 * 2-->3-->5-->10-->20-->30-->null
 * That means all the elements lesser than equals to 5 would be on left-hand side
 * and all greater elements would be right-hand side of partition-element...
 **/
public class PartitionLinkedlist {
    public static void main(String[] args) {
        SingleListNode head = new SingleListNode(10);
        SingleListNode n1 = new SingleListNode(20);
        SingleListNode n2 = new SingleListNode(5);
        SingleListNode n3 = new SingleListNode(3);
        SingleListNode n4 = new SingleListNode(30);
        SingleListNode n5 = new SingleListNode(2);

        head.nextNode = n1;
        n1.nextNode = n2;
        n2.nextNode = n3;
        n3.nextNode = n4;
        n4.nextNode = n5;
        System.out.println("Before Partition:"+head);
        int p = 5;
        SingleListNode result = doPartition(head, p);
        System.out.println("After Partition:"+result);
    }
    public static SingleListNode doPartition(SingleListNode head, int p){
        SingleListNode h = head;
        SingleListNode t = head;
        while(head != null){
            SingleListNode tempNod = head.nextNode;
            if(head.data <= p){
                head.nextNode = h;
                h = head;
            } else if (head.data > p) {
                t.nextNode = head;
                t = head;
            }
            head = tempNod;
        }
        t.nextNode = null;
        return h;
    }
}
