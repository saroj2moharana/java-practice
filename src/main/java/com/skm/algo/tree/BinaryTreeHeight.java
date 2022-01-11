package com.skm.algo.tree;

import com.skm.algo.util.TreeUtil;

import java.util.Scanner;

/**
 * Created by saroj on 4/30/2019.
 */
public class BinaryTreeHeight {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Node node = TreeUtil.getDefaultNode();
        System.out.println("Height of Binary Tree:"+findMaxHight(node));
        //System.out.println("Completed Binary Tree:"+node);
    }
    private static int findMaxHight(Node node){
        if(node == null) return -1;
        return Integer.max(findMaxHight(node.getLeftNode()),findMaxHight(node.getRightNode()))+1;
    }
}
