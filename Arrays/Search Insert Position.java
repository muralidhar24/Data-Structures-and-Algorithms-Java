
// Problem: Search Insert Position
// Platform: LeetCode
// Difficulty: Easy
// Approach: Binary Search to find target or insertion index
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (expected binary search solution)

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (left <= right) {

            mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;

            else if (target > nums[mid])
                left = mid + 1;

            else if (target < nums[mid])
                right = mid - 1;
        }

        if (target > nums[mid])
            return mid + 1;

        return mid;
    }
}