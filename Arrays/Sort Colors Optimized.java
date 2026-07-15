
// Problem: Sort Colors
// Platform: LeetCode
// Difficulty: Medium
// Approach: Count the number of 0s, 1s, and 2s, then overwrite the array
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: ✅ Yes (although there is another one-pass optimal solution)

class Solution {
    public void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int num : nums) {

            if (num == 0)
                zero++;
            else if (num == 1)
                one++;
            else
                two++;
        }

        for (int index = 0, size = nums.length; index < size; index++) {

            if (zero > 0) {
                nums[index] = 0;
                zero--;
            } else if (one > 0) {
                nums[index] = 1;
                one--;
            } else {
                nums[index] = 2;
                two--;
            }
        }
    }
}