package com.skm.algo.graph;

import java.util.LinkedList;

/**
 * Created by saroj on 7/4/2019.
 */
public class Graph {
    private int vertices;
    private LinkedList<Integer> adjList[];

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public LinkedList<Integer> getAdjList(int index){
        return adjList[index];
    }


    Graph(int vertices){
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for(int i=0;i<vertices; i++){
            adjList[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int source, int dest){
        adjList[source].add(dest);
    }
}
