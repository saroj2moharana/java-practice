package com.skm.algo.linkedlist;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by saroj on 7/24/2019.
 * 2-->3-->4-->5-->3
 */
public class LinkedListLoopDetect {
    public static void main(String arg[]){
        SingleListNode singleListNode = new SingleListNode(2);

        SingleListNode singleListNode3 = new SingleListNode(3);
        singleListNode.setNextNode(singleListNode3);//2-->3

        singleListNode.getNextNode().setNextNode(new SingleListNode(4));//2-->3-->4
        singleListNode.getNextNode().getNextNode().setNextNode(new SingleListNode(5));//2-->3-->4-->5
        singleListNode.getNextNode().getNextNode().getNextNode().setNextNode(singleListNode3);//2-->3-->4-->5-->3
        System.out.println(singleListNode);
        //detectLoop(singleListNode);
    }
    public static void detectLoop(SingleListNode singleListNode){
        HashSet<SingleListNode> nodeVisited = new LinkedHashSet<>();
        while(singleListNode != null){
            if(nodeVisited.contains(singleListNode)){
                System.out.println("Found Loop at:"+singleListNode);
                break;
            }
                nodeVisited.add(singleListNode);

            singleListNode = singleListNode.getNextNode();
        }
    }
}
