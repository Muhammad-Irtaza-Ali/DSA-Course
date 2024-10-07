# DSA-Course

## Lab 06 - Sorting: Bubble Sort
This directory contains solutions to the problems assigned for **Lab 06**. The focus of this lab is on understanding and implementing the Bubble Sort algorithm, including an optimized version with early stopping, and modifying the algorithm to sort strings by length.

## Lab Objectives

- **Objective**: Practice and understand sorting algorithms, specifically Bubble Sort, and implement both standard and optimized versions of the algorithm.
- **Tasks**:
  1. Implement the Bubble Sort algorithm to sort an array of integers.
  2. Implement an optimized version of Bubble Sort that stops early if the array is already sorted.
  3. Modify Bubble Sort to sort a list of strings by their lengths in ascending order.

---

## Part 1: Bubble Sort for Integer Array

### Task1: Bubble Sort Implementation

- **Method**: `bubbleSort(int[] arr)`
  - This method takes an array of integers and sorts it in ascending order using the standard Bubble Sort algorithm.
  
#### Example:
- **Input**: `int[] arr = {5, 1, 3, 4, 6, 2}`
- **Output**: `[1, 2, 3, 4, 5, 6]`

#### Instructions:
- Define an array of integers as input.
- Apply Bubble Sort to sort the array and print the sorted array as output.
  
---

## Task2: Optimized Bubble Sort with Early Stopping

### Optimized Bubble Sort Implementation

- **Method**: `earlyStopBubbleSort(int[] arr)`
  - This method implements an optimized version of Bubble Sort. It stops early if the array is already sorted during any pass through the array.
  
#### Example:
- **Input**: `int[] arr = {5, 1, 3, 4, 6, 2}`
- **Output**: `[1, 2, 3, 4, 5, 6]`

#### Instructions:
- Apply the optimized version of Bubble Sort, and demonstrate its ability to terminate early if the array becomes sorted during any iteration.

---

## Task3: Sorting a List of Strings by Length

### Bubble Sort for Sorting Strings by Length

- **Method**: `bubbleSortStringsByLength(String[] arr)`
  - This method sorts an array of strings based on their lengths in ascending order using the Bubble Sort algorithm.
  
#### Example:
- **Input**: `String[] arr = {"apple", "pie", "banana", "cat"}`
- **Output**: `["pie", "cat", "apple", "banana"]`

#### Instructions:
- Modify the Bubble Sort algorithm to compare the lengths of strings rather than the numeric values of integers.
  
---

## Part 2: LeetCode Problems Related to Sorting

### Task1. **Merge Sorted Array**
   - **Problem Link**: [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/description/?envType=problem-list-v2&envId=sorting)
   - **Problem Statement**: You are given two sorted arrays and are tasked with merging them into a single sorted array.
   - **Example**:
     - **Input**: `nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3`
     - **Output**: `[1, 2, 2, 3, 5, 6]`
   - **File**: `PART2_Task1.java`

### Task2. **Intersection of Two Arrays II**
   - **Problem Link**: [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/description/?envType=problem-list-v2&envId=sorting)
   - **Problem Statement**: Find the intersection of two arrays, including duplicate elements.
   - **Example**:
     - **Input**: `nums1 = [1,2,2,1], nums2 = [2,2]`
     - **Output**: `[2,2]`
   - **File**: `PART2_Task2.java`

### Task3. **Find the Difference**
   - **Problem Link**: [Find the Difference](https://leetcode.com/problems/find-the-difference/description/?envType=problem-list-v2&envId=sorting)
   - **Problem Statement**: You are given two strings, and one string has an extra character. Find the differing character.
   - **Example**:
     - **Input**: `s = "abcd", t = "abcde"`
     - **Output**: `"e"`
   - **File**: `PART2_Task3.java`

---

## How to Run

1. Clone this repository.
   ```bash
   git clone https://github.com/YourRepo/DSA-Course
   ```

2. Compile the Java files using your favorite IDE or from the command line.
   ```bash
   javac BubbleSort.java OptimizedBubbleSort.java SortStringsByLength.java Task1.java Task2.java Task3.java
   ```

3. Run the main methods to see outputs for provided examples.

---

## Code Snapshots

Snapshots of the code output are provided to verify the correctness and functionality of the implemented solutions.

---

## Author

This lab was completed by **Muhammad Irtaza Ali** as part of the course objectives in developing proficiency with sorting algorithms and solving related problems.

