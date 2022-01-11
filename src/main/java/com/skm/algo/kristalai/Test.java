package com.skm.algo.kristalai;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author saroj on 7/29/2020
 */
public class Test {
    Map<Integer, Node> parentNodeMap = new HashMap<>();
    Set<Integer> visitedNodes = new HashSet<>();

    /**
     * find out kth nearest...
     * @param target
     * @param k
     */
    public void knearest (Node target, int k) {
        visitedNodes.add(target.data);
        //base condition...
        if(k == 0){
            System.out.println(target.data+",");
            return;
        }
        //UPWARD MOVE
        Node parentNode = parentNodeMap.get(target.data);
        if(parentNode != null && !visitedNodes.contains(parentNode.data)) knearest(parentNode,k-1);

        //LEFT MOVE
        if(target.leftNode != null && !visitedNodes.contains(target.leftNode.data)) knearest(target.leftNode,k-1);

        //RIGHT MOVE
        if(target.leftNode != null && !visitedNodes.contains(target.rightNode.data)) knearest(target.rightNode,k-1);
    }
    private void storeParentNode(Node root, Node target){
        if(root == null && root.data == target.data){
            return;
        }
        //store in hashmap...
        if(target.data<root.data){
            if(root.leftNode != null) parentNodeMap.put(root.leftNode.data,root);
            storeParentNode(root.leftNode,target);
        }

        if(target.data>=root.data){
            if(root.rightNode != null) parentNodeMap.put(root.rightNode.data,root);
            storeParentNode(root.rightNode,target);
        }

    }
    public static void main(String[] args) {
        Test test = new Test();
        Node root = new Node(20);
        Node targetNode = new Node(15);
        test.knearest(targetNode, 2);
    }
}

class Node{
    Node leftNode;
    Node rightNode;
    int data;

    Node(int data){
        this.data = data;
    }
}
