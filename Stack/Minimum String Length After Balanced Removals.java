
// Problem: Minimum Length After Removing Adjacent 'ab' or 'ba' Pairs
// Platform: Custom
// Difficulty: Easy / Medium
// Approach: Use a Stack to remove valid adjacent pairs greedily
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (single-pass stack solution)

class Solution {
    public int minLengthAfterRemovals(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (stack.isEmpty())
                stack.push(ch);

            else if (stack.peek() == 'a' && ch == 'b'
                  || stack.peek() == 'b' && ch == 'a')
                stack.pop();

            else
                stack.push(ch);
        }

        return stack.size();
    }
}