public class TASK3 {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);  
            ListNode current = dummyHead;
            int carry = 0;

            // Traverse both lists
            while (l1 != null || l2 != null) {
                int x = (l1 != null) ? l1.val : 0;
                int y = (l2 != null) ? l2.val : 0;
                int sum = carry + x + y;
                carry = sum / 10; 
                current.next = new ListNode(sum % 10); 
                current = current.next;

                // Move to the next nodes
                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }

            // If there's a carry left, create a new node
            if (carry > 0) {
                current.next = new ListNode(carry);
            }

            return dummyHead.next;    
        }
    }

    public static void main(String[] args) {
        TASK3 task = new TASK3();
        Solution solution = task.new Solution();

        // Create first linked list: l1 = [2, 4, 3] (represents 342)
        ListNode l1 = task.new ListNode(2);
        l1.next = task.new ListNode(4);
        l1.next.next = task.new ListNode(3);

        // Create second linked list: l2 = [5, 6, 4] (represents 465)
        ListNode l2 = task.new ListNode(5);
        l2.next = task.new ListNode(6);
        l2.next.next = task.new ListNode(4);

        // Add the two numbers
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        // Print the result linked list
        System.out.print("Result: ");
        printList(result); // Expected output: [7, 0, 8]
    }

    // Helper method to print the linked list starting from a given node
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}
