
// Problem: Baseball Game
// Platform: LeetCode
// Difficulty: Easy
// Approach: Stack to simulate operations and maintain scores
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < operations.length; i++) {

            if (!operations[i].equals("+") && !operations[i].equals("C") && !operations[i].equals("D")) {

                stack.push(Integer.parseInt(operations[i]));
            } else {

                if (!stack.isEmpty()) {
                    if (operations[i].equals("+") && stack.size() >= 2) {
                        stack.push(stack.peek() + stack.get(stack.size() - 2));
                    } else if (operations[i].equals("D")) {
                        stack.push(stack.peek() * 2);
                    } else if (operations[i].equals("C")) {
                        stack.pop();
                    }
                }
            }
        }

        for (int n : stack) {
            result += n;
        }

        return result;
    }
}