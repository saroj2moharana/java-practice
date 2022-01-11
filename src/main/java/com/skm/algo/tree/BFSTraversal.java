package com.skm.algo.tree;

import com.skm.algo.util.TreeUtil;

import java.util.LinkedList;

/**
 * Created by saroj on 7/3/2019.
 */
public class BFSTraversal {

    public static void main(String arg[]){
        LinkedList<Node> nodes = new LinkedList<>();
        Node node = TreeUtil.getDefaultNode();
        nodes.add(node);
        while(!nodes.isEmpty()){
            Node node1 = nodes.remove();
            System.out.println(node1.getData());
            if(node1.getLeftNode() != null) nodes.add(node1.getLeftNode());
            if(node1.getRightNode() != null) nodes.add(node1.getRightNode());
        }
    }
}
