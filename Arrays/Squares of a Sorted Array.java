
// Problem: Squares of a Sorted Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Two Pointer (compare absolute values from both ends)
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int left = 0;
        int right = nums.length - 1;
        int result[] = new int[nums.length];

        for(int i=nums.length - 1; i>=0; i--) {

            if(Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[i] = nums[right] * nums[right];
                right--;
            } else {
                result[i] = nums[left] * nums[left];
                left++;
            }
        }

        return result;
    }
}