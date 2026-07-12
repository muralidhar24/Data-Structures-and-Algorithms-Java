
// Problem: Power of Two
// Platform: LeetCode
// Difficulty: Easy
// Approach: Check whether n equals 2^i for i = 0 to 31
// Time Complexity: O(1)
// Space Complexity: O(1)
// Optimal: ⚠️ Accepted, but not the most optimal approach

class Solution {
    public boolean isPowerOfTwo(int n) {

        for (int index = 0; index <= 31; index++) {

            if (Math.pow(2, index) == n)
                return true;
        }

        return false;
    }
}