
package linkedlist;

public class Task3 {
    // Definition for singly-linked list node
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }}
    // Method to merge two sorted linked lists
    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
        // Create a dummy node to help with merging
        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;
   // Traverse both lists
        while(list1!=null&&list2!=null){
            if (list1.val<=list2.val){
                tail.next=list1;
                list1=list1.next;
            } else{
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }

        // If there are remaining nodes in either list, append them
        if(list1!=null){
            tail.next=list1;
        } else{
            tail.next=list2;
        }

        return dummy.next; // Return the merged list, skipping the dummy node
    }

    // Main method
    public static void main(String[] args){
        Task3 solution=new Task3();

        // Example 1: Input: list1 = [1,2,4], list2 = [1,3,4]
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(4);

        ListNode list2=new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);

        System.out.print("List 1: ");
        displayList(list1);
        System.out.print("List 2: ");
        displayList(list2);

        ListNode mergedList=solution.mergeTwoLists(list1,list2);
        System.out.print("Merged List: ");
        displayList(mergedList);

        // Example 2: Input: list1 = [], list2 = []
        ListNode emptyList1=null;
        ListNode emptyList2=null;

        System.out.print("Empty List 1: ");
        displayList(emptyList1);
        System.out.print("Empty List 2: ");
        displayList(emptyList2);

        ListNode mergedEmptyList=solution.mergeTwoLists(emptyList1,emptyList2);
        System.out.print("Merged Empty List: ");
        displayList(mergedEmptyList);

        // Example 3: Input: list1 = [], list2 = [0]
        ListNode list3=null;
        ListNode list4=new ListNode(0);

        System.out.print("List 3: ");
        displayList(list3);
        System.out.print("List 4: ");
        displayList(list4);

        ListNode mergedList3=solution.mergeTwoLists(list3,list4);
        System.out.print("Merged List 3: ");
        displayList(mergedList3);
    }

    //method to display the linked list
    public static void displayList(ListNode head) {
        ListNode current=head;
        while (current!=null) {
            System.out.print(current.val+" -> ");
            current=current.next;
        }
        System.out.println("null");
    }
}
