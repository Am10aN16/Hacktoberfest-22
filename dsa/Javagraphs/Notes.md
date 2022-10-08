Graph questions : [450 DSA Graph](https://450dsa.com/graph) 

We can create and print graph by two methods-
1. Adj Matrix 
2. adj List 

Printing graph using adjMatrix mehtod - (adjMatrix)[#]  
printing graph using adjList- (adjList)[#]


- AdjMatrix is used in Dense graphs, as it is not easy to track and visualise all list as compared to the adjMatrix
- It is faster to use adjacency lists for graphs having less number of edges.

## BFS in Graphs
- Traversal Technique 
- Need two things- visited array and Adj List 

- get a front node in queue  - Extract it - mark visited- print it 
push next node into queue - don't print visited 

- in case of disconnected graph - add for loop to make sure that you have traversed all the loop

Read more here: [BFS JavaTpoint](https://www.javatpoint.com/breadth-first-search-algorithm)

(BFS Code)[#]


### Explanation to code :

create a queue Q 
mark v as visited and put v into Q 
while Q is non-empty 
    remove the head u of Q 
    mark and enqueue all (unvisited) neighbours of u

Dry run : ![image](https://user-images.githubusercontent.com/54740310/194698805-7974a0c7-2d2f-410d-a25e-8b605d435de1.png)




