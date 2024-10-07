
package com.mycompany.stack1;
 import java.util.Stack;
/**
 *
 * @author Irtaza Ali
 */
public class TASK1 {
  
    public boolean isValid(String s) {
          Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
     if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        
    return stack.isEmpty();

    }

    public static void main(String[] args) {
        TASK1 vp = new TASK1();

        // Test cases
        System.out.println(vp.isValid("()"));        // true
        System.out.println(vp.isValid("()[]{}"));    // true
        System.out.println(vp.isValid("(]"));        // false
        System.out.println(vp.isValid("([])"));      // true
    }
}


