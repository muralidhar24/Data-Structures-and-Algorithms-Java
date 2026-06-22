
// Problem: Determine if String Halves Are Alike
// Platform: LeetCode
// Difficulty: Easy
// Approach: Count vowels in both halves and compare
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (expected solution)

class Solution {
    public boolean halvesAreAlike(String s) {

        int firstHalf = 0;
        int secondHalf = 0;

        for (int index = 0, size = s.length() / 2; index < size; index++) {
            if ("aeiouAEIOU".indexOf(s.charAt(index)) >= 0)
                firstHalf++;
        }

        for (int index = s.length() / 2, size = s.length(); index < size; index++) {
            if ("aeiouAEIOU".indexOf(s.charAt(index)) >= 0)
                secondHalf++;
        }

        return firstHalf == secondHalf;
    }
}