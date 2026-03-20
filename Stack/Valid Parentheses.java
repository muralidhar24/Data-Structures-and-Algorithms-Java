
// Problem: Valid Parentheses
// Platform: LeetCode
// Difficulty: Easy
// Approach: Stack to match opening and closing brackets
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty())
                    return false;

                char top = stack.peek();
                if((top == '(' && ch == ')') ||
                   (top == '{' && ch == '}') ||
                   (top == '[' && ch == ']')) {
                stack.pop();
                 } else {
                    return false;
                 }
            }

           
        }

        return stack.isEmpty();
    }
}