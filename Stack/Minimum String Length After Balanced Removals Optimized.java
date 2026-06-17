
// Problem: Minimum Length After Removing Adjacent 'ab' or 'ba' Pairs
// Platform: Custom
// Difficulty: Easy / Medium
// Approach: Count 'a' and 'b' and return their frequency difference
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: ⚠️ Only if the problem allows removing any 'a' with any 'b'
// Not correct if removals must be adjacent.

class Solution {
    public int minLengthAfterRemovals(String s) {

        int[] arr = new int[2];

        for (char ch : s.toCharArray())
            arr[ch - 'a']++;

        return Math.abs(arr[0] - arr[1]);
    }
}