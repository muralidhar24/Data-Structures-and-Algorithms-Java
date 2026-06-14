
// Problem: A Number After a Double Reversal
// Platform: LeetCode
// Difficulty: Easy
// Approach: Reverse the number twice and compare with the original
// Time Complexity: O(d)   // d = number of digits
// Space Complexity: O(1)
// Optimal: ❌ Correct, but not optimal

class Solution {
    public boolean isSameAfterReversals(int num) {

        int reverse1 = 0;
        int reverse2 = 0;

        int temp = num;

        while (temp > 0) {

            reverse1 = reverse1 * 10 + temp % 10;
            temp = temp / 10;
        }

        temp = reverse1;

        while (temp > 0) {

            reverse2 = reverse2 * 10 + temp % 10;
            temp = temp / 10;
        }

        return num == reverse2;
    }
}