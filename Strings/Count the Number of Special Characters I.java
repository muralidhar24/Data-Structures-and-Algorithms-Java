
// Problem: Count the Number of Special Characters I
// Platform: LeetCode
// Difficulty: Easy
// Approach: Store all characters in a HashSet, then check for each uppercase letter whether both its uppercase and lowercase forms exist.
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int numberOfSpecialChars(String word) {

        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (char ch : word.toCharArray()) {
            set.add(ch);
        }

        for (char ch = 'A'; ch <= 'Z'; ch++) {

            if (set.contains(ch) && set.contains((char) (ch + 32)))
                count++;
        }

        return count;
    }
}