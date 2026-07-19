
// Problem: Find Triangular Sum of an Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Repeatedly replace each element with the sum of itself and the next element modulo 10 until only one element remains.
// Time Complexity: O(n²)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int triangularSum(int[] nums) {

        for (int dec = 0, size = nums.length; dec < size; dec++) {

            for (int right = 1; right < nums.length - dec; right++) {

                nums[right - 1] = (nums[right - 1] + nums[right]) % 10;

            }

        }

        return nums[0];
    }
}