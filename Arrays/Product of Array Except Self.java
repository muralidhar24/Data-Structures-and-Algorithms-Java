
// Problem: Product of Array Except Self
// Platform: LeetCode
// Difficulty: Medium
// Approach: Total product + zero counting
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: ❌ Not accepted as the optimal solution for this problem
// Reason: Uses division, while the problem explicitly requires a solution without division.
// Expected Optimal: Prefix Product + Suffix Product in O(n) time and O(1) extra space.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int value = 1;
        int zeroCount = 0;

        for (int digit : nums) {

            if (digit != 0)
                value = value * digit;
            else
                zeroCount++;
        }

        for (int index = 0, size = nums.length; index < size; index++) {

            if (zeroCount == 0)
                nums[index] = value / nums[index];

            else if (nums[index] == 0 && zeroCount == 1)
                nums[index] = value;

            else
                nums[index] = 0;
        }

        return nums;
    }
}