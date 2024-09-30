/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack1;

import java.util.Stack;

/**
 *
 * @author Irtaza Ali
 */
public class TASK2 {
   static class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // A single node or empty list is a palindrome
        }
   Stack<Integer> stack = new Stack();
        ListNode curr = head;
        while(curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr != null && curr.val == stack.pop()) {
            curr = curr.next;
        }
        return curr == null; 
    }

    // Helper function to reverse a linked list
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {
        TASK2 pll = new TASK2();

        // Example 1
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        System.out.println(pll.isPalindrome(head1));  // true

        // Example 2
        ListNode head2 = new ListNode(1, new ListNode(2));
        System.out.println(pll.isPalindrome(head2));  // false
    }
}

