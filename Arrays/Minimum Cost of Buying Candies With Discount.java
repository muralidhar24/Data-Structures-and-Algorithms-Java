
// Problem: Minimum Cost of Buying Candies With Discount
// Platform: LeetCode
// Difficulty: Easy
// Approach: Sort in ascending order and skip every third candy from the end
// Time Complexity: O(n log n)
// Space Complexity: O(1)   // ignoring sorting space
// Optimal: Yes ✅ (sorting + greedy is the expected approach)

class Solution {
    public int minimumCost(int[] cost) {
        
        Arrays.sort(cost);

        int counter = 0;
        int result = 0;

        for (int index = cost.length - 1; index >= 0; index--) {

            if (counter == 2) {
                counter = 0;
                continue;
            }

            result = result + cost[index];

            counter++;
        }

        return result;
    }
}