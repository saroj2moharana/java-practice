package com.skm.algo.tree;

import java.util.*;

/**
 * @Author saroj on 10/05/22
 *
 * Given a binary tree and a node where fire starts. All nodes burn is the same speed.
 * In each time unit, all the neighbors of a node get burnt and subsequently with each time unit their neighbors.
 * You have to find the nodes that are burned on each unit of time.
 *
 * input = [1,3,4,5,6,7,8,9] Start = 8 op = [[8],[5,7,9],[6,3],[1,4]]
 * 		 5
 * 		/ \
 * 	   3   8
 * 	  / \  /\
 * 	 1  4 7  9
 * 	     /
 * 	    6
 **/
public class BurningTree {
    static HashMap<Integer,Node> hm = new HashMap();
    public static void main(String[] args) {
        Node root = new Node(5);
        Node n1 = new Node(3);
        Node n2 = new Node(1);
        Node n3 = new Node(4);
        Node n4 = new Node(8);
        Node n5 = new Node(7);
        Node n6 = new Node(6);
        Node n7 = new Node(9);
        root.setLeftNode(n1);
        root.setRightNode(n4);

        n1.setLeftNode(n2);
        n1.setRightNode(n3);

        n4.setLeftNode(n5);
        n4.setRightNode(n7);

        n5.setLeftNode(n6);

        List<List<Integer>> burnedList = burnTree(root, n4);
        System.out.println("burnedList:"+burnedList);

    }
    public static List<List<Integer>> burnTree(Node root, Node targetNode){
        List<List<Integer>> burnedList = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        q.add(targetNode);
        while(!q.isEmpty()){
            List<Integer> al = new ArrayList<>();
            int l = q.size();
            for(int i=0; i<l; i++){
                Node c = q.remove();
                al.add(c.getData());
                c.setVisited(true);
                addNeighours(q,c,root);
            }
            burnedList.add(al);
        }
        return burnedList;
    }

    public static void addNeighours(Queue q, Node c, Node root){
        //get parent...
        Node parent = getParent(root,c);
        int parentData = parent != null? parent.getData():-1;
        System.out.println("parent of:"+c.getData()+" is :"+parentData);
        if(parent != null && !parent.isVisited()) q.add(parent);
        if(c.leftNode != null && !c.leftNode.isVisited()) q.add(c.leftNode);
        if(c.rightNode != null && !c.rightNode.isVisited()) q.add(c.rightNode);
    }

    public static Node getParent(Node root, Node cur){
        Node p = hm.get(cur.getData());
        if(p != null) return p;
        if(root == null || root.getData() == cur.getData()) return root;
        if(p==null && root.leftNode != null){
            hm.put(root.leftNode.getData(), root);
            p = getParent(root.leftNode,cur);
        }
        if(p == null && root.rightNode != null){
            hm.put(root.rightNode.getData(), root);
            p = getParent(root.rightNode,cur);

        }
        return root;
    }
}
