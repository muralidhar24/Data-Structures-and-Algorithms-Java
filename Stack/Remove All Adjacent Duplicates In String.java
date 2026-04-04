
// Problem: Remove All Adjacent Duplicates In String
// Platform: LeetCode
// Difficulty: Easy
// Approach: Stack to remove adjacent duplicates
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (can be slightly optimized using StringBuilder instead of Stack)

import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();
        String result = "";

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch)
                stack.pop();
            else
                stack.push(ch);
        }

        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }

        return result;
    }
}