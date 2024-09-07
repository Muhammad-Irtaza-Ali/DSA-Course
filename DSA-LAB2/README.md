# DSA-Course

# Lab 2 - LeetCode Tasks

This repository contains solutions to the problems assigned for Lab 2 from LeetCode. The problems cover various topics including array manipulation, string operations, prime number calculations, and set-based operations.

## Problems Covered

### 1. Concatenation of Array:
   - **Problem Link**: [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
   - **Problem Statement**: Given an integer array `nums`, create an array `ans` such that `ans[i] == nums[i]` and `ans[i + n] == nums[i]`, where `n` is the length of `nums`.
   - **Example**:
     - Input: `nums = [1, 2, 1]`
     - Output: `[1, 2, 1, 1, 2, 1]`
   - **Solution Approach**: Using a loop to construct a new array that concatenates two copies of the original array.
   - **File**: `Task1.java`

### 2. **Find Words Containing a Specific Character**
   - **Problem Link**: [Find Words Containing Character](https://leetcode.com/problems/find-words-containing-character/)
   - **Problem Statement**: Given an array of strings and a character, return an array of indices representing the words that contain the character.
   - **Example**:
     - Input: `words = ["leet", "code"]`, `x = 'e'`
     - Output: `[0, 1]`
   - **Solution Approach**: Check each word for the character and store its index if the character is found.
   - **File**: `Task2.java`

### 3. **Maximum Number of Words in Sentences**
   - **Problem Link**: [Maximum Number of Words Found in Sentences](https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/)
   - **Problem Statement**: Given an array of sentences, return the maximum number of words in any single sentence.
   - **Example**:
     - Input: `sentences = ["this is great", "I love coding"]`
     - Output: `3`
   - **Solution Approach**: Split each sentence by spaces and count the number of words.
   - **File**: `Task3.java`

### 4. **Count Pairs with Absolute Difference k**
   - **Problem Link**: [Count Number of Pairs with Absolute Difference K](https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k)
   - **Problem Statement**: Given an array of integers `nums` and an integer `k`, return the number of pairs `(i, j)` such that `|nums[i] - nums[j]| == k`.
   - **Example**:
     - Input: `nums = [1, 2, 2, 1]`, `k = 1`
     - Output: `4`
   - **Solution Approach**: Use a hash map to efficiently count pairs.
   - **File**: `Task4.java`

### 5. **Find Common Elements Between Two Arrays**
   - **Problem Link**: [Find Common Elements Between Two Arrays](https://leetcode.com/problems/find-common-elements-between-two-arrays)
   - **Problem Statement**: Given two integer arrays, count the number of elements in the first array that exist in the second, and vice versa.
   - **Example**:
     - Input: `nums1 = [4, 3, 2]`, `nums2 = [2, 2, 3]`
     - Output: `[3, 2]`
   - **Solution Approach**: Use an array to count occurrences and compare the arrays.
   - **File**: `Task5.java`

### 6. **Count Primes Less Than N**
   - **Problem Link**: [Count Primes](https://leetcode.com/problems/count-primes/)
   - **Problem Statement**: Given an integer `n`, return the number of prime numbers less than `n`.
   - **Example**:
     - Input: `n = 10`
     - Output: `4` (The primes less than 10 are `2, 3, 5, 7`)
   - **Solution Approach**: Implemented using the Sieve of Eratosthenes for optimal prime counting.
   - **File**: `Task6.java`

## How to Run

1. Clone this repository.
   git clone https://github.com/Muhammad-Irtaza-Ali/DSA-Course

2. Compile the Java files using your favorite IDE or from the command line.
  javac FileName.java

Run the main methods to see outputs for provided examples.

## Code Snapshots
Snapshots of the code output are provided to verify the correctness and functionality of the implemented solutions.

## Author
This lab was completed by **Muhammad Irtaza Ali** as part of the course objectives in developing proficiency with array data structures and related algorithmic techniques.


