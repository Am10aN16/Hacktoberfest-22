package Javagraphs.javagraphs_swapnilxi;
import java.util.ArrayList;

public class AdjList
{
			
			  // Adding edge
static void addEdge(ArrayList<ArrayList<Integer>> adjList, int s, int d) {
				adjList.get(s).add(d);
				adjList.get(d).add(s);
			  }
			
public static void main(String[] args) {			
				int V = 5;
				ArrayList<ArrayList<Integer>> adjList = new ArrayList<>(V);
			
				for (int i = 0; i < V; i++)
				  adjList.add(new ArrayList<>());
			
				// Add edges
				addEdge(adjList, 0, 1);
				addEdge(adjList, 0, 2);
				addEdge(adjList, 0, 3);
				addEdge(adjList, 1, 2);
			
				printGraph(adjList);
			  }
			
			  // Print the graph
			  static ArrayList<ArrayList<Integer>>  printGraph(ArrayList<ArrayList<Integer>> adjList) {
				for (int i = 0; i < adjList.size(); i++) {
				  System.out.println("\nVertex " + i + ":");
				  for (int j = 0; j < adjList.get(i).size(); j++) {
					System.out.print(" -> " + adjList.get(i).get(j));
				  }
				  System.out.println();
				}
				return adjList;
			  }
}

	
	