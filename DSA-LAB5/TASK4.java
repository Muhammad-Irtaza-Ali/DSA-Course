
package com.mycompany.stack1;
  import java.util.Stack;

/**
 *
 * @author Irtaza Ali
 */
public class TASK4 {
  
    public int[] finalPrices(int[] prices) {
        // Result array to store the final prices after discounts
        int[] result = new int[prices.length];
        
        // Stack to store indices of the prices array
        Stack<Integer> stack = new Stack<>();
        
        // Iterate through the prices array
        for (int i = 0; i < prices.length; i++) {
            // Check if the current price can provide a discount to the previous items
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int idx = stack.pop();
                result[idx] = prices[idx] - prices[i]; // Apply discount
            }
            // Push current index onto the stack
            stack.push(i);
        }
        
        // For all remaining indices in the stack, no discount applies
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            result[idx] = prices[idx];
        }
        
        return result;
    }

    public static void main(String[] args) {
        TASK4 solution = new TASK4();

        // Example 1
        int[] prices1 = {8, 4, 6, 2, 3};
        int[] result1 = solution.finalPrices(prices1);
        for (int res : result1) {
            System.out.print(res + " ");  // Output: 4 2 4 2 3
        }
        System.out.println();

        // Example 2
        int[] prices2 = {1, 2, 3, 4, 5};
        int[] result2 = solution.finalPrices(prices2);
        for (int res : result2) {
            System.out.print(res + " ");  // Output: 1 2 3 4 5
        }
        System.out.println();

        // Example 3
        int[] prices3 = {10, 1, 1, 6};
        int[] result3 = solution.finalPrices(prices3);
        for (int res : result3) {
            System.out.print(res + " ");  // Output: 9 0 1 6
        }
    }
}

