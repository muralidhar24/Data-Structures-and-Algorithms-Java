
// Problem: Check if All Characters Have Equal Number of Occurrences
// Platform: LeetCode
// Difficulty: Easy
// Approach: Count character frequencies and verify they are all equal
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (expected frequency-array solution)

class Solution {
    public boolean areOccurrencesEqual(String s) {

        int[] arr = new int[26];

        for (char ch : s.toCharArray())
            arr[ch - 'a']++;

        int temp = arr[s.charAt(0) - 'a'];

        for (int value : arr)

            if (value != 0 && temp != value)
                return false;

        return true;
    }
}