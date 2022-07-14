package com.skm.algo.tree;



import java.util.HashMap;
import java.util.Map;

/**
 * @author Saroj on 15/07/22
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.
 *
 *      3
 *     /\
 *    9  20
 *      /  \
 *     15   7
 * Example 1:
 *
 *
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 **/
public class TreeBuildFromPreAndIn {
    static Map<Integer, Integer> map = new HashMap<>();
    static int preIndex = 0;
    public static void main(String[] args) {
        int[] p = new int[]{3,9,20,15,7};
        int[] i = new int[]{9,3,15,20,7};
        Node node = buildTree(p,i);
        System.out.println(node);
    }
    public static Node buildTree(int[] p, int[]in){
        //store inorder values in index wise so that it will be faster to read in O(1) time complexity...
        int l = in.length;
        for(int i=0; i<l; i++){
            map.put(in[i],i);
        }
        return build(p,in,0,l-1);
    }

    public static Node build(int[] p, int[] i, int start, int end){
        if(start > end) return null;
        int data = p[preIndex++];
        Node node = new Node(data);
        //if start == end then there is no child node so no need to proceed further so return back from here...
        if(start == end) return node;
        //else continue further...
        //find index of such element in inorder array for getting leftNod & rightNode...
        int index = map.get(data);
        node.leftNode = build(p,i,start,index-1);
        node.rightNode = build(p,i,index+1,end);
        return node;
    }
}
