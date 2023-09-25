package com.skm.algo.tree;

import com.skm.algo.util.TreeUtil;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author saroj on 21/09/23
 */
public class MirrorOfTree {
    public static void main(String[] args) {
        Node root = TreeUtil.getDefaultNode();
        Node res = mirror(root);
        System.out.println(res);
    }
    public static Node mirror(Node root){
        //traverse level wise...
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            //change left to right and vice versa...
            Node curNode = queue.poll();
            if(curNode != null){
                Node rightNode = curNode.getRightNode();
                curNode.setRightNode(curNode.getLeftNode());
                curNode.setLeftNode(rightNode);
                if(curNode.getLeftNode() != null) queue.offer(curNode.getLeftNode());
                if(curNode.getRightNode() != null) queue.offer(curNode.getRightNode());
            }
        }
        return root;
    }
}
