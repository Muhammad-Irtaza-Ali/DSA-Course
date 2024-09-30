# DSA-Course

# Lab 3 - Linked List Operations

This directory contains solutions to the problems assigned for Lab 3. The focus of this lab is on singly linked lists, including operations such as insertion, deletion, searching, and more.

## Lab Objectives

- **Objective**: Practice and understand basic operations in a singly linked list.
- **Tasks**: Implement a singly linked list with various operations and solve related problems on LeetCode.

## Part 1: Linked List Implementation

### Node Structure Implementation
- **Node Class**: Represents each element in the linked list.
  - Contains:
    - `int data`: The value of the node.
    - `Node next`: Reference to the next node in the list.

### Linked List Operations
- **LinkedList Class**: Contains methods for various operations.
  
  - **Insertion Operations**:
    - `addAtStart(int data)`: Inserts a new node at the start of the linked list.
    - `addAtEnd(int data)`: Inserts a new node at the end of the linked list.
    - `addAtPosition(int data, int position)`: Inserts a new node at a specific position. Prints an error message if the position is invalid.
  
  - **Deletion Operations**:
    - `deleteFromStart()`: Deletes the first node of the linked list.
    - `deleteFromEnd()`: Deletes the last node of the linked list.
    - `deleteByValue(int data)`: Deletes the first occurrence of a node with the given value. Prints an error message if the value is not found.
  
  - **Traversal Operations**:
    - `display()`: Traverses the linked list and prints each node’s data.
  
  - **Search Operation**:
    - `search(int value)`: Searches for a node with the given value and prints its position (0-based index). Prints "Value not found" if the value is not present.
  
  - **Reverse Operation**:
    - `reverse()`: Reverses the linked list.
  
  - **Count Nodes**:
    - `countNodes()`: Returns the total number of nodes in the linked list.

### File
- **LinkedList.java**: Contains the implementation of the singly linked list and all the methods mentioned.

## Part 2: LeetCode Problems

### 1. **Intersection of Two Linked Lists**
   - **Problem Link**: [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/description/?envType=problemlist-v2&envId=linked-list)
   - **Problem Statement**: Find the node where two linked lists intersect. If no intersection exists, return null.
   - **Example**:
     - **Input**: `List1: 4 -> 1 -> 8 -> 4 -> 5`, `List2: 5 -> 6 -> 1 -> 8 -> 4 -> 5`
     - **Output**: `8` (The node where the two lists intersect)
   - **Solution Approach**: Use two pointers, starting at the heads of both lists. Traverse the lists and switch to the other list's head when reaching the end. The intersection node will be found when both pointers meet.
   - **File**: `Task1.java`

### 2. **Remove Duplicates from Sorted List**
   - **Problem Link**: [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sortedlist/description/?envType=problem-list-v2&envId=linked-list)
   - **Problem Statement**: Remove duplicate elements from a sorted linked list.
   - **Example**:
     - **Input**: `1 -> 1 -> 2 -> 3 -> 3`
     - **Output**: `1 -> 2 -> 3`
   - **Solution Approach**: Traverse the linked list, comparing each node with the next node. Skip nodes with duplicate values by adjusting the next pointers.
   - **File**: `Task2.java`

### 3. **Merge Two Sorted Lists**
   - **Problem Link**: [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=problem-listv2&envId=linked-list)
   - **Problem Statement**: Merge two sorted linked lists into a single sorted list.
   - **Example**:
     - **Input**: `List1: 1 -> 2 -> 4`, `List2: 1 -> 3 -> 4`
     - **Output**: `1 -> 1 -> 2 -> 3 -> 4 -> 4`
   - **Solution Approach**: Use a dummy node to build the merged list. Compare the nodes of both lists and attach the smaller node to the merged list. Continue until one of the lists is exhausted.
   - **File**: `Task3.java`

### 4. **Add Two Numbers**
   - **Problem Link**: [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/description/?envType=problem-listv2&envId=linked-list)
   - **Problem Statement**: Add two numbers represented by linked lists and return the sum as a linked list.
   - **Example**:
     - **Input**: `List1: 2 -> 4 -> 3`, `List2: 5 -> 6 -> 4`
     - **Output**: `7 -> 0 -> 8` (represents 807, the sum of 342 and 465)
   - **Solution Approach**: Traverse both lists, adding corresponding digits along with any carry from the previous step. Create a new node for each digit of the result and handle cases where lists have different lengths.
   - **File**: `Task4.java`

## How to Run

1. Clone this repository.
   ```bash
   git clone https://github.com/Muhammad-Irtaza-Ali/DSA-Course
   ```

2. Compile the Java files using your favorite IDE or from the command line.
   ```bash
   javac LinkedList.java IntersectionOfTwoLinkedLists.java RemoveDuplicatesFromSortedList.java MergeTwoSortedLists.java AddTwoNumbers.java
   ```

3. Run the main methods to see outputs for provided examples.

## Code Snapshots

Snapshots of the code output are provided to verify the correctness and functionality of the implemented solutions.

## Author

This lab was completed by **Muhammad Irtaza Ali** as part of the course objectives in developing proficiency with linked lists and related algorithmic techniques.
