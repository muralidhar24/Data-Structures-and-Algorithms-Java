
// Problem: Left and Right Sum Differences
// Platform: LeetCode
// Difficulty: Easy
// Approach: Prefix Sum + Suffix Sum arrays, then compute absolute differences
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: ⚠️ Good solution, but not fully optimal (can be solved in O(n) time and O(1) extra space excluding output array)

class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int[] result = new int[nums.length];
        int[] right = new int[nums.length];
        int size = result.length;

        for (int index = 1; index < size; index++) {
            result[index] = result[index - 1] + nums[index - 1];
        }

        for (int index = size - 2; index >= 0; index--) {
            right[index] = right[index + 1] + nums[index + 1];
        }

        for (int index = 0; index < size; index++) {
            result[index] = Math.abs(result[index] - right[index]);
        }

        return result;
    }
}