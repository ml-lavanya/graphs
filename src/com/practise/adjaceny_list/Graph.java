package com.practise.adjaceny_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Graph {
    List<LinkedList<Node>> nodeList;

    public Graph(){
        nodeList = new ArrayList<LinkedList<Node>>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentLinkedList = new LinkedList<Node>();
        currentLinkedList.add(node);
        nodeList.add(currentLinkedList);
    }

    public void addEdge(int src, int dest){
        LinkedList<Node> srcLinkedList = nodeList.get(src);
        Node destinationNode = nodeList.get(dest).get(0);
        srcLinkedList.add(destinationNode);
    }

    public boolean checkEdge(int src, int dest){
        Node destinationNode = nodeList.get(dest).get(0);
        LinkedList<Node> srcLinkedList = nodeList.get(src);
        for (Node node : srcLinkedList){
            if(node == destinationNode) return true;
        }
        return false;
    }

    public void print(){
        for (LinkedList<Node> linkedList : nodeList){
            for (Node node : linkedList){
                System.out.print(node.name + "->");
            }
            System.out.println();
        }
    }
}

