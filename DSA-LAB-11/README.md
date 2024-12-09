# DSA-Course

# Lab: Graph Representation and Operations

This repository contains solutions for the lab focused on graph representation and operations using adjacency matrices. The tasks in this lab aim to strengthen understanding and application of graph data structures to solve real-world problems efficiently.

---

## Objectives

By completing this lab, students will:

1. Understand graph representation using adjacency matrices.
2. Learn how to perform graph operations programmatically.
3. Solve real-world graph problems like finding the shortest path, all paths between vertices, and detecting connected components.

---

## Contents

### Tasks Overview

1. **Task 01: Implement a Graph Using an Adjacency Matrix**
   - **Objective**: Create and represent a graph using an adjacency matrix.
   - **Input**: Number of vertices and edges, followed by edge pairs (u, v).
   - **Output**: Display the adjacency matrix of the graph.

   **Example Input:**
   - Vertices: 4
   - Edges: [(1, 2), (2, 3), (3, 4), (4, 1)]

   **Example Output:**
   ```
   Adjacency Matrix:
   0 1 0 1
   1 0 1 0
   0 1 0 1
   1 0 1 0
   ```

2. **Task 02: Display the Graph as an Adjacency Matrix**
   - **Objective**: Extend Task 1 by creating a function to display the adjacency matrix in a readable format.
   - **Output**: Clearly print the adjacency matrix row by row, ensuring rows and columns correspond to vertices.

3. **Task 03: Find the Shortest Path Between Two Vertices**
   - **Objective**: Compute the shortest path between two vertices using the adjacency matrix.
   - **Input**: Starting vertex and destination vertex.
   - **Output**: The shortest path length and the sequence of vertices.

   **Example Input:**
   - Start: 1, Destination: 4

   **Example Output:**
   ```
   Shortest Path: 1 → 2 → 4
   Length: 2
   ```

4. **Task 04: Find All Paths Between Two Vertices**
   - **Objective**: Find all possible paths between two vertices in the graph.
   - **Input**: Starting and destination vertices.
   - **Output**: List all paths and their respective lengths.

   **Example Input:**
   - Start: 1, Destination: 4

   **Example Output:**
   ```
   Paths:
   1 → 2 → 4 (Length: 2)
   1 → 3 → 4 (Length: 2)
   ```

5. **Task 05: Detect Connected Components in an Undirected Graph**
   - **Objective**: Identify all connected components of an undirected graph using adjacency matrices.
   - **Input**: Adjacency matrix of an undirected graph.
   - **Output**: List all connected components (groups of vertices).

   **Example Output:**
   ```
   Connected Components:
   Component 1: {1, 2, 3}
   Component 2: {4, 5}
   ```

6. **Repeat All Above Tasks for a Weighted Graph**
   - Perform the same operations for a weighted graph, where edge weights represent costs or distances between vertices.
   - Use the adjacency matrix to store weights instead of binary values.

---

## Approach

For each task, the following approach was used:

1. **Understand the Problem Statement**: Carefully read the task objectives and constraints.
2. **Plan the Solution**: Identify the appropriate graph operations and algorithms.
3. **Implement the Code**: Write efficient and clean code that adheres to best practices.
4. **Validate with Test Cases**: Test the solutions using provided and edge cases.

---

## Example Outputs

### Task 01: Implement a Graph Using an Adjacency Matrix
**Example Input:**
- Vertices: 4
- Edges: [(1, 2), (2, 3), (3, 4), (4, 1)]

**Example Output:**
```
Adjacency Matrix:
0 1 0 1
1 0 1 0
0 1 0 1
1 0 1 0
```

### Task 03: Find the Shortest Path Between Two Vertices
**Example Input:**
- Start: 1, Destination: 4

**Example Output:**
```
Shortest Path: 1 → 2 → 4
Length: 2
```

### Task 05: Detect Connected Components
**Example Input:**
- Adjacency Matrix:
  ```
  0 1 0 0 0
  1 0 1 0 0
  0 1 0 0 0
  0 0 0 0 1
  0 0 0 1 0
  ```

**Example Output:**
```
Connected Components:
Component 1: {1, 2, 3}
Component 2: {4, 5}
```

---
## Code Snapshots
Snapshots of the code output are provided to verify the correctness and functionality of the implemented solutions.

## Conclusion

This lab provided hands-on experience with graph data structures, including adjacency matrix representation, shortest path calculation, path enumeration, and connected component detection. By extending these tasks to weighted graphs, students developed a deeper understanding of graph algorithms and their applications.

---

## Author

This lab was completed by **Muhammad Irtaza Ali** as part of the course objectives in mastering graph data structures and algorithmic techniques.

