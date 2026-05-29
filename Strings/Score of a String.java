
// Problem: Score of a String
// Platform: LeetCode
// Difficulty: Easy
// Approach: Iterate and sum absolute differences of adjacent characters
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (single pass, no extra space)

class Solution {
    public int scoreOfString(String s) {
        
        int result = 0;

        for (int index = 0, size = s.length(); index < size - 1; index++)
            result = result + Math.abs((int) s.charAt(index) - (int) s.charAt(index + 1));

        return result;
    }
}