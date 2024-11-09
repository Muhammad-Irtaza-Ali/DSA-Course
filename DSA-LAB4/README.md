
# DSA-Course

# Lab 04: Doubly Linked List Implementation  and leetcode tasks

This repository contains the solution for implementing a doubly linked list, covering essential operations such as insertion, deletion, traversal, search, reversal, and node counting.


# Lab Part 01: Doubly Linked List Implementation  
## Objective

By completing this lab, students will:
1. Understand the structure and functionality of a doubly linked list.
2. Implement various operations including insertion, deletion, traversal, searching, and reversal of nodes.
3. Practice efficient data manipulation within a doubly linked list structure.

## Contents

### 1. **Node Structure Implementation**
   - **Node Class**: Represents each element in the linked list.
     - `int data`: Holds the data for each node.
     - `Node next`: Reference to the next node in the list.
     - `Node prev`: Reference to the previous node in the list.

### 2. **Doubly Linked List Class**
   - **Insertion Operations**
     - **addAtStart(int data)**: Inserts a new node at the beginning of the list.
     - **addAtEnd(int data)**: Inserts a new node at the end of the list.
     - **addAtPosition(int data, int position)**: Inserts a new node at a specified position in the list. If the position is invalid, displays a message.

   - **Deletion Operations**
     - **deleteFromStart()**: Deletes the first node from the list.
     - **deleteFromEnd()**: Deletes the last node from the list.
     - **deleteByValue(int data)**: Deletes the first occurrence of a node with the specified value. Displays a message if the value is not found.

   - **Traversal Operations**
     - **displayFromStart()**: Prints each node’s data from the start of the list.
     - **displayFromEnd()**: Prints each node’s data from the end of the list.

   - **Search Operation**
     - **search(int value)**: Searches for a node with a specific value. Prints the 0-based index if found, otherwise indicates that the value is not found.

   - **Reverse Operation**
     - **reverse()**: Reverses the linked list.

   - **Count Operation**
     - **countNodes()**: Returns the total number of nodes in the list.

### 3. **Testing and Validation**
   - **Main Method Tests**: In the main method, the doubly linked list is tested with various operations to ensure functionality:
     - Insertion at the start, end, and specific positions.
     - Deletion from the start, end, and by specific value.
     - Searching for values within the list.
     - Displaying the list after each operation.
     - Reversing and counting nodes.

## Example

Given the following test cases:

1. **Insertions**  
   Insert elements at the start, end, and at specific positions.

2. **Deletions**  
   Delete nodes from the start, end, and by value.

3. **Search**  
   Search for specific values in the list, printing their positions if found.

4. **Display**  
   Display the list after each operation for verification.

5. **Reversal and Counting**  
   Reverse the list and count the total number of nodes.

## Files

- **DoublyLinkedList.java**: Contains the `DoublyLinkedList` class with all operations defined.

## How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/yourusername/DSA-Lab-DoublyLinkedList
   ```

2. Compile and run the files:

   ```bash
   javac DoublyLinkedList.java
   java DoublyLinkedList
   ```

## Conclusion

Through this lab, students gain hands-on experience with linked list structures and practice implementing core operations for a doubly linked list. This strengthens their understanding of data structures and efficient data manipulation techniques.

---

# Lab Part 02: LeetCode Linked List Tasks  

This repository also includes solutions to three linked list problems from LeetCode, aimed at improving understanding and proficiency with linked list operations.

## Problems Covered

### 1. **Middle of the Linked List**
   - **Problem Link**: [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/description/)
   - **Problem Statement**: Given a singly linked list, find the middle node. If there are two middle nodes, return the second one.
   - **Example**:
     - Input: `1 -> 2 -> 3 -> 4 -> 5`
     - Output: `3`
   - **Solution Approach**: Use the two-pointer technique to find the middle node efficiently.
   - **File**: `Task1_MiddleOfLinkedList.java`

### 2. **Convert Binary Number in a Linked List to Integer**
   - **Problem Link**: [Convert Binary Number in a Linked List to Integer](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/)
   - **Problem Statement**: Given a singly linked list representing a binary number, convert it to an integer.
   - **Example**:
     - Input: `1 -> 0 -> 1`
     - Output: `5`
   - **Solution Approach**: Traverse the list and convert the binary number using bit manipulation.
   - **File**: `Task2_ConvertBinaryToInteger.java`

### 3. **Add Two Numbers**
   - **Problem Link**: [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/description/)
   - **Problem Statement**: Given two non-empty linked lists representing two non-negative integers in reverse order, return their sum as a linked list.
   - **Example**:
     - Input: `(2 -> 4 -> 3) + (5 -> 6 -> 4)`
     - Output: `7 -> 0 -> 8`
   - **Solution Approach**: Use carry addition to sum nodes from each list and handle list length differences.
   - **File**: `Task3_AddTwoNumbers.java`

## Files

- **TASK1.java**: Finds the middle node of a linked list.
- **TASK2.java**: Converts a binary number represented in a linked list to an integer.
- **TASK3.java**: Adds two numbers represented by two linked lists in reverse order.

## How to Run

1. Compile the Java files individually using:

   ```bash
   javac Task1.java
   java Task1
   ```

   Repeat for each task file as required.

## Conclusion

These LeetCode tasks help students improve their problem-solving skills with linked list operations, covering middle node retrieval, binary conversion, and list-based number addition.

---

This README provides a comprehensive overview for the lab and LeetCode tasks, organized to ensure clear understanding and ease of use. Let me know if you need additional customization!

## Code Snapshots
Snapshots of the code output are provided to verify the correctness and functionality of the implemented solutions.

## Author
This lab was completed by **Muhammad Irtaza Ali** as part of the course objectives in developing proficiency with array data structures and related algorithmic techniques.