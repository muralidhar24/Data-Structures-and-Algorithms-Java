
// Problem: N-Repeated Element in Size 2N Array
// Platform: LeetCode
// Difficulty: Easy
// Approach: HashSet to detect the first repeated element
// Time Complexity: O(n)
// Space Complexity: O(n)
// Optimal: Yes ✅ (standard efficient solution)

class Solution {
    public int repeatedNTimes(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num))
                return num;

            set.add(num);
        }

        return 0;
    }
}