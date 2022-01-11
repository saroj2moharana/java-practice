package com.skm.algo.linkedlist;

/**
 * Created by saroj on 7/22/2019.
 */
public class SingleListNode {
    public int data;
    public SingleListNode nextNode;

    public SingleListNode(int data) {
        this.data = data;
    }

    public SingleListNode(){}

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SingleListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(SingleListNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("data=").append(data);
        sb.append(" --> ").append(nextNode);
        return sb.toString();
    }
}
