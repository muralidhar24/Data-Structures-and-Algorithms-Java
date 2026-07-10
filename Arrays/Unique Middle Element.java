
// Problem: Is Middle Element Unique (Custom)
// Platform: Custom
// Difficulty: Easy
// Approach: Count the frequency of each element, then check the frequency of the middle element
// Time Complexity: O(n)
// Space Complexity: O(1) (assuming values are in the range 0–100)
// Optimal: Yes ✅

class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

        int[] map = new int[101];

        for (int num : nums)
            map[num]++;

        return map[nums[nums.length / 2]] == 1;
    }
}