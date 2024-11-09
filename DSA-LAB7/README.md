# DSA-Course

# Lab 07: Fundamentals of Queue using Array and Linked List  
 

## Objective

The purpose of this lab is to help students gain an in-depth understanding of the Queue data structure by implementing it using two different approaches in Java:
1. Queue implementation using an array.
2. Queue implementation using a singly linked list.

This lab will reinforce the concepts of Enqueue, Dequeue, and Peek operations in both array-based and linked list-based Queue structures.

## Contents

### Part 01: Queue Implementation Using an Array

In this part, students implement a queue using a fixed-size array to handle basic queue operations. This approach introduces the use of a circular queue to efficiently manage the queue in a limited space.

- **Methods**:
  - **enqueue(int data)**: Adds an element to the rear of the queue.
  - **dequeue()**: Removes and returns the front element of the queue.
  - **peek()**: Returns the front element of the queue without removing it.

- **File**: `QueueInArray.java`

### Part 02: Queue Implementation Using a Linked List

In this part, students implement a queue using a singly linked list, which provides a dynamic alternative to the array-based implementation. This linked list-based approach allows for a queue of arbitrary size, as memory is allocated as nodes are added.

- **Methods**:
  - **enqueue(int data)**: Adds an element to the rear of the queue by creating a new node at the end.
  - **dequeue()**: Removes and returns the front element of the queue by deleting the front node.
  - **peek()**: Returns the front element of the queue without removing it.

- **Example Usage**:
  ```java
  LinkedListQueue queue = new LinkedListQueue();
  queue.enqueue(10);
  queue.enqueue(20);
  System.out.println(queue.peek()); // Output: 10
  queue.dequeue();
  System.out.println(queue.peek()); // Output: 20
  ```

- **File**: `Queuell.java`

## Files

- **ArrayQueue.java**: Contains the `ArrayQueue` class for the array-based implementation of the queue.
- **LinkedListQueue.java**: Contains the `LinkedListQueue` class for the linked list-based implementation of the queue.
- **QueueTest.java**: Test file to demonstrate and validate the operations of both queue implementations.

## How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/yourusername/DSA-Lab-Queue
   ```

2. Compile and run the Java files:

   ```bash
   javac Queuell.java
   java Queuell
   ```

## Key Concepts

1. **Queue Operations**:
   - Enqueue: Adding an element to the rear of the queue.
   - Dequeue: Removing an element from the front of the queue.
   - Peek: Viewing the front element without removal.

2. **Array vs. Linked List Implementation**:
   - Array-based queues are limited by a fixed size but offer quick access to elements.
   - Linked list-based queues are dynamic and can expand or shrink as needed, but involve additional pointer management.

3. **Testing and Validation**:
   - Test both implementations by adding, removing, and peeking elements to ensure the queue behaves as expected.

## Conclusion

This lab provides a fundamental understanding of Queue data structures by implementing both array-based and linked list-based queues. Through these implementations, students can compare the advantages and limitations of each approach.

---

This README is designed to provide clear guidance on the lab's tasks, objectives, and operations for both array-based and linked list-based queue implementations. Let me know if you'd like any additional adjustments!

## Code Snapshots
Snapshots of the code output are provided to verify the correctness and functionality of the implemented solutions.

## Author
This lab was completed by **Muhammad Irtaza Ali** as part of the course objectives in developing proficiency with array data structures and related algorithmic techniques.