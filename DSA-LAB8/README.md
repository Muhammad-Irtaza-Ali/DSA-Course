# DSA-Course

# Lab 08: Tree and Binary Tree  
  
This repository contains the solutions for Lab 08, which focuses on binary trees, including implementing a binary tree structure, inserting nodes, counting nodes, and performing tree traversals. 

## Objective

By completing this lab, students will:

1. Understand the concept and structure of binary trees.
2. Implement a binary tree data structure using linked lists or arrays.
3. Practice inserting elements into the binary tree.
4. Calculate the total number of nodes within the tree.
5. Implement and perform various tree traversals, including Level-order, Pre-order, In-order, and Post-order.

## Contents

### 1. **Binary Tree Implementation**  
   - **Node Class**: Represents a tree node with:
     - `int value`: The node's value.
     - `Node left`: A pointer to the left child.
     - `Node right`: A pointer to the right child.
   - **BinaryTree Class**: Contains:
     - A root node.
     - Methods for inserting nodes into the binary tree.
     - A method to count the total nodes in the tree.

### 2. **Tree Traversals Implemented**
   - **Level-order Traversal**: Traverse nodes level by level.
   - **Pre-order Traversal**: Visit the root node, then left subtree, followed by the right subtree.
   - **In-order Traversal**: Visit the left subtree, root node, and then the right subtree.
   - **Post-order Traversal**: Visit the left and right subtrees first, and then the root node.

## Testing the Binary Tree

### Insertion Test
- **Goal**: Insert 7–10 elements into the binary tree (e.g., `50, 30, 20, 40, 70, 60, 80`).
- **Process**: After inserting each element, the program outputs the current total number of nodes in the tree.

### Traversal Tests
- **Goal**: Perform and display the results of the four traversal methods (Level-order, Pre-order, In-order, Post-order) after inserting elements.

## Example

Given the following elements to insert: `50, 30, 20, 40, 70, 60, 80`

1. **Total Nodes Count**  
   After each insertion, the program outputs the total nodes in the tree.

2. **Traversal Output**  
   After all elements are inserted, the program displays the output for each traversal method.

## Files

- **TreeNode.java**: Contains the `Node` class definition for creating tree nodes,which includes insertion, node counting, and traversal methods.
- **BinaryTree1.java**: Main test file that demonstrates the insertion of nodes, node count, and various traversal results. 


## How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/yourusername/DSA-Lab08-BinaryTree
   ```

2. Compile and run the files:

   ```bash
   javac BinaryTree1.java
   java BinaryTree1
   ```


## Code Snapshots
Snapshots of the code output are provided to verify the correctness and functionality of the implemented solutions.

## Conclusion

Through this lab, students practice the essential concepts related to binary trees. By implementing a binary tree structure, performing insertions, counting nodes, and completing different types of traversals, students develop a solid understanding of binary tree operations and traversal algorithms.

---

This README provides an organized structure for students to understand the lab objectives, tasks, files, and execution steps. Let me know if you need further customization!


## Author
This lab was completed by **Muhammad Irtaza Ali** as part of the course objectives in developing proficiency with array data structures and related algorithmic techniques.