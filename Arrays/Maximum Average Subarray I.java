
// Problem: Maximum Average Subarray I
// Platform: LeetCode
// Difficulty: Easy
// Approach: Sliding Window (fixed window size k)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int right = 0;
        int sum = 0;

        double max = 0d;

        if(nums.length < k)
            return 0;

        for(int i=0; i<k; i++) {
            sum = sum + nums[right];
            right++;
        }

        max = sum;

        while(right < nums.length) {
            sum = sum + nums[right] - nums[right - k];
            right++;
            max = Math.max(max, sum);
        }

        return max / k;
    }
}