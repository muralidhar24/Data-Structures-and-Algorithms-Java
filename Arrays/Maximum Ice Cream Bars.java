
// Problem: Maximum Ice Cream Bars
// Platform: LeetCode
// Difficulty: Medium
// Approach: Sort costs and buy the cheapest ice creams first (Greedy)
// Time Complexity: O(n log n)
// Space Complexity: O(1) or O(log n) depending on sorting implementation
// Optimal: ✅ Yes (Greedy is the intended approach)

class Solution {
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);

        int count = 0;

        for (int num : costs) {

            if (coins < num)
                break;

            count++;
            coins = coins - num;
        }

        return count;
    }
}