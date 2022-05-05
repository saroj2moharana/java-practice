package com.skm.algo.linkedlist;

/**
 * @Author saroj on 05/05/22
 * This program is for checking whether linked list is palindrome or not
 * 10-->20-->30-->20-->10-->null is a palindrome it's same as it's reverse
 **/
public class PallindromeCheck {
    public static void main(String[] args) {
        SingleListNode head = new SingleListNode(10);
        SingleListNode n1 = new SingleListNode(20);
        SingleListNode n2 = new SingleListNode(30);
        //SingleListNode n5 = new SingleListNode(30);
        SingleListNode n3 = new SingleListNode(20);
        SingleListNode n4 = new SingleListNode(10);

        head.nextNode = n1;
        n1.nextNode = n2;
        n2.nextNode = n3;
        //n5.nextNode = n3;
        n3.nextNode = n4;
        System.out.println("Before Partition:"+head);
        boolean flag = checkPalindrome(head);
        System.out.println("Checked palindrome : "+flag);
    }

    public static boolean checkPalindrome(SingleListNode head){
        /**
         * 1. Find out middle node...
         * 2. reverse from middle...
         * 3. Iterate from head & reversed-last from middle part
         * 4. check from both sides whether it's equal or not...
         */
        //find out middle node...
        SingleListNode mid = getMiddle(head);
        SingleListNode revHead = reverse(mid);
        System.out.println("reverse : "+revHead);
        while(revHead.nextNode != null){
            if (head.data != revHead.data) return false;
            head = head.nextNode;
            revHead = revHead.nextNode;
        }
        return true;
    }
    public static SingleListNode getMiddle(SingleListNode head){
        SingleListNode slow = head;
        SingleListNode fast = head;
        while(fast.nextNode != null && fast.nextNode.nextNode != null){
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }
        System.out.println("Middle element:"+slow.data);
        return slow;
    }

    public static SingleListNode reverse(SingleListNode curNode){
        if(curNode.nextNode == null) return curNode;
        SingleListNode head = reverse(curNode.nextNode);
        //reverse now...
        //20-->10-->null;
        SingleListNode tempNextNode = curNode.nextNode;//20
        curNode.nextNode = curNode.nextNode.nextNode;//10-->null
        tempNextNode.nextNode = curNode;//20-->10

        return head;
    }
}
