package com.skm.algo.graph;

/**
 * Created by saroj on 7/4/2019.
 */
public class GraphDisplay {
    public static void main(String arg[]){
        System.out.println("Creating a graph...");
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        displayGraph(graph);

    }
    static void displayGraph(Graph graph){
        System.out.println("Following Graph :"+graph);
        for(int i=0 ; i<graph.getVertices();i++){
            System.out.println(graph.getAdjList(i));
        }
    }
}
