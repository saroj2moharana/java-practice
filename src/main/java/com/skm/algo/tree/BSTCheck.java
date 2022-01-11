package com.skm.algo.tree;

/**
 * @author saroj on 10/10/2019
 */
public class BSTCheck {
    public static void main(String[] args) {
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
        Node rootNode = null;
        //build tree...
        for(int i=0; i<keys.length; i++){
            rootNode = insertNode(rootNode,keys[i]);
        }
        System.out.println(rootNode);
        //check bst...
        if(isBst(rootNode, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("This is BST...");
        else
            System.out.println("This is not BST...");
    }

    public static boolean isBst(Node root, int min, int max){
        //base case...
        if(root == null) return true;

        //check both baundaries...
        if(root.getData() < min || root.getData() >= max) return false;

        return isBst(root.getLeftNode(),min,root.getData()) && isBst(root.getRightNode(),root.getData(),max);
    }

    public static Node insertNode(Node root, int data){
        if(root == null) {
            root = new Node(data);
            return root;
        }
        if(data<=root.getData()){
            Node leftNode = insertNode(root.getLeftNode(),data);
            root.setLeftNode(leftNode);
        }else if(data>root.getData()){
            Node rightNode = insertNode(root.getRightNode(),data);
            root.setRightNode(rightNode);
        }
        return root;
    }
}
