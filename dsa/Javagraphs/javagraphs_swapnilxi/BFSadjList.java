package Javagraphs.javagraphs_swapnilxi;

import java.util.ArrayList;
import java.util.LinkedList;

class BFSadjList{
    private static int bfs( ArrayList<ArrayList<Integer>>adj, int v, int src , int d,int pred[], int dist[]){
        LinkedList<Integer> queue= new LinkedList<>();
        boolean[] vis= new boolean[v];
        for(int i=0; i< v; ++i){
        vis[i]=false;
        dist[i]= Integer.MAX_VALUE;
        pred[i]=-1;
        }
        vis[src]= true;
        queue.add(src);
        dist[src]=0;// distance from src to src

        while (!queue.isEmpty()){
            int curr=  queue.poll();
              System.out.println(curr);
        //traverse all the neighbour and add unvisted to queue
        for(int  i=0 ; i< adj.get(curr).size(); ++i){
            int neighbor= adj.get(curr).get(i);
            if(vis[neighbor]==false){
                queue.add(neighbor);
                vis[neighbor]=true;

                dist[neighbor]= dist[curr]+1;
                pred[neighbor]= curr;
            }
        }
        }
        return d;
        
    }
    void addEdge(int s,int d, ArrayList<ArrayList<Integer>> adj)  
    {  
        adj.get(s).add(d);       
    } 

    public static void main(String[] args) {
        int v=9;
        int[] pred=new int[v+1];
        int[] dist=new  int [v+1];
        BFSadjList graph = new BFSadjList();  
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) adj.add(new ArrayList<Integer>());
			
        graph.addEdge(0, 1,adj );  
        graph.addEdge(0, 3,adj);  
        graph.addEdge(0, 4,adj);  
        graph.addEdge(4, 5, adj);  
        graph.addEdge(3, 5,adj);  
        graph.addEdge(1, 2,adj);  
        graph.addEdge(1, 0,adj);  
        graph.addEdge(2, 1,adj);  
        graph.addEdge(4, 1,adj);  
        graph.addEdge(3, 1,adj);  
        graph.addEdge(5, 4,adj);  
        graph.addEdge(5, 3, adj);  
        System.out.println("Breadth First Traversal for the graph is:");  
        bfs(adj, v,0,6, pred, dist);  
        
    }
 } 