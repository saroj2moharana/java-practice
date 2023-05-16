package com.skm.algo.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author saroj on 15/05/23
 */
public class SwapNodes {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        //1,2,3,4,5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = s1.swapNodes(head,2);
        while(result != null){
            System.out.print(result.val+"-->");
            result = result.next;
        }
    }
}
class Solution {
    public ListNode swapNodes1(ListNode head, int k) {
        ListNode tempNode = head;
        Map<Integer,ListNode> map = new HashMap<>();
        int c = 1;
        while(head != null){
            map.put(c,head);
            c++;
            head = head.next;
        }
        int l = map.size();
        if(l == k){
            swapNode(map.get(1), map.get(k));
            return tempNode;
        }
        //1
        ListNode l1 = map.get(k);
        if(k == 1) l1 = map.get(k);
        //3
        ListNode l2 = map.get(l-k+1);
        if(k == l) l2 = map.get(k);
        //6,7
        swapNode(l1,l2);

        return tempNode;
    }
    private void swapNode(ListNode l1, ListNode l2){
        int val = l1.val;
        l1.val = l2.val;
        l2.val = val;
    }

    ListNode l1 = null;
    ListNode l2 = null;
    public ListNode swapNodes(ListNode head, int k) {
        ListNode tempNode = head;
        recurseNode(head,k);
        swapNode(l1,l2);
        return tempNode;
    }
    int fc = 1;
    int bc = 0;
    private void recurseNode(ListNode head, int k){
        if(head == null){
            return;
        }
        if(fc == k) l1 = head;
        fc++;
        recurseNode(head.next,k);
        bc++;
        if(bc == k) l2 = head;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
