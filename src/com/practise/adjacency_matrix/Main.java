package com.practise.adjacency_matrix;

public class Main {
    public static void main(String[] args){
        Graph adjacentMatrixGraph = new Graph(4);
        adjacentMatrixGraph.addNode(new Node('A'));
        adjacentMatrixGraph.addNode(new Node('B'));
        adjacentMatrixGraph.addNode(new Node('C'));
        adjacentMatrixGraph.addNode(new Node('D'));

        adjacentMatrixGraph.addEdge(0, 1);
        adjacentMatrixGraph.addEdge(1, 2);
        adjacentMatrixGraph.addEdge(2, 3);
        adjacentMatrixGraph.addEdge(3, 0);

        adjacentMatrixGraph.print();
    }
}