package Core;

import java.util.Stack;

public class BalancedParenthesis {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening brackets onto the stack
            }

            if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }

                char top = stack.pop(); // Pop the top element from the stack
                
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }

        return stack.isEmpty(); // Return true if all opening brackets are matched
    }

    public static void main (String[] args) {
        String exp = "[()]{}{[()()]()}";

        if (isBalanced(exp)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
