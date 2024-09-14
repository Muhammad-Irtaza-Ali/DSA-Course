
package linkedlist;


public class Task1 {
    // Definition for singly-linked list node
      public class node{
    int data;
    node next;
    public node(int data){
    this.data=data;
    this.next=null;   
    }}
    private node head;
    Task1(){
    this.head=null;

    }
    //Function to insert values
    public void insertAtStart(int data){
    node newnode=new node(data);
     newnode.next=head;
    head=newnode;
    }
    
    // Function to display List
       public void display(){ 
    node current=head;
    while(current != null){
        System.out.print(current.data+"->");
       current = current.next;
    }
        System.out.print("null\n");
        }
    // Funtion to get intersection   
    public class Solution {
    public node getIntersectionNode(node headA,node headB) {
        node a=headA;
        node b=headB;
        while(a!=b){
     if(headA==null || headB==null){
        return null;
     }
   a = (a==null)?headB:a.next;
   b = (b==null)?headA:b.next;
        }
        return a;
    }
}   
     public static void main(String[] args) {
// Creating two linked lists that intersect at node 8
        // List A: 4 -> 1 -> 8 -> 4 -> 5
        // List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
  Task1 listA = new Task1();     
        listA.insertAtStart(5);
        listA.insertAtStart(4);
        node intersectionNode = listA.new node(8);  // Shared intersection node
        listA.head.next.next = intersectionNode;    // Linking intersection node to list A
        intersectionNode.next = new Task1().new node(4);  // Adding more nodes after intersection
        intersectionNode.next.next = new Task1().new node(5);

        Task1 listB = new Task1();     
        listB.insertAtStart(5);
        listB.insertAtStart(6);
        listB.insertAtStart(1);
        listB.head.next.next.next = intersectionNode;  // Linking list B to the intersection node
        
        // Display both lists
        System.out.print("List A: ");
        listA.display();
        System.out.print("List B: ");
        listB.display();
        
        // Call getIntersectionNode to find the intersection point
        Task1.Solution solution = listA.new Solution();
        node intersection = solution.getIntersectionNode(listA.head, listB.head);
        if (intersection != null) {
            System.out.println("Intersected at node with value: " + intersection.data);
        } else {
            System.out.println("No intersection");
        }
     
     }  
    }
