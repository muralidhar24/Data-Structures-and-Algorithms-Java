
// Problem: Minimum Element After Digit Sum Transformation
// Platform: LeetCode
// Difficulty: Easy
// Approach: Compute digit sum for each number and track the minimum
// Time Complexity: O(n × d)   // d = number of digits
// Space Complexity: O(1)
// Optimal: Yes ✅ (single traversal with constant extra space)

class Solution {
    public int minElement(int[] nums) {
        
        int min = Integer.MAX_VALUE;

        for (int index = 0, size = nums.length; index < size; index++) {

            int temp = nums[index];
            int result = 0;

            for (int inner = 1; inner <= String.valueOf(nums[index]).length(); inner++) {

                result = temp % 10 + result;

                temp = temp / 10;
            }

            min = Math.min(min, result);
        }

        return min;
    }
}