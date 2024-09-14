
package linkedlist;

public class Task2 {
 
    // Definition for singly-linked list node
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }}

    // Method to delete duplicates from sorted linked list
    public ListNode deleteDuplicates(ListNode head){
        if(head==null){
            return null; // If the list is empty
        }
        ListNode current=head;
        // Traverse the list
        while (current!=null && current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next; // Skip the next node
            } else{
                current=current.next; // Move to the next node
            }
        }
        return head;
    }

    // Main method
    public static void main(String[] args){
        Task2 solution=new Task2();

        // Example 1: Input: head = [1,1,2]
        ListNode head1=new ListNode(1);
        head1.next=new ListNode(1);
        head1.next.next=new ListNode(2);
        
        System.out.print("Original List 1: ");
        displayList(head1);
        ListNode result1=solution.deleteDuplicates(head1);
        System.out.print("After removing duplicates: ");
        displayList(result1);

        // Example 2: Input: head = [1,1,2,3,3]
        ListNode head2=new ListNode(1);
        head2.next=new ListNode(1);
        head2.next.next=new ListNode(2);
        head2.next.next.next=new ListNode(3);
        head2.next.next.next.next=new ListNode(3);
        
        System.out.print("Original List 2: ");
        displayList(head2);
        ListNode result2=solution.deleteDuplicates(head2);
        System.out.print("After removing duplicates: ");
        displayList(result2);
    }
    
    // Utility method to display the linked list
    public static void displayList(ListNode head){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.val+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
}
  

