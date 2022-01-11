package com.skm.algo.util;

import com.skm.algo.tree.Node;

/**
 * Created by saroj on 4/30/2019.
 */
public class TreeUtil {
    /*
        6
        |
    4------7
    |      |
  2---5     8
  |
 3
  */
    public static Node getDefaultNode(){
        Node rootNode = new Node(6);
        TreeUtil treeUtil = new TreeUtil();
        treeUtil.insertNode(rootNode,4);
        treeUtil.insertNode(rootNode,7);
        treeUtil.insertNode(rootNode,8);
        treeUtil.insertNode(rootNode,5);
        treeUtil.insertNode(rootNode,2);
        treeUtil.insertNode(rootNode,3);
        return rootNode;
    }
    /**
     * Inserting node in recursive manner...
     * @param node
     * @param value
     * @return
     */
    public Node insertNode(Node node, int value){
        //check value is lessthan current node, if yes, then put in left node...
        if(value <= node.getData()){
            //insert at left node...
            if(node.getLeftNode() != null){
                insertNode(node.getLeftNode(),value);
            }else{
                System.out.println("Inserted - "+value+" at left of "+node.getData());
                node.setLeftNode(new Node(value));
            }
        }else if(value > node.getData()){
            //insert at right node...
            if(node.getRightNode() != null){
                insertNode(node.getRightNode(), value);
            }else{
                System.out.println("Inserted - "+value+" at right of "+node.getData());
                node.setRightNode(new Node(value));
            }
        }
        return  node;
    }
}
