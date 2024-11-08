package com.practise.adjaceny_list;

public class Main {
    public static void main(String[] args) {
        Graph adjacencyListGraph = new Graph();
        adjacencyListGraph.addNode(new Node('A'));
        adjacencyListGraph.addNode(new Node('B'));
        adjacencyListGraph.addNode(new Node('C'));
        adjacencyListGraph.addNode(new Node('D'));
        adjacencyListGraph.addNode(new Node('E'));

        adjacencyListGraph.addEdge(0, 1);
        adjacencyListGraph.addEdge(1, 2);
        adjacencyListGraph.addEdge(1, 4);
        adjacencyListGraph.addEdge(2, 3);
        adjacencyListGraph.addEdge(2, 4);
        adjacencyListGraph.addEdge(4, 0);
        adjacencyListGraph.addEdge(4, 2);

        adjacencyListGraph.print();
    }
}
