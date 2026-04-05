
// Problem: Max Consecutive Ones
// Platform: LeetCode
// Difficulty: Easy
// Approach: Linear Scan with Counter Tracking
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int temp = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                if(temp > result) result = temp;
                temp = 0;
            }
            else {
                temp++;
                if(i == nums.length-1) {
                    if(temp > result) result = temp;
                }
            }
        }
        return result;
    }
}