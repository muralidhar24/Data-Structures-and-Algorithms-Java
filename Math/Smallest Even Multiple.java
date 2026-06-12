
// Problem: Smallest Even Multiple
// Platform: LeetCode
// Difficulty: Easy
// Approach: If n is even, answer is n; otherwise answer is 2n
// Time Complexity: O(1)
// Space Complexity: O(1)
// Optimal: Yes ✅ (direct mathematical observation)

class Solution {
    public int smallestEvenMultiple(int n) {

        if (n % 2 == 0)
            return n;

        return n * 2;
    }
}