
// Problem: Two Sum
// Platform: LeetCode
// Difficulty: Easy
// Approach: Store each number and its index in a HashMap, then search for the complement
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (optimal HashMap solution)

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int index = 0, size = nums.length; index < size; index++)
            map.put(nums[index], index);

        for (int index = 0, size = nums.length; index < size; index++) {

            if (map.containsKey(target - nums[index]) &&
                map.get(target - nums[index]) != index)

                return new int[] { index, map.get(target - nums[index]) };
        }

        return null;
    }
}