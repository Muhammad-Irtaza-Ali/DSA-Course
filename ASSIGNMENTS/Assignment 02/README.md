# DSA-Course

# Assignment 02: Binary Search Tree (BST)  

This repository contains the solutions for Assignment 02, focusing on Binary Search Trees (BSTs), including implementation, insertion, node counting, searching,deletion and tree traversals.

---

## Objective  

By completing this lab, students will:  

1. Understand the concept and properties of Binary Search Trees (BSTs).  
2. Implement a BST data structure using linked lists or arrays.  
3. Insert and delete elements, while maintaining its properties.  
4. Calculate the total number of nodes in the BST.  
5. Search for specific elements within the BST.  
6. Implement and perform various tree traversals (In-order, Pre-order, Post-order, and Level-order).  

---

## Contents  

### 1. **Binary Search Tree Implementation**  

#### **Node Class**  
- **Attributes**:  
  - `int value`: The value of the node.  
  - `Node left`: Pointer to the left child.  
  - `Node right`: Pointer to the right child.  

#### **BinarySearchTree Class**  
- **Attributes**:  
  - `Node root`: The root node of the tree.  
- **Methods**:  
  - `void insert(int value)`: Inserts an element into the BST while maintaining its properties (values smaller than the current node go to the left, larger values go to the right).  
  - `void delete(int value)`: delete elements.  
  - `int countNodes()`: Calculates and returns the total number of nodes in the tree.  
  - `boolean search(int value)`: Searches for a given value in the BST and returns whether it exists.  

### 2. **Tree Traversals Implemented**  
1. **In-order Traversal**: Left → Root → Right (outputs elements in sorted order).  
2. **Pre-order Traversal**: Root → Left → Right.  
3. **Post-order Traversal**: Left → Right → Root.  
4. **Level-order Traversal**: Traverse nodes level by level using a queue.  

---

## Testing the Binary Search Tree  

### **Insertion Test**  
- **Goal**: Insert at least 7–10 elements into the BST (e.g., `50, 30, 20, 40, 70, 60, 80`).  
- **Process**: After each insertion, output the total number of nodes in the BST using `countNodes()`.  

### **Search Test**  
- **Goal**: Search for specific values (e.g., `20, 60, 90`) in the BST.  
- **Output**: Indicate whether each value exists in the tree.  

### **Traversal Tests**  
- **Goal**: Perform all four traversal methods after inserting the elements.  
- **Output**: Display the results of:  
  - **In-order Traversal** (should output elements in sorted order).  
  - **Pre-order Traversal**.  
  - **Post-order Traversal**.  
  - **Level-order Traversal**.  

---

## Files  

1. **TreeNode.java**: Contains the `Node` class definition for creating tree nodes, including attributes and methods.  
2. **BinarySearchTree.java**: Main implementation of the BST class, including insertion, searching, node counting, and traversal methods. Testing file that demonstrates the functionality of the BST by inserting nodes, counting nodes, performing searches, and displaying traversal outputs.  

---

## How to Run  

1. Clone this repository:  

   ```bash  
   git clone https://github.com/yourusername/DSA-Lab09-BinarySearchTree  
   ```  

2. Compile and run the files:  

   ```bash  
   javac BinarySearchTree.java  
   java BinarySearchTree  
   ```  

---

## Example  

### **Given Elements**:  
`50, 30, 20, 40, 70, 60, 80`  

1. **Total Nodes Count**  
   After each insertion, the program outputs the total nodes in the tree.  

2. **Search Results**  
   Example searches for `20, 60, 90`:
   - `20`: Found  
   - `60`: Found  
   - `90`: Not Found  

3. **Traversal Output**  
   - **In-order**: `20, 30, 40, 50, 60, 70, 80`  
   - **Pre-order**: `50, 30, 20, 40, 70, 60, 80`  
   - **Post-order**: `20, 40, 30, 60, 80, 70, 50`  
   - **Level-order**: `50, 30, 70, 20, 40, 60, 80`  

---


## Code Snapshots
Snapshots of the code output are provided to verify the correctness and functionality of the implemented solutions.

## Conclusion  

This Assignment 02 reinforces the foundational concepts of Binary Search Trees. By implementing and testing insertions,deletions, searches, node counting, and various tree traversals, students gain practical experience with BST operations, helping them understand their real-world applications in problem-solving.  

---


## Author
This Assignment 02 was completed by **Muhammad Irtaza Ali** as part of the course objectives in developing proficiency with array data structures and related algorithmic techniques.