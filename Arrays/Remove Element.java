
// Problem: Remove Element
// Platform: LeetCode
// Difficulty: Easy
// Approach: Two Pointer with swapping unwanted elements to the end
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (efficient in-place removal approach)

class Solution {
    public int removeElement(int[] nums, int val) {
        
        int count = 0;
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == val)
                count++;

        while (left < right) {

            while (left < right && nums[right] == val)
                right--;

            while (left < right && nums[left] != val)
                left++;

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }

        return nums.length - count;
    }
}