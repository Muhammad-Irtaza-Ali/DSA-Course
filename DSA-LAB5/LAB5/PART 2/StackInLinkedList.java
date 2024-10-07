
package com.mycompany.stack1;
import java.util.*;
//Part 02: Stack Implementation Using a Linked List
public class StackInLinkedList {
    // Node class representing each element in the stack
class Node{
    int data;
    Node next;
public Node(int data){
        this.data = data;
        this.next = null;
    }
}

private Node top;
    public StackInLinkedList(){
        this.top = null;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed "+value);
    }

    // Method to pop an element from the stack
    public int pop(){
        if(isEmpty()){
           throw new EmptyStackException(); // or throw an exception
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    
    // Method to peek at the top element of the stack
    public int peek(){
       if(isEmpty()){
           throw new EmptyStackException(); // or throw an exception
        }
       return top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
        
   
     // Method to calculate the size of the stack
    public int size(){
        int count=0;
        Node temp=top;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
       return count;
    }




// Method to display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
   
   //  Main method to test the stack implementation
    public static void main(String[] args) {
        StackInLinkedList stack = new StackInLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Peek: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.display();
        System.out.println("Size :"+stack.size()); 
    }
}

