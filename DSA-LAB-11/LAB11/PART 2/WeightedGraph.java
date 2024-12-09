package com.mycompany.graph1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeightedGraph{
    int[][] matrix;

   
    WeightedGraph(int vertices){
        matrix=new int[vertices][vertices]; }

    
    public void add(int u,int v,int weight){
        matrix[u-1][v-1]=weight;
        matrix[v-1][u-1]=weight;
    }

   public void display(){
        System.out.println("Adjacency Matrix:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }}

    // Find the shortest path using Dijkstra's algorithm
    public void findShortestPath(int start,int end){
        int vertices=matrix.length;
        int[] dist=new int[vertices];
        boolean[] visited = new boolean[vertices];
        int[] parent = new int[vertices];

        for(int i=0;i<vertices;i++){
            dist[i]=Integer.MAX_VALUE;
            parent[i]=-1;
        }
dist[start-1]=0;

    for(int i=0;i<vertices-1;i++){
            int u = findMinDistance(dist, visited);
            visited[u]=true;
            for(int v=0;v<vertices;v++){
                if(!visited[v] && matrix[u][v] !=0 &&dist[u] !=Integer.MAX_VALUE
                        && dist[u] + matrix[u][v]<dist[v]){
                    dist[v]=dist[u]+matrix[u][v];
                    parent[v] = u;
                }}}

        printPath(parent,start-1,end-1,dist[end -1]);
    }

     int findMinDistance(int[] dist,boolean[] visited){
        int min = Integer.MAX_VALUE, minIndex = -1;

        for(int v = 0; v <dist.length;v++){
            if (!visited[v]&&dist[v]<min){
                min = dist[v];
                minIndex = v;
            }}
        return minIndex;
    }

     void printPath(int[] parent,int start,int end,int distance){
        List<Integer> path = new ArrayList<>();
        int current = end;

        while(current!=-1){
            path.add(current+1);
            current=parent[current];
        }

        Collections.reverse(path);
        System.out.println("Shortest Path from " + (start + 1) + " to " + (end + 1) + ": " + path);
        System.out.println("Shortest Distance: " + distance);
    }

    // Detect all connected components
    public void findConnectedComponents(){
        int vertices = matrix.length;
        boolean[] visited = new boolean[vertices];
        List<List<Integer>> components = new ArrayList<>();

        for(int i=0;i<vertices;i++){
            if(!visited[i]){
                List<Integer> component = new ArrayList<>();
                dfs(i,visited,component);
                components.add(component);
            }}

        System.out.println("Connected Components:");
        for(int i=0;i<components.size();i++){
            System.out.println("Component "+(i+1)+": "+components.get(i));
        }}

     void dfs(int vertex,boolean[] visited,List<Integer> component) {
        visited[vertex]=true;
        component.add(vertex+1);

        for(int i= 0;i<matrix.length;i++){
            if(matrix[vertex][i]!=0&&!visited[i]){
                dfs(i,visited,component);
            }}}

    // Main method
    public static void main(String[] args){
        WeightedGraph graph = new WeightedGraph(4);
        graph.add(1, 2, 3);
        graph.add(2, 3, 1);
        graph.add(3, 4, 4);
        graph.add(4, 1, 2);

        graph.display();

        // Find the shortest path
        graph.findShortestPath(1, 4);

        // Detect connected components
        graph.findConnectedComponents();
    }
}
