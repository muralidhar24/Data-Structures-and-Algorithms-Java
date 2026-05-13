
// Problem: Check if the Sentence Is Pangram
// Platform: LeetCode
// Difficulty: Easy
// Approach: Frequency array to track all 26 lowercase letters
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (efficient and clean solution)

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        if (sentence.length() < 26) return false;

        int[] count = new int[26];

        for (char letter : sentence.toCharArray())
            count[letter - 'a']++;

        for (int frequency : count)
            if (frequency == 0) return false;

        return true;
    }
}