
package com.mycompany.stack1;
import java.util.*;

 // Task 01: Implement a stack using an array with the following methods:      
public class StackInArray{
    private int[] stack;
    private int top;
    private int capacity;
// Constructor to initialize the stack with a given capacity
    public StackInArray(int capacity){
        if(capacity<=0){
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        this.capacity = capacity;
        stack =new int[capacity];
        top =-1;
    }
  // Method to push an element onto the stack
    public void push(int value){
        if(isFull()){
           throw new IllegalStateException("Stack is full");
        }
        stack[++top]=value;
        System.out.println("Pushed "+value);
    }

    // Method to pop an element from the stack
    public int pop(){
        if(isEmpty()){
       throw new EmptyStackException(); // or throw an exception
        }
     return stack[top--];}

    // Method to peek at the top element of the stack
   
    public int peek() {
        if(isEmpty()){
           throw new EmptyStackException(); // or throw an exception
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty(){
        return top==-1;
    }

    // return the size of stack
    public int size(){
    return top+1;
   }
    
     // Method to check if the stack is full
    public boolean isFull(){
        return top==capacity - 1;
    }

    // Method to display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        StackInArray stack = new StackInArray(5);
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(20);
        stack.display();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.display();
        System.out.println("Size :"+ stack.size());
        stack.display();
    }
}

