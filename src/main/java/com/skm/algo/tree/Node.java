package com.skm.algo.tree;

/**
 * Created by saroj on 4/30/2019.
 */
public class Node {
    private int data;
    public Node leftNode;
    public Node rightNode;
    public int level;
    public boolean visited;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Node(int data){
        this.data = data;
        //this.visited = false;
    }

    public Node(){}

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(int data){
        this.setLeftNode(new Node(data));
    }
    public void setRightNode(int data){
        this.setRightNode(new Node(data));
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("d=").append(data);
        sb.append(",level=").append(level);
        sb.append(", left=").append(leftNode);
        sb.append(", right=").append(rightNode);
        sb.append(", visited=").append(visited);
        sb.append('}');
        return sb.toString();
    }
}
