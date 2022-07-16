package com.skm.algo.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Saroj on 17/07/22
 * Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 *
 * Example 1:
 **
 *      1
 *     / \
 *    2   3
 *     \   \
 *     5    4
 * Input: root = [1,2,3,null,5,null,4]
 * Output: [1,3,4]
 * Example 2:
 *
 * Input: root = [1,null,3]
 * Output: [1,3]
 * Example 3:
 *
 * Input: root = []
 * Output: []
 **/
public class TreeRightView {
    static Map<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Node root = new Node(1);
        Node ch1 = new Node(2);
        root.setLeftNode(ch1);
        Node ch2 = new Node(3);
        root.setRightNode(ch2);
        Node ch3 = new Node(5);
        ch1.setRightNode(ch3);
        Node ch4 = new Node(4);
        ch2.setRightNode(ch4);

        printRightView(root,0);
    }
    public static void printRightView(Node node, int level){
        if(node == null) return;
        if(!map.containsKey(level)){
            map.put(level,node.getData());
            System.out.print(node.getData() + " ");
        }
        level++;
        printRightView(node.rightNode, level);
        printRightView(node.leftNode, level);
        return;
    }
}
