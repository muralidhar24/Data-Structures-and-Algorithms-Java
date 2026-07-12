
// Problem: Number of Steps to Reduce a Number to Zero
// Platform: LeetCode
// Difficulty: Easy
// Approach: Simulate the given operations until the number becomes zero
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public int numberOfSteps(int num) {

        int stepsCount = 0;

        while (num != 0) {

            if (num % 2 != 0)
                num = num - 1;
            else
                num = num / 2;

            stepsCount++;
        }

        return stepsCount;
    }
}