# DSA-Course  

# Lab 10: Tree (LeetCode Challenges Only)  

This repository contains the solutions for Lab 10, focusing on solving tree-based problems from LeetCode. These challenges aim to strengthen the understanding and application of tree data structures in solving real-world problems.  

---

## Objective  

By completing this lab, students will:  

1. Understand the properties and behavior of tree data structures.  
2. Solve algorithmic problems related to binary trees, including symmetry checks, maximum depth calculation, path sum verification, and tree inversion.  
3. Implement solutions that are efficient and adhere to best coding practices.  
4. Enhance problem-solving skills using tree-based approaches.  

---

## Contents  

### Tasks Overview  

1. **Task 01: Symmetric Tree**  
   - **Problem**: [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/description/?envType=problem-list-v2&envId=tree)  
   - **Explanation**: Watch the detailed explanation [here](https://www.youtube.com/watch?v=Mao9uzxwvmc).  

2. **Task 02: Maximum Depth of Binary Tree**  
   - **Problem**: [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=problem-list-v2&envId=tree)  

3. **Task 03: Path Sum**  
   - **Problem**: [Path Sum](https://leetcode.com/problems/path-sum/description/?envType=problem-list-v2&envId=tree)  

4. **Task 04: Invert Binary Tree**  
   - **Problem**: [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/description/?envType=problem-list-v2&envId=tree)  

5. **Task 05: Path Sum II**  
   - **Problem**: [Path Sum II](https://leetcode.com/problems/path-sum-ii/description/?envType=problem-list-v2&envId=binary-tree)  

---

## Approach  

For each task, the following approach was used:  

1. **Understand the Problem Statement**: Carefully read the problem and constraints.  
2. **Plan the Solution**: Identify the required tree traversal method and algorithm (e.g., recursion or iterative approach).  
3. **Implement the Code**: Write clean and optimized code that adheres to LeetCode's problem requirements.  
4. **Test Cases**: Validate the solution with both provided and edge test cases.  

---

## Solutions  

### **Task 01: Symmetric Tree**  
- **Goal**: Check if a binary tree is symmetric around its center.  
- **Approach**:  
  - Use a recursive function to compare the left and right subtrees.  
  - Ensure corresponding nodes in the left and right subtrees are equal.  

### **Task 02: Maximum Depth of Binary Tree**  
- **Goal**: Find the maximum depth (height) of a binary tree.  
- **Approach**:  
  - Use recursion to calculate the depth of left and right subtrees.  
  - Return `1 + max(leftDepth, rightDepth)`.

### **Task 03: Path Sum**  
- **Goal**: Determine if there is a root-to-leaf path with a given sum.  
- **Approach**:  
  - Use depth-first search (DFS).  
  - Subtract the node value from the sum as you traverse, and check for leaf nodes.  

### **Task 04: Invert Binary Tree**  
- **Goal**: Invert a binary tree (mirror the structure).  
- **Approach**:  
  - Swap the left and right children recursively or iteratively.  

### **Task 05: Path Sum II**  
- **Goal**: Find all root-to-leaf paths where the sum equals a target value.  
- **Approach**:  
  - Use DFS to traverse and backtrack, storing paths that match the target sum.  

## Code Snapshots
Snapshots of the code output are provided to verify the correctness and functionality of the implemented solutions.

## Example Outputs  

1. **Task 01 (Symmetric Tree)**  
   - Input: `[1, 2, 2, 3, 4, 4, 3]`  
   - Output: `true`  

2. **Task 02 (Maximum Depth of Binary Tree)**  
   - Input: `[3, 9, 20, null, null, 15, 7]`  
   - Output: `3`  

3. **Task 03 (Path Sum)**  
   - Input: `[5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1], Target Sum: 22`  
   - Output: `true`  

4. **Task 04 (Invert Binary Tree)**  
   - Input: `[4, 2, 7, 1, 3, 6, 9]`  
   - Output: `[4, 7, 2, 9, 6, 3, 1]`  

5. **Task 05 (Path Sum II)**  
   - Input: `[5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1], Target Sum: 22`  
   - Output: `[[5, 4, 11, 2], [5, 8, 4, 5]]`  

---

## Conclusion  

This lab provided practical experience with tree-related problems, reinforcing concepts such as recursion, traversal methods, and path-related calculations. Students gained hands-on practice in solving real-world problems with tree data structures.  

---  

## Author
This lab was completed by **Muhammad Irtaza Ali** as part of the course objectives in developing proficiency with array data structures and related algorithmic techniques.
--- 
