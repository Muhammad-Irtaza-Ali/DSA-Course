
package doublylinkedlist;

public class DoublyLinkedList {
public class node{
int data;
node next;
node prev;
node(int data){
this.data=data;
this.next=null;
this.prev=null;
}
}
private node head;
private node tail;
public DoublyLinkedList(){
this.head=null;
this.tail=null;
}

 public void insertAtStart(int data){
    node newNode = new node(data);
    if(head == null){
    head = tail = newNode;
    }
    else{
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
    }
       
    }
   
    public void insertAtEnd(int data){
    node newNode = new node(data);
    if(head == null){
    head= tail =newNode;
    }
   
    else{
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
    }}
    
    public void insertatposition(int data,int position){
    node newNode = new node(data);
        if(position==1){
    newNode.next=head;
    if(head!=null){
    head.prev=newNode;    
    }
    head=newNode;
    if(tail==null){
    head=tail=newNode;
    }
    return;
    }
    int count=1;
    node temp=head;
    while(temp!=null && count<position){
     count++;
    temp=temp.next;}
    if(temp==null && count!=position){
        System.out.println("Position out of bound");
        return;
    }
    if(temp==null && count==position){
    tail.next=newNode;
    newNode.prev=tail;
    tail=newNode;
    return;
    }
    node prev=temp.prev;
   prev.next=newNode;
   newNode.prev=prev;
   newNode.next=temp;
  }
   
  public void deletehead(){
  if(head==null){
      System.out.println("Nothing to delete List is Empty");
      return;
  }
  if(head.next==null){
  head=tail=null;
  return;
  }
  head=head.next;
  head.prev=null;  
  } 
    
  public void deletetail(){
  if(head==null){
      System.out.println("Nothing to delete List is Empty");
      return;
  }
  if(head==tail){
  head=tail=null;
  return;}
  tail=tail.prev;
   tail.next=null;
  } 
    
    
    
  public void deltebyvalue(int value){
  if(head==null){
      System.out.println("Nothing to delete List is Empty");
      return;
  }
 if(head.data==value){ deletehead();return;} 
 if(tail.data==value){ deletetail();return;} 
node temp=head; 
 while(temp!=null && temp.data!=value){
 temp=temp.next;}
 if(temp==null){System.out.println("value Not found");return;}
 node prev=temp.prev;
 node next=temp.next;
 prev.next=next;
 next.prev=prev;
  
  
  }  
    
   public void search(int value){
   if(head==null){System.out.println("List is empty");return;}
  // if(head.data==value){System.out.println("The value "+value+"found at "+0+" index");;return;} 
   node temp=head;
   int count=0;
   while(temp!=null){
           if (temp.data == value) {
            System.out.println("The value " + value + " found at " + count + " index");
            return;
        }
   temp=temp.next;
   count++;
   }
  System.out.println("value:"+value+" Not found");
   }
    
    
    
    
    
    
    public void reverse(){
     if (head == null) {
        System.out.println("List is empty. Nothing to reverse.");
        return;
    }
     if (head.next == null) {
        return;
    }
    node current = head;
    node prev = null;
    while (current != null) {
        // Swap the current node's next and prev pointers
        prev = current.prev;
        current.prev = current.next;
        current.next = prev;

        // Move to the previous node in the original list
        current = current.prev;
    } 
    //tail=head;
       prev=tail;
       tail=head;
       head=prev;
    
    }
    
    public void oountNodes(){
        int count=0;
    node current = head;
    while(current !=null){
      count++;
        current = current.next;
    }
    System.out.print("\nThe Number of Nodes are:"+count);
    }
   
    
    
    
    
    
    
    
    
    
    
    public void displayFromStart(){
    node current = head;
    while(current !=null){
        System.out.print(current.data + "->");
        current = current.next;
    }
    System.out.print("null\n");
    }
   
    public void displayFromEnd(){
    node current = tail;
    while(current !=null){
        System.out.print(current.data + "->");
        current = current.prev;
    }
        System.out.print("null\n");
   }

    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtStart(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtStart(10);
        list.displayFromStart();
        //list.displayFromEnd();
       // list.insertatposition(7, 2);
        list.search(20);
        list.reverse();
        list.displayFromStart();
         list.oountNodes();
        System.out.println(list.tail.data);
       
    }
    
}
