package Javagraphs.javagraphs_swapnilxi;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    private int v;        
    private LinkedList<Integer>[] adj;      /* adjacency list */  
    private Queue<Integer> queue;           /*  neighbour queueue */  
    BFSTraversal(int v)  
    {  
        this.v = v;  
        this.adj = new LinkedList[v];  
        for (int i=0; i<v; i++)  
        {  
            adj[i] = new LinkedList<>();  
        }  
        queue = new LinkedList<Integer>();  
    }  
    void addEdge(int s,int d)  
    {  
        adj[s].add(d);      /* adding an edge to the adjacency list (edges are bidirectional in this example) */  
    }  
    void BFS(int n)  
    {  
        boolean visited[] = new boolean[v];       /* initialize boolean array for holding the data */  
        int neighbour = 0;  
        visited[n]=true;                    
        queue.add(n);       /* root v is added to the top of the queueue */  
        while (!queue.isEmpty())  
        {  
            n = queue.poll();        /* remove the top element of the queueue */   
            System.out.print(n+" ");    /* print the top element of the queueue */  
            for (int i = 0; i < adj[n].size(); i++)  /* iterate through the linked list and push all neighbors into queueue */  
            {  
                neighbour = adj[n].get(i);  
                if (!visited[neighbour])      /* only insert visited into queueue if they have not been explored already */  
                {  
                    visited[neighbour] = true;  
                    queue.add(neighbour);  
                }  
            }    
        }  
    }  
    public static void main(String args[])  
    {  
        BFSTraversal graph = new BFSTraversal(6);  
        graph.addEdge(0, 1);  
        graph.addEdge(0, 3);  
        graph.addEdge(0, 4);  
        graph.addEdge(4, 5);  
        graph.addEdge(3, 5);  
        graph.addEdge(1, 2);  
        graph.addEdge(1, 0);  
        graph.addEdge(2, 1);  
        graph.addEdge(4, 1);  
        graph.addEdge(3, 1);  
        graph.addEdge(5, 4);  
        graph.addEdge(5, 3);  
        System.out.println("Breadth First Traversal for the graph is:");  
        graph.BFS(0);  
    }  
    
}
