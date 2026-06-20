
// Problem: Sum of Unique Elements
// Platform: LeetCode
// Difficulty: Easy
// Approach: Frequency counting using a fixed-size array
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (better than the HashMap solution for this problem's constraints)

class Solution {
    public int sumOfUnique(int[] nums) {

        int result = 0;

        int[] arr = new int[101];

        for (int index = 0, size = nums.length; index < size; index++)
            arr[nums[index]]++;

        for (int index = 1, size = arr.length; index < size; index++)
            if (arr[index] == 1)
                result = result + index;

        return result;
    }
}