
// Problem: Missing Multiple
// Platform: LeetCode
// Difficulty: Easy
// Approach: Store all numbers in a HashSet, then check multiples of k starting from k until the first missing multiple is found.
// Time Complexity: O(n + m)
// Space Complexity: O(n)
// Optimal: Yes ✅

class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        int count = k;

        while (true) {

            if (!set.contains(count))
                break;

            count = count + k;
        }

        return count;
    }
}