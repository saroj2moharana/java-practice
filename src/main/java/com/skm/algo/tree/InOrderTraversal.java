package com.skm.algo.tree;

import com.skm.algo.util.TreeUtil;
import java.util.Stack;

/**
 * Created by saroj on 7/23/2019.
 */
public class InOrderTraversal {
    public static void main(String arg[]){
        Node node = TreeUtil.getDefaultNode();
        inOrderTraversalUsingStack(node);
    }
    public static void inOrderTraversalUsingStack(Node node){
        Stack<Node> nodes = new Stack<>();
        while(true){
            //push till left node is not null...
            if(node != null){
                nodes.push(node);
                node = node.getLeftNode();
            }else if(!nodes.isEmpty()){
                node = nodes.pop();//get root of child most tree...
                System.out.println(node.getData());//display root of child most tree...
                node = node.getRightNode();
            }else
                break;
        }
    }
}
