
// Problem: Majority Element
// Platform: LeetCode
// Difficulty: Easy
// Approach: Sorting and returning middle element
// Time Complexity: O(n log n)
// Space Complexity: O(1)   // ignoring sorting space (depends on implementation)
// Optimal: ❌ Not optimal (can be solved in O(n) time and O(1) space using Boyer-Moore Voting Algorithm)

class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length / 2];
    }
}