
// Problem: Count the Number of Special Characters I
// Platform: LeetCode
// Difficulty: Easy
// Approach: Iterate through all uppercase letters and use indexOf() to check whether both the uppercase and lowercase versions exist in the string.
// Time Complexity: O(26 × n) ≈ O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int numberOfSpecialChars(String word) {

        int count = 0;

        for (char ch = 'A'; ch <= 'Z'; ch++) {

            if (word.indexOf(ch) > -1 &&
                word.indexOf((char) (ch + 32)) > -1)
                count++;
        }

        return count;

    }
}