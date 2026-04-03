
// Problem: Remove Duplicates from Sorted Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Two Pointer (slow-fast pointer to overwrite duplicates)
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (best possible in-place solution)

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int left = 0;
        int right = 1;

        while (right < nums.length) {

            int leftValue = nums[left];
            int rightValue = nums[right];

            if (leftValue != rightValue) {
                left++;
                nums[left] = nums[right];
            }

            right++;
        }

        return left + 1;
    }
}