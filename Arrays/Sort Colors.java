
// Problem: Sort Colors
// Platform: LeetCode
// Difficulty: Medium
// Approach: Nested loops sorting (Selection/Bubble style sorting)
// Time Complexity: O(n²)
// Space Complexity: O(1)
// Optimal: ❌ Not optimal (expected solution is Dutch National Flag algorithm in O(n))

class Solution {
    public void sortColors(int[] nums) {
        
        for (int i = 0, size = nums.length; i < size; i++) {

            for (int j = i; j < size; j++) {

                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}