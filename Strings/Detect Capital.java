
// Problem: Detect Capital
// Platform: LeetCode
// Difficulty: Easy
// Approach: Check all uppercase OR all lowercase OR only first uppercase
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (clean and efficient solution)

class Solution {
    public boolean detectCapitalUse(String word) {

        if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()))
            return true;

        for(int index = 1, size = word.length(); index < size; index ++) {

            char letter = word.charAt(index);
            if(Character.isUpperCase(letter))
                return false;

        }

        return true;
    }
}