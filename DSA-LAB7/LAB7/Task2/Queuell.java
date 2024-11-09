
package com.mycompany.stack1;

public class Queuell {
  
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
        
    }    
}

  private Node front, rear;
    public Queuell() {
        this.front = this.rear = null;
    }

    
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(this.rear==null){
            this.front = this.rear = newNode;
            System.out.println("Enqueued " + data);
            return;
       }
        else{
       rear.next = newNode;
       rear = newNode;
        System.out.println("Enqueued " + data);
        }
    }

      public int dequeue(){
        if(this.front==null){
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
         int value = this.front.data;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
    return value;
    }
    
      
    int peek(){
    return front.data;
    }
   
    public void display() {
        if (this.front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = front;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queuell queue = new Queuell();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();
        //queue.enqueue(40);
        queue.display();
        System.out.println("PEEK:"+queue.peek());  
   
    
    }
}

