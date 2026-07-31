
// Problem: Ransom Note
// Platform: LeetCode
// Difficulty: Easy
// Approach: Count the frequency of each character in the magazine, then decrement the count while traversing the ransom note. If any required character is unavailable, return false.
// Time Complexity: O(m + n)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] arr = new int[26];

        for (char ch : magazine.toCharArray())
            arr[ch - 'a']++;

        for (char ch : ransomNote.toCharArray()) {

            if (arr[ch - 'a'] != 0)
                arr[ch - 'a']--;
            else
                return false;
        }

        return true;
    }
}