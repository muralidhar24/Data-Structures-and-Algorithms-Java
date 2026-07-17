
// Problem: Lemonade Change
// Platform: LeetCode
// Difficulty: Easy
// Approach: Greedily maintain the count of $5 and $10 bills.
// Always use one $10 + one $5 before using three $5 bills when giving change for $20.
// Time Complexity: O(n)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;
        int twenty = 0;

        for (int num : bills) {

            if (num == 5)
                five++;

            else if (num == 10 && five > 0) {
                ten++;
                five--;
            }

            else if (num == 20 && ten > 0 && five > 0) {
                twenty++;
                ten--;
                five--;
            }

            else if (num == 20 && five > 2) {
                twenty++;
                five = five - 3;
            }

            else
                return false;
        }

        return true;
    }
}