
// Problem: Concatenate Array with Reverse
// Platform: Custom
// Difficulty: Easy
// Approach: Fill front with original array and back with reverse order
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (single traversal and efficient memory usage)

class Solution {
    public int[] concatWithReverse(int[] nums) {

        int size = nums.length;

        int[] arr = new int[size * 2];

        for(int i = 0; i < size; i++) {

            arr[i] = nums[i];

            arr[arr.length -1 - i] = nums[i];

        }

        return arr;
    }
}