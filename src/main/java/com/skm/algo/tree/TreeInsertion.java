package com.skm.algo.tree;

import java.util.Scanner;

/**
 * @author saroj on 10/18/2019
 */
public class TreeInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int counter = 0;
        while(counter<5){
            System.out.println("Please enter a new number:");
            root = insertNode(root,sc.nextInt());
            counter++;
        }
        System.out.println(root);
    }

    public static Node insertNode(Node root, int curElement){
        Node headNode = root;
        //for a fresh tree...
        if(root == null){
            root = new Node(curElement);
            return root;
        }else if(curElement <= root.getData()){//traverse to left if current value is less than tree...
            Node curNode = insertNode(root.getLeftNode(),curElement);
            root.setLeftNode(curNode);
        }else if(curElement >= root.getData()){//traverse to right if current value is greater than current-Node's value...
            Node curNode = insertNode(root.getRightNode(),curElement);
            root.setRightNode(curNode);
        }
        return headNode;
    }
}
