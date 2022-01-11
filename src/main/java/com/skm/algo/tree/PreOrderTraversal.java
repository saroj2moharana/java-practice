package com.skm.algo.tree;

import com.skm.algo.util.TreeUtil;

import java.util.Stack;

/**
 * Created by saroj on 5/1/2019.
 */
public class PreOrderTraversal {
    public static void main(String arg[]){
        Node node = TreeUtil.getDefaultNode();
        preOrderTraversal(node);
        preOrderTraversalUsingStack(node);
    }
    //It will traverse in preOrder(Root-Left-Right) manner... i.e. 6-4-2-3-5-7-8
    private static void preOrderTraversal(Node node){
        if(node == null) return;
        System.out.println(node.getData()+"---");
        preOrderTraversal(node.getLeftNode());
        preOrderTraversal(node.getRightNode());
    }
    private static void preOrderTraversalUsingStack(Node node){
        System.out.println("PreOrderTraversal by using stack...");
        Stack<Node> stack = new Stack();
        while(node != null){
            System.out.println(node.getData()+"---");
            if(node.getRightNode() != null) stack.push(node.getRightNode());
            node = node.getLeftNode();
            if(node == null && !stack.isEmpty())
                node = stack.pop();
        }
    }
}
