
// Problem: Power of Four
// Platform: LeetCode
// Difficulty: Easy
// Approach: Generate powers of 4 and compare with n
// Time Complexity: O(1)
// Space Complexity: O(1)
// Optimal: ⚠️ Accepted, but not the most optimal approach

class Solution {
    public boolean isPowerOfFour(int n) {

        for (int index = 0; index <= 15; index++)

            if (Math.pow(4, index) == n)
                return true;

        return false;
    }
}