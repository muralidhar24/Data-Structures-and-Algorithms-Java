
// Problem: Valid Anagram
// Platform: LeetCode
// Difficulty: Easy
// Approach: Frequency Count using fixed-size array (26 lowercase letters)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (better than HashMap approach)

class Solution {
    public boolean isAnagram(String s, String t) {

        int[] sCount = new int[26];
        int[] tCount = new int[26];

        for(char ch : s.toCharArray())
            sCount[ch - 'a']++;

        for(char ch : t.toCharArray())
            tCount[ch - 'a']++;

        return Arrays.equals(sCount, tCount);
        
    }
}