package com.skm.algo.linkedlist;

/**
 * @Author saroj on 05/05/22
 * This program is for finding intersectionNode of two linked list...
 * l1 = 10-->20-->30-->40-->50-->60-->null
 * l2 = 3-->40-->50-->60-->null
 * output : 40 as this node is the meeting point of two linkedLists...
 **/
public class IntersectionNode {
    public static void main(String[] args) {
        SingleListNode l1 = new SingleListNode(10);
        SingleListNode n1 = new SingleListNode(20);
        SingleListNode n2 = new SingleListNode(30);
        SingleListNode n3 = new SingleListNode(40);
        SingleListNode n4 = new SingleListNode(50);
        SingleListNode n5 = new SingleListNode(60);

        l1.nextNode = n1;
        n1.nextNode = n2;
        n2.nextNode = n3;
        n3.nextNode = n4;
        n4.nextNode = n5;
        System.out.println("First Linkedlist :"+l1);

        SingleListNode l2 = new SingleListNode(3);
        l2.nextNode = n3;
        System.out.println("Second Linkedlist :"+l2);

        SingleListNode res = getIntersectionNode(l1, l2);
        System.out.println("Intersection node : "+res.data);
    }

    private static SingleListNode getIntersectionNode(SingleListNode n1, SingleListNode n2) {
        /**
         * 1. Find out length of both linkedlists...
         * 2. Iterate bigger one till getting both lists same size...
         * 3. then check each node, if equal then return that node...
         */
        int l1 = 0, l2 = 0;
        SingleListNode t1 = n1;
        SingleListNode t2 = n2;
        while(n1 != null){
            l1++;
            n1 = n1.nextNode;
        }
        while (n2 != null){
            l2++;
            n2 = n2.nextNode;
        }
        int dif = l1-l2;
        if(dif > 0){
            while(dif>0){
                t1 = t1.nextNode;
                dif--;
            }
        }else if(dif < 0){
            t2 = t2.nextNode;
        }
        while(t1 != null){
            if(t1 == t2) return t1;
            t1 = t1.nextNode;
            t2 = t2.nextNode;
        }

        return null;
    }
}
