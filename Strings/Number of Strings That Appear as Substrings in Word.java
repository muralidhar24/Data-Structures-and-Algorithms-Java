
// Problem: Number of Strings That Appear as Substrings in Word
// Platform: LeetCode
// Difficulty: Easy
// Approach: Check whether each pattern is a substring of the given word
// Time Complexity: O(p × w)
//   p = number of patterns
//   w = length of word (depends on String.indexOf implementation)
// Space Complexity: O(1)
// Optimal: Yes ✅ (expected solution)

class Solution {
    public int numOfStrings(String[] patterns, String word) {

        int count = 0;

        for (String name : patterns) {

            if (word.indexOf(name) != -1)
                count++;
        }

        return count;
    }
}