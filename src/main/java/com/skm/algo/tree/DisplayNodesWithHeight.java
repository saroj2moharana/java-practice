package com.skm.algo.tree;

import com.skm.algo.util.TreeUtil;

/**
 * Find nodes at a distance k from the root.
 */
public class DisplayNodesWithHeight {
    public static void main(String[] args) {
        Node root = TreeUtil.getDefaultNode();
        displayNodesWithDistance(1,root);
    }
    public static void displayNodesWithDistance(int k,Node curNode){
        if(k==0 && curNode != null) System.out.println(curNode.getData());
        if(curNode == null) return;
        k--;
        displayNodesWithDistance(k,curNode.getLeftNode());
        displayNodesWithDistance(k,curNode.getRightNode());
    }
}
