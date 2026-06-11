
// Problem: GCD of Odd and Even Sums
// Platform: LeetCode
// Difficulty: Easy
// Approach: Compute odd/even sums using formulas and find GCD using Euclidean Algorithm
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Optimal: ⚠️ Almost optimal, but your GCD implementation has the dividend/divisor initialization reversed.
// Expected approach: Euclidean Algorithm on the two sums.

class Solution {
    public int gcdOfOddEvenSums(int n) {

        int sumOdd = (int) Math.pow(n, 2);
        int sumEven = (int) Math.pow(n, 2) + n;

        int dividend = Math.min(sumOdd, sumEven);
        int divisor = Math.max(sumOdd, sumEven);

        while (dividend % divisor != 0) {

            int temp = dividend % divisor;
            dividend = divisor;
            divisor = temp;
        }

        return divisor;
    }
}