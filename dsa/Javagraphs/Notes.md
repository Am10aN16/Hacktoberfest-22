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



