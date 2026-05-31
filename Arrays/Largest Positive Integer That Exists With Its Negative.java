
// Problem: Largest Positive Integer That Exists With Its Negative
// Platform: LeetCode
// Difficulty: Easy
// Approach: HashSet for fast lookup of negative counterpart
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (efficient lookup approach)

class Solution {
    public int findMaxK(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int digit : nums)
            set.add(digit);

        int max = -1;

        for (int index = 0, size = nums.length; index < size; index++) {

            if (nums[index] > 0 &&
                set.contains(-(nums[index])) &&
                max < nums[index])

                max = nums[index];
        }

        return max;
    }
}