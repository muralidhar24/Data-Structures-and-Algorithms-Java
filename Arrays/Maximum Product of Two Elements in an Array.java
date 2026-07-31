
// Problem: Maximum Product of Two Elements in an Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Iterate through every pair of elements, compute (nums[i] - 1) × (nums[j] - 1), and keep the maximum product found.
// Time Complexity: O(n²)
// Space Complexity: O(1)
// Optimal: No ❌ (Can be solved in O(n) by finding the two largest elements)

class Solution {
    public int maxProduct(int[] nums) {

        int max = 0;

        for (int outer = 0, size = nums.length; outer < size; outer++) {

            for (int inner = outer + 1; inner < size; inner++) {

                max = Math.max(max, (nums[outer] - 1) * (nums[inner] - 1));
            }
        }

        return max;
    }
}