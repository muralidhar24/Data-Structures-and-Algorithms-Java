
// Problem: Sum of Unique Elements
// Platform: LeetCode
// Difficulty: Easy
// Approach: Count frequencies using HashMap, then sum elements that appear exactly once
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (expected frequency-counting solution)

class Solution {
    public int sumOfUnique(int[] nums) {

        int result = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            if (entry.getValue() == 1)
                result = result + entry.getKey();

        return result;
    }
}