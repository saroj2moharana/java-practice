package com.skm.algo.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author saroj on 2/26/2020
 * This is for displaying top view of a binary tree...
 */
public class TopViewDisplayDemo {
    public static void main(String[] args) {
        Node headNode = new Node(1);
        headNode.setLeftNode(2);
        headNode.setRightNode(3);
        headNode.leftNode.setLeftNode(4);
        headNode.rightNode.setRightNode(6);
        headNode.rightNode.setLeftNode(5);
        headNode.leftNode.leftNode.setLeftNode(7);
        headNode.rightNode.leftNode.setRightNode(8);
        headNode.rightNode.leftNode.rightNode.setRightNode(9);
        headNode.rightNode.leftNode.rightNode.getRightNode().setRightNode(10);
        System.out.println(headNode);
        displayTopView(headNode);

    }
    public static void displayTopView(Node headNode){
        Queue<Node> nodeQueue =  new LinkedList<>();
        headNode.setLevel(0);
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        hm.put(0,headNode.getData());
        nodeQueue.add(headNode);
        while(!nodeQueue.isEmpty()){
            Node curNode = nodeQueue.poll();
            if(curNode.getRightNode() != null){
                if(!hm.containsKey(curNode.getLevel()+1)){
                    hm.put(curNode.getLevel()+1,curNode.getRightNode().getData());
                }
                curNode.getRightNode().setLevel(curNode.getLevel()+1);
                nodeQueue.add(curNode.getRightNode());
            }
            if(curNode.getLeftNode() != null){
                if(!hm.containsKey(curNode.getLevel()-1)){
                    hm.put(curNode.getLevel()-1,curNode.getLeftNode().getData());
                }
                curNode.getLeftNode().setLevel(curNode.getLevel()-1);
                nodeQueue.add(curNode.getLeftNode());
            }
            //System.out.println(nodeQueue);
        }
        //display map values...
        System.out.println("Top View: "+hm.values());
    }
}
