package com.practise.adjacency_matrix;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<Node> nodeList = new ArrayList<Node>();
    int[][] matrix;

    public Graph(int size){
        matrix = new int[size][size];
    }

    public void addNode(Node node){
        nodeList.add(node);
    }

    public void addEdge(int src, int dest){
        matrix[src][dest] = 1;
    }

    public boolean checkEdge(int src, int dest){
        return matrix[src][dest] == 1;
    }

    public void print(){
        System.out.print("  ");
        for (Node node : nodeList){
            System.out.print(node.data + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodeList.get(i).data + " ");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
