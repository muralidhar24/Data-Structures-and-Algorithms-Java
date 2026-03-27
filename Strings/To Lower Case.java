
// Problem: To Lower Case
// Platform: LeetCode
// Difficulty: Easy
// Approach: Character manipulation using ASCII values
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public String toLowerCase(String s) {
        
        StringBuilder result = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90) {
                result.replace(i, i + 1, String.valueOf((char) ((int) s.charAt(i) + 32)));
            }
        }

        return result.toString();
    }
}