
// Problem: Concatenation of Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: Copy elements into original and shifted positions
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (cleaner and better than resetting index approach)

class Solution {
    public int[] getConcatenation(int[] nums) {

        int size = nums.length;
        int[] arr = new int[size * 2];

        for (int i = 0; i < size; i++) {

            arr[i] = nums[i];
            arr[size + i] = nums[i];
        }

        return arr;
    }
}