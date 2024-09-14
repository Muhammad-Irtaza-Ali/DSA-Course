
package linkedlist;

public class Task4 {
    // Definition for singly-linked list node
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val=x;
            next=null;
        }
    }

    // Method to add two numbers represented by linked lists
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummyHead=new ListNode(0); // Dummy node to simplify code
        ListNode current=dummyHead;
        int carry=0;

        // Traverse both lists
        while(l1!=null||l2!=null){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=carry+x+y;
            carry=sum/10; // Calculate new carry
            current.next=new ListNode(sum%10); // Create new node with current digit
            current=current.next;

            // Move to next nodes if available
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }

        // If there's carry left, add a new node
        if(carry>0){
            current.next=new ListNode(carry);
        }

        return dummyHead.next; // Return the result list, skipping dummy node
    }

    // Main method
    public static void main(String[] args){
        Task4 solution=new Task4();

        // Example 1: Input: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        System.out.print("List 1: ");
        displayList(l1);
        System.out.print("List 2: ");
        displayList(l2);

        ListNode result=solution.addTwoNumbers(l1,l2);
        System.out.print("Sum List: ");
        displayList(result);

        // Example 2: Input: l1 = [0], l2 = [0]
        ListNode l3=new ListNode(0);
        ListNode l4=new ListNode(0);

        System.out.print("List 3: ");
        displayList(l3);
        System.out.print("List 4: ");
        displayList(l4);

        ListNode result2=solution.addTwoNumbers(l3,l4);
        System.out.print("Sum List 2: ");
        displayList(result2);

        // Example 3: Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        ListNode l5=new ListNode(9);
        l5.next=new ListNode(9);
        l5.next.next=new ListNode(9);
        l5.next.next.next=new ListNode(9);
        l5.next.next.next.next=new ListNode(9);
        l5.next.next.next.next.next=new ListNode(9);
        l5.next.next.next.next.next.next=new ListNode(9);

        ListNode l6=new ListNode(9);
        l6.next=new ListNode(9);
        l6.next.next=new ListNode(9);
        l6.next.next.next=new ListNode(9);

        System.out.print("List 5: ");
        displayList(l5);
        System.out.print("List 6: ");
        displayList(l6);

        ListNode result3=solution.addTwoNumbers(l5,l6);
        System.out.print("Sum List 3: ");
        displayList(result3);
    }

    // method to display the linked list
    public static void displayList(ListNode head) {
        ListNode current=head;
        while(current!=null) {
            System.out.print(current.val+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
}
