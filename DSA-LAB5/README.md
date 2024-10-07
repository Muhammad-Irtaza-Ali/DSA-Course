# DSA-Course

## Lab 05 - Fundamentals of Stack using Array and LinkedList
This directory contains solutions to the problems assigned for Lab 05. The focus of this lab is on understanding the stack data structure by implementing it using both arrays and linked lists, as well as solving related problems on LeetCode.

## Lab Objectives

- **Objective**: Practice and understand the basic operations of the stack data structure using both arrays and linked lists.
- **Tasks**: Implement a stack using an array and a linked list, and solve related problems on LeetCode.

## Part 1: Stack Implementation Using an Array

### Stack Implementation Using Array

- **Array-based Stack Class**: Contains methods for stack operations.
  
  - **Stack Operations**:
    - `push(int data)`: Adds an element to the top of the stack.
    - `pop()`: Removes and returns the top element from the stack.
    - `peek()`: Returns the top element without removing it.
    - `isEmpty()`: Checks if the stack is empty.
    - `size()`: Returns the number of elements in the stack.

#### Instructions:
- Define a fixed capacity for your array (for example, 5).
- Handle edge cases such as stack overflow (when the array is full) and stack underflow (when trying to pop from an empty stack).
- Write a `main` method to test all the stack operations by pushing and popping elements, and printing the stack after each operation.

---

## Part 2: Stack Implementation Using a Linked List

### Stack Implementation Using Linked List

- **Linked List-based Stack Class**: Contains methods for stack operations.

  - **Stack Operations**:
    - `push(int data)`: Adds an element to the top of the stack.
    - `pop()`: Removes and returns the top element from the stack.
    - `peek()`: Returns the top element without removing it.
    - `isEmpty()`: Checks if the stack is empty.
    - `size()`: Returns the number of elements in the stack.

#### Instructions:
- Use a singly linked list where each node contains an integer data field and a pointer to the next node.
- Handle edge cases such as trying to pop from an empty stack.
- Write a `main` method to test all the stack operations by pushing and popping elements, and printing the stack after each operation.

---

## Part 3: LeetCode Problems

### 1. **Valid Parentheses**
   - **Problem Link**: [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/?envType=problem-list-v2&envId=stack)
   - **Problem Statement**: Check if the input string containing only parentheses is valid by ensuring all opening brackets have a corresponding closing bracket in the correct order.
   - **Example**:
     - **Input**: `()[]{}` 
     - **Output**: `true`
   - **Solution Approach**: Use a stack to ensure every opening bracket has a corresponding closing bracket in the correct order.
   - **File**: `Task1.java`

### 2. **Palindrome Linked List**
   - **Problem Link**: [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/description/?envType=problem-list-v2&envId=stack)
   - **Problem Statement**: Check whether a singly linked list is a palindrome.
   - **Example**:
     - **Input**: `1 -> 2 -> 2 -> 1`
     - **Output**: `true`
   - **Solution Approach**: Use a stack to store the first half of the linked list, then compare it with the second half.
   - **File**: `Task2.java`

### 3. **Next Greater Element I**
   - **Problem Link**: [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/description/?envType=problem-list-v2&envId=stack)
   - **Problem Statement**: Find the next greater element for each element in an array.
   - **Example**:
     - **Input**: `nums1 = [4,1,2], nums2 = [1,3,4,2]`
     - **Output**: `[-1,3,-1]`
   - **Solution Approach**: Use a stack to keep track of elements for which the next greater element hasn't been found yet.
   - **File**: `Task3.java`

### 4. **Final Prices with a Special Discount in a Shop**
   - **Problem Link**: [Final Prices with a Special Discount in a Shop](https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/?envType=problem-list-v2&envId=stack)
   - **Problem Statement**: Given the price list of items, find the final price after applying a special discount on the right side.
   - **Example**:
     - **Input**: `[8, 4, 6, 2, 3]`
     - **Output**: `[4, 2, 4, 2, 3]`
   - **Solution Approach**: Use a stack to keep track of elements and apply the discount as soon as a smaller or equal price is found to the right.
   - **File**: `Task4.java`


## How to Run

1. Clone this repository.
   ```bash
   git clone https://github.com/YourRepo/DSA-Course
   ```

2. Compile the Java files using your favorite IDE or from the command line.
   ```bash
   javac StackArray.java StackLinkedList.java Task1.java Task2.java Task3.java Task4.java
   ```

3. Run the main methods to see outputs for provided examples.


## Code Snapshots

Snapshots of the code output are provided to verify the correctness and functionality of the implemented solutions.


## Author

This lab was completed by **Muhammad Irtaza Ali** as part of the course objectives in developing proficiency with stack data structures and related algorithmic techniques.
