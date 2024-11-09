public class TASK1{
    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode middleNode(ListNode head) {
            if (size(head) < 2) {
                return head;
            }
            int n = size(head) / 2;
            int count = 0;
            ListNode middle = head;

            while (middle != null) {
                if (count == n) {
                    return middle;
                }
                middle = middle.next;
                count++;
            }
            return middle; // This return won't be reached, but it's here for completeness.
        }

        public int size(ListNode head) {
            int count = 0;
            ListNode current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the TASK1 class to access non-static members
        TASK1 task = new TASK1();
        Solution solution = task.new Solution();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head1 = task.new ListNode(1);
        head1.next = task.new ListNode(2);
        head1.next.next = task.new ListNode(3);
        head1.next.next.next = task.new ListNode(4);
        head1.next.next.next.next = task.new ListNode(5);

        ListNode middle1 = solution.middleNode(head1);
        System.out.print("Middle Node of List 1: ");
        printList(middle1); // Output: 3 -> 4 -> 5

        // Create another linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head2 = task.new ListNode(1);
        head2.next = task.new ListNode(2);
        head2.next.next = task.new ListNode(3);
        head2.next.next.next = task.new ListNode(4);
        head2.next.next.next.next = task.new ListNode(5);
        head2.next.next.next.next.next = task.new ListNode(6);

        ListNode middle2 = solution.middleNode(head2);
        System.out.print("Middle Node of List 2: ");
        printList(middle2); // Output: 4 -> 5 -> 6
    }

    // Helper method to print the linked list starting from a given node
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
