
// Problem: Check Divisibility by Digit Sum and Product
// Platform: LeetCode
// Difficulty: Easy
// Approach: Extract each digit, calculate the digit sum and digit product, then check whether the original number is divisible by their sum.
// Time Complexity: O(d)
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public boolean checkDivisibility(int n) {

        int sum = 0, product = 1;
        int temp = n;

        while (temp > 0) {

            sum = sum + (temp % 10);
            product = product * (temp % 10);

            temp = temp / 10;
        }

        return n % (sum + product) == 0;
    }
}