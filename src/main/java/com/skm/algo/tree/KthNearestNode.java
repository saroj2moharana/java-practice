package com.skm.algo.tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author saroj on 7/29/2020
 */
public class KthNearestNode {
    Map<Integer, Node> parentNodeMap = new HashMap<>();
    Set<Integer> visitedNodes = new HashSet<>();

    /**
     * find out kth nearest...
     * @param target
     * @param k
     */
    public void knearest (Node target, int k) {
        visitedNodes.add(target.getData());
        //base condition...
        if(k == 0){
            System.out.println(target.getData()+",");
            return;
        }
        //UPWARD MOVE
        Node parentNode = parentNodeMap.get(target.getData());
        if(parentNode != null && !visitedNodes.contains(parentNode.getData())) knearest(parentNode,k-1);

        //LEFT MOVE
        if(target.leftNode != null && !visitedNodes.contains(target.leftNode.getData())) knearest(target.leftNode,k-1);

        //RIGHT MOVE
        if(target.leftNode != null && !visitedNodes.contains(target.rightNode.getData())) knearest(target.rightNode,k-1);
    }
    private void storeParentNode(Node root, Node target){
        if(root == null && root.getData() == target.getData()){
            return;
        }
        //store in hashmap...
        if(target.getData()<root.getData()){
            if(root.leftNode != null) parentNodeMap.put(root.leftNode.getData(),root);
            storeParentNode(root.leftNode,target);
        }

        if(target.getData()>=root.getData()){
            if(root.rightNode != null) parentNodeMap.put(root.rightNode.getData(),root);
            storeParentNode(root.rightNode,target);
        }

    }
    public static void main(String[] args) {
        KthNearestNode test = new KthNearestNode();
        Node root = new Node(20);
        Node targetNode = new Node(15);
        test.knearest(targetNode, 2);
    }
}
