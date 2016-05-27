package com.jackson.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class BFSShortestReach {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i = 0;
        while (i < t) {
            Graph g = new Graph();
            int n = in.nextInt();
            for (int j = 1; j <= n; j++) {
                Node node = new Node(j);
                g.addNode(node);
            }
            
            int m = in.nextInt();
            int j = 0;
            while (j < m) {
                int x = in.nextInt();
                int y = in.nextInt();
                Node nodeX = g.getNode(x);
                Node nodeY = g.getNode(y);
                nodeX.addEdge(y);
                nodeY.addEdge(x);
                g.addNode(nodeX);
                g.addNode(nodeY);
                j++;
            }
            int s = in.nextInt();
            g.bfsSearch(g.getNode(s));
            
            for (Iterator iterator = g.nodes.keySet().iterator(); iterator.hasNext();) {
                Integer id = (Integer)iterator.next();
                Node node = g.nodes.get(id);
                if (!node.id.equals(s)) {
                    System.out.print(node.distance + " ");
                }
            }
            
            i++;
            System.out.println();
        }
        in.close();
    }
    
    private static class Node {
        private Integer id;
        private int distance = -1;
        private HashMap<Integer, Boolean> edges = new HashMap<Integer, Boolean>();
        
        public Node (Integer id) {
            this.id = id;
        }
        
        public void addEdge (Integer id) {
            this.edges.put(id, false);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Node node = (Node)obj;
            return this.id.equals(node.id);
        }

        @Override
        public String toString() {
              return "[Id: " + id + "] | " + edges;
        }
        
        
    }
    
    private static class Graph {
        private HashMap<Integer, Node> nodes = new HashMap<Integer, Node>();
        
        public void addNode(Node node) {
            nodes.put(node.id, node);
        }
        
        public boolean contains (Integer id) {
            return nodes.containsKey(id);
        }
        
        public Node getNode(Integer id) {
            return nodes.get(id);
        }
        
        public void bfsSearch(Node origin) {
            LinkedList<Node> queue = new LinkedList<Node>(); 
            origin.distance = 0;
            
            queue.add(origin);
            
            while (!queue.isEmpty()) {
                Node current = queue.removeFirst();
                
                for (Iterator iterator = current.edges.keySet().iterator(); iterator.hasNext();) {
                    Integer id = (Integer) iterator.next();
                    Node node = nodes.get(id);
                    if (node.distance == -1) {
                        node.distance = current.distance + 6;
                        queue.add(node);
                    }
                }
            }
        }
        
        
    }

}
