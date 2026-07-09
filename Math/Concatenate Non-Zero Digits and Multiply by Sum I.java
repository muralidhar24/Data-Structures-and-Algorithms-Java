
// Problem: Sum and Multiply (Custom)
// Platform: Custom
// Difficulty: Easy
// Approach: Reverse the number to preserve digit order, remove zeros, build the new number, compute digit sum, and return their product
// Time Complexity: O(d)   // d = number of digits
// Space Complexity: O(1)
// Optimal: Yes ✅

class Solution {
    public long sumAndMultiply(int n) {

        int reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }

        long x = 0, sum = 0;

        while (reverse > 0) {

            if (reverse % 10 != 0) {

                x = x * 10 + reverse % 10;
                sum = sum + reverse % 10;
            }

            reverse = reverse / 10;
        }

        long result = x * sum;
        return result;
    }
}