
package linkedlist;

public class Linkedlist {
   // Definition for singly-linked list node
    public class node{
    int data;
    node next;
    public node(int data){
    this.data=data;
    this.next=null;   
    }}
    // Creating head to store te address of starting point of List
    private node head;
    Linkedlist(){
    this.head=null;

    }
    
    // Method to insert at Start
    public void insertAtStart(int data){
    node newnode=new node(data);
     newnode.next=head;
    head=newnode;
    }
    
    // Method to insert at End
    public void insertAtEnd(int data) {
        node newNode = new node(data);
        if (head ==null) {
            head =newNode;
        }else{
            node temp=head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }}
     
    // Method to insert at Position
    public void insertAtPosition(int data,int position) {
        int count=0;
        node current =head;
        node newNode=new node(data);
        while(current != null){
                if(count==position){
                node temp =current.next;
                current.next=newNode;
                newNode.next=temp;
                } current = current.next;
                count++;
              }}
    
    
    //Method to delete from start
     public void deleteatstart(){
    head=head.next;
    }
    //Method to delete from End 
    public void deleteAtEnd() {
        if(head == null){
            System.out.println("List is empty. Nothing to delete.");
            return;
        }if(head.next == null){
            head =null;
        }else{
           node temp = head;
            while(temp.next.next != null){
                temp = temp.next; }
           temp.next = null;
        }}

    
     //Method to delete by value
    public void deletebyvalue(int value){
    if(head==null){System.out.println("The list is empty");
    }
    else{
    node current=head;
    while(current.next!=null){
    if (current.next.data==value){
      current.next=current.next.next;
    }
    current=current.next;}}}
    
    
    //Traversal: Method to display list
     public void display(){ 
    node current=head;
    while(current != null){
        System.out.print(current.data+"->");
       current = current.next;
    }
        System.out.print("null\n");
        }
   
     
     
     
     //Method to search value
    public void search(int value){
     boolean mark=false;
        int count=0;
        node current =head;
        while(current != null){
                if(current.data==value){
                   mark=true;
                      break; }else {mark=false;}
                current = current.next;
                count++;
              }
        if(mark==true){System.out.println("Found at position "+count);}
        else{System.out.println("Value Not Found");}
    }
    
    
    //Method to Reverse the list
    public void reverse(){
    if(head==null){System.out.println("The list is Empty");return;}
    else{
    Linkedlist list=new Linkedlist();    
     node current =head;
    while(current!=null){
    list.insertAtStart(current.data);
    current=current.next;
        }
    list.display();
    }}
   
    
    //Method to count size of list
public void size(){
        int count =0;
        node temp=head;
        while(temp != null){
            count++;
            temp = temp.next;}
         System.out.println(count);
   }
    
    
    
    
    public static void main(String[] args) {
Linkedlist list=new Linkedlist();     
      // Insert elements
    System.out.println("Inserting elements at the start:");
    list.insertAtStart(10);
    list.insertAtStart(20);
    list.insertAtStart(30);
    list.insertAtStart(40);
    list.display();
   // Inserting by position
    System.out.println("Inserting 15 at position 2:");
    list.insertAtPosition(15, 2);
    list.display();
 //Inserting at End of list
    System.out.println("Inserting 12 at the end:");
    list.insertAtEnd(12);
    list.display();

    // Delete elements
    System.out.println("Deleting element from start:");
    list.deleteatstart();
    list.display();

    System.out.println("Inserting 40 at the end:");
    list.insertAtEnd(40);
    list.display();

    System.out.println("Deleting element from end:");
    list.deleteAtEnd();
    list.display();

    System.out.println("Size of the list:");
    list.size();

    System.out.println("Inserting 9 at position 1:");
    list.insertAtPosition(9, 1);
    list.display();

    System.out.println("Deleting element with value 20:");
    list.deletebyvalue(20);
    list.display();

    System.out.println("Searching for value 10:");
    list.search(10);

    System.out.println("Reversing the list:");
    list.reverse();

   }
    //Done By Muhammad Irtaza Ali
}
