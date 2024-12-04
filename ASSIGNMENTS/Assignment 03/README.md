# DSA-Course  

# Assignment 03: AVL Tree Operations  

This repository contains the solutions for Assignment 03, focusing on AVL Tree operations. The assignment includes implementation, insertion, deletion with rebalancing, and searching for a specific key in the tree, ensuring the AVL property is maintained.

---

## Objective  

By completing this lab, students will:  

1. Understand the concept and properties of AVL Trees.  
2. Implement an AVL Tree data structure.  
3. Insert elements into the AVL Tree and ensure it remains balanced using rotations.  
4. Delete elements from the AVL Tree and perform necessary rebalancing.  
5. Search for specific elements within the AVL Tree.  

---

## Contents  

### 1. **AVL Tree Implementation**  

#### **Node Class**  
- **Attributes**:  
  - `int key`: The key of the node.  
  - `int height`: The height of the node.  
  - `Node left`: Pointer to the left child.  
  - `Node right`: Pointer to the right child.  

#### **AVLTree Class**  
- **Attributes**:  
  - `Node root`: The root node of the tree.  
- **Methods**:  
  - `void insert(int key)`: Inserts an element into the AVL Tree while maintaining its balanced property by performing rotations if needed.  
  - `void delete(int key)`: Deletes an element from the AVL Tree and rebalances the tree if required.  
  - `boolean search(int key)`: Searches for a given key in the AVL Tree and returns whether it exists.  
  - `int getHeight(Node node)`: Returns the height of a given node.  
  - `int getBalance(Node node)`: Calculates and returns the balance factor of a node.  
  - `Node leftRotate(Node node)`: Performs a left rotation on the subtree rooted at the given node.  
  - `Node rightRotate(Node node)`: Performs a right rotation on the subtree rooted at the given node.  

---

## Testing the AVL Tree  

### **Insertion Test**  
- **Goal**: Insert at least 7–10 elements into the AVL Tree (e.g., `10, 20, 30, 40, 50, 25`).  
- **Process**: After each insertion, verify that the AVL property is maintained by outputting the tree structure or performing traversals.  

### **Search Test**  
- **Goal**: Search for specific values (e.g., `30, 50, 70`) in the AVL Tree.  
- **Output**: Indicate whether each value exists in the tree.  

### **Deletion Test**  
- **Goal**: Delete elements from the AVL Tree (e.g., `40, 10`) and ensure the tree remains balanced.  
- **Output**: After each deletion, verify the AVL property by outputting the tree structure or performing traversals.  

---

## Files  

1. **AVLNode.java**: Contains the `Node` class definition for creating AVL Tree nodes, including attributes and methods.Main implementation of the AVL Tree class, including insertion, deletion, and searching operations with rotations to maintain balance.Testing file that demonstrates the functionality of the AVL Tree by inserting nodes, deleting nodes, searching for keys, and validating balance after each operation.  

---

## How to Run  

1. Clone this repository:  

   ```bash  
   git clone https://github.com/yourusername/DSA-Lab10-AVLTree  
   ```  

2. Compile and run the files:  

   ```bash  
   javac AVLTree.java   
   java AVLTree  
   ```  

---

## Example  

### **Given Elements**:  
`10, 20, 30, 40, 50, 25`  

1. **Search Results**  
   Example searches for `30, 50, 70`:  
   - `30`: Found  
   - `50`: Found  
   - `70`: Not Found  

2. **Insertion & Rotations**  
   - Insert `40`: A rotation occurs to maintain the balance property.  
   - Insert `25`: Another rotation occurs.  

3. **Deletion**  
   - Delete `40`: The tree rebalances after removal.  

---

## Code Snapshots  

Snapshots of the code outputs are provided to verify the correctness and functionality of the implemented solutions.

---

## Conclusion  

This Assignment 03 highlights the importance of maintaining balance in search trees. By implementing and testing AVL Tree operations such as insertions, deletions, and searches with necessary rotations, students gain practical experience with self-balancing trees, essential for efficient real-world data organization and retrieval.  

---

## Author  

This Assignment 03 was completed by **Muhammad Irtaza Ali** as part of the course objectives in developing proficiency with self-balancing tree data structures and related algorithmic techniques.