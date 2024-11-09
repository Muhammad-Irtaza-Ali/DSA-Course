public class TASK2 {
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
        public int getDecimalValue(ListNode head) {
            ListNode temp = head;
            int size = 0;

            // Calculate the size of the linked list
            while (temp != null) {
                size++;
                temp = temp.next;
            }

            int i = size - 1;
            temp = head;
            int ans = 0;

            // Convert the binary linked list to a decimal value
            while (temp != null) {
                if (temp.val == 1) {
                    ans += Math.pow(2, i);
                }
                i--;
                temp = temp.next;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the TASK1 class to access non-static members
        TASK2 task = new TASK2();
        Solution solution = task.new Solution();

        // Create a linked list: 1 -> 0 -> 1
        ListNode head1 = task.new ListNode(1);
        head1.next = task.new ListNode(0);
        head1.next.next = task.new ListNode(1);

        // Calculate the decimal value from the linked list
        int decimalValue1 = solution.getDecimalValue(head1);
        System.out.println("Decimal value of head1: " + decimalValue1); // Output: 5

        // Create another linked list: 0
        ListNode head2 = task.new ListNode(0);

        // Calculate the decimal value from the linked list
        int decimalValue2 = solution.getDecimalValue(head2);
        System.out.println("Decimal value of head2: " + decimalValue2); // Output: 0
    }
}
