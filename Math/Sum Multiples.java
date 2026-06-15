
// Problem: Sum Multiples
// Platform: LeetCode
// Difficulty: Easy
// Approach: Iterate through numbers and add those divisible by 3, 5, or 7
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅ (expected straightforward solution)

class Solution {
    public int sumOfMultiples(int n) {
        
        int sum = 0;

        for (int index = 1; index <= n; index++) {

            if (index % 3 == 0 || index % 5 == 0 || index % 7 == 0)
                sum = sum + index;
        }

        return sum;
    }
}