
// Problem: Container With Most Water
// Platform: LeetCode
// Difficulty: Medium
// Approach: Two Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length-1;
        int min = 0;
        while(left<right)
        {
            int count = (height.length-left) - (height.length-right);
            min = Math.min(height[left],height[right]);
            if(result < min*count)
            result = min*count;
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }


        }
        return result;
    }
}