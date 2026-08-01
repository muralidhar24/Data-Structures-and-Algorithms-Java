
// Problem: Maximum Value
// Platform: LeetCode / Contest
// Difficulty: Easy
// Approach: Use the derived mathematical formula to directly compute the maximum value without iteration.
// Time Complexity: O(1)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public long maximumValue(int n, int s, int m) {

        if (n == 1)
            return s;

        return (m + s) + (long) ((n / 2) - 1) * (m - 1);

    }
}