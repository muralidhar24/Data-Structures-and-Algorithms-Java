
// Problem: Number of Good Pairs
// Platform: LeetCode
// Difficulty: Easy
// Approach: Nested loops to compare every pair
// Time Complexity: O(n²)
// Space Complexity: O(1)
// Optimal: ❌ Not optimal (can be solved in O(n) using HashMap frequency counting)

class Solution {
    public int numIdenticalPairs(int[] nums) {

        int pairCount = 0;

        for (int i = 0, size = nums.length; i < size; i++) {

            for (int j = i; j < size; j++)

                if (nums[i] == nums[j] && i < j)
                    pairCount++;
        }

        return pairCount;
    }
}