
package com.mycompany.stack1;

public class QueueInArray {
    static class Queue {
        int arr[]; // Array to store queue elements
        int front; // Index of the front element
        int rear;  // Index of the rear element
        int size;  // Maximum size of the queue

        // Constructor to initialize the queue
        Queue(int size) {
            this.size = size;
            arr = new int[size];
            front = 0;  // Initialize front index
            rear = -1;  // Initialize rear index
        }

        // Method to add an element to the rear of the queue
        public void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue Overflow: Unable to add " + data);
            } else {
                arr[++rear] = data; // Increment rear and add the element
            }
        }

        // Method to remove and return the front element of the queue
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow: No elements to remove");
                return -1; // Return -1 if the queue is empty
            }
            return arr[front++]; // Return the front element and increment front
        }

        // Method to return the front element without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty: No elements to peek");
                return -1; // Return -1 if the queue is empty
            }
            return arr[front]; // Return the front element
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return front > rear; // Queue is empty if front index is greater than rear index
        }

        // Method to display the queue elements
        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5); // Create a queue with a maximum size of 5
        
        // Enqueue elements into the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display(); // Display current queue elements

        // Attempt to enqueue an element into a full queue
        queue.enqueue(60);

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements from the queue
        System.out.println("Removed: " + queue.dequeue());
        queue.display(); // Display current queue elements after dequeue

        System.out.println("Front element after dequeue: " + queue.peek());
    }
}