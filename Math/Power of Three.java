
// Problem: Power of Three
// Platform: LeetCode
// Difficulty: Easy
// Approach: Generate powers of 3 and compare with n
// Time Complexity: O(1)
// Space Complexity: O(1)
// Optimal: ⚠️ Accepted, but not the most optimal approach

class Solution {
    public boolean isPowerOfThree(int n) {

        for (int index = 0; index <= 19; index++)

            if (Math.pow(3, index) == n)
                return true;

        return false;
    }
}