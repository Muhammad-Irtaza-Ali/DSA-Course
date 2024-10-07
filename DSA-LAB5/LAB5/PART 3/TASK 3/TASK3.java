
package com.mycompany.stack1;
    import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Irtaza Ali
 */
public class TASK3 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
          
        int n = nums1.length, n2 = nums2.length;
        int[] res = new int[n];

        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i : nums2) {
            while(!stack.isEmpty() && stack.peek() < i) {
                map.put(stack.pop(), i);
            } 
            stack.push(i);
        }

        for(int i=0; i<n; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }

        return res;
    }

    public static void main(String[] args) {
        TASK3 nge = new TASK3();

        // Example 1
        int[] nums1_1 = {4, 1, 2};
        int[] nums2_1 = {1, 3, 4, 2};
        int[] result1 = nge.nextGreaterElement(nums1_1, nums2_1);
        for (int res : result1) {
            System.out.print(res + " ");  // Output: -1 3 -1
        }
        System.out.println();

        // Example 2
        int[] nums1_2 = {2, 4};
        int[] nums2_2 = {1, 2, 3, 4};
        int[] result2 = nge.nextGreaterElement(nums1_2, nums2_2);
        for (int res : result2) {
            System.out.print(res + " ");  // Output: 3 -1
        }
    }
}


