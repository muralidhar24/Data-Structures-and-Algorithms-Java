
// Problem: Running Sum of 1d Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: In-place Prefix Sum
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (best possible solution)

class Solution {
    public int[] runningSum(int[] nums) {

        for (int index = 1, size = nums.length; index < size; index++) {
            nums[index] = nums[index] + nums[index - 1];
        }

        return nums;
    }
}