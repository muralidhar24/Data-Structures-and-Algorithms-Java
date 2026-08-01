
// Problem: Find Greatest Common Divisor of Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Find the minimum and maximum elements in the array, then compute their GCD using the Euclidean algorithm.
// Time Complexity: O(n + log(max))
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int findGCD(int[] nums) {

        int dividend = Integer.MIN_VALUE;
        int divisor = Integer.MAX_VALUE;

        for (int num : nums) {

            dividend = Math.max(num, dividend);
            divisor = Math.min(num, divisor);

        }

        while (divisor != 0) {

            int temp = dividend % divisor;
            dividend = divisor;
            divisor = temp;

        }

        return dividend;

    }
}