package com.skm.algo.tree;

import com.skm.algo.util.TreeUtil;

/**
 * @author SAROJ on 18-10-2021
 */
public class TreeNodeDistance {
    public static void main(String[] args) {
        Node node = TreeUtil.getDefaultNode();
        int l = 5,r=7;
        int d = findDistance(node,l,r);
        System.out.println("Distance - "+d);

    }
    public static int findDistance(Node curNode, int l, int r){
        Node lcaNode = findLca(curNode, l, r);
        //System.out.println("lcaNode-"+lcaNode.getData());
        int lh = findHeight(lcaNode,l,0);
        //System.out.println("h1 - "+lh);
        int rh = findHeight(lcaNode,r,0);
        //System.out.println("h2 - "+rh);
        return lh+rh;
    }
    public static int findHeight(Node curNode, int data, int level){
        if(curNode == null) return -1;
        if(curNode.getData() == data) return level;

        int lh = findHeight(curNode.leftNode,data,level+1);
        if(lh == -1) return findHeight(curNode.rightNode,data,level+1);
        return lh;
    }
    public static Node findLca(Node curNode, int l, int r){
        if(curNode == null) return null;
        if(curNode.getData()==l || curNode.getData() == r) return curNode;
        Node left = findLca(curNode.leftNode,l,r);
        Node right = findLca(curNode.rightNode,l,r);
        if(left != null && right != null) return curNode;
        else return left != null ? left : right;
    }
}
