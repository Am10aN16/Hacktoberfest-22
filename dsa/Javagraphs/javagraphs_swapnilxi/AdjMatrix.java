package  Javagraphs.javagraphs_swapnilxi; 
import java.util.*;
class Graph {
    private int v;
     private int e;
     private int[][] a= new int[v+1][v+1];
     
     public Graph(int nodes ){
         this.v= nodes;
         this.e=0;
         this.a= new int[nodes][nodes];
     }
     
 public void addEdge(int start,int destination){
        a[start][destination] = 1;
        a[destination][start] = 1;
       e++;
    }



public void printGraph(){
System.out.print("vertex: "+v+ " edge: "+ e + "\n");
        System.out.println("Adjacency Matrix : ");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j <v ; j++) {

                System.out.print(a[i][j]+ " ");
            }
            System.out.println( "\n");
        }
}

    public static void main(String[] args) {
        Graph graph= new Graph(5);
        System.out.println("intial structure" + graph.v +"\n");
        graph.addEdge(0,1);
        graph.addEdge(1,2);  
        graph.addEdge(2,1);
        graph.addEdge(2,0);
        graph.printGraph();
        }
}