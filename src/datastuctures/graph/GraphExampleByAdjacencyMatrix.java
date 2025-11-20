package datastuctures.graph;

import java.util.*;

public class GraphExampleByAdjacencyMatrix {
    public static void main(String[] args) {
        // Adjacency Matrix
        GraphMatrix graphMatrix = new GraphMatrix(3);
        graphMatrix.addEdge(0,1);
        graphMatrix.addEdge(0,2);
        graphMatrix.printEdges();
        graphMatrix.printMatrix();
        // Adjacency List
        GraphAdjacencyList graphAdjacencyList =  new GraphAdjacencyList();
        graphAdjacencyList.addVertex("A");
        graphAdjacencyList.addVertex("B");
        graphAdjacencyList.addVertex("C");
        graphAdjacencyList.addEdge("A","B");
        graphAdjacencyList.addEdge("A","C");
        graphAdjacencyList.addEdge("B","C");
        graphAdjacencyList.addEdge("C","A");
        graphAdjacencyList.printGraph();
    }

}

class GraphAdjacencyList{
    Map<String, List<String>> adjList = new HashMap<>();
    public void addVertex(String v)
    {
        adjList.put(v,new ArrayList<>());
    }

    public void addEdge(String src,String dest){
        adjList.get(src).add(dest);
    }

    public void printGraph(){
        for(String v:adjList.keySet()){
            System.out.println(v+" -> " + adjList.get(v));
        }
    }

}


// AdjacencyMatrix
class GraphMatrix{

    // matrix table
    private int[][] matrix;
    private int vertices;
    private String[] labels;

    GraphMatrix(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
        labels = new String[vertices];

        // default labels: A, B, C, ...
        for (int i = 0; i < vertices; i++) {
            labels[i] = String.valueOf((char) ('A' + i));
        }
        }

        public  void addEdge(int src,int des){
        matrix[src][des] =1;
        matrix[des][src] =1;
        }


    // Print adjacency matrix
    public void printMatrix() {
        for (int i = 0; i < vertices; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    // Print edges with labels
    public void printEdges() {
        System.out.println("Graph edges:");
        for (int i = 0; i < vertices; i++) {
            for (int j = i + 1; j < vertices; j++) {
                if (matrix[i][j] == 1) {
                    System.out.println(labels[i] + " -- " + labels[j]);
                }
            }
        }
    }

}