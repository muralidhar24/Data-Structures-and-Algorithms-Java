
// Problem: Binary Search
// Platform: LeetCode
// Difficulty: Easy
// Approach: Two Pointer (Linear Search from both ends)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length -1;

        while(left <= right) {

            if(nums[left] == target)
                return left;

            if(nums[right] == target)
                return right;

            left++;
            right--;
        }
        return -1;
        
    }
}