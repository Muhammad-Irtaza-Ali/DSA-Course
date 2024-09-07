/* LinkedList.java that iclude the following operation of linked list
1. InsertAtStart
2. DeleteAtStart
3.Display
4. DeleteAtEnd
5. insertAtEnd
6. Size of Linked List

*/
public class Linkedlist {

    private int data;
    public class node{
    int data;
    node next;
    public node(int data){
    this.data=data;
    this.next=null;   
    }}
    private node head;
    Linkedlist(){
    this.head=null;
    }
   
   
    public void insertAtStart(int data){
    node newnode=new node(data);
     newnode.next=head;
    head=newnode;
    }
    
    
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

    
    public void display(int data){
    node current=head;
    while(current != null){
        System.out.print(current.data+"->");
       current = current.next;
    }
        System.out.print("null\n");
        }
    
    
    public void deleteatstart(){
    head=head.next;
    }
     
     
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
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        list.insertAtStart(40);
        list.display(list.data);
        list.deleteatstart();
        list.display(list.data);
        list.insertAtEnd(40);
        list.display(list.data);
        list.deleteAtEnd();
        list.display(list.data);
        list.size();  }
    //Done By Muhammad Irtaza Ali
}
