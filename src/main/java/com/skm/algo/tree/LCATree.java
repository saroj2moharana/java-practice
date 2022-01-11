package com.skm.algo.tree;

import com.skm.algo.util.TreeUtil;

/**
 * @author SAROJ on 18-10-2021
 */
public class LCATree {
    public static void main(String[] args) {
        Node root = TreeUtil.getDefaultNode();
        int l = 2, r=5;
        Node lcaNode = findLCA(root,l,r);
        System.out.println("LCA - "+lcaNode.getData());
    }
    public static Node findLCA(Node curNode,int l, int r){
        if(curNode == null) return curNode;
        if(curNode.getData() == l || curNode.getData() == r) return curNode;
        Node leftNode = findLCA(curNode.leftNode,l,r);
        Node rightNode = findLCA(curNode.rightNode,l,r);
        if(leftNode != null && rightNode != null) return curNode;
        else return leftNode != null ? leftNode:rightNode;
    }
}
